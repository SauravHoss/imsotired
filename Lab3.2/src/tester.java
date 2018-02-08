
public class tester 
{

	public static void main(String[] args) 
	{
		String [] list1 = { "b","ab", "cc" };
		String [] list2 = { "va", "a", "v"};
		merge(list1,list2);
		
		int [] listy = {5,1,4,2,7,8,9};
		partition(listy);
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
		System.out.println(java.util.Arrays.toString(full));
	}
	
	public static int partition(int [] list)
	{
		//Takes an array, picks first number as pivot and puts smaller numbers on left side, bigger on right
		
	    int base = list[0];    
	    int temp = 0;
	    int ni = 0;
	    int last = list.length -1;

	    for(int i = 1; i < list.length; i++)
	    {
	        if( list[i] <= base)
	        {
	            temp = list[i];
	            list[i] = base;
	            list[i-1] = temp;             
	            ni = i;
	        } 
	        else if(list[i] > base && last > i)
	        {
	            temp = list[i];
	            list[i] = list[last];
	            list[last] = temp;
	            last -= 1;
	            i--;
	        }
	    }
	    
	    System.out.println(java.util.Arrays.toString(list));
	    System.out.println(ni);
	    return ni;
	}
	
	//Swaps two items in an array of integers
		public static void swapperi(int [] arr, int x, int y) 
		{
			int holder = arr[x];
			arr[x] = arr[y];
			arr[y] = holder;	
		}
}