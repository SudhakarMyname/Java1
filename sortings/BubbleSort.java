package sortings;

public class BubbleSort {

	public static void main(String[] args) {
	
		int arr[] = { 2,1,8,-3,6,4,12};
		
		int n = arr.length;
		
		for(int i=0 ; i<n-1 ; i++ ) {
			boolean sort = true;
			for(int j = 0 ; j<n-1 ; j++) {
				
				if (arr[j+1] < arr[j])
				{
					int temp = arr [j+1];
					arr[j+1] = arr[j];
					arr[j] = temp ;
					sort = false;
					
					
				}}
				if(sort)
					break;
				
			}
		
		for( int item  : arr)
		{
			System.out.println(item + " ");
	
		}
	
	}

}
