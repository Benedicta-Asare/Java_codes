class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] newArray = new int[nums.length];
        int i = 0;
        int j = n;
        int k = 0;
        while (i < n) {
            newArray[k++] = nums[i];
            newArray[k++] = nums[j];
            i++;
            j++;
        }
        return newArray;    
    }
}
