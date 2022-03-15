// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
{
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    
		    int n = Integer.parseInt(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    int arr[] = new int[n];
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    int k = Integer.parseInt(br.readLine().trim());
		    
		    Solution ob= new Solution();
		    System.out.println(ob.countKdivPairs(arr, n, k));
		}
	}
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static int countKdivPairs(int arr[], int n, int k)
    {
        //code here
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0; i<n; i++)
        {
            int div = arr[i] % k;
            hm.put(div, hm.getOrDefault(div,0)+1);
        }
        
        int low = 1, high = k-1;
        int count = 0;
        while(low < high)
        {
            int l = hm.containsKey(low) ? hm.get(low) : 0;
            int h = hm.containsKey(high) ? hm.get(high) : 0;
            count += l*h;
            low++;
            high--;
        }
       
       //handling odd digit(middle) for 1 to k range
        if(low == high)
        {
            int c = hm.containsKey(high) ? hm.get(high) : 0;
            count += (c*(c-1))/2;
        }
        
        //handling zeroes
        if(hm.containsKey(0))
        {
            int c =  hm.get(0);
            count += (c*(c-1))/2;
        }
        return count;
    }
}