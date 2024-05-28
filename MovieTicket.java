import java.util.Scanner;
class MovieTicket
{
public static void main(String args[])
{
 int price;
  Scanner sc= new Scanner(System.in);
  int age=0,time=0;
  System.out.println("enter your age:-");
   age=sc.nextInt();
  System.out.println("enter your movie time:--");
  time=sc.nextInt();
   if(age<5 || age>60)
      {
       System.out.println("you got free ticket..!");
        }
    else if(time>=12 || time<=5)
      {
       System.out.println("your ticket price is 250..!!");
      }
      else if(time>=5 || time<=9)
      {
       System.out.println("your ticket price is 300");
       }
      else
      {
       System.out.println("you ticket price is 200");
       }
   }
}
 output:--
 
enter your age:-
36
enter your movie time:--
6
your ticket price is 300
