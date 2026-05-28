class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // 2, 1, 1, 3 i = 3
        // []
        // [3, 2, 1, 0]
        int[] result = new int[temperatures.length];
        Stack<int[]> stack = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {
            int temp = temperatures[i];

            while (!stack.isEmpty() && temp > stack.peek()[0]) {
                int[] pop = stack.pop();
                result[pop[1]] = i - pop[1];
            }

            stack.push(new int[]{temp, i});
        }

        return result;

        
    }
}
