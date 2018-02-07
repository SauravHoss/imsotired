
public class tester 
{

	public static void main(String[] args) 
	{
		String [] list1 = { "b","ab", "cc" };
		String [] list2 = { "aa", "a", "v"};
		merge(list1,list2);
	}

	public static void merge(String [] list1, String [] list2) 
	{
		//Precondition : Both lists are sorted
	
		String [] full = new String [(list1.length) + (list2.length)];
		
		int j = 0;
		int l = 0;
		int r = 0;
		
		while(j < full.length-1) 
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
	
	public static int partition(int [] list) 
	{
		int [] temp = new int [list.length];		
		
		int base = list[0];
		
		
	}
	
	
	
}