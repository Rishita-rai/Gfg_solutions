class Solution {
    public static int[] lps(String pat){
        int n=pat.length();
        int []lps=new int[n];
        int length=0;
        lps[0]=0;
        int i=1;
        while(i<n){
            if(pat.charAt(i)==pat.charAt(length))
            {
                length++;
                lps[i]=length;
                i++;
            }
            else{
                if(length!=0){
                    length=lps[length-1];
                }
                else if(length==0){
                    lps[i]=0;
                    i++;
                }
                
                }
            }
           return lps; 
        }
    
    public boolean areRotations(String s1, String s2) {
        // code here
        String txt=s1+s1;
        int n=txt.length();
        int m=s2.length();
        int i=0; int j=0;
        int []lps=lps(s2);
        while(i<n){
            if(txt.charAt(i)==s2.charAt(j)){
                j++;
                i++;
            }
            if(j==m){
                return true;
            }
            else if(i<n && txt.charAt(i)!=s2.charAt(j) ){
                if(j!=0){j=lps[j-1];}
                else{
                    i++;
                }
                
            }
        }
        return false;
    }
}
