public class PowerOf2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 50;
		int i = PowerOf2(n);
		
		System.out.printf("The Power of 2 under %d", n);
	}

	public static int PowerOf2(int n) {
		int curr;
		
		if (n == 1)
			curr = 1;
		else if (n == 2)
			curr = 2;
		else
		{
			int prev = PowerOf2(n/2);			
			curr = prev * 2;
		}
		
		System.out.println(curr);
		return curr;
	}	
}
