// User function Template for Java

class Solution {
    public boolean checkDuplicates(int arr[]) {
        // Code here
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j])
                    return true;
            }
        }
        return false;
    }
}