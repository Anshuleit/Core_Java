package test;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= " I am feeling lucky";
		char ch;
		String p= " ";
		for(int i=(s.length()-1);i>0;i--)
		{
			ch= s.charAt(i);
			p=p+ch;
		}
		System.out.println(p);
		
		
		int num = 10282023;
		int sum=0;
		int c=0, d;
		while(num!=0)
		
		{
			d= num%10;
			c= c*10+d;
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println(sum);
		System.out.println(c);
	}

}
