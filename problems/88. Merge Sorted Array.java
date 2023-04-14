class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ans[] = new int[m + n];
        for(int i = 0 ; i < m; ++i){ans[i] = nums1[i];}
        for(int i = 0 ; i < n; ++i){ans[i+m] = nums2[i];}
        Arrays.sort(ans);
        for(int i = 0 ; i < nums1.length; ++i){
            nums1[i] = ans[i];
        }
    }
}
