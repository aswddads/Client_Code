package com.youdu.network.http;

/**
 * @function: 所有请求相关地址
 */
public class HttpConstants {

    private static final String ROOT_URL = "http:10.0.2.2:8080";

    /**
     * 请求本地产品列表
     */
    public static String PRODUCT_LIST = ROOT_URL + "/Server_Data/search.json";

    /**
     * 本地产品列表更新时间措请求
     */
    public static String PRODUCT_LATESAT_UPDATE = ROOT_URL + "/Server_Data/upsearch.json";

    /**
     * 登陆接口
     */
    public static String LOGIN = ROOT_URL + "/Server_Data/login_phone.json";

    /**
     * 检查更新接口
     */
    public static String CHECK_UPDATE = ROOT_URL + "/Server_Data/check_update.json";

    /**
     * 首页产品请求接口
     */
    public static String HOME_RECOMMAND = ROOT_URL + "/Server_Data/home_data.json";

    /**
     * 课程详情接口
     */
    public static String COURSE_DETAIL = ROOT_URL + "/Server_Data/course_detail.json";

}


