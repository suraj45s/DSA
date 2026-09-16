class Solution {
    public String addBinary(String a, String b) {
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;
        StringBuilder ans = new StringBuilder();
        while(i>=0 || j>=0 || carry != 0){
            int bit1 = 0;
            int bit2 = 0;
            if(i>=0){
                bit1 = a.charAt(i) - '0';
            }
            if(j>=0){
                bit2 = b.charAt(j) - '0';
            }
            int sum = bit1 + bit2 + carry;
            ans.append(sum%2);
            carry = sum/2;
            i--;
            j--;
        }
        return ans.reverse().toString();
        }
    }
