import java.util.Scanner;
class AreaRec
{
  int l,w,area;
Scanner sc = new Scanner(System.in);
  public void input()
   {
     System.out.println("enter length");
     l=sc.nextInt();
     System.out.println("enter width");
     w=sc.nextInt();
    }
   public void process()
    {
     System.out.println("process l*w ");
      area=l*w;
     }
    public void output()
    {
      System.out.println("Area of rectangle is "+area);
    }

public static void main(String args[])
{ 
 AreaRec pg= new AreaRec();
  pg.input();
   pg.process();
    pg.output();
}
}
  

output:--
enter length
10
enter width
5
process
Area of rectangle is 50
