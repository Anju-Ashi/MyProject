package javapractise;

import java.util.ArrayList;

public class array {

	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<>();

	    // add elements in the array list
	    a.add(100);
	    a.add(200);
	    a.add(300);
	    System.out.println("ArrayList: " + a);
	     

	    a.add(3,700);
	    System.out.println(a);
	    
	    a.set(2, 900);
	    System.out.println(a);
	    
	    a.contains(900);
	    System.out.println(a);
	    
	    int b=a.size();
	    System.out.println(b);
	    
	    a.lastIndexOf(700);
	    System.out.println(b);
	    
	    a.add(4,600);
	    System.out.println(a);
	    
	    a.remove(3);
	    System.out.println(a);
	    
	    int i=a.indexOf(600);
	    System.out.println(i);
	  
	    
    
	}
}
	