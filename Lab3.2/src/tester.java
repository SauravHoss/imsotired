
public class tester 
{

	public static void main(String[] args) 
	{
		String [] list1 = { "ab","bc" };
		String [] list2 = { "bc", "ab"};
		merge(list1,list2);
	}

	public static String [] merge(String [] list1, String [] list2) 
	{
		//Precondition : Both lists are sorted
	
		String [] full = new String [list1.length+list2.length-2];
		
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

		
	
}
