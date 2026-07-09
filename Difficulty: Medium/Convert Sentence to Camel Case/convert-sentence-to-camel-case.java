class Solution {
    // Function to convert the given string to Camel Case
    public String convertToCamelCase(String s) {
        // code here
        StringBuilder res=new StringBuilder();
        boolean flag=false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                flag=true;
                
            }
            else if(flag==true){
                res.append(Character.toUpperCase(s.charAt(i)));
        

      flag=false;
            }
            else{
                res.append(s.charAt(i));
            }
            
        }
        return res.toString();
    }
}