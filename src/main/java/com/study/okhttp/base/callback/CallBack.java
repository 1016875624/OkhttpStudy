package com.study.okhttp.base.callback;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public class CallBack implements Callback {
	private Call call;
	private Response response;
	
	@Override
	public void onFailure(Call call, IOException e) {
		this.call=call;
		response=null;
		e.printStackTrace();
	}

	@Override
	public void onResponse(Call call, Response response) throws IOException {
		this.call=call;
		this.response=response;
	}

	public Call getCall() {
		return call;
	}

	public Response getResponse() {
		return response;
	}

	
}
