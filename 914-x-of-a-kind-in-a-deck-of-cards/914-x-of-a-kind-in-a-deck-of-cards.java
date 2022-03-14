class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<deck.length; i++)
        {
            hm.put(deck[i], hm.getOrDefault(deck[i],0)+1);
        }
        Iterator <Integer> it = hm.keySet().iterator(); 
        int gcd = 1;
        int c = 1;
        while(it.hasNext())  
        {
            int key=(int)it.next();
            int val = hm.get(key);
            if(c == 1)
            {
               gcd = val;
                c++;
            }
            else
            {
                gcd = gcd(gcd,val);
            }

        }
        if(gcd < 2)
            return false;
        else
            return true;
    }
    public int gcd(int a, int b)
    {
        if(b%a == 0)
            return a;
        
        return gcd(b%a,a);
    }
}