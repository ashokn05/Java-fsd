package Map;

import java.util.*;
import java.util.Map.Entry;
public class Map {

	public static void main(String[] args) {
		

		
		HashMap<Integer,String> ha=new HashMap<Integer,String>();      
	      ha.put(1,"abc");    
	      ha.put(2,"def");    
	      ha.put(3,"ghi");   
	       
	      System.out.println("\nTe Hashmap are: ");  
	      for(Entry<Integer, String> m:ha.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }

	       
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"jkl");  
	      ht.put(5,"mno");  
	      ht.put(6,"pqr");  
	      ht.put(7,"stu");  

	      System.out.println("\nThe HashTable are: ");  
	      for(Entry<Integer, String> n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      

	      
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"vwx");    
	      map.put(9,"y21");    
	      map.put(10,"r15");       
	      
	      System.out.println("\nThe TreeMap are: ");  
	      for(Entry<Integer, String> l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	   }  
}

