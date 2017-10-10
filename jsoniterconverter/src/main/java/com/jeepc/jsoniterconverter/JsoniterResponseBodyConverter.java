package com.jeepc.jsoniterconverter;

import com.jsoniter.JsonIterator;
import com.jsoniter.any.Any;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import okhttp3.ResponseBody;
import retrofit2.Converter;

final class JsoniterResponseBodyConverter<T> implements Converter<ResponseBody, T> {


    private Type mType;


    JsoniterResponseBodyConverter(Type type) {
        mType = type;

    }

    @Override
    public T convert(ResponseBody value) throws IOException {
        try {
            return (T) JsonIterator.parse(value.string()).read(mType);
        } finally {
            value.close();
        }
    }
}
