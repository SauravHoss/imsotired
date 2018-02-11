import java.util.Arrays;

public class tester 
{

	public static void main(String[] args) 
	{
		//Testing Code
		String [] test1 = { "apple","cucumber", "microsoft", "zorro" };
		String [] test2 = { "banana", "cherry", "mahogany","oreos", "pinata"};
		int [] test3 = {3,4,2,7,12,22,0,1};
		
		//Merge Test
		long start = System.nanoTime();
		String [] mresult = merge(test1,test2);
		long end = System.nanoTime();
		long time = end-start;
		System.out.println("Merge Test Result: "+Arrays.toString(mresult));
		System.out.println("									Time Taken: " + time + " nanoseconds");

		
		//Partition Test
		start = System.nanoTime();
		int pps = partition(test3);
		end = System.nanoTime();
		time = end = start;
		System.out.println("Partition Test Result: "+Arrays.toString(test3) + " & Pivot Position: " + pps);
		System.out.println("									Time Taken: " + time + " nanoseconds");
	}

	public static String[] merge(String [] list1, String [] list2) 
	{
		//Precondition : Both lists are sorted
		//Takes two arrays and merges them in ascending order
	
		String [] full = new String [(list1.length) + (list2.length)-1]; //i made it work but am confused about why its minus 1 and not 2
		
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
			
			else
			{
				full[j] = list1[l];
				j++;
				l++;
			}
		}
	
		return full;
	}
	
	public static int partition(int [] list)
	{
		//Takes an array, picks first number as pivot and puts smaller numbers on left side, bigger on right
		//Why is the run time so long did I do it wrong?
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