package com.Raj;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectToJson {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		customer c= new customer(111,"raj","raj.kayyam1@gmail.com");
		//convert Object to json format
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("customer.json"),c);
		System.out.println("completed");
	}

}