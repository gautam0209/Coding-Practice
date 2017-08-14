package leetcode;



import java.util.*;

/**
 * Not working
 * Created by Gautam Vashisht on 7/21/2017.
 */
public class PermutationBF {

        public static List<List<Integer>> permute(int[] nums) {

            int temp[];
            Set<List<Integer>> permutations = new HashSet<>();

            for(int i=nums.length-1; i>=0; i--)
            {

                int n = nums[i];
                for(int k=0; k<nums.length; k++)
                {
                    List<Integer> list = new ArrayList<>();
                    for(int j = 0; j<nums.length; j++)
                    {
                        if(j!=i)
                            list.add(nums[j]);
                        if(j==k)
                            list.add(n);

                    }
                    permutations.add(list);
                    System.out.println(Arrays.deepToString(list.toArray()));
                }
                System.out.println();

            }

            List<List<Integer>> result = new ArrayList<>(permutations);

            return result;

        }

        public static void main(String ar[])
        {
            Scanner s = new Scanner(System.in);
            int[] a = new int[3];
            for(int i=0; i<3; i++)
                a[i] = s.nextInt();
            permute(a);
        }
}
