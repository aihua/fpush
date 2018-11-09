package com.appjishu.fpush.core.constant;

public enum FMessageType {

    // 利用构造函数传参

	LOGIN_REQ((byte)0x1), LOGIN_RESP((byte)0x2), HEARTBEAT_RESP((byte) 0x3), HEARTBEAT_REQ((byte) 0x4);

    // 定义私有变量

    private int value;

    // 构造函数，枚举类型只能为私有

    private FMessageType(int value) {

        this.value = value;

    }

    @Override
    public String toString() {

        return String.valueOf(this.value);

    }
    
    public int value() {
    	return value;
    }
}