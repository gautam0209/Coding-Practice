package leetcode;

/**
 * Created by Gautam Vashisht on 8/7/2017.
 *
 * O(LOG(m+n)/2)
 */
public class MedianSortedArrays2 {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        if (nums1.length == 0 && nums2.length == 0)
            return -1;

        int nextMid =0, k2=0;
        int k = (nums1.length + nums2.length + 1)/2;

        int mid = findKthIndex(nums1, 0, nums1.length - 1, nums2, 0, nums2.length - 1,k);

        double res = mid;

        if((nums1.length + nums2.length)%2 == 0)
        {
            k2 = k + 1;
            nextMid = findKthIndex(nums1, 0, nums1.length - 1, nums2, 0, nums2.length - 1,k2);
            res = (mid+nextMid)/2d;
        }

        return res;
    }

    public static int findKthIndex(int[] A, int leftA, int rightA, int[] B, int leftB, int rightB, int k)
    {

        if(leftA>rightA)
            return B[leftB + k -1];

        if(leftB>rightB)
            return A[leftA + k -1];

        int midA = (leftA + rightA)/2;
        int midB = (leftB + rightB)/2;



        if(A[midA] <= B[midB])
        {
            if( k <= (midA - leftA ) + (midB - leftB ) + 1)
                return findKthIndex(A,leftA,rightA,B,leftB,midB-1,k);
            else
                return findKthIndex(A,midA+1,rightA,B,leftB,rightB,(k-(midA-leftA)-1));
        }

        else
        {
            if( k <= (midA - leftA ) + (midB - leftB ) + 1)
                return findKthIndex(A,leftA,midA-1,B,leftB,rightB,k);
            else
                return  findKthIndex(A,leftA,rightA,B,midB+1,rightB,(k-(midB-leftB)-1));
        }

    }

    public static void main(String ar[]) {
        // int[] arr1 = {1, 4, 5};
        //int[] arr2 = {2, 3, 6};
        int[] arr1 = {1,3};
        int[] arr2 = {2};
        System.out.println(findMedianSortedArrays(arr1, arr2));
    }
}
