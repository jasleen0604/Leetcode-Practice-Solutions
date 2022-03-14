// { Driver Code Starts
//Initial Template for Java

//Initial Template for Java



import java.io.*;
import java.util.*;


 // } Driver Code Ends
//User function Template for Java



class Solution
{
    boolean checkIsAP(int arr[] ,int n)
    {
        // code here
        int fsm = Integer.MAX_VALUE, ssm = Integer.MAX_VALUE;
        for(int i=0; i<n; i++)
        {
            if(arr[i] < fsm)
            {
                ssm = fsm;
                fsm = arr[i];
            }
            if(arr[i] < ssm && arr[i] > fsm)
            ssm = arr[i];
        }
        
        int diff = ssm-fsm;

        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<n; i++)
        hs.add(arr[i]);
        
        int find = ssm;
        for(int i = 1; i< n; i++)
        {
            if(hs.contains(find) == false)
            return false;
            
            find += diff;
        }
        return true;
    }
}



// { Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main (String[] args) throws IOException{
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while(testcases-- > 0){
            int n=Integer.parseInt(br.readLine());

            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            int a[]=new int[n];
            for(int  i=0;i<n;i++)
            {
                a[i]=Integer.parseInt(a1[i]);
            }
            Solution ob=new Solution();

            boolean ans=ob.checkIsAP(a,n);
            if(ans==true)
            System.out.println("YES");
            else
            System.out.println("NO");
        }
    }
}



  // } Driver Code Ends