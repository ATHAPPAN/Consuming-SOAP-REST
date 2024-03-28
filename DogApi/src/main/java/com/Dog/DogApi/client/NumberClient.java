package com.Dog.DogApi.client;

import java.math.BigInteger;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import com.dataaccess.webservicesserver.NumberToWords;
import com.dataaccess.webservicesserver.NumberToWordsResponse;

public class NumberClient extends WebServiceGatewaySupport{

	String uri="https://www.dataaccess.com/webservicesserver/NumberConversion.wso";

	
	public NumberToWordsResponse getWord (String number) {
		System.out.println("getWord");
		

		NumberToWords  numReq= new NumberToWords();
		numReq.setUbiNum(new BigInteger(number));

		NumberToWordsResponse resp= (NumberToWordsResponse) getWebServiceTemplate().marshalSendAndReceive(uri,numReq);
		System.out.println(resp);
		return resp;
	}



}
