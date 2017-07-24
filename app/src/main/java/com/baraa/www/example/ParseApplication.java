package com.baraa.www.example;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

/**
 * Created by root on 7/24/17.
 */
public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();






        // Use for troubleshooting.
        // IMPORTANT: Remove this line for production.
        Parse.setLogLevel(Parse.LOG_LEVEL_DEBUG);

        // Use OkHttp for monitoring Parse trafic.
        // Can be Level.BASIC, Level.HEADERS, or Level.BODY
        // Go to http://square.github.io/okhttp/3.x/logging-interceptor/ to see the options.
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        builder.networkInterceptors().add(httpLoggingInterceptor);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("education-courses") // TODO: Replace with your app ID.
                .clientKey(null)
                .clientBuilder(builder)
                .server("https://education-courses.herokuapp.com/parse/").build()); // TODO: Replace with your app URL.

        ParseObject testObject = new ParseObject("TestObject");
        testObject.put("foo", "bar");
        testObject.saveInBackground();
    }
}