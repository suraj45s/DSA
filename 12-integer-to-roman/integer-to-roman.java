class Solution {
    public String intToRoman(int num) {
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String result = "";
        int i = 0;
        while(i<values.length){
            while(num >= values[i]){
                result = result + roman[i];
                num = num - values[i];
            }
            i++;
        }
        return result;
    }
}