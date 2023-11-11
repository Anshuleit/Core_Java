package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1= new ArrayList<String>();
		
		list1.add("Apple");
		list1.add("Mango");
		//System.out.println(list1);
		
		//list1.remove(0);
		
		//System.out.println(list1);
		
		//System.out.println(list1.get(0));
		
		list1.add("Orange");
		list1.add("Banana");
		
		//System.out.println(list1.get(list1.size()-1));
		
		list1.set(0, "Pomegrant");
		
		//System.out.println(list1);
		
			
			for(int i=0;i<list1.size();i++) {
				
			System.out.println(list1.get(i));	
			
			if(list1.get(i).equals("Mango"))
			{
				System.out.println("present at" + i);
			}
		}
			
			Collections.sort(list1);
			System.out.println(list1);
			
			Collections.sort(list1, Collections.reverseOrder());
			System.out.println(list1);
			
			
			
			
			
		}
		
		

}
