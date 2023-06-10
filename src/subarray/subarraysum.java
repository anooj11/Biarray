package subarray;
public class subarraysum
{
	public static int arraysum(int [] arr)
	{
		int maxsum= arr[0];
		int sum=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(sum<0)
			{
				sum=arr[i];
			}
			else
			{
				sum=sum+arr[i];
			}
			maxsum= Math.max(sum, maxsum);
		}
		return maxsum;
	}
	public static void main(String args[])
	{
		int array[]= {-2,-3,4,-1,-2,1,5,-3};
		int result= arraysum(array);
		System.out.println(result);
	}
}