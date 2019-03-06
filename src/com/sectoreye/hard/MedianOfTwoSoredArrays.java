package com.sectoreye.hard;

/**
 * Created by sectoreye on 2019-02-28.
 */
public class MedianOfTwoSoredArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] sortArray = sort(nums1, nums2);
        if (sortArray.length % 2 == 0) {
            return (sortArray[sortArray.length / 2 -1] + sortArray[sortArray.length / 2]) / 2.0;
        }
        return sortArray[(int) Math.floor(sortArray.length / 2)];
    }

    private int[] sort(int[] nums1, int[] nums2) {
        int totalSize = nums1.length + nums2.length;
        int nums1Index = 0;
        int nums2Index = 0;
        int resultIndex = 0;
        int[] result = new int[totalSize];
        while ((nums1Index + nums2Index) != totalSize) {
            if (nums1.length - 1 < nums1Index) {
                result[resultIndex++] = nums2[nums2Index++];
                continue;
            } else if (nums2.length - 1 < nums2Index) {
                result[resultIndex++] = nums1[nums1Index++];
                continue;
            }

            if (nums1[nums1Index] < nums2[nums2Index]) {
                result[resultIndex++] = nums1[nums1Index++];
            } else if (nums1[nums1Index] > nums2[nums2Index]) {
                result[resultIndex++] = nums2[nums2Index++];
            } else {
                result[resultIndex++] = nums1[nums1Index++];
                result[resultIndex++] = nums2[nums2Index++];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        MedianOfTwoSoredArrays medianOfTwoSoredArrays = new MedianOfTwoSoredArrays();
        int[] nums1 = new int[]{};
        int[] nums2 = new int[]{2,3};

        System.out.println(medianOfTwoSoredArrays.findMedianSortedArrays(nums1, nums2));

    }
}
