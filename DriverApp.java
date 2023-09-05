package com.gratlearning.driverapp;

import java.util.Scanner;

import com.gratlearning.service.EmpCredentialsImp;
import com.greatlearning.model.Employee;

public class DriverApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your first name");
		String f = sc.next();
		System.out.println("Please enter your last name");
		String l = sc.next();
		
		Employee emp1 = new Employee(f , l);
		Employee emp2 = new Employee();
		emp2.setFname(f);
		emp2.setLname(l);
		
		EmpCredentialsImp cred = new EmpCredentialsImp();
		
		System.out.println("Please enter the department number from the following");
		
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. HumanResource");
		System.out.println("4. Legal");
		
		String genEmail = "";
		String genPassword = "";
		
		int choice = sc.nextInt();
		
		switch(choice){
		case 1 :  genEmail = cred.generateEmailId(emp1.getFname().toLowerCase(),emp1.getLname().toLowerCase(),"Technical");
		break;
		
		case 2 : genEmail = cred.generateEmailId(emp1.getFname().toLowerCase(),emp1.getLname().toLowerCase(),"Admin");
		break;
		
		case 3 : genEmail = cred.generateEmailId(emp1.getFname().toLowerCase(),emp1.getLname().toLowerCase(),"HumanResource");
		break;
		
		case 4 : genEmail = cred.generateEmailId(emp1.getFname().toLowerCase(),emp1.getLname().toLowerCase(),"Legal");
		break;
		
		default : System.out.println("Please enter correct number");
		
		}
		genPassword = cred.generatePassword();
		emp1.setEmailid(genEmail);
		emp1.setPassword(genPassword);
		cred.showDetails(emp1);
	}

}
