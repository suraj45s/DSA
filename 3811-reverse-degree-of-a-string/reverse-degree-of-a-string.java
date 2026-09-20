class Solution {
    public int reverseDegree(String s) {
        int index = 0;
        
        int productSum = 0;
        for(int i=0; i<s.length();i++){
            int RevIdx = 0;
            for(char ch = 'z';ch >= 'a';ch--){
                if(s.charAt(i) == ch){
                    break;
                }
                RevIdx++;
            }
            index += 1;
            productSum += index*(RevIdx+1);
        }
        return productSum;

    }
}