import java.util.Arrays;
class zeroOne{
    	public static void main(String[] args) {
		
		int[] arr = {0, 1, 0, 0, 0};
		
		for(int e: arr) {
			System.out.print(e + " ");
		}
		int n = arr.length;
		int temp = 0;
		
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				if(arr[i] == 1 && arr[j] == 0) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("\n" + Arrays.toString(arr));
	}

}
    
