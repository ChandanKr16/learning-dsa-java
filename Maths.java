public class Maths{


	public static void main(String args[]){
		//System.out.println(countDigits(7));
		//System.out.println(isPalindrome(3634));
		//System.out.println(countTrailingZeros(10));
		printPrimeNumbersSieve(100);
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


	private static int countTrailingZeros(int num){

		int count = 0;

		for(int i = 5; i <= num; i=i*5){
			count += num / i;
		}

		return count;

	}


	private static void printPrimeNumbersSieve(int num){

		boolean isPrime[] = new boolean[num+1];


		for(int i = 2; i*i <= num; i++){

			if(!isPrime[i]){
				for(int j = i*2; j <=  num; j=j+i){
					isPrime[j] = true;
				}
			}

		}

		for(int i = 2; i <= num; i++){
			if(!isPrime[i]){
				System.out.print(i + " ");
			}
		}


	}



}