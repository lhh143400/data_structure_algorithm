package sorttest;

import chapter2.part2.SingleLinkedList;

/**
 * 描述：链表测试
 *
 * @author lhh
 * @Date 2020/11/4 18:00
 */
public class LinkedTest {

    public  SingleLinkedList setData(int []s1) throws Exception {
        SingleLinkedList list1=new SingleLinkedList();
        for (int i=0;i<s1.length;i++){
            list1.add(i,s1[i]);
        }
      return list1;
    }


    public static void main(String[] args) throws Exception {
        int a[]={2,4,3};
        int b[]={5,6,4};

        LinkedTest test=new LinkedTest();
        SingleLinkedList t = test.setData(a);

        for (int i=0;i<t.size;i++){
            System.out.println(t.get(i));
        }
        System.out.println(test);
    }
}
