class One
{
 void call()
{
System.out.println("one");
}
}
class Two extends One
{
  void call()
  {
System.out.println("two");
}
  void two()
  {
   System.out.println("two spe");
  }
}
class Three extends One
{
  void call()
  {
  System.out.println("three");
  }  
   void three()
  {
  System.out.println("three spe");
  }
}
 public class HirEx
{
 public static void main(String args[])
{
   Two t = new Two();
    t.call();
    t.two();
   Three th= new Three();
    th.call();
   th.three();

}
}
