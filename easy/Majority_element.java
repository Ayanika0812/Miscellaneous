/* The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
Example 1:
Input: nums = [3,2,3]
Output: 3
Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2
*/


class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int majorityCount = nums.length / 2;
        for(int i=0;i<nums.length;i++){
          
            int count = map.getOrDefault(nums[i],0)+1;
          
            map.put(nums[i],count);
            if(count>majorityCount){
                return nums[i];
            }
        }
        return -1;
    }
}


//Boyer Moore -> OPTIMAL

class Solution {
    public int majorityElement(int[] nums) {
        int count =0;
        int ele = 0;
        for(int i = 0;i<nums.length;i++){
            if(count == 0){
                count = 1;
                ele = nums[i];
            }
            else if(nums[i] == ele){
                count++;
            }
            else{
                count--;
            }
        }
        int count1 =0 ;
        for(int i =0 ;i<nums.length;i++){
            if(nums[i] == ele) count1++;
        }

        if(count1 > (nums.length / 2)){
            return ele;
        }
        return -1;
    }
}
