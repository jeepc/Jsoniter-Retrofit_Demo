package com.jeepc.jsoniterconverter;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;


/**
 * A {@linkplain Converter.Factory converter} which uses Jsoniter for JSON.
 */
public class JsoniterConverterFactory extends Converter.Factory {



  public static JsoniterConverterFactory create() {
    return new JsoniterConverterFactory();
  }

  private JsoniterConverterFactory() {
  }

  @Override
  public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotations,
                                                          Retrofit retrofit) {
    return new JsoniterResponseBodyConverter<>(type);
  }

  @Override
  public Converter<?, RequestBody> requestBodyConverter(Type type,
                                                        Annotation[] parameterAnnotations, Annotation[] methodAnnotations, Retrofit retrofit) {
    return new JsoniterRequestBodyConverter<>(type);
  }

}
