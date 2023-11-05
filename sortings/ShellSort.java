package sortings;

public class ShellSort {
	
	public static void sort(int [] arr)
	{
		int n = arr.length;
		
	for(int gap = n/2 ; gap > 0 ; gap/=2)
	{
		for ( int i = gap ; i < n ; i++ )
		{
			
			int temp = arr[i];
			int j;
			
	for(  j =i ; j>= gap && arr[j - gap] > temp; j-=gap)
	{
		arr[j] = arr [j-gap];
	}
	System.out.println(j);
		arr[j] = temp;
				
		}			
	}		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = { 64 , 25 , 12 , 22 , 11};
		sort(arr);
		System.out.println("sorted array");
		for(int num : arr)
		{
			System.out.println(num+" ");
		}
		
	}

}
