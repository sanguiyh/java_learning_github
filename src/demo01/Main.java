package demo01;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("hello");
        list.add(100);
        list.add(true);

        /*
         * Object可以存储任意类型对象， 使用集合的过程中需要明确知道每个存储单元的数据类型,否则引发ClassCastException
         */
        for (int i = 0; i < list.size(); i++) {
            Object o = list.get(i);
            System.out.println(o);
            //Exception in thread "main" java.lang.ClassCastException
            //Integer cannot be cast to class java.lang.String
            // 运行期异常
            //  String str = (String) o;
            // System.out.println(o);
        }
        System.out.println("1.===============================================================");
        //泛型 1.提供编译时类型检测
        //2.获取元素不需要强制类型转换
        //泛型本质 参数化类型
        //<String>指定集合中存储的类型为String
        ArrayList<String> strList = new ArrayList<>();
        //strList.add(100);报错
        strList.add("a");
        strList.add("b");
        strList.add("c");

        System.out.println("2.===================================================================");
        for (int i = 0; i < strList.size(); i++) {
            String s = strList.get(i);
            System.out.println(s);
        }

        System.out.println("3.===================================================================");
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(100);
        intList.add(200);
        intList.add(300);

        for (int i = 0; i < intList.size(); i++) {
            int num = intList.get(i);
            System.out.println(num);
        }
    }
}
