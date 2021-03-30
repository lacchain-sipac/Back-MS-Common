package com.invest.honduras.http;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.invest.honduras.enums.TypeStatusCode;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class HttpResponse<T> {
	
	 private String status;
	 private T data;
	 private String error;
	 private String message;
	 public HttpResponse(int status, T data){
		 this.status = status==200?TypeStatusCode.OK.getCode():status+"";
		 this.data = data;
		 
		 if(status == 200) {
			 message = TypeStatusCode.OK.getMessage();
		 }
	//	 this.message = message;
	 }
	 
	 public HttpResponse(int status,T data, String error){
		 this.status = status==200?TypeStatusCode.OK.getCode():status+"";
		 this.data = data;
		 this.error = error;
	//	 this.message = message;
	 }
	       

}
