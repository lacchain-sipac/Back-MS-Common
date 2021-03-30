package com.invest.honduras.model;
 
import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class BaseStorage{
	@Id
	private String id;
	private String fileName;
	private String contentType;
    private String observation;
    
    
}
