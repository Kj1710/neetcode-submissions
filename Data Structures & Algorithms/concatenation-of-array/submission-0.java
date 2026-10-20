class Solution {
    public int[] getConcatenation(int[] nums) {
        int N=nums.length;
    int newArr[] = new int[2 * N];
    for (int i = 0; i < N; i++) {
      newArr[i] = nums[i];
      newArr[i + N] = nums[i];
    }
    return newArr;
    }
}