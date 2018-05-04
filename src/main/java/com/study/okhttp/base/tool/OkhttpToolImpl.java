package com.study.okhttp.base.tool;

import java.io.IOException;
import java.util.Properties;
import java.util.Set;

import com.alibaba.fastjson.JSONObject;
import com.study.okhttp.base.callback.CallBack;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Request.Builder;
import okhttp3.RequestBody;
import okhttp3.Response;

public class OkhttpToolImpl implements OkhttpTool {
	private OkHttpClient okHttpClient=new OkHttpClient.Builder().build();
	private Request request;
	private Response response;
	private Request.Builder requestBuilder=new Request.Builder();
	private Callback callback=new CallBack();
	@Override
	public Response post(Request request) {
		return post(request, okHttpClient);
	}
	@Override
	public Callback postEnqueue(Request request) {
		return postEnqueue(request, okHttpClient);
	}
	@Override
	public Response post(Request request, OkHttpClient client) {
		return excute(request, client);
	}
	@Override
	public Callback postEnqueue(Request request, OkHttpClient client) {
		return postEnqueue(request, client, callback);
	}
	@Override
	public Callback postEnqueue(Request request, OkHttpClient client, Callback callback) {
		return enqueue(request, client, callback);
	}
	@Override
	public Response post() {
		return post(request, okHttpClient);
	}
	@Override
	public Response post(String url, JSONObject jsonObject) {
		return post(url, jsonObject, new Headers.Builder().build(), okHttpClient);
	}
	@Override
	public Response post(String url, JSONObject jsonObject, Headers headers) {
		return post(url, jsonObject, headers, okHttpClient);
	}
	@Override
	public Response postJson(String url, JSONObject jsonObject) {
		return postJson(url, jsonObject, new Headers.Builder().build(), okHttpClient);
	}
	@Override
	public Response postJson(String url, JSONObject jsonObject, Headers headers) {
		return postJson(url, jsonObject, headers, okHttpClient);
	}
	@Override
	public Response post(OkHttpClient client) {
		return post(request, client);
	}
	@Override
	public Response post(String url, JSONObject jsonObject, OkHttpClient client) {
		return post(url, jsonObject, new Headers.Builder().build(), client);
	}
	@Override
	public Response post(String url, JSONObject jsonObject, Headers headers, OkHttpClient client) {
		return excute(request(url, jsonObject, headers), client);
	}
	@Override
	public Response postJson(String url, JSONObject jsonObject, OkHttpClient client) {
		return postJson(url, jsonObject, new Headers.Builder().build(), client);
	}
	@Override
	public Response postJson(String url, JSONObject jsonObject, Headers headers, OkHttpClient client) {
		return excute(requestJson(url, jsonObject, headers), client);
	}
	@Override
	public Callback postEnqueue() {
		return postEnqueue(request, okHttpClient, callback);
	}
	@Override
	public Callback postEnqueue(String url, JSONObject jsonObject) {
		return postEnqueue(url, jsonObject, new Headers.Builder().build(), callback, okHttpClient);
	}
	@Override
	public Callback postEnqueue(String url, JSONObject jsonObject, Headers headers) {
		return postEnqueue(url, jsonObject, headers, callback, okHttpClient);
	}
	@Override
	public Callback postJsonEnqueue(String url, JSONObject jsonObject) {
		
		return postJsonEnqueue(url, jsonObject, new Headers.Builder().build(), callback, okHttpClient);
	}
	@Override
	public Callback postJsonEnqueue(String url, JSONObject jsonObject, Headers headers) {
		return postJsonEnqueue(url, jsonObject, headers, callback, okHttpClient);
	}
	@Override
	public Callback postEnqueue(Callback callback) {
		return postEnqueue(request, okHttpClient, callback);
	}
	@Override
	public Callback postEnqueue(String url, JSONObject jsonObject, Callback callback) {
		return null;
	}
	@Override
	public Callback postEnqueue(String url, JSONObject jsonObject, Headers headers, Callback callback) {
		return postEnqueue(url, jsonObject, headers, callback, okHttpClient);
	}
	@Override
	public Callback postJsonEnqueue(String url, JSONObject jsonObject, Callback callback) {
		return postEnqueue(url, jsonObject, new Headers.Builder().build(), callback, okHttpClient);
	}
	@Override
	public Callback postJsonEnqueue(String url, JSONObject jsonObject, Headers headers, Callback callback) {
		return postJsonEnqueue(url, jsonObject, headers, callback, okHttpClient);
	}
	@Override
	public Callback postEnqueue(OkHttpClient client) {
		return postEnqueue(request, client, callback);
	}
	@Override
	public Callback postEnqueue(String url, JSONObject jsonObject, OkHttpClient client) {
		return postEnqueue(url, jsonObject, new Headers.Builder().build(), callback, client);
	}
	@Override
	public Callback postEnqueue(String url, JSONObject jsonObject, Headers headers, OkHttpClient client) {
		return postEnqueue(url, jsonObject, headers, callback, client);
	}
	@Override
	public Callback postJsonEnqueue(String url, JSONObject jsonObject, OkHttpClient client) {
		return postJsonEnqueue(url, jsonObject, new Headers.Builder().build(), callback, client);
	}
	@Override
	public Callback postJsonEnqueue(String url, JSONObject jsonObject, Headers headers, OkHttpClient client) {
		return postJsonEnqueue(url, jsonObject, headers, callback, client);
	}
	@Override
	public Callback postEnqueue(Callback callback, OkHttpClient client) {
		return postEnqueue(request, client, callback);
	}
	@Override
	public Callback postEnqueue(String url, JSONObject jsonObject, Callback callback, OkHttpClient client) {
		return postEnqueue(url, jsonObject, new Headers.Builder().build(), callback, client);
	}
	@Override
	public Callback postEnqueue(String url, JSONObject jsonObject, Headers headers, Callback callback,
			OkHttpClient client) {
		return enqueue(request(url, jsonObject, headers), client, callback);
	}
	@Override
	public Callback postJsonEnqueue(String url, JSONObject jsonObject, Callback callback, OkHttpClient client) {
		return postJsonEnqueue(url, jsonObject, new Headers.Builder().build(), callback, client);
	}
	@Override
	public Callback postJsonEnqueue(String url, JSONObject jsonObject, Headers headers, Callback callback,
			OkHttpClient client) {
		return enqueue(requestJson(url, jsonObject, headers), client, callback);
	}
	@Override
	public Response get() {
		return get(okHttpClient);
	}
	@Override
	public Response get(String url) {
		return get(url, new Headers.Builder().build(), okHttpClient);
	}
	@Override
	public Response get(String url, Headers headers) {
		return get(url, headers, okHttpClient);
	}
	@Override
	public Response get(OkHttpClient client) {
		return excute(request, client);
	}
	@Override
	public Response get(String url, OkHttpClient client) {
		return get(url, new Headers.Builder().build(), client);
	}
	@Override
	public Response get(String url, Headers headers, OkHttpClient client) {
		return excute(request(url, headers), client);
	}
	@Override
	public Callback getEnqueue() {
		return getEnqueue(callback, okHttpClient);
	}
	@Override
	public Callback getEnqueue(String url) {
		return getEnqueue(url, new Headers.Builder().build(), callback, okHttpClient);
	}
	@Override
	public Callback getEnqueue(String url, Headers headers) {
		return getEnqueue(url, headers, callback, okHttpClient);
	}
	@Override
	public Callback getEnqueue(Callback callback) {
		return getEnqueue(callback, okHttpClient);
	}
	@Override
	public Callback getEnqueue(String url, Callback callback) {
		return getEnqueue(url, new Headers.Builder().build(), callback, okHttpClient);
	}
	@Override
	public Callback getEnqueue(String url, Headers headers, Callback callback) {
		return getEnqueue(url, headers, callback, okHttpClient);
	}
	@Override
	public Callback getEnqueue(OkHttpClient client) {
		return getEnqueue(callback, client);
	}
	@Override
	public Callback getEnqueue(String url, OkHttpClient client) {
		return getEnqueue(url, new Headers.Builder().build(), callback, client);
	}
	@Override
	public Callback getEnqueue(String url, Headers headers, OkHttpClient client) {
		return getEnqueue(url, headers, callback, client);
	}
	@Override
	public Callback getEnqueue(Callback callback, OkHttpClient client) {
		return enqueue(request, client, callback);
	}
	@Override
	public Callback getEnqueue(String url, Callback callback, OkHttpClient client) {
		return getEnqueue(url, new Headers.Builder().build(), callback, client);
	}
	@Override
	public Callback getEnqueue(String url, Headers headers, Callback callback, OkHttpClient client) {
		return enqueue(request(url, headers), client, callback);
	}
	@Override
	public Request request(String url) {
		return request(url, new JSONObject(), new Headers.Builder().build());
	}
	@Override
	public Request request(String url, Headers headers) {
		return request(url, new JSONObject(), headers);
	}
	@Override
	public Request request(Builder builder) {
		return builder.build();
	}
	@Override
	public Request request(String url, JSONObject jsonObject) {
		return request(url, jsonObject, new Headers.Builder().build());
	}
	@Override
	public Request request(String url, JSONObject jsonObject, Headers headers) {
		if (jsonObject==null) {
			jsonObject=new JSONObject();
		}
		if (headers==null) {
			headers=new Headers.Builder().build();
		}
		//添加头部
		for (int i = 0; i < headers.size(); i++) {
			requestBuilder.addHeader(headers.name(i), headers.value(i));
		}
		// 使用的是get方法
		if (jsonObject.size()==0) {
			request=requestBuilder.url(url).build();
			for (int i = 0; i < headers.size(); i++) {
				 requestBuilder.removeHeader(headers.name(i));
			}
			return request; 
		}
		else {
			request=requestBuilder.url(url).post(formBody(jsonObject)).build();
			for (int i = 0; i < headers.size(); i++) {
				requestBuilder.removeHeader(headers.name(i));
			}
			return request;
		}
	}
	@Override
	public Request requestJson(String url, JSONObject jsonObject) {
		return requestJson(url, jsonObject, new Headers.Builder().build());
	}
	@Override
	public Request requestJson(String url, JSONObject jsonObject, Headers headers) {
		if (jsonObject==null) {
			jsonObject=new JSONObject();
		}
		if (headers==null) {
			headers=new Headers.Builder().build();
		}
		//添加头部
		for (int i = 0; i < headers.size(); i++) {
			requestBuilder.addHeader(headers.name(i), headers.value(i));
		}
		// 使用的是get方法
		if (jsonObject.size()==0) {
			request=requestBuilder.url(url).build();
			for (int i = 0; i < headers.size(); i++) {
				 requestBuilder.removeHeader(headers.name(i));
			}
			return request; 
		}
		else {
			request=requestBuilder.url(url).post(jsonBody(jsonObject)).build();
			for (int i = 0; i < headers.size(); i++) {
				requestBuilder.removeHeader(headers.name(i));
			}
			return request;
		}
	}
	@Override
	public Call call() {
		return call(request, okHttpClient);
	}
	@Override
	public Call call(Request request) {
		return call(request, okHttpClient);
	}
	@Override
	public Call call(Request request, OkHttpClient client) {
		return client.newCall(request);
	}
	@Override
	public Call call(String url, JSONObject jsonObject) {
		return call(url, jsonObject, new Headers.Builder().build(), okHttpClient);
	}
	@Override
	public Call call(String url, JSONObject jsonObject, Headers headers) {
		return call(url, jsonObject, headers, okHttpClient);
	}
	@Override
	public Call call(String url, JSONObject jsonObject, Headers headers, OkHttpClient client) {
		return client.newCall(request(url, jsonObject, headers));
	}
	@Override
	public Call call(String url) {
		return call(url, new JSONObject(), new Headers.Builder().build(), okHttpClient);
	}
	@Override
	public Call call(String url, Headers headers) {
		return call(url, new JSONObject(), new Headers.Builder().build(), okHttpClient);
	}
	@Override
	public Call callJson(String url, JSONObject jsonObject) {
		return callJson(url, jsonObject, new Headers.Builder().build(), okHttpClient);
	}
	@Override
	public Call callJson(String url, JSONObject jsonObject, Headers headers) {
		return callJson(url, jsonObject, headers, okHttpClient);
	}
	@Override
	public Call callJson(String url, JSONObject jsonObject, Headers headers, OkHttpClient client) {
		return client.newCall(requestJson(url, jsonObject, headers));
	}
	@Override
	public RequestBody jsonBody(Properties props) {
		return null;
	}
	@Override
	public RequestBody jsonBody(JSONObject jsonObject) {
		MediaType mt=MediaType.parse("application/json; charset=utf-8");
		RequestBody rb=RequestBody.create(mt, jsonObject.toJSONString());
		return rb;
	}
	@Override
	public FormBody formBody(Properties props) {
		
		
		return null;
	}
	@Override
	public FormBody formBody(JSONObject jsonObject) {
		FormBody.Builder fb=new FormBody.Builder();
		Set<String>keys=jsonObject.keySet();
		for (String key : keys) {
			fb.add(key, jsonObject.getString(key));
		}
		return fb.build();
	}
	@Override
	public Response excute() {
		try {
			return okHttpClient.newCall(request).execute();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public Response excute(Request request) {
		try {
			return okHttpClient.newCall(request).execute();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public Response excute(Request request, OkHttpClient client) {
		try {
			return client.newCall(request).execute();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public Callback enqueue() {
		okHttpClient.newCall(request).enqueue(callback);
		return callback;
	}
	@Override
	public Callback enqueue(Request request) {
		okHttpClient.newCall(request).enqueue(callback);
		return callback;
	}
	@Override
	public Callback enqueue(Request request, OkHttpClient client) {
		client.newCall(request).enqueue(callback);
		return callback;
	}
	@Override
	public Callback enqueue(Request request, OkHttpClient client, Callback callback) {
		client.newCall(request).enqueue(callback);
		return callback;
	}
	
	
	
	/*@Override
	public Response post() {
		return excute();
	}
	@Override
	public Response post(String url, JSONObject jsonObject) {
		return excute(request(url, jsonObject));
	}
	@Override
	public Response post(String url, JSONObject jsonObject, Headers headers) {
		return excute(request(url, jsonObject, headers));
	}
	@Override
	public Response postJson(String url, JSONObject jsonObject) {
		return excute(requestJson(url, jsonObject));
	}
	@Override
	public Response postJson(String url, JSONObject jsonObject, Headers headers) {
		return excute(requestJson(url, jsonObject, headers));
	}
	@Override
	public Response post(OkHttpClient client) {
		return excute(request, client);
	}
	@Override
	public Response post(String url, JSONObject jsonObject, OkHttpClient client) {
		return excute(request(url, jsonObject), client);
	}
	@Override
	public Response post(String url, JSONObject jsonObject, Headers headers, OkHttpClient client) {
		return excute(request(url, jsonObject, headers), client);
	}
	@Override
	public Response postJson(String url, JSONObject jsonObject, OkHttpClient client) {
		return excute(requestJson(url, jsonObject), client);
	}
	@Override
	public Response postJson(String url, JSONObject jsonObject, Headers headers, OkHttpClient client) {
		return excute(requestJson(url, jsonObject, headers), client);
	}
	@Override
	public Callback postEnqueue() {
		return enqueue();
	}
	@Override
	public Callback postEnqueue(String url, JSONObject jsonObject) {
		return enqueue(request(url, jsonObject));
	}
	@Override
	public Callback postEnqueue(String url, JSONObject jsonObject, Headers headers) {
		return enqueue(request(url, jsonObject, headers));
	}
	@Override
	public Callback postJsonEnqueue(String url, JSONObject jsonObject) {
		return enqueue(requestJson(url, jsonObject));
	}
	@Override
	public Callback postJsonEnqueue(String url, JSONObject jsonObject, Headers headers) {
		return enqueue(requestJson(url, jsonObject, headers));
	}
	@Override
	public Callback postEnqueue(Callback callback) {
		okHttpClient.newCall(request).enqueue(callback);
		return callback;
	}
	@Override
	public Callback postEnqueue(String url, JSONObject jsonObject, Callback callback) {
		enqueue(request(url, jsonObject), okHttpClient, callback);
		return callback;
	}
	@Override
	public Callback postEnqueue(String url, JSONObject jsonObject, Headers headers, Callback callback) {
		return enqueue(request(url,jsonObject,headers), okHttpClient, callback);
	}
	@Override
	public Callback postJsonEnqueue(String url, JSONObject jsonObject, Callback callback) {
		return enqueue(requestJson(url, jsonObject), okHttpClient, callback);
	}
	@Override
	public Callback postJsonEnqueue(String url, JSONObject jsonObject, Headers headers, Callback callback) {
		return enqueue(requestJson(url, jsonObject, headers), okHttpClient, callback);
	}
	@Override
	public Callback postEnqueue(OkHttpClient client) {
		return enqueue(request, client);
	}
	@Override
	public Callback postEnqueue(String url, JSONObject jsonObject, OkHttpClient client) {
		return enqueue(request(url, jsonObject), client);
	}
	@Override
	public Callback postEnqueue(String url, JSONObject jsonObject, Headers headers, OkHttpClient client) {
		return enqueue(request(url, jsonObject, headers), client);
	}
	@Override
	public Callback postJsonEnqueue(String url, JSONObject jsonObject, OkHttpClient client) {
		return enqueue(requestJson(url, jsonObject), client);
	}
	@Override
	public Callback postJsonEnqueue(String url, JSONObject jsonObject, Headers headers, OkHttpClient client) {
		return enqueue(requestJson(url, jsonObject, headers), client);
	}
	@Override
	public Callback postEnqueue(Callback callback, OkHttpClient client) {
		return enqueue(request, client, callback);
	}
	@Override
	public Callback postEnqueue(String url, JSONObject jsonObject, Callback callback, OkHttpClient client) {
		return enqueue(request(url, jsonObject), client, callback);
	}*/
	
	
	/*public Response excute() {
		response = null;
		if (request!=null) {
			try {
				response=okHttpClient.newCall(request).execute();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return response;
	}
	
	public Response excute(Request request) {
		response = null;
		if (request!=null) {
			try {
				response=okHttpClient.newCall(request).execute();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return response;
	}*/
	
	
}
