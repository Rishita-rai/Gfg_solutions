class Solution {
    public char nonRepeatingChar(String s) {
        // code here
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            sb=sb.append(s.charAt(i));
        }
        for(int i=0;i<sb.length();i++){
            boolean duplicate=false;
            int j=0;
            while(j<sb.length() )
            {
                
                if(j == i){
    j++;
    continue;
}
                
                if(sb.charAt(i)==sb.charAt(j)){
                    duplicate=true;
                    break;
                }
                j++;
        
            } if(duplicate==false){
            return sb.charAt(i);
        }
            
        }
       
        return '$';
    }
}
