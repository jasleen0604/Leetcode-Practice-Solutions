class Solution {
     public int[] countBits(int n) {
        int[] arr = new int[n+1];
        int val = 0, powOfTwo = 1;
        for (int i = 1; i < arr.length; i++) {
            if (i == powOfTwo) {
                arr[i] = 1;
                powOfTwo *= 2;
            } else {
                int prevPowOfTwo = powOfTwo / 2;
                arr[i] = 1 + arr[i-prevPowOfTwo];
            }
        }
        return arr;
    }
}