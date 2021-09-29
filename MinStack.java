import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class MinStack {
    List<Integer> data;

    /** initialize your data structure here. */
    public MinStack() {
        data = new ArrayList<>();
    }

    public void push(int val) {
        data.add(val);
    }

    public void pop() {
        data.remove(data.size() - 1);
    }

    public int top() {
        return data.get(data.size() - 1);
    }

    public int getMin() {
        return Collections.min(data);
    }
}