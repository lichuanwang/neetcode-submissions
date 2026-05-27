class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> numStack = new Stack<>();

        for (String s : tokens) {
            Integer result = null;
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                int num1 = numStack.pop();
                int num2 = numStack.pop();
                
                if (s.equals("+")) {
                    result = num2 + num1;
                }

                if (s.equals("-")) {
                    result = num2 - num1;
                }

                if (s.equals("*")) {
                    result = num2 * num1;
                }

                if (s.equals("/")) {
                    result = num2 / num1;
                }

            } else {
                result = Integer.parseInt(s);
            }

            numStack.push(result);
        }

        return numStack.pop();
    }
}
