class Solution {
    static String decToBinary(int n) {
        if(n==0)
            return "0";
        String result="";
        int rem;
        while(n>0){
            rem=n%2;
            result=rem+result;//add in front
            n=n/2;
        }
        return result;
    }
}