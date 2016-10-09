package src;


public class Arrays {

	public static void main(String[] args) {
		int num = 5; //Looked number
		int[] nums = { 3, 1, 6, 4, 9, 5, 8, 2 };
		if (find(nums, num) == -1)
		{
			System.out.println("Number wasn't found");
		}
		else
		{
			System.out.println(find(nums, num));	
		}
	}
	public static int find(int nums[], int num)
	{
		for (int i = 0; i < nums.length; i++)
		{
			if (nums[i] == num)
			{
				return i;
			}
		}
		return -1;
	}

}
