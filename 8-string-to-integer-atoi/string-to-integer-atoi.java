class Solution {
    public int myAtoi(String s) {
        int num = 0;
        int sign = 1;
        int i = 0;
        
        while(i<s.length() && s.charAt(i) == ' '){
            i++;
        }
        if(i<s.length() && s.charAt(i)=='-'){
            sign = -1;
            i++;
        }
        else if(i<s.length() && s.charAt(i)=='+'){
            i++;
        }
        while(i<s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9'){
            int digit = s.charAt(i) - '0';
            if(num >Integer.MAX_VALUE/10 || (num == Integer.MAX_VALUE/10 && digit>7)){
                if(sign == 1){
                    return Integer.MAX_VALUE;
                }
                else{
                    return Integer.MIN_VALUE;
                }
            }
            num = num*10 + (s.charAt(i) - '0');
            i++;
        }
        return num*sign;
    }
}