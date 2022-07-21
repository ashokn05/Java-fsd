package Collections;

import java.util.*;

public class Collections {

	public static void main(String[] args) {

		System.out.println("ArrayList");
		ArrayList<String> place=new ArrayList<String>();   
	      place.add("Hyderbad");//
	      place.add("chennai");    	   
	      System.out.println(place);  
		

	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector<Integer> v = new Vector();
	      v.addElement(8); 
	      v.addElement(15); 
	      System.out.println(v);
		

	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> names=new LinkedList<String>();  
	      names.add("pushpa");  
	      names.add("RRR");  	      
	      Iterator<String> itr=names.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  
	       

	       System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(101);  
	       set.add(103);  
	       set.add(102);
	       set.add(104);
	       System.out.println(set);
	       
	       
	       
	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	       set2.add(15);  
	       set2.add(13);  
	       set2.add(12);
	       set2.add(14);	       
	       System.out.println(set2);
	      	} 
	      }  
	}

