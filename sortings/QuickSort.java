package sortings;

public class QuickSort {
	
	public static void sort(int  []  arr, int low , int high)
	{
		if (low < high) {
			int index = partition (arr,low,high);
			sort(arr,low,index-1);
			sort(arr, index+1,high);}
		}
	
	private static int partition(int[] arr , int low,int high)
	{
		int pivot = arr[high];
		int i = low - 1 ;
		for(int j = low ; j<high ; j++)
		{
			if(arr[j] < pivot)
			{
				i++;
				swap(arr,i,j);
			}
		}
		swap (arr , i+1 , high);
		return i+1;
	}
		
	public static void swap(int [] arr , int i , int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {64,25,12,22,11};
	sort(arr , 0 , arr.length-1);
	for(int num: arr)
	{
		System.out.println(num+" ");
	}
		
	}

}
