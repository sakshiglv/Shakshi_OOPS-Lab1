package com.gratlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class EmpCredentialsImp implements EmpCredentials{

	@Override
	public String generateEmailId(String fname, String lname, String dept) {
		return fname+lname+"@"+dept+".gl.com";

	}

	@Override
	public String generatePassword() {
		String caps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String small = "abcdefghijklmnopqrstuvwxyz";
        String num = "0123456789";
        String spchr = "!@#$%^&*()";
        String combined = caps+small+num+spchr;
        
        Random random = new Random();
        String pass = "";
        
        for(int i = 0 ; i<8; i++) {
        	pass = pass +String.valueOf(combined.charAt((random.nextInt(combined.length()))));
        	
        }return pass ;
	}    

	@Override
	public void showDetails(Employee e) {
		System.out.println("Dear "+e.getFname()+" "+e.getLname()+" your generated credentials are as follow :" );
		System.out.println("Email >--- "+e.getEmailid());
		System.out.println("Password >--- "+e.getPassword());
		
		
	}

}
