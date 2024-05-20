public class Fover
{
  /*  public void fun(int x)
    {
        System.out.println(x);
    }
    public void fun(float f)
    {
        System.out.println(f);
    }
    public void fun(char c)
    {
        System.out.println(c);
    }
    public void fun(String name)
    {
        System.out.println(name);
    }*/
     public void dis(int x, float y)
     {
         System.out.println(x+ " " +y);
     }
     public void dis(float f, char c)
     {
         System.out.println(f+" "+c);
     }
     public void dis(char c, String s)
     {
         System.out.println(c+" "+s);
     }
     
      public static void main(String args[])
      {
          Fover fo = new Fover();
          /*fo.fun(10);
          fo.fun(5.5f);
          fo.fun('s');
          fo.fun("Supraja");*/
          fo.dis(5,3.05f);
          fo.dis(2.24f,'R');
          fo.dis('A',"anudip");
          
      }
}
