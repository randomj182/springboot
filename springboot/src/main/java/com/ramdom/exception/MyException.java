package com.ramdom.exception;
/**
 * @description 自定义异常类，继承exception.用来实验捕获该异常，并返回json.用于测试
 * @author random
 * @version 1.0
 * @date 2018年8月7日
 * 
 */
public class MyException extends Exception {
    /**
	 * serialVersionUID用来作为Java对象序列化中的版本标示之用；
	 * 如果一个序列化类没有声明这样一个static final的产量，JVM会根据各种参数为这个类计算一个；
	 * 对于同样一个类，不同版本的JDK可能会得出不同的serivalVersionUID;
	 * !不加次句会有警告!
	 */
	private static final long serialVersionUID = 1L;

	public MyException(String message) {
        super(message);
    }
}