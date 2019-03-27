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
