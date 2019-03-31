第二天（2019.3.28）
02.Find Peak Element
Description
中文
English
你给出一个整数数组(size为n)，其具有以下特点：

相邻位置的数字是不同的
A[0] < A[1] 并且 A[n - 2] > A[n - 1]
假定P是峰值的位置则满足A[P] > A[P-1]且A[P] > A[P+1]，返回数组中任意一个峰值的位置。

Example
样例 1:
	输入:  [1, 2, 1, 3, 4, 5, 7, 6]
	输出:  1 or 6
	
	解释:
	返回峰顶元素的下标


样例 2:
	输入: [1,2,3,4,1]
	输出:  3

oj:https://www.lintcode.com/problem/find-peak-element/description
注意：这道题是和第一道题是有关系的，在这种特定的条件下，一定不要写出O(n)的解法，面试中也是，只要是搜索的题目，一维的是最优解O(1)或者O(logn)
public class ArrayAboutDemo {
    /**
     * find the peak num in array
     * @param nums  array
     * @return  index of the peak num
     */
    public int findPeakElement(int[] nums){
        int length = nums.length;
        if(length==0){
            return 0;
        }
        int left=0;
        int right=length-1;
        int mid = -1;
        while(left<right){
            mid=left+((right-left)>>1);//instand of (left + right) / 2 
            if(nums[mid]<nums[mid+1]){ // 
                left=mid+1;
            }else{
                right=mid;
            }
        }
        return right;
    }
}
