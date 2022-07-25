package Diamond;

public class Diamond1 implements First, Second 
{  
    public void show() 
    {  
        First.super.show(); 
        Second.super.show(); 
    } 
    public static void main(String args[]) 
    { 
        Diamond1 ob = new Diamond1(); 
        ob.show(); 
    } 
}
