
该lib是一个自定义Converter，以便于Retrofit2使用Jsoniter解析json
使用方法：

1、添加依赖： 
```
  compile'com.squareup.retrofit2:retrofit:2.3.0'
  compile'com.jsoniter:jsoniter:0.9.15'
  compile'com.jsoniter:jsoniter:0.9.15'
```

 
2、代码实现：
```
  Retrofit retrofit =newRetrofit.Builder()
                                .addConverterFactory(JsoniterConverterFactory.create())
                                .build();
```
