public class Maths{


	public static void main(String args[]){
		System.out.println(countDigits(121));
	}

	private static int countDigits(int n){
		int count = 0;

		while(n != 0){
			count++;
			n /= 10;
		}


		return count;
	}

}