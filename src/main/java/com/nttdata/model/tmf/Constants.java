package com.nttdata.model.tmf;

public class Constants {
	/*
	 * Cadence variables
	 */
    public static final String TASK_LIST = "order-decomposition";
    public static final String DOMAIN = "simple-domain"; //System.getenv("simple-domain");//"sample";//
    public static final int PORT = 7933; //Integer.parseInt(System.getenv("8088"));//7933;//
    public static final String HOST = "localhost"; //System.getenv("localhost");//"localhost";//
	 
    /*
     * Http variables
     */    
    public static final String SERVICEORDER =System.getenv("SERVICEORDER");//"http://51.137.0.193";
    public static final String SERVICEINVENTORY= System.getenv("SERVICEINVENTORY");//"http://51.137.0.193";
	public static final String BEESION =  System.getenv("BEESION_URL");//"http://51.137.0.193/catalog/service/";
	public static final String ENVIRONMENT = System.getenv("ENVIRONMENT");//"PRODUCTION"
    
    public static final String POSTMETHOD = "POST";
    public static final String GETMETHOD = "GET";
    public static final String PUTMETHOD = "PUT";
    public static final String ORDER_DECOMPOSITION="order-decomposition";

    public static final String ADD = "add";
    public static final String UPDATE = "update";
    public static final String CANCEL = "cancel";
    
}
