package String;

public class Day1_Anagram1 {

	static void sort( char [] arr)
	{
		int n = arr.length;
		for(int r=1 ; r<n ; r++)
		{
			for(int j=0 ; j<n-r ; j++)
			{
				if(arr[j] > arr [j+1])
				{
					char ch = arr[j];
					arr[j] = arr [j+1];
					arr[j+1] = ch;
				}
			}
		}
	}
	static boolean equals ( char[]arr1 , char[]arr2)
	{
		if ( arr1.length != arr2.length )
			return false;
		for(int i=0; i<arr1.length; i++)
		{
			if(arr1[i] != arr2[i])
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		
		String str1 = "TAND";
		String str2 = "DTBN";
		
		char [] arr1 = str1.toCharArray();
		char [] arr2 = str2.toCharArray();
		
		sort(arr1);
		sort(arr2);
	
		boolean anagram = equals ( arr1 , arr2);
		
		if(anagram)
		{
			System.out.println("yes");
		}
		else
			System.out.println("no");

	}

}
