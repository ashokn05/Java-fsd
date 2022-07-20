package Access_modifiers;

class defaultaccess
{ 
  void display() 
     { 
         System.out.println("You are using defalut access specifier"); 
     } 
} 
public class Default {

	public static void main(String[] args) {
		System.out.println("Dafault Access Specifier");
		defaultaccess d = new defaultaccess(); 		  
        d.display(); 

	}
}

