package presentation;

import java.util.Scanner;

import javax.print.attribute.standard.JobOriginatingUserName;

import dao.UserDao;
import dao.UserDaoImpl;
import exception.SystemException;
import model.UserPojo;
import service.UserService;
import service.UserServiceImpl;

public class BankingApplicationSystem {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		UserService testUserService = new UserServiceImpl();
		char proceed = 'y';

		while (proceed == 'y') {
			System.out.println("*****************************");
			System.out.println("BANKING APPLICATION SYSTEM");
			System.out.println("*****************************");
			System.out.println("1. Register");
			System.out.println("2. Login");
			System.out.println("*****************************");
			System.out.println("Please enter an option:");
			int option = scan.nextInt();
			System.out.println("*****************************");
			switch (option) {

			case 1:
				UserPojo newuserpojo = new UserPojo();
				System.out.println("Please enter your UserName : ");
				scan.nextLine();
				newuserpojo.setUserName(scan.nextLine());
				System.out.println("Please enter emailid : ");
				newuserpojo.setEmailId(scan.nextLine());
				System.out.println("Please enter password : ");
				newuserpojo.setPassword(scan.nextLine());
				System.out.println("Please enter phoneno : ");
				newuserpojo.setPhoneNo(scan.nextInt());
				UserPojo userPojo = null;
				try {
					System.out.println("executed");
					userPojo = testUserService.addUser(newuserpojo);
					System.out.println("executed");
				} catch (SystemException e) {
					System.out.println(e.getMessage());
					break;
				}
				System.out.println("*****************************");
				System.out.println("New User added successfully! \nUser NAME is :" + userPojo.getUserName());
				System.out.println("*****************************");
				break;
			case 2:
				UserPojo viewUserPojo = null;
				UserService userService = new UserServiceImpl();
				System.out.println("please enter your username :");
				scan.nextLine();
				viewUserPojo.setUserName(scan.nextLine());
				System.out.println("please enter your password :");
				scan.nextLine();
				viewUserPojo.setPassword(scan.nextLine());

				try {
					viewUserPojo = userService.loginUser(null, null);
				} catch (SystemException e) {
					System.out.println(e.getMessage());
					break;
				}

				if (viewUserPojo == null) {
					System.out.println("*****************************");
					System.out.println("Product ID does not exist. \nPlease enter a valid Product ID!");
					System.out.println("*****************************");
					break;
				} else {
					System.out.println("*****************************");
					System.out.println("Product to be updated...");
					System.out.println("*****************************");
					System.out.println("Product ID : " + viewUserPojo.getUserName());
					System.out.println("Product Name : " + viewUserPojo.getEmailId());
					System.out.println("Product Description : " + viewUserPojo.getPassword());
					System.out.println("Product Cost : " + viewUserPojo.getPhoneNo());
					System.out.println("*****************************");
					System.out.println("Please enter new Product Cost :");

				}
			}
			System.out.println("*******************************************************************");
			System.out.println("Thank you for using Banking Application System!!");
			System.out.println("*******************************************************************");
			System.exit(0);

		}

	}
}
