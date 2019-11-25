import java.util.*;

class BMS extends Thread
{
 public void run()
 {
  for(int i=0;i<5;i++)
  {
   System.out.println("BMS College of Engineering");
   try{
       Thread.sleep(10000);
      }catch(Exception e){};
  }
 }
}

class CSE extends Thread
{
 public void run()
 {
  for(int i=0;i<5;i++)
  {
   System.out.println("Computer Science and Engineering");
   try{
       Thread.sleep(10000);
      }catch(Exception e){};
  }
 }
}

public class Threadlab9
{
 public static void main(String args[])
 {
  BMS a1=new BMS();
  CSE a2=new CSE();

  a1.start();
  a2.start();
 }
}