import java.util.*;
	
class student
{
	String name;
	String usn;
	String phno;

	Scanner s=new Scanner(System.in);

	public void getdata()
	{
		System.out.print("\nEnter student name: ");
		name=s.next();
		System.out.print("\nEnter student usn: ");
		usn=s.nextLine();
		System.out.print("\nEnter phone number:");
		phno=s.nextLine();
	}
	
	public void display()
	{
		System.out.print("\nName: "+name);
		System.out.print("\nUsn: "+usn);
		System.out.print("\nPhone number: "+phno);
	}
		
}

class marks extends student
{
	int n,totsee,totcie;
	int see[]=new int[10];
	int cie[]=new int[10];
	int cre[]=new int[10];
	
	Scanner s=new Scanner(System.in);
	
	public void getdata()
	{	
		super.getdata();
		System.out.print("\nEnter number of coures: ");
		n=s.nextInt();
		
		System.out.print("\nEnter SEE marks of "+n+" coures: ");
		for(int i=0;i<n;i++)
		{
			see[i]=s.nextInt();
		}

		System.out.print("\nEnter CIE marks of "+n+" coures: ");
		for(int i=0;i<n;i++)
		{
			cie[i]=s.nextInt();
		}

		System.out.print("\nEnter CREDITS of "+n+" coures: ");
		for(int i=0;i<n;i++)
		{
			cre[i]=s.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			totsee+=see[i];
			totcie+=cie[i];
		}		
	}
	
	public void display()
	{
		super.display();
		System.out.print("\nSEE marks: ");
		for(int i=0;i<n;i++)
			System.out.print(see[i]+ " \t");
		System.out.print("\n");
		System.out.print("\nCIE marks: ");
		for(int i=0;i<n;i++)
			System.out.print(cie[i]+ " \t");
		System.out.print("\n");
	}
}

class result extends marks
{
	int tot;
	char grade[]=new char[10];

	public void getdata()
	{
		super.getdata();
		for(int i=0;i<n;i++)
		{
			tot=see[i]+cie[i];
			if(tot>=90)
				grade[i]='S';
			else if(tot>=75 && tot<90)
				grade[i]='A';
			else if(tot>=60 && tot<75)
				grade[i]='B';
			else if(tot>=50 && tot<60)
				grade[i]='C';
			else if(tot>=40 && tot<50)
				grade[i]='D';
			else
				grade[i]='F';
		}
	}
	
	public void display()
	{
		super.display();
		System.out.print("\nGRADES: ");
		for(int i=0;i<n;i++)
			System.out.print(grade[i]+" \t");
		System.out.print("\n");
	}
}

class studentdemo
{
	public static void main(String args[])
	{
		int n;	
	
		Scanner s=new Scanner(System.in);
	
		System.out.print("\nEnter number of students: ");
		n=s.nextInt();
	
		result r[]=new result[n];
	
		for(int i=0;i<n;i++)
		{
			r[i]=new result();
			r[i].getdata();
		}
		System.out.print("\nStudents marks who has scored in SEE compared to CIE: ");
		for(int i=0;i<n;i++)
		{
			if(r[i].totsee>r[i].totcie)
				r[i].display();
		}
	}
}
		
		
	
		
	
	

	
	
		
		