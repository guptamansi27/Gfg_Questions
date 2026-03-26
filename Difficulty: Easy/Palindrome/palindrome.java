class Solution {
    public boolean isPalindrome(int n) {
        int num=n;
        int rem,rev=0;
        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(rev==num)
            return true;
        return false;
    }
}