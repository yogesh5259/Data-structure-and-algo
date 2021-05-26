class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<String>();
        for (String s : tokens) {
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                int value2 = Integer.parseInt(stack.pop());
                int value1 = Integer.parseInt(stack.pop());
                if (s.equals("+")) {
                    String val = (value1 + value2) + "";
                    stack.push(val);
                } else if (s.equals("-")) {
                    String val = (value1 - value2) + "";
                    stack.push(val);
                } else if (s.equals("*")) {
                    String val = (value1 * value2) + "";
                    stack.push(val);
                } else if (s.equals("/")) {
                    String val = (value1 / value2) + "";
                    System.out.println(val);
                    stack.push(val);
                }

            } else {
                stack.push(s);
            }
        }
        return Integer.parseInt(stack.pop());
    }
}