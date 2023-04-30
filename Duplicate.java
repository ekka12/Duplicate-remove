import java.util.*;

public class Duplicate {

	public static void main(String[] args) {
		int arr[]= {1,1};
		Arrays.sort(arr);
		int c=1;
		int count=1;
		//length of unique value
		for(int i=0;i<arr.length-1;i++)
		{
			if (arr[i]!=arr[i+1])
			{
				count++;
			}
		}

		//System.out.println(count);
		int a1[] = new int[count];
		a1[0]=arr[0];
		//storing unique	
		for(int i=0;i<arr.length-1;i++)
		{
			if(c<count) 
			{
				if(arr[i]!=arr[i+1])
				{	

					a1[c]=arr[i+1];	
					c++;
				}
			}
		}

		for(int i=0;i<a1.length;i++)
		{
			System.out.println(a1[i]);
		}
	}
}
