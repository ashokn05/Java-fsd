package methods;

public class methodoverloading {
	
public void area1(int a)
    {
         System.out.println("Area of Square : "+(a*a));
    }
    public void area(int r) 
    {
         System.out.println("Area of Circle : "+(3.14*r*r));
    }

    public static void main(String args[])
   {

methodoverloading ob=new methodoverloading();
       ob.area1(10);
       ob.area1(5);  
   }
}

