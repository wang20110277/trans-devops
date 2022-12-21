package com.trans.constants;

public class ApiTypeConstant {
    public static final String SERVICE_TYPE_AUTH = "auth";
    public static final String SERVICE_TYPE_WEB = "system";
    public static final String SERVICE_TYPE_APP = "app";
    public static final String SERVICE_TYPE_OPEN = "open";
    public static final String SERVICE_TYPE_PROJECT = "project";
    public static final String AUTH_BASE_PATH = "/" + SERVICE_TYPE_AUTH + "/api/";
    public static final String WEB_BASE_PATH = "/" + SERVICE_TYPE_WEB + "/api/";
    public static final String APP_BASE_PATH = "/" + SERVICE_TYPE_APP + "/api/";
    public static final String OPEN_BASE_PATH = "/" + SERVICE_TYPE_OPEN + "/api/";
    public static final String PROJECT_BASE_PATH = "/" + SERVICE_TYPE_PROJECT + "/api/";
}
