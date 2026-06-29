class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int largest=-1;
        int secondlargest=-1;
        int j=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                
                secondlargest=largest;
                largest=arr[i];
                j=i;
            }
           
            
        }
         for(int i=j+1;i<arr.length;i++){
                if(arr[i]>secondlargest && arr[i]!=largest ){
                    secondlargest=arr[i];
                }
                
            }
        return secondlargest;
    }
}