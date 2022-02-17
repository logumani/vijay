package q2;

import java.util.Scanner;

public class Mark {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter the Student Id:");
int i = s.nextInt();
System.out.println("The Student ID is:"+i);
System.out.println("Enter the Student Name:");
String n = s.next();
System.out.println("The Student Name is:"+n);
System.out.println("Enter the Tamil Mark");
float t = s.nextFloat();
System.out.println("The Tamil Mark is:"+t);
System.out.println("Enter the English Mark");
float e = s.nextFloat();
System.out.println("The English Mark is:"+e);
System.out.println("Enter the Maths Mark");
float m = s.nextFloat();
System.out.println("The Maths Mark is:"+m);
System.out.println("Enter the Sceince Mark");
float sc = s.nextFloat();
System.out.println("The Science Mark is:"+sc);
System.out.println("Enter the S.Science Mark");
float ss = s.nextFloat();
System.out.println("The S.Scienc Mark is:"+ss);
//float tt=(float) ((t+e+m+sc+ss)/5);
//System.out.println("The Avg Mark is:"+tt);
//System.out.println("The S.Scienc Mark is:"+ss);
float aa= (float) (t+e+m+sc+ss);
System.out.println("The Total Mark of"+"\n"+n+"\t"+aa);
float tt=(float) ((t+e+m+sc+ss)/5);
System.out.println("The Avg Mark is:"+tt);
	}

}
