package com.nttdata.security;

import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.ssl.SSLContexts;

import javax.json.Json;
import javax.json.JsonObject;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

public class TokenProvider {

    public String getToken() throws IOException, KeyStoreException, NoSuchAlgorithmException, KeyManagementException {
    	
    	if (System.getenv("IF_TOKEN").equals("false")) {
    		System.out.println("No token");
    		return "";
    		
		}
			
        CloseableHttpClient client = HttpClients.custom()
                .setSSLSocketFactory(new SSLConnectionSocketFactory(SSLContexts.custom().loadTrustMaterial(null, new TrustSelfSignedStrategy()).build(), NoopHostnameVerifier.INSTANCE))
                .build();

        HttpGet configurationRequest = new HttpGet(System.getenv("URL_WELL_KNOWN"));

        CloseableHttpResponse configurationResponse = client.execute(configurationRequest);

        JsonObject configurationObject = Json.createReader(configurationResponse.getEntity().getContent()).readObject();
        System.out.println("configurationObject==>"+configurationObject);
        String tokenEndpoint = configurationObject.getString("token_endpoint");

        configurationResponse.close();
        HttpPost tokenRequest = new HttpPost(tokenEndpoint);
        List<NameValuePair> data = new ArrayList<NameValuePair>();
        data.add(new BasicNameValuePair("grant_type", "client_credentials"));
        data.add(new BasicNameValuePair("client_id", System.getenv("CLIENT_ID")));
        data.add(new BasicNameValuePair("client_secret", System.getenv("CLIENT_SECRET")));
        data.add(new BasicNameValuePair("scope", System.getenv("SCOPE")));
        tokenRequest.setEntity(new UrlEncodedFormEntity(data));
        CloseableHttpResponse tokenResponse = client.execute(tokenRequest);
        JsonObject tokenObject = Json.createReader(tokenResponse.getEntity().getContent()).readObject();
        String accessToken = tokenObject.getString("access_token");
        Integer expiresIn = tokenObject.getInt("expires_in");
        String refreshToken = tokenObject.getString("refresh_token");

        return accessToken;
    }
}
