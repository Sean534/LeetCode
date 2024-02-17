class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> Map = new HashMap<Integer,Integer>(); //Make a empty Hashmap that will contain Integer key and Integer value
        for (int i = 0; i < nums.length; i++) //Go through the array of nums
        {
            int difference = target - nums[i]; //Trick: If we Take our target subtract by the current number, we can see if the hashmap contains the difference
            if (Map.containsKey(difference)) //If Map contains the difference
            {
                return new int[]{Map.get(difference), i}; //If so, return the indices of the difference and the current indice i
            }
            Map.put(nums[i], i); //If no difference can be sound in the Map, put the current value and indice in the map to keep track
        }
        return nums;
    }
}
