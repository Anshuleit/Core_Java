package test;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] a= {10,20,30};
		 int sum=0;
		 for(int b:a)
		 {
			 sum=sum+b;
			
		 }
		 System.out.println(sum);
		 
		 // words
		 String s= "Hie Everyone";
		 int count=1;
		 for(int x=0;x<(s.length());x++)
		 {
			 if(s.charAt(x)==' ')
			 {
				 count=count+1;
			 }
		 }
		 System.out.println(count);
		 
		 System.out.println(s.split(" ").length);
		 
	}

}
