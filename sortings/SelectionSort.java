package sortings;

public class SelectionSort {

	public static void main(String[] args) {
	
		int arr[] = {3,1,-2,7,4,0};
		
		int n = arr.length;
		
		for(int i=0 ; i < n-1 ; i++) {
			
			int minind = i;
			
			for(int j=i; j<n; j++ ) {
				
				if(arr[j] < arr[minind])
				{
					minind = j;
					
				}
			}
			int temp = arr [i];
			arr[i] = arr [minind];
			arr[minind] = temp;
			
		}
		
		for (int item : arr)
		{
			System.out.println(item+" ");
		}
	}

}
