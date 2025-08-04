//input: {3, 8, 1, 2 , 4, 9} output =  1 3 9 8 4 2

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    for(int i = 0;i<n;i++)
	    {
	        arr[i] = sc.nextInt();
	    }
	    ArrayList<Integer> oddno = new ArrayList<>();
	    ArrayList<Integer> evenno = new ArrayList<>();
	    for(int i = 0;i<n;i++)
	    {
	        if(arr[i]%2 != 0)
	        {
	            oddno.add(arr[i]);
	        }
	        else
	        {
	            evenno.add(arr[i]);
	        }
	    }
	    Collections.sort(oddno);
	    Collections.sort(evenno, Collections.reverseOrder());
	    for(int num : oddno)
	    {
	        System.out.print(num +" ");
	
	    }
	    for(int num : evenno)
	    {
	        System.out.print(num + " ");
	    }
	}
}
