package chapter2.part2;

/**
 * 描述：单向链表-版本1
 *
 * @author lhh
 * @Date 2020/11/5 17:29
 */
public class SingleLinkeOne<T> {
    T val;
    SingleLinkeOne next;
    public int size;

    SingleLinkeOne() {
    }

    SingleLinkeOne(T val) {
        this.val = val;
    }

    SingleLinkeOne(T val, SingleLinkeOne next) {
        this.val = val;
        this.next = next;
    }

    /**
     * 指定位置添加元素
     *
     * @param i
     * @param t
     */
    public void add(int i, T t) {
        if (i < 0 || i > size) {
            throw new ArrayIndexOutOfBoundsException("插入的位置不合法");
        } else {
            SingleLinkeOne temp = this;
            int counter = -1;
            while (temp != null) {
                if ((i - 1) == counter) {
                    //将i前面的节点指向node，node的指向i节点
                    SingleLinkeOne node = new SingleLinkeOne(t);
                    SingleLinkeOne back = temp.next;
                    temp.next = node;
                    node.next = back;
                    size++;
                }
                temp = temp.next;
                counter++;
            }
        }
    }

    public SingleLinkeOne setData(int[] s1) {
        SingleLinkeOne list1 = new SingleLinkeOne();
        for (int i = 0; i < s1.length; i++) {
            list1.add(i, s1[i]);
        }
        return list1;
    }

    public SingleLinkeOne addTwoNumbers(SingleLinkeOne l1, SingleLinkeOne l2) {
        SingleLinkeOne root = new SingleLinkeOne(0);
        SingleLinkeOne cursor = root;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int l1Val = l1 != null ? (int) l1.val : 0;
            int l2Val = l2 != null ? (int) l2.val : 0;
            int sumVal = l1Val + l2Val + carry;
            carry = sumVal / 10;

            SingleLinkeOne sumNode = new SingleLinkeOne(sumVal % 10);
            cursor.next = sumNode;
            cursor = sumNode;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return root.next;

    }

    public static void main(String[] args) {
        System.out.println(0.29*100);
        int a[] = {2, 4, 3};
        int b[] = {5, 6, 4};

        SingleLinkeOne one = new SingleLinkeOne();
        SingleLinkeOne one1 = one.setData(a);
        SingleLinkeOne one2 = one.setData(b);
        one1=one1.next;
        one2=one2.next;
        SingleLinkeOne one3 = one.addTwoNumbers(one1, one2);
        System.out.println(one.getElenmt(one3));
    }


    String getElenmt(SingleLinkeOne one){
        String s="";
        while (one!=null){
            s+=one.val;
            one=one.next;
        }
        return s;
    }
}
