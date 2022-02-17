package scan;

import java.util.Scanner;

public class Emo {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter employee age");
		byte age = s.nextByte();
        System.out.println("employee age is:"+age);	
        
        System.out.println("enter emplyoee atm pin");
        short pin = s.nextShort();
        System.out.println("emplyee atm pin is:"+pin);
        
        System.out.println("enter employee Pincode");
        int pincode = s.nextInt();
        System.out.println("employee pincode is"+pincode);
        
        System.out.println("enter employee phno");
       //** long phno = s.nextLong();78*/
        long phno = s.nextLong();
        System.out.println("employee phno is:"+ phno);
        
        System.out.println("enter employee salar");
        float sal = s.nextFloat();
        System.out.println("employee salary is:"+sal);
        
        System.out.println("employee name is");
	    s.nextLine();
        String nam = s.nextLine();
	    System.out.println("employee name is:"+nam);
	}

}
