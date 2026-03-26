// User function Template for Java

class Solution {
    public static int maxSubStr(String str) {
        // Write your code here
        int zero=0,one=0,count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='0')
                zero++;
            else
                one++;
            if(zero==one)
                count++;
        }
        if(zero!=one) return -1;
        
        return count;
    }
}