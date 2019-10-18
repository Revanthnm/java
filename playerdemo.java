import java.util.*;

abstract class player
{
	String name;
	int matches_played;
	int average;

	public abstract void cal_average(String s1,int n);
	
	public void display()
	{
		System.out.print("\nName: "+name);
		System.out.print("\nMatches played: "+matches_played);
	}
}

class Batsman extends player
{
	int runs_scored;
	
	Scanner s=new Scanner(System.in);	

	public void cal_average(String s1,int m)
	{
		System.out.print("\nEnter runs scored by player: ");
		runs_scored=s.nextInt();
		name=s1;
		matches_played=m;
	}
	public void display()
	{
		super.display();
		average=runs_scored/matches_played;
		System.out.print("\nAverage runs scored: "+average);
	}
}

class Bowler extends player
{
	int runs_given;
	
	Scanner s=new Scanner(System.in);	

	public void cal_average(String s1,int m)
	{
		System.out.print("\nEnter runs given by player: ");
		runs_given=s.nextInt();
		name=s1;
		matches_played=m;
	}
	public void display()
	{
		super.display();
		average=runs_given/matches_played;
		System.out.print("\nAverage runs given: "+average);
	}
}		
	
class playerdemo
{
	public static void main(String args[])
	{
		int m,n,i,ch,ma;
		String s1;
	
		Scanner s=new Scanner(System.in);	

		System.out.print("\nEnter number of batsmans: ");
		m=s.nextInt();
			
		Batsman b1[]=new Batsman[m];
		
		System.out.print("\nEnter number of bowlers: ");
		n=s.nextInt();

		Bowler b2[]=new Bowler[n];
	
		while(true)
		{
			System.out.print("\nEnter choice:\n1.BATSMAN\n2.BOWLER\n3.EXIT\nCHOICE : ");
			ch=s.nextInt();
			
			switch(ch)
			{
				case 1:	for(i=0;i<m;i++)
					{
						System.out.print("\nEnter name of player: ");
						s1=s.next();
						System.out.print("\nEnter number of matches played: ");
						ma=s.nextInt();
						b1[i]=new Batsman();
						b1[i].cal_average(s1,ma);
						b1[i].display();
					}
					break;

				case 2:	for(i=0;i<m;i++)
					{
						System.out.print("\nEnter name of player: ");
						s1=s.next();
						System.out.print("\nEnter number of matches played: ");
						ma=s.nextInt();
						b2[i]=new Bowler();
						b2[i].cal_average(s1,ma);
						b2[i].display();
					}
					break;
	
				case 3:	System.exit(0);
	
				default:	System.out.print("\nINVALID INPUT");
			}
		}
	}
}
						
				
		