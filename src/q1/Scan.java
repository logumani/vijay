package q1;

import java.util.Scanner;

public class Scan {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Employee ID:");
		int i = s.nextInt();
		System.out.println("The Employee ID is:"+i);
		System.out.println("Enter the Employee Name:");
		String n = s.next();
		System.out.println("The Employee Name is:"+n);
		System.out.println("Enter the Employee Email:");
		String e = s.next();
		System.out.println("The Employee Email:"+e);
		System.out.println("Enter the Employee Phno:");
		long c = s.nextLong();
		System.out.println("The Employee Phno is:"+c);
		System.out.println("Enter the Employee Salary:");
		int sl = s.nextInt();
		System.out.println("The Employee Salary is:"+sl);
		System.out.println("Enter the Employee Gender:");
		String g = s.next();
		System.out.println("The Employee Gender is:"+g);
		//Next Line
		System.out.println("Enter the Employee City:");
		s.nextLine();
		String a = s.nextLine();
		System.out.println("The Employee City is:"+a);
		
	}

}
