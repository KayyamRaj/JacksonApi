package com.Raj;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertJsontoJavaObject {
	public static void main(String[] args) throws Exception{
		//json to java object 
		File f= new File ("customer.json");
		ObjectMapper mapper= new ObjectMapper();
		customer cust=mapper.readValue(f, customer.class);
		System.out.println(cust);
	}

}
