package com.ramdom.exception;
/**
 * @description 自定义异常类，继承exception.用于测试
 * @author random
 * @version 1.0
 * @date 2018年8月7日
 * 
 */
public class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}