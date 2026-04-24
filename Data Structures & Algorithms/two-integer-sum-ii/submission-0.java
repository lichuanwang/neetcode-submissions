class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int rightPointer = numbers.length - 1;
        int leftPointer = 0;
        while (leftPointer < rightPointer) {
            int currSum = numbers[leftPointer] + numbers[rightPointer];
            if (currSum == target) {    
                return new int[]{++leftPointer, ++rightPointer};
            } else if (currSum > target) {
                rightPointer--;
            } else {
                leftPointer++;
            }
        }

        return null;
    }
}


