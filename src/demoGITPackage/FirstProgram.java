package demoGITPackage;

public class FirstProgram {

	public static void main(String[] args) {
		
		int num= 5678;
		int rev=0;
		for(;num!=0;num/=10)
		{
			int rem = num%10;
			rev=rev*10+rem;
		}
		System.out.println(rev);
		

	}

}
