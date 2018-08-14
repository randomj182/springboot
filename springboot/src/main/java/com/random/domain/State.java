package com.random.domain;
/**
 * @description 根据上面所述的订单需求场景定义状态和事件枚举.
 * @author random
 * @version 1.0
 * @date 2018年8月14日
 * 
 */
public class State {
	public enum States {
	    UNPAID,                 // 待支付
	    WAITING_FOR_RECEIVE,    // 待收货
	    DONE                    // 结束
	}

	public enum Events {
	    PAY,        // 支付
	    RECEIVE     // 收货
	}
}
