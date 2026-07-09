// Last updated: 09/07/2026, 09:19:17
   class Solution {
    public boolean isNumber(String s) {
        int n = s.length();
        int i=0;
        boolean initialSignFound = false;

        //check only dot
        if(n==1 && s.charAt(0)=='.') return false;

        //check initial sign
        if(s.charAt(i) == '+' || s.charAt(i)=='-'){
            initialSignFound = true;
            i++;
        }

        //check integer or decimal found before e
        boolean preIntegerFound = false;

        boolean preDecimal = false;

        //check number before e or E
        boolean isDecimal = false;
        boolean foundExponent = false;
        while(i<n){
            char ch = s.charAt(i);
            if(ch >= '0' && ch<='9'){
                i++;
                preIntegerFound = true;
                preDecimal = true;
            }
            else if(ch=='.'){
                isDecimal = true;
                break;
            }
            else if(ch=='e' || ch=='E'){
                foundExponent = true;
                break;
            }
            else{
                return false;
            }
        }

        boolean postDecimal = false;
        if(isDecimal){
            i++;
            while(i<n){
                char ch = s.charAt(i);
                if(ch >= '0' && ch<='9'){
                    i++;
                    preIntegerFound = true;
                    postDecimal = true;
                }
                else if(ch=='e' || ch=='E'){
                    if(!preIntegerFound) return false;
                    foundExponent = true;
                    break;
                }
                else{
                    return false;
                }
            }
            if(i==n){
                if(initialSignFound && !preDecimal && !postDecimal) return false;
            }
        }
        boolean postIntegerFound = false;
        if(foundExponent){
            i++;
            if(i<n && !preIntegerFound) return false;
            if(i<n){
                if(s.charAt(i)=='+' || s.charAt(i)=='-'){
                    i++;
                }
            }
            else{
                return false;
            }
            while(i<n){
                char ch = s.charAt(i);
                if(ch >= '0' && ch<='9'){
                    i++;
                    postIntegerFound = true;
                }
                else{
                    return false;
                }
            }
            if(preIntegerFound && !postIntegerFound){ 
                return false;
            }
        }
        if(initialSignFound && !preDecimal && !postDecimal) return false;
        return true;
    }
}