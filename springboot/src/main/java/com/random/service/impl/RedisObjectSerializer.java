package com.random.service.impl;

import org.springframework.core.convert.converter.Converter;
import org.springframework.core.serializer.support.DeserializingConverter;
import org.springframework.core.serializer.support.SerializingConverter;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;

/**
 * @description 实现对象的序列化接口.
 * @author random
 * @version 1.0
 * @date 2018年8月7日
 * 
 */
public class RedisObjectSerializer implements RedisSerializer<Object>{
	private Converter<Object,byte[]> serializer = new SerializingConverter();
	private Converter<byte[], Object> deserializer = new DeserializingConverter();

	static final byte[] EMPTY_ARRAY = new byte[0];
	
	@Override
	public Object deserialize(byte[] bytes) {
		if(isEmpty(bytes)){
			return null;
		}
		try {
			return deserializer.convert(bytes);
		} catch (Exception e) {
			throw new SerializationException("Cannot deserialize",e);
		}
	}

	private boolean isEmpty(byte[] data) {
		return (data == null || data.length == 0);
	}

	@Override
	public byte[] serialize(Object object){
		if (object == null) {
			return EMPTY_ARRAY;
		}
		try {
			return serializer.convert(object);
		} catch (Exception e) {
			return EMPTY_ARRAY;
		}
	}

}
