class Solution {
    public int evalRPN(String[] tokens) {
    Stack<String> opStack = new Stack<>();
        Stack<Integer> valuesStack = new Stack<>();
        int computeValue  = 0;
        for(String token: tokens) {
            if(Set.of("+", "-", "*", "/").contains(token)) {
               if(!valuesStack.isEmpty()) {
                     int value1 = valuesStack.pop();
                     int value2 = valuesStack.pop();
                     computeValue = switch (token) {
                          case "+" -> value2 + value1;
                          case "-" -> value2 - value1;
                          case "*" -> value2 * value1;
                          case "/" -> value2 / value1;
                          default -> computeValue;
                     };
                     valuesStack.push(computeValue);
               }
            } else {
                valuesStack.push(Integer.parseInt(token));
            }
        }
         // Return the final computed value
        return valuesStack.pop();
    }
}
