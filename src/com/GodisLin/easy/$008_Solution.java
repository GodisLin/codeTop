package com.GodisLin.easy;

public class $008_Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int m_pos = m - 1;
        int n_pos = n - 1;
        int pos = m + n - 1;
        while (n_pos >= 0){
            if(m_pos < 0){
                nums1[pos--] = nums2[n_pos--];
            }else if(nums1[m_pos] < nums2[n_pos]){
                nums1[pos--] = nums2[n_pos--];
            }else{
                nums1[pos--] = nums1[m_pos--];
            }
        }
    }
}
