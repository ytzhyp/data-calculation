    01.Classical Binary Search
    Description
    Find any position of a target number in a sorted array. Return -1 if target does not exist.

    Example
    Example 1:

    Input: nums = [1,2,2,4,5,5], target = 2
    Output: 1 or 2

    Example 2:
    Input: nums = [1,2,2,4,5,5], target = 6
    Output: -1
    oj: https://www.lintcode.com/problem/classical-binary-search/description
    /**
     * 01.Classical Binary Search
     * @param nums An int array sorted in ascending order
     * @param key the target num
     * @return this index of key in int array named nums
     */
    public static int getIndexOfKey(int[] nums,int key){

        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middle = (left + right);
            if (nums[middle] == key){
                return middle;
            } else if(nums[middle] > key){
                right = middle - 1;
            } else{
                left = middle + 1;
            }
        }
        return -1;
    }

