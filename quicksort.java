import java.util.*;
class quick
{
	int sort()
	{
		int i,n,pivot,low=0,high=0;
		int arr[] = new int[100];
		Scanner s = new Scanner(System.in);
		System.out.println("enter size of array : ");
		n = s.nextInt();
		System.out.println("enter array : ");
		for(i=0;i<=n;i++)
		{
			arr[i] = s.nextInt();
		}
		System.out.println("enter pivotal index : ");
		pivot = s.nextInt();
		high = n;
		for(i=0;i<=n;i++)
		{
			if(arr[low]<arr[pivot])
			{
				int temp = arr[low];
				arr[low] = arr[pivot];
				arr[pivot] = temp;
				low++;
				pivot--;
			}
			else
			{
				int temp1 = arr[pivot];
				arr[pivot] = arr[low];
				arr[low] = temp1;
				
			}
		}
		System.out.println("array : ");
		for(i=0;i<=n;i++)
		{
			System.out.println(arr[i]);
		}
		return 0;
	}
}
public class quicksort
{
	public static void main(String[]args)
	{
		quick q = new quick();
		q.sort();
	}
}