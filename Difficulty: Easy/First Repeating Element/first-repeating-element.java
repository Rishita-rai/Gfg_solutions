class Solution {
    public static int firstRepeated(int[] arr) {
        // code here
        HashMap<Integer,Integer> h= new HashMap<>();
        HashSet<Integer> w= new HashSet<>();
        int c=-1;
        for(int i=0;i<arr.length;i++){
        if(!h.containsKey(arr[i])){
            h.put(arr[i],i+1);
        }else
        {
            c=h.get(arr[i]);
            w.add(c);
        }
    }
    if(w.size()==0){
        return -1;
    }
    int min = Integer.MAX_VALUE;
    for(int a:w){
        if(a<min){
            min=a;
        }
    }
    return min;
    }
}
