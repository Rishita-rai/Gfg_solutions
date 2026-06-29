class Solution {
    public static int largest(int[] arr) {
        // code here
        int max=arr[0];
        for(int a:arr){
            if (a>max)
            max=a;
        }
        return max;
    }
}
