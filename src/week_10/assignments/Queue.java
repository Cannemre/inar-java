package week_10.assignments;

public class Queue {
    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 8;

    Queue() {
        this.elements = new int[DEFAULT_CAPACITY];
    }

    public void enqueue(int v) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = v;
    }

    public int dequeue() {
        int result = elements[0];
        for (int i = 0; i < size - 1; i++) {
            int temp = elements[i];
            elements[i] = elements[i + 1];
            elements[i + 1] = temp;
        }
        size--;
        return result;
    }

    public boolean empty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}
