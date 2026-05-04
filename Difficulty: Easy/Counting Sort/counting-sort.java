class Solution {
    public static String countSort(String s) {
       /* Method 1: bubble sort as O(n^2) T.C so time exceed error
       char[] c = s.toCharArray();
        for(int i=0;i<c.length-1;i++){
            for(int j=0;j<c.length-1-i;j++){
                if(c[j]>c[j+1]){
                    char temp=c[j+1];
                    c[j+1]=c[j];
                    c[j]=temp;
                }
            }
                
        }
        return new String(c);*/
        //Method 2: Counting sort
        //Count Array
        int[] count = new int[26];
        
        for(char ch:s.toCharArray()){
            count[ch-'a']++;
        }
        //Build sorted Array
        StringBuilder sb = new StringBuilder();
        
        //Traverse count Array
        for(int i=0;i<26;i++){
            while(count[i]>0){
                sb.append((char)(i+'a'));
                count[i]--;
            }
        }
        return sb.toString();
    }
}