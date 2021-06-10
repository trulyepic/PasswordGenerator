package passwordapp;

import java.util.Scanner;

public class Password {
	
	String userEntry;
	Scanner in = new Scanner(System.in);
	
	
	public void generatePassword() {
		System.out.println("Enter length of password in integer: ");
		while(true) {
			
			try {
			
			userEntry = in.nextLine();
			int num = Integer.parseInt(userEntry);
	
			String userGeneratedPassword = randomPass(num);
			System.out.println("Your password is: " + userGeneratedPassword );
			break;
			}catch(Exception e) {
				System.out.println("please enter only integer value: ");
			}
			
		}
	
	}
	
	private String randomPass(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890*&%$$#$#";
		char[] password = new char[length];
		
		for (int i = 0; i <length; i++) {
			
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
			
		}
		return new String(password);
	}
	


}
