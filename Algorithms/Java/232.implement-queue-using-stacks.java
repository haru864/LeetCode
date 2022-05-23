import java.util.Stack;

import javax.security.sasl.SaslException;

/*
 * @lc app=leetcode id=232 lang=java
 *
 * [232] Implement Queue using Stacks
 */

// @lc code=start
class MyQueue {

    Stack<Integer> s1;
    Stack<Integer> s2;

    public MyQueue() {

        this.s1 = new Stack<>();
        this.s2 = new Stack<>();
    }

    public void push(int x) {

        while (!this.s1.isEmpty()) {
            this.s2.push(this.s1.pop());
        }

        this.s1.push(x);

        while (!this.s2.isEmpty()) {
            this.s1.push(this.s2.pop());
        }

        return;
    }

    public int pop() {

        return this.s1.pop();
    }

    public int peek() {

        return this.s1.peek();
    }

    public boolean empty() {

        return this.s1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
// @lc code=end
