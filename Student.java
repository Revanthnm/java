package Cie;


import java.util.*;


public class Student{
	
	public String usn, name;
	
	public int sem;
	
	Scanner sc = new Scanner(System.in);
	
	public Student(){
		
		usn = "";
		
		name = "";
		
		sem = 0;
	
	}
	
	void input(){
		
		System.out.print("Enter USN of the Student : ");
		
		usn = sc.next();
		
		System.out.print("Enter Name of the Student : ");
		
		name = sc.next();
		
		System.out.print("Enter Sem of the Student : ");
		
		sem = sc.nextInt();

	}
	
}
