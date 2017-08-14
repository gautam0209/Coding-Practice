package leetcode;

import java.util.*;

/**
 * Created by Gautam Vashisht on 7/24/2017.
 */
public class MedianSortedArrays {

        public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

            if (nums1.length == 0 && nums2.length == 0)
                return -1;

            if (nums1.length <= nums2.length)
                return findMedianSortedArr(nums1, 0, nums1.length - 1, nums2, 0, nums2.length - 1);
            else
                return findMedianSortedArr(nums2, 0, nums2.length - 1, nums1, 0, nums1.length - 1);


        }


        public static double findMedianSortedArr(int[] nums1, int low1, int high1, int[] nums2, int low2, int high2) {
            int l1 = nums1.length;
            int l2 = nums2.length;
            System.out.println("l2 is :" + l2);
            System.out.println("l1 is :" + l1);

            if (l1 == 0)
                return findMedian(nums2, low2, high2);
            else if (l2 == 0)
                return findMedian(nums1, low1, high1);
            else if (l1 == 1 && l2 == 1)
                return (nums1[0] + nums2[0]) / 2d;

            else if (l1 == 1 && l2 % 2 != 0) {
                int median = 0;
                if (nums2[l2 / 2 - 1] <= nums1[0] && nums1[0] <= nums2[l2 / 2 + 1])
                    median = nums1[0];
                else if (nums2[l2 / 2 - 1] >= nums1[0] && nums2[l2 / 2 - 1] <= nums2[l2 / 2 + 1])
                    median = nums2[l2 / 2 - 1];
                else
                    median = nums2[l2 / 2 + 1];
                return (median + nums2[l2 / 2]) / 2d;

            } else if (l1 == 1 && l2 % 2 == 0) {
                int median = 0;
                if (nums2[l2 / 2 - 1] <= nums1[0] && nums1[0] <= nums2[l2 / 2])
                    median = nums1[0];
                else if (nums2[l2 / 2 - 1] >= nums1[0] && nums2[l2 / 2 - 1] <= nums2[l2 / 2])
                    median = nums2[l2 / 2 - 1];
                else
                    median = nums2[l2 / 2];
                return median;
            } else if (l1 == 2 && l2 == 2) {
                return (Math.max(nums1[0], nums2[0]) + Math.min(nums1[1], nums2[1])) / 2d;
            } else if (l1 == 2 && l2 % 2 == 0) {
                int[] tempA = {nums2[l2 / 2], nums2[l2 / 2 - 1], Math.max(nums2[l2 / 2 - 2], nums1[0]), Math.min(nums2[l2 / 2 + 1], nums1[1])};
                return findMed(tempA);
            } else if (l1 == 2 && l2 % 2 != 0) {
                if (l2 == 1) {
                    int[] tempA = {nums1[0], nums1[1], nums2[0]};
                    return findMed(tempA);
                }
                int[] tempA = {nums2[l2 / 2], Math.max(nums2[l2 / 2 - 1], nums1[0]), Math.min(nums2[l2 / 2 + 1], nums1[1])};
                return findMed(tempA);
            } else {
                double median1 = findMedian(nums1, low1, high1);
                double median2 = findMedian(nums2, low2, high2);
                if (median1 > median2) {
                    return findMedianSortedArr(Arrays.copyOfRange(nums1, low1, (low1 + high1) / 2 + 1),
                            0, (low1 + high1) / 2,
                            Arrays.copyOfRange(nums2, (low2 + high2) / 2, high2 +1),
                            0, high2 - (low2 + high2) / 2);
                } else if (median2 > median1) {
                    return findMedianSortedArr(Arrays.copyOfRange(nums1, (low1 + high1) / 2, high1 + 1),
                            0, high1 - (low1 + high1) / 2,
                            Arrays.copyOfRange(nums2, low2, (low2 + high2) / 2 + 2),
                            0, (low2 + high2) / 2 + 1);
                } else
                    return median1;

            }
        }

        public static double findMedian(int[] arr, int low, int high) {
            if (arr.length == 1)
                return arr[0];
            int size = high - low + 1;
            if (size % 2 == 0) {
                return (arr[size / 2] + arr[size / 2 - 1]) / 2d;
            } else
                return arr[size / 2];
        }

        public static double findMed(int[] arr) {
            Arrays.sort(arr);
            if (arr.length == 1)
                return arr[0];
            int size = arr.length;
            if (size % 2 == 0) {
                return (arr[size / 2] + arr[size / 2 - 1]) / 2d;
            } else
                return arr[size / 2];
        }


        public static void main(String ar[]) {
           // int[] arr1 = {1, 4, 5};
            //int[] arr2 = {2, 3, 6};
            int[] arr1 = {1, 2, 3};
            int[] arr2 = {4, 5, 6};
            System.out.println(findMedianSortedArrays(arr1, arr2));
        }
    }
