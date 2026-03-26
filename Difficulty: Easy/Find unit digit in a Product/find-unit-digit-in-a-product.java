// User function Template for Java
class Solution {
    static int theLastDigit(int a, int b, int c, int d, int e, int f) {
        
        int x=(int)Math.pow(a%10,(b%4==0?4:b%4))%10;
        int y=(int)Math.pow(c%10,(d%4==0?4:d%4))%10;
        int z=(int)Math.pow(e%10,(f%4==0?4:f%4))%10;
        
        return (x*y*z)%10;
        
    }
}