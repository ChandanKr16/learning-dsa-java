public class Maths{


	public static void main(String args[]){
		System.out.println(countDigits(7));
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





}