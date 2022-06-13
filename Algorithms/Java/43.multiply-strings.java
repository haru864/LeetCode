import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
 * @lc app=leetcode id=43 lang=java
 *
 * [43] Multiply Strings
 */

// @lc code=start
class Solution {

    public String multiply(String num1, String num2) {

        List<List<String>> result = new ArrayList<>();

        for (int i = num2.length() - 1; i >= 0; i--) {
            List<String> list;
            list = mult(num1, num2.charAt(i));
            for (int j = num2.length() - 1; j > i; j--) {
                list.add("0");
            }
            result.add(list);
            // printList(list);
        }

        List<String> total = new ArrayList<>();
        total.add("0");

        for (int i = 0; i < result.size(); i++) {
            total = add(total, result.get(i));
            // printList(total);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < total.size(); i++) {
            sb.append(total.get(i));
        }

        boolean notZero = false;

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) != '0')
                notZero = true;
        }

        return (notZero) ? sb.toString() : "0";
    }

    public List<String> mult(String a, char b) {

        List<String> ret = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        int carry = 0;

        for (int i = a.length() - 1; i >= 0; i--) {
            int n = Character.getNumericValue(a.charAt(i));
            int m = Character.getNumericValue(b);
            int result = n * m;
            if (carry != 0) {
                result += carry;
            }
            stack.add(String.valueOf(result % 10));
            carry = result / 10;
        }

        if (carry != 0) {
            stack.add(String.valueOf(carry));
        }

        while (!stack.isEmpty()) {
            ret.add(stack.pop());
        }

        return ret;
    }

    public List<String> add(List<String> a, List<String> b) {

        List<String> ret = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        int carry = 0;
        int len = 0;
        int bottom_a = a.size() - 1;
        int bottom_b = b.size() - 1;

        for (int i = Math.max(a.size(), b.size()) - 1; i >= 0; i--) {
            len++;
            int n, m;
            if (len > a.size())
                n = 0;
            else
                n = Integer.parseInt(a.get(bottom_a--));
            if (len > b.size())
                m = 0;
            else
                m = Integer.parseInt(b.get(bottom_b--));
            int sum = n + m + carry;
            stack.add(String.valueOf(sum % 10));
            carry = sum / 10;
        }

        if (carry != 0)
            stack.add(String.valueOf(carry));

        while (stack.size() > 0) {
            ret.add(stack.pop());
        }

        return ret;
    }

    public void printList(List<String> list) {

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.print("\n");
    }
}
// @lc code=end
