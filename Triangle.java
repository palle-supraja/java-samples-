import java.util.Scanner; 
class Triangle
{
 public static void main(String args[])
{
  int a,b,c;
  Scanner sc= new Scanner(System.in);
  System.out.println("enter three lengths of triangle side");
  a=sc.nextInt();
   b= sc.nextInt();
   c=sc.nextInt();
   
    if(a==b && b==c)
    {
     System.out.println("eauilateral triangle");
     }
    else if( a==b || a==c || b==c)
    {
     System.out.println("isosceles triangele");
    }
    else
    {
     System.out.println("scalene Triangele");
     }
   }
}
  
output:--

enter three lengths of triangle side
10
5
5
isosceles triangele
