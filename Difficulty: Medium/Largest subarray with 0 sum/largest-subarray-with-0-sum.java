//Method 1 without hashmap- tc:O doesn't run for all test cases
/*class Solution {
    int maxLength(int arr[]) {
        // code here
        int n=arr.length;
        int maxLength=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum==0)
                    maxLength=Math.max(maxLength,j-i+1);
            }
        }
        return maxLength;
    }
}*/
////Method 2 with prefixsum+ hashmap- tc:O(n)
import java.util.*;

class Solution {
    int maxLength(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == 0) {
                maxLen = i + 1;
            }

            if (map.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - map.get(sum));
            } else {
                map.put(sum, i); // store first occurrence
            }
        }

        return maxLen;
    }
}