public class Maths{


	public static void main(String args[]){
		//System.out.println(countDigits(7));
		System.out.println(isPalindrome(3634));
	}

	private static int countDigits(int n){

		if(n == 0) return 1;
		
		return (int) (Math.log10(n) + 1);

		/*int count = 0;

		while(n != 0){
			count++;
			n /= 10;
		}


		return count;*/

	}

	private static boolean isPalindrome(int num){
		int temp = num;
		int rev = 0;

		while(temp != 0)
		{	
			rev = rev*10 + temp % 10;
			temp /= 10;
		}	

		return rev == num;
	}





}