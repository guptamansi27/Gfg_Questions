class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int i=0;
        int n=arr.length;
        while(i<n/2){
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
            i++;
        }
    }
}