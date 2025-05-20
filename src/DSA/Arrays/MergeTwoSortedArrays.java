package DSA.Arrays;

public class MergeTwoSortedArrays {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            if (n == 0) {
                return;
            }
            if (m == 0) {
                int b = 0;
                for (int i = 0; i < nums2.length; i++) {
                    nums1[b] = nums2[i];
                    b++;
                }
                return;
            }
            int l = nums1.length - 1;
            while (n > 0) {
                if (m > 0 && nums1[m - 1] > nums2[n - 1]) {
                    nums1[l] = nums1[m - 1];
                    m--;

                } else {
                    nums1[l] = nums2[n - 1];

                    n--;
                }
                l--;
            }
        }
}
