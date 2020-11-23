package sorttest;


public class No<T> {
    private T c;

    public T getC() {
        return c;
    }

    public void setC(T c) {
        this.c = c;
    }

    public static void main(String[] args) {
        No<Integer> integerNo = new No<>();
        integerNo.setC(1);
    }
}
