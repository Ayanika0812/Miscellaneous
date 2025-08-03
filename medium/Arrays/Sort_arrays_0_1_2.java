/*Example 1:
Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:
Input: nums = [2,0,1]
Output: [0,1,2]
*/

class Solution {
    public void sortColors(int[] nums) {
        //DEUTCH NATIONAL FLAG                       -----> Optimal
        int low = 0,mid =0,high = nums.length-1;

        while(mid<=high){
            if(nums[mid]==0){
               // swap(nums[low],nums[mid]);
               int temp = nums[low];
               nums[low]=nums[mid];
               nums[mid]=temp;
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else {            //if(nums[mid]==2)
                 int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}
