import java.util.*;
class Extra
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,res,sum=0;
System.out.println("enter a required table number:--");
int n=sc.nextInt();

int arr[] =new int[11];
for (i=0;i<=10;i++)
{
res=n*i;
arr[i]=res;
System.out.println(arr[i]);
sum=sum+arr[i];

}
System.out.println("sum is" +sum);

}
}
