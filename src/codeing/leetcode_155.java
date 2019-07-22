package codeing;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class leetcode_155 {
    class MinStack {
        //定义一个集合
        private List<Integer> list;

        /**
         * initialize your data structure here.
         */
        public MinStack() {
            list = new ArrayList<>();

        }

        //入栈
        public void push(int x) {
            list.add(x);
        }

        //删除栈顶元素
        public void pop() {
            if (list.size() > 0) {
                list.remove(list.size() - 1);
            }
        }

        //获取栈顶元素
        public int top() {
            if (list.size() > 0) {
                return list.get(list.size() - 1);
            }
            return 0;
        }

        //检索栈中的最小元素
        public int getMin() {
            int min = list.get(0);
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i) < min) {
                    min = list.get(i);
                }
            }
            return min;
        }
    }

    public static void main(String[] args) {
        leetcode_155.MinStack minStack = new leetcode_155().new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());

    }
}
