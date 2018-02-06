
public class tester 
{

	public static void main(String[] args) 
	{
		String [] list1 = { "ab","bc" };
		String [] list2 = { "bc", "ab"};
		merge(list1,list2);
	}

	public static  String[] merge(String [] list1, String [] list2) 
	{
		//Precondition : Both lists are sorted
	
		String [] full = new String [list1.length+list2.length];
		
		int j = 0;
		int l = 0;
		int r = 0;
		
		while(j < full.length) 
		{
			if (list1[l].compareTo(list2[r]) > 0)
			{
				full[j] = list2[r];
				j++;
				r++;
			}			
			
			else 
			{
				full[j] = list1[l];
				j++;
				l++;
			}
		}
		return full;
	}
	
	//public static int partition(int [] list) 
	{
		
	}

		//Swaps two items in an array of Strings
		public static void swappers(String[] test, int x, int y) 
		{
			String holder = test[x];
			test[x] = test[y];
			test[y] = holder;
		}
		
		//Swaps two items in an array of integers
		public static void swapperi(int [] arr, int x, int y) 
		{
			int holder = arr[x];
			arr[x] = arr[y];
			arr[y] = holder;	
		}
}
