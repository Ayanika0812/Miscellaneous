//every element appears twice except for one. Find that single one.

class Solution {
    public int singleNumber(int[] nums) {
        int n= nums.length;
        HashMap<Integer, Integer> countMap = new HashMap<>();

        for(int num : nums){
            countMap.put(num, countMap.getOrDefault(num,0)+1);
        }

        for(int num : nums){
            if(countMap.get(num)==1){
                return num;
            }
        }
    return 1;
    }
}

//OR
//OPTIMAL

class Solution {
    public int singleNumber(int[] nums) {
        int XOR =0;
        for(int i=0;i<nums.length;i++){
            XOR=XOR^nums[i];
        }
        return XOR;
    }
}
