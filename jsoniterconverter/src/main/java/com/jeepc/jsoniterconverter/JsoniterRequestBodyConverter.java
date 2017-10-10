package com.jeepc.jsoniterconverter;

import com.jsoniter.JsonIterator;
import com.jsoniter.output.JsonStream;

import java.io.IOException;
import java.lang.reflect.Type;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Converter;

final class JsoniterRequestBodyConverter<T> implements Converter<T, RequestBody> {
  private static final MediaType MEDIA_TYPE = MediaType.parse("application/json; charset=UTF-8");

  private Type mType;

  JsoniterRequestBodyConverter(Type type) {
    this.mType = type;
  }

  @Override
  public RequestBody convert(T value) throws IOException {
    String content = JsonStream.serialize(false,mType,value);
    return RequestBody.create(MEDIA_TYPE, content);
  }
}
