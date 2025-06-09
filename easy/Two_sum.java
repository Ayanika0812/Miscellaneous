 //Note: The returned array must be malloced, assume caller calls free().

int* twoSum(int* nums, int numsSize, int target, int* returnSize) {
    int* resarr=(int *)malloc(2*sizeof(int));
    if(resarr==NULL)
    {
        *returnSize=0;
    }
    for(int i=0;i<numsSize;i++)
    {
        for(int j=i+1;j<numsSize;j++)
        {
            if(nums[i]+nums[j]==target)
            {
                resarr[0]=i;
                resarr[1]=j;
                *returnSize=2;
                return resarr;
            }
        }
    }
    *returnSize=0; //No solution
    return NULL; 
}


//2nd solution

