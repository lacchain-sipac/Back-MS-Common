package com.invest.honduras.vc;

import java.io.Serializable;
import java.util.Date;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class VerifiableCredential<T>  implements Serializable{
	
	private static final long serialVersionUID = -2861201512355619017L;
	
	@SerializedName("@context")
	private String[] context;
	//private String id;
	private String[] type;
	
	private String issuer;
    
	private Date issuanceDate;
	
	private Date expirationDate;
    
	private T credentialSubject;
	
	private Proof proof;
	
	public VerifiableCredential(){
		this.context = ConstansVC.CONTEXT_CREDENTIAL;
		this.type = ConstansVC.TYPE_CREDENTIAL;
	}

}
