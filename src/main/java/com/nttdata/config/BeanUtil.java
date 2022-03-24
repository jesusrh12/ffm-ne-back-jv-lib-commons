package com.nttdata.config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Utility that allows to obtain the contexts of classes
 * @author lsotelod, 02/2022
 *
 */
public class BeanUtil implements ApplicationContextAware {

	private static ApplicationContext appCxt;

	/**
	 * Method that allows initializing the applicationContext
	 * 
	 */
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		appCxt = applicationContext;
	}

	/**
	 * Method that allows obtaining the connection of the class mainWebSocket
	 * 
	 * @return
	 * @throws BeansException
	 */
	public static Object getConfig(String name) throws BeansException {
		return (Object) appCxt.getAutowireCapableBeanFactory().getBean(name);
	}
	

}