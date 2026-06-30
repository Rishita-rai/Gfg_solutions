class Solution {
    public int countOnes(int[] arr) {
        // code here
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if (arr[mid]==0){
                high=mid-1;
                
            }
            else if(mid==arr.length-1 || arr[mid+1]!=1){
                return mid+1;
            }
            else{
                low=mid+1;
            }
        }
        return 0;
    }
}