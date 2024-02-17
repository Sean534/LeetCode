class Solution {
    public boolean containsDuplicate(int[] nums) {
       HashSet<Integer> unique = new HashSet<Integer>(); //HashSet Of empty Integers
       for (int i = 0; i < nums.length; i++) //Goes through the Array of Nums
        {
            if (unique.contains(nums[i])) //if Hashset contains the specific number then we will return true
            { 
                return true;
            }
            unique.add(nums[i]); //the first time we go through the array, nothing exist in the hashset so we input it into it
        }
        return false;
    }
}