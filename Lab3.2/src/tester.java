
public class tester 
{

	public static void main(String[] args) 
	{
		String [] list1 = { "b","ab", "cc" };
		String [] list2 = { "va", "a", "v"};
		merge(list1,list2);
		
		int [] listy = {1,9,5,2,5,6};
	//	partition(listy, 1, 6);
	}

	public static void merge(String [] list1, String [] list2) 
	{
		//Precondition : Both lists are sorted
	
		String [] full = new String [(list1.length) + (list2.length)];
		
		int j = 0;
		int l = 0;
		int r = 0;
		
		while(l < list1.length && r < list2.length) 
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
		//return full;
		System.out.print(java.util.Arrays.toString(full));
	}
	
	 public static int partition( int [] arr, int low, int high)
	 {
		   int pivot = arr[0];  
		 
		    int i = (low - 1);

		    for (int j = low; j <= high- 1; j++)
		    {
		       
		        if (arr[j] <= pivot)
		        {
		            i++; 
		            swapperi(arr, i, j);
		        }
		    }
		    swapperi(arr, i+1, high);
		    return (i + 1);
		}

	
	//Swaps two items in an array of integers
		public static void swapperi(int [] arr, int x, int y) 
		{
			int holder = arr[x];
			arr[x] = arr[y];
			arr[y] = holder;	
		}
	
	
	
}