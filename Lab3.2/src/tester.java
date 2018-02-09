
public class tester 
{

	public static void main(String[] args) 
	{
		//Testing Code
		String [] list1 = { "b","ab", "cc" };
		String [] list2 = { "a", "a", "c"};
	//	merge(list1,list2);
		
		int [] listy = {3,4,2,7,12,22,0,1};
		partition(listy);
	}

	public static void merge(String [] list1, String [] list2) 
	{
		//Precondition : Both lists are sorted
		//Takes my will to live and destroys it
	
		String [] full = new String [(list1.length) + (list2.length)];
		
		int j = 0;
		int l = 0;
		int r = 0;
		
		while(l < list1.length && r < list2.length && j < full.length) 
		{
			if (list1[l].compareTo(list2[r]) >= 0)
			{
				full[j] = list2[r];
				j++;
				r++;
			}			
			
			if(list1[l].compareTo(list2[r]) < 0) 
			{
				full[j] = list1[l];
				j++;
				l++;
			}
		}
		
		if(r == list2.length)
		{
			for(int m = j; m < full.length;m++);
		}
		if(l == list1.length)
		{
			for(int m = j; m < full.length;m++);
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
	    int last = list.length-1;

	    for(int i = 1; i < list.length; i++)
	    {
	        if(list[i] <= base)
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
	            last--;
	            i--;
	        }
	    }
	    
	    System.out.print(java.util.Arrays.toString(list));
	    System.out.print("  Index of Pivot " + ni);
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