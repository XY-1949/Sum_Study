package life.ysd.basics.Collection.List;

import org.junit.Test;

import java.util.*;

/**
 * @author Yinsd
 * @version 1.0
 * Only code and time last forever
 * @date 2022/4/19 1:19 PM
 */
public class Demo01 extends AbstractCollection{


    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
class CollectionSum extends Exception{


    public int[] testSum(int[] sum){

        //定义三个List集合的常用实现类集合：ArrayList，Vector，LinkedList；
        List<Integer> objects = new ArrayList<>();
        List<Integer> objects3 = new Vector<>();
        List<Integer> objects4 = new LinkedList<>();
        //定义三个Set集合的常用实现类集合：HashSet，LinkedHashSet，TreeSet；
        Set<Integer> objects1 = new HashSet<>();
        Set<Integer> objects2 = new LinkedHashSet<>();
        Set<Integer> objects5 = new TreeSet<>();



        for (int i:sum) {
            objects.add(i);
            objects1.add(i);
            objects2.add(i);
            objects3.add(i);
            objects4.add(i);
            objects5.add(i);
            //objects5.add(null);
        }

        System.out.println("ArrayList：");
        ListIterator<Integer> integerListIterator = objects.listIterator();
        for ( int i:objects) {
            System.out.print(i+", ");
        }
        System.out.println();
        System.out.println("HashSet：");
        for (int i:objects1) {
            System.out.print(+i+", ");
        }
        System.out.println();
        System.out.println("LinkedHashSet：");
        for (int i:objects2) {
            System.out.print(i+", ");
        }

        System.out.println();
        System.out.println("Vector：");
        for (int i:objects3) {
            System.out.print(i+", ");
        }

        System.out.println();
        System.out.println("LinkedList：");
        for (int i:objects4) {
            System.out.print(i+", ");
        }

        System.out.println();
        System.out.println("TreeSet：");
        for (int i:objects5) {
            System.out.print(i+", ");
        }
        return sum;
    }

    public static void main(String[] args) {
        //设定一个长度为15的数组：
        int in =0;
        int[] sum = new int[]{1, 45, 12, 10,0,12,13,41,42,99,87,78,87};
        CollectionSum collectionSum = new CollectionSum();
        collectionSum.testSum(sum);
    }


    public synchronized void test(){



    }

    public Integer test(Integer in){


        return in;
    }
}
