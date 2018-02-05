
public class tester 
{

	public static void main(String[] args) 
	{
		int [] test1 = {1, 4, 4, 5, 2, 4, 3, 17, 0};
		
	}

		public static void merge() 
		{
			
			
		}
		
		public static void merger(int [] arr, int [] left, int [] right, int fr, int fl, int x) 
		{
		//Precondition: Both arrays are sorted
			
			for(int j=0;j<arr.length;j++) 
			{
				fr = right[j];
				
				for(int i = 0; i< arr.length;i++ )
				{
					fl = left[i];
					
					if(fr>fl) 
					{
						arr[x]=fl;
						x++;
					}
					else
					{
						arr[x]=fr;
						x++;
					}
			}
		
		
		}
		}
		public static void quick() 
		{
		
		}
	
		public static void partitioner() 
		{
			
		}
		
	//Swaps two items in an array of integers
		public static void swapperi(int [] arr, int x, int y) 
		{
			int holder = arr[x];
			arr[x] = arr[y];
			arr[y] = holder;	
		}
		
}
