
import java.util.*;

public class Permutation {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {1,2,3};
        List<List<Integer>> res=s.permute(arr);
        System.out.println(res);
    }
}

/*
class Solution {
    public List<List<Integer>> permute(int[] nums) {

        //initalizing one data structure which store the value during recursive call in it
        List<Integer> ds = new ArrayList<>();

        // initalizing array of array which print output the permutation of array
        List<List<Integer>> ans = new ArrayList<>();
        
        // intializing another array of length final array nums of type boolean which mark the value true when we visited that particular index during recursive call because we don't want duplicate value in array (* not considering duplicate value which already present in intial array)
        boolean[] freq = new boolean[nums.length];
        // calling the function
        permutation(ds,ans,nums,freq);
        return ans;
        
    }

    public void permutation(List<Integer>ds, List<List<Integer>> ans, int[] nums, boolean[] freq)
    {

        // this is base condition whe size of declared data structure became equal to intial array then that time ds contain one cycle of permutation and we add it to ans.
        if(ds.size() == nums.length)
        {
            ans.add(new ArrayList<>(ds));
            return;
        }
        // running loop till n and marking visited not visited during recursive call
        for(int i = 0; i < nums.length; i++)
        {
            if(!freq[i])
            {
                // if not visited then mark true
                freq[i] = true;
                //add it to ds
                ds.add(nums[i]);
                //call the function again because it recursion calling back to back
                permutation(ds,ans,nums,freq);
                // when recursin reaches equal to size of intial array then remove tha last element of ds and unmarked the visited array
                ds.remove(ds.size()-1);
                freq[i] = false;
            }
        }

    }
}
*/

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        find(nums, nums.length, 0, ans);
        return ans;
    }
    public static void find(int[] arr, int n, int ind, List<List<Integer>> ans){
        if(ind == n){
            List<Integer> ds = new ArrayList<>();
            for(int it : arr){
                ds.add(it);
            }
            ans.add(ds);
            return;
        }
        for(int i=ind; i<n;i++){
            swap(arr, i, ind);
            find(arr, n, ind+1, ans);
            swap(arr, i, ind);
        }
    }
    public static void swap(int[] arr, int si, int ei){
        int t = arr[si];
        arr[si] = arr[ei];
        arr[ei] = t;
    }
}
