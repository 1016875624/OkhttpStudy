package com.study.okhttp.base.jar;

import java.util.HashMap;
import java.util.List;

import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;

public class CookieJarImpl implements CookieJar {
	HashMap<String, List<Cookie>> cookieStore=new HashMap<>();
	@Override
	public List<Cookie> loadForRequest(HttpUrl url) {
		//根据host来获取cookie
		//according to the host to get cookie.
		return cookieStore.get(url.host());
	}

	@Override
	public void saveFromResponse(HttpUrl url, List<Cookie> cookies) {
		//如果已经有cookie 那么就直接在尾部添加就好了
		if (cookieStore.get(url.host())!=null) {
			cookieStore.get(url.host()).addAll(cookies);
		}
		//如果没有的话 直接添加
		else {
			cookieStore.put(url.host(), cookies);
		}
	}

}
