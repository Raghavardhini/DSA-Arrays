//Two Sum 
//input arr[] = {9,8,4,3,2} target = 12 output =[8,4]

import java.util.*;
public class Main
{
    public static int[] sum(int n , int[] arr, int target)
    {
        for(int i = 0;i<n;i++)
        {
            for(int j = i+1;j<n;j++)
            {
                if(arr[i]+arr[j] == target)
                {
                    return new int[]{arr[i], arr[j]};
                }
            }
        }
        return new int[]{-1,-1};
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    for(int i = 0 ;i < n ;i++)
	    {
	        arr[i] = sc.nextInt();
	    }
	    int target = sc.nextInt();
	    int[] result = sum(n, arr, target);

        System.out.println(Arrays.toString(result));
	}
}
