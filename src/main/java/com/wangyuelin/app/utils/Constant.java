package com.wangyuelin.app.utils;

import javax.xml.soap.SAAJResult;

/**
 * 描述:
 *
 * @outhor wangyuelin
 * @create 2018-06-25 下午3:46
 */
public class Constant {

    public interface RespCode {
        int SUCCESS = 1000;
        int ERROR = 1001;

    }

    public interface MSG {
        String SUCCESS = "数据请求成功";
        String ERROE = "数据请求失败";
    }

    public interface Page{
        String P_404 = "404";
        String ERROR = "error";
    }





}