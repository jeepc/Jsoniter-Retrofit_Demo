package com.jeepc.jsoniter_retrofit_demo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.jeepc.jsoniterconverter.JsoniterConverterFactory;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final long starTime = System.currentTimeMillis();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://www.kuaidi100.com")
                .addConverterFactory(JsoniterConverterFactory.create())
               // .addConverterFactory(GsonConverterFactory.create())
                .build();
        Api api = retrofit.create(Api.class);
        api.getLogistics().enqueue(new Callback<Logistics>() {
            @Override
            public void onResponse(Call<Logistics> call, Response<Logistics> response) {
                Logistics logistics = response.body();
                Log.e("jeepc11",logistics.toString());
                Log.e("jeepc11","time:"+(System.currentTimeMillis()-starTime));
            }

            @Override
            public void onFailure(Call<Logistics> call, Throwable t) {
                Log.e("jeepc11",t.toString());
            }
        });
    }
}
