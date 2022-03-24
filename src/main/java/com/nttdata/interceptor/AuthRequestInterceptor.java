package com.nttdata.interceptor;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.nttdata.config.AuthProperties;

import lombok.extern.slf4j.Slf4j;
import okhttp3.FormBody;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

@Slf4j
@Component
public class AuthRequestInterceptor implements Interceptor {

	private static final String AUTHORIZATION_HEADER = "Authorization";
	private static final String BEARER_TOKEN_TYPE = "Bearer ";
	public static final MediaType JSON = MediaType
			.get("application/x-www-form-urlencoded; charset=utf-8");

	@Autowired
	AuthProperties config;

	private final OkHttpClient client = new OkHttpClient.Builder()
			.connectTimeout(160, TimeUnit.SECONDS).readTimeout(60, TimeUnit.SECONDS)
			.writeTimeout(60, TimeUnit.SECONDS).build();

	private static final ObjectMapper mapper = new ObjectMapper();

	private String addAutHeader() {

		String token = "";
		Response response;

		try {
			Request request = new Request.Builder().url(config.getUrlWellKnow()).build();
			response = client.newCall(request).execute();
			ResponseBody rs = response.body();
			JsonNode rsNode = mapper.readTree(rs.string());

			String urlIAM = rsNode.get("token_endpoint").asText();

			RequestBody formBody = new FormBody.Builder().add("grant_type", config.getGrantType())
					.add("client_id", config.getClientId())
					.add("client_secret", config.getClientSecret()).add("scope", config.getScope())
					.build();

			request = new Request.Builder().url(urlIAM).addHeader("Accept", "*/*")
					.addHeader("Content-Type", "application/x-www-form-urlencoded").post(formBody)
					.build();
			Response rsIAM = client.newCall(request).execute();
			token = mapper.readTree(rsIAM.body().string()).get("access_token").asText();

		} catch (Exception e) {
			log.error("Authentication error {} ", e);
		}

		return BEARER_TOKEN_TYPE.concat(token);

	}

	@Override
	public Response intercept(Chain chain) throws IOException {
		Request request = chain.request();
		Request newRequest;
		newRequest = request.newBuilder().addHeader(AUTHORIZATION_HEADER, addAutHeader()).build();
		return chain.proceed(newRequest);

	}

}
