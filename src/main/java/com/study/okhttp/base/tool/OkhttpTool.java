package com.study.okhttp.base.tool;

import java.util.Properties;

import com.alibaba.fastjson.JSONObject;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public interface OkhttpTool {
	Response post(Request request);
	Callback postEnqueue(Request request);
	Response post(Request request,OkHttpClient client);
	Callback postEnqueue(Request request,OkHttpClient client);
	Callback postEnqueue(Request request,OkHttpClient client,Callback callback);
	Response post();
	Response post(String url,JSONObject jsonObject);
	Response post(String url,JSONObject jsonObject,Headers headers);
	Response postJson(String url,JSONObject jsonObject);
	Response postJson(String url,JSONObject jsonObject,Headers headers);
	
	Response post(OkHttpClient client);
	Response post(String url,JSONObject jsonObject,OkHttpClient client);
	Response post(String url,JSONObject jsonObject,Headers headers,OkHttpClient client);
	Response postJson(String url,JSONObject jsonObject,OkHttpClient client);
	Response postJson(String url,JSONObject jsonObject,Headers headers,OkHttpClient client);
	
	Callback postEnqueue();
	Callback postEnqueue(String url,JSONObject jsonObject);
	Callback postEnqueue(String url,JSONObject jsonObject,Headers headers);
	Callback postJsonEnqueue(String url,JSONObject jsonObject);
	Callback postJsonEnqueue(String url,JSONObject jsonObject,Headers headers);
	
	Callback postEnqueue(Callback callback);
	Callback postEnqueue(String url,JSONObject jsonObject,Callback callback);
	Callback postEnqueue(String url,JSONObject jsonObject,Headers headers,Callback callback);
	Callback postJsonEnqueue(String url,JSONObject jsonObject,Callback callback);
	Callback postJsonEnqueue(String url,JSONObject jsonObject,Headers headers,Callback callback);
	
	Callback postEnqueue(OkHttpClient client);
	Callback postEnqueue(String url,JSONObject jsonObject,OkHttpClient client);
	Callback postEnqueue(String url,JSONObject jsonObject,Headers headers,OkHttpClient client);
	Callback postJsonEnqueue(String url,JSONObject jsonObject,OkHttpClient client);
	Callback postJsonEnqueue(String url,JSONObject jsonObject,Headers headers,OkHttpClient client);
	
	Callback postEnqueue(Callback callback,OkHttpClient client);
	Callback postEnqueue(String url,JSONObject jsonObject,Callback callback,OkHttpClient client);
	Callback postEnqueue(String url,JSONObject jsonObject,Headers headers,Callback callback,OkHttpClient client);
	Callback postJsonEnqueue(String url,JSONObject jsonObject,Callback callback,OkHttpClient client);
	Callback postJsonEnqueue(String url,JSONObject jsonObject,Headers headers,Callback callback,OkHttpClient client);
	
	Response get();
	Response get(String url);
	Response get(String url,Headers headers);
	
	Response get(OkHttpClient client);
	Response get(String url, OkHttpClient client);
	Response get(String url,Headers headers,OkHttpClient client);
	
	
	Callback getEnqueue();
	Callback getEnqueue(String url);
	Callback getEnqueue(String url,Headers headers);
	
	Callback getEnqueue(Callback callback);
	Callback getEnqueue(String url,Callback callback);
	Callback getEnqueue(String url,Headers headers,Callback callback);
	
	Callback getEnqueue(OkHttpClient client);
	Callback getEnqueue(String url,OkHttpClient client);
	Callback getEnqueue(String url,Headers headers,OkHttpClient client);
	
	Callback getEnqueue(Callback callback,OkHttpClient client);
	Callback getEnqueue(String url,Callback callback,OkHttpClient client);
	Callback getEnqueue(String url,Headers headers,Callback callback,OkHttpClient client);
	
	Request request(String url);
	Request request(String url, Headers headers);
	
	Request request(Request.Builder builder);
	
	Request request(String url,JSONObject jsonObject);
	Request request(String url,JSONObject jsonObject,Headers headers);
	
	Request requestJson(String url,JSONObject jsonObject);
	Request requestJson(String url,JSONObject jsonObject,Headers headers);
	
	/**
	* <p>方法名称: call</p>
	* <p>描述：默认的request 和client 进行请求</p>
	* @return Call 返回类型
	*/
	Call call();
	
	/**
	* <p>方法名称: call</p>
	* <p>描述：用默认的client 请求传入的request</p>
	* @param request
	* @return Call 返回类型
	*/
	Call call(Request request);
	
	
	/**
	* <p>方法名称: call</p>
	* <p>描述：用指定的client 请求 request</p>
	* @param request 
	* @param client
	* @return Call 返回类型
	*/
	Call call(Request request,OkHttpClient client);
	
	Call call(String url,JSONObject jsonObject);
	Call call(String url,JSONObject jsonObject,Headers headers);
	Call call(String url,JSONObject jsonObject,Headers headers,OkHttpClient client);
	
	Call call(String url);
	Call call(String url,Headers headers);
	
	Call callJson(String url,JSONObject jsonObject);
	Call callJson(String url,JSONObject jsonObject,Headers headers);
	Call callJson(String url,JSONObject jsonObject,Headers headers,OkHttpClient client);
	/**
	* <p>方法名称: jsonBody</p>
	* <p>描述：将properties 转换为json的requestbody</p>
	* @param props 包含要提交的值
	* @return RequestBody 返回类型
	*/
	RequestBody jsonBody(Properties props);
	
	/**
	* <p>方法名称: jsonBody</p>
	* <p>描述：创建jsonrequest</p>
	* @param jsonObject json对象
	* @return RequestBody 返回类型
	*/
	RequestBody jsonBody(JSONObject jsonObject);
	
	/**
	* <p>方法名称: formBody</p>
	* <p>描述：将传入的 properties 转换为OKhttp可以用的form对象</p>
	* @param props 包含要传参数的 form 数据
	* @return FormBody 返回类型
	*/
	FormBody formBody(Properties props);
	
	/**
	* <p>方法名称: formBody</p>
	* <p>描述：将传入的 properties 转换为OKhttp可以用的form对象</p>
	* @param props 包含要传参数的 form 数据
	* @return FormBody 返回类型
	*/
	FormBody formBody(JSONObject jsonObject);
	
	/**
	* <p>方法名称: excute</p>
	* <p>描述：用成员属性中的 client 和 request 发送请求</p>
	* @return Response 访问后的response对象
	*/
	Response excute();
	
	/**
	* <p>方法名称: excute</p>
	* <p>描述：用默认的client 请求传入的request对象</p>
	* @param request 要发送的request
	* @return Response 访问后的response对象
	*/
	Response excute(Request request);
	
	/**
	* <p>方法名称: excute</p>
	* <p>描述：自己提供 request 和 client 进行访问</p>
	* @param request 需要发送的请求对象
	* @param client 用来发送请求的client
	* @return Response 返回类型
	*/
	Response excute(Request request,OkHttpClient client);
	
	/**
	* <p>方法名称: enqueue</p>
	* <p>描述：使用异步的方法执行请求</p>
	* @return Call 返回类型
	*/
	Callback enqueue();
	
	/**
	* <p>方法名称: enqueue</p>
	* <p>描述：使用异步的方法进行请求request</p>
	* @param request 要进行请求的request
	* @return Callback 返回类型
	*/
	Callback enqueue(Request request);
	
	/**
	* <p>方法名称: enqueue</p>
	* <p>描述：使用异步的方式进行请求 进行请求传入的request 和client</p>
	* @param request 要请求的request
	* @param client 进行请求的client对象
	* @return Callback 返回类型
	*/
	Callback enqueue(Request request ,OkHttpClient client);
	
	/**
	* <p>方法名称: enqueue</p>
	* <p>描述：在个函数中可以自己决定callback 的方式</p>
	* @param request 要请求的request
	* @param client 进行请求的client对象
	* @param callback 自己重写的 callback对象
	* @return Callback 返回类型
	*/
	Callback enqueue(Request request,OkHttpClient client,Callback callback);
}
