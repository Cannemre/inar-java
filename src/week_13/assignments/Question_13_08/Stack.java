package week_13.assignments.Question_13_08;

import java.util.ArrayList;

public class Stack implements Cloneable {
    private ArrayList<Object> list = new ArrayList<>();

    public ArrayList<Object> getList() {
        return list;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        return list.isEmpty() ? null : list.get(getSize() - 1);
    }

    public Object pop() {
        if (isEmpty()) {
            return null;
        }
        Object o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public void push(Object o) {
        list.add(o);
    }

    public boolean isEqual(Stack o) {
        if (getSize() != o.getSize()) {
            return false;
        }
        for (int i = 0; i < o.getList().size(); i++) {
            if (o.getList().get(i) != getList().get(i)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return list.toString();
    }

    @Override
    public Stack clone() {
        try {
            Stack clone = (Stack) super.clone();
            clone.list = copyList();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
    private ArrayList<Object> copyList() {
        ArrayList<Object> newList = new ArrayList<>();
        newList.addAll(list);
        return newList;
    }
}
