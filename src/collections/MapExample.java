package collections;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap <String,Integer> map1= new HashMap<String,Integer>();
		map1.put("Apple", 100);
		map1.put("Mango", 70);
		System.out.println(map1.get("Mango"));
		
		for(String s: map1.keySet())
		{
			System.out.println(map1);
		}
		
		
 
	}

}
