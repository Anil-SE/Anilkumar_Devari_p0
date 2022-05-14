package presentation;


import java.util.Scanner;

import model.RegistrationPojo;
import service.RegistrationService;
import service.RegistrationServiceImpl;

public class BankingManagementSystem {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		RegistrationService registrationService = new RegistrationServiceImpl();
		
		char proceed = 'y';
		
		
		while(proceed == 'y') {
			
			System.out.println("*****************************");
			System.out.println("Registration MANAGEMENT SYSTEM");
			System.out.println("*****************************");
			System.out.println("1. register ");
			System.out.println("2. Sign in");
			System.out.println("5. Exit");
			System.out.println("*****************************");
			System.out.println("Please enter an option:");
			int option = scan.nextInt();
			System.out.println("*****************************");
			switch (option) {
			case 1:
				
				RegistrationPojo registrationPojo = new RegistrationPojo();
				System.out.println("Please enter new User Name : ");
				scan.nextLine();
				registrationPojo.setuserName(scan.nextLine());
				System.out.println("Please enter new Email Id : ");
				registrationPojo.setEmailId(scan.nextLine());
				System.out.println("Please password : ");
				registrationPojo.setPassword(scan.nextLine());
				System.out.println("Please phone number : ");
				registrationPojo.setPhoneNo(scan.nextInt());
				
				System.out.println("*****************************");
				System.out.println("New User added successfully! \nUser username is :" + registrationPojo.getuserName());
				System.out.println("*****************************");
				System.out.println("Do you want to continue?(y/n)");
				proceed = scan.next().charAt(0);
				break;

			
			}
		}
		


	}

}
