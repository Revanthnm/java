import Cie.*;

import See.*;

import java.util.*;


class packDemo{
	
	public static void main(String args[]){
	
		
		Internals intOb = new Internals();
		
		Student stuOb = new Student();
		
		External extOb = new External();
		
	
		Scanner sc = new Scanner(System.in);
		

		System.out.print("Enter the Name of Student : ");
	
		stuOb.name = sc.next();
		
		System.out.print("Enter the USN of Student : ");
		
		stuOb.usn = sc.next();
		
		System.out.print("Enter the Sem of Student : ");
	
		stuOb.sem = sc.nextInt();
		
		System.out.println("Enter the Internal marks in 5 subjects :");
	
		int i;
		
		for(i = 0; i < 5; i++){
		
			intOb.marks[i] = sc.nextInt();
		
		}
		
		System.out.println("Enter the External marks in 5 subjects :");
	
		for(i = 0; i < 5; i++){
			
			extOb.seemarks[i] = sc.nextInt();
		
		}
		
		System.out.println("Student Info : \nName : " + stuOb.name + "\nUSN : " + stuOb.usn + "\nSem : " + stuOb.sem + "\nFinal Marks in 5 courses :");
		
		for(i = 0; i < 5; i++){
			
			System.out.println("Sub " + (i+1) + " : " + ((extOb.seemarks[i]/2) + intOb.marks[i]));
		
		}
	
	}

}
