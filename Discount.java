import java.util.Scanner;
class  Discount
{
 public static void main(String args[])
{
   String str1="Premium",str2="Non-Premium";
   String a;
    double res=0, pur;
  Scanner sc = new Scanner(System.in);
     System.out.println("choose one from:--\n Premium\n Non-Premium\n");
    a=sc.nextLine();
     System.out.println("enter purchase amount");
     pur=sc.nextInt();
    if(str1.equalsIgnoreCase(a) && pur>=1000)
     {
      res=pur-(pur*0.2);
       System.out.println("your Discount amount "+(pur*0.2));
      System.out.println("your amount after 20% discount "+res);
       }
      else if(str2.equalsIgnoreCase(a) && pur>=2000)
      {
       res=pur-(pur*0.15);
      System.out.println("your Discount amt "+(pur*0.15));
      System.out.println("your amount after 15% discount "+res);

      }
      else {
      System.out.println("Invalid input");
      }
}
}
 

//output:--
choose one from:--
 Premium
 Non-Premium
non-premium
enter purchase amount
3900
your Discount amt 585.0
your amount after 15% discount 3315.0
-------------------------------------
 choose one from:--
 Premium
 Non-Premium

premium
enter purchase amount
2560
your purchases 2560.0
your amount after 20% discount 2048.0

