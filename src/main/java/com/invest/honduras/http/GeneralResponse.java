package com.invest.honduras.http;

import com.invest.honduras.http.HttpResponse;

public class GeneralResponse extends HttpResponse<String> {

	public GeneralResponse(int status, String data ) {
		super(status, data );
	}

}
