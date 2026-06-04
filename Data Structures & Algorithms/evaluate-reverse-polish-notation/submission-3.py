class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        stack = [];
        for token in tokens:
            if token in  ("+", "-", "*", "/"):
                num1 = stack.pop()
                num2 = stack.pop()
                if token == "+":
                    total = num1 + num2
                if token == "-":
                    total = num2 - num1
                if token == "*":
                    total = num1 * num2
                if token == "/":
                    total = int(num2 / num1)
                stack.append(total);
            else:
                stack.append(int(token))

        return stack.pop()
            
                

        