public class CountFreq{

	public static void main(String[] args) {
		int arr[] = {1};
		countFreq(arr);
	}


	private static void countFreq(int arr[]){

		int count = 1;

		for(int i = 1; i < arr.length; i++){
			if(arr[i-1] == arr[i]){
				count++;
			}
			else{
				System.out.println(arr[i-1] + " : " + count);
				count = 1;
			}
		}

		System.out.println(arr[arr.length-1] + " : " + count);

	}
}