第四天（2019.3.30）
04.First Bad Version
Description
代码库的版本号是从 1 到 n 的整数。某一天，有人提交了错误版本的代码，因此造成自身及之后版本的代码在单元测试中均出错。请找出第一个错误的版本号。
你可以通过 isBadVersion 的接口来判断版本号 version 是否在单元测试中出错，具体接口详情和调用方法请见代码的注释部分。
    /**
     * find first bad version num
     * @param n version from 1 to n
     * @return first bad version
     */
    public static int findFirstBadVersion(int n) {
        if (n <= 0) {
            return -1;
        }

        int start = 1;
        int end = n;
        int res = -1;
        while (start <= end) {
            int mid = start + ((end - start) >> 1);
            if (isBadVersion(mid)) { //invoke method
                end = mid - 1;
                res = mid;
            } else {
                start = mid + 1;
            }
        }
        return res;
    }
