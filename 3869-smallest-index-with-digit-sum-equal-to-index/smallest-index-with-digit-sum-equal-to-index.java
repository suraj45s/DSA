class Solution {
    public int smallestIndex(int[] nums) {
        int i=0;
        int TarSum = 0;
        while(i<nums.length){
            int num = nums[i];
                TarSum = getSumofDig(num);
                if(TarSum == i){
                return TarSum;
            }
            
            i++;
        }
        return -1;
    }
    public int getSumofDig(int num){
        int sum = 0;
        num = Math.abs(num);
        while(num>0){
            sum += num%10;
            num = num/10;
        }
        return sum;
    }
}