class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;          // pointer for nums1
        int j = n - 1;          // pointer for nums2
        int k = m + n - 1;      // pointer for the final position in nums1

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) { 
                nums1[k--] = nums1[i--];  // put the bigger one at the end
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        // Copy remaining elements from nums2, if any
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
        // No need to copy nums1 leftovers — they're already in place
    }
}
