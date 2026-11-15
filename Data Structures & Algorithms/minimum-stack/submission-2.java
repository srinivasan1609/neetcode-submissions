class MinStack {
            private Deque<Integer> stackList = new ArrayDeque<>();
        public MinStack() {

        }

        public void push(int val) {
            stackList.push(val);
        }

        public void pop() {
            stackList.pop();
        }

        public int top() {
            return stackList.peek();
        }

        public int getMin() {
             Stack<Integer> tmp = new Stack<>();
        int mini = stackList.peek();

        while (!stackList.isEmpty()) {
            mini = Math.min(mini, stackList.peek());
            tmp.push(stackList.pop());
        }

        while (!tmp.isEmpty()) {
            stackList.push(tmp.pop());
        }

        return mini;
        }
}
