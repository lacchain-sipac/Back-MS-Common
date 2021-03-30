package com.invest.honduras.error;

import com.invest.honduras.http.HttpResponse;

public class GeneralErrorResponse extends HttpResponse<String> {

	public GeneralErrorResponse(int status, String error) {
		super(status, null, error);
	}

}
