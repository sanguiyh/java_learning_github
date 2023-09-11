package demo02_genric;

public class Main {
    public static void main(String[] args) {
        Genric<String> str = new Genric<>();
        Genric<String> stringGenric = new Genric<String>("abc");
        System.out.println(stringGenric.getKey());

        //泛型类，不支持基本数据类型。只支持类类型
//        Genric<int> genric1 = new Genric<int>();
        Genric<Integer> integerGenric = new Genric<>(20);
        System.out.println(integerGenric.getKey());

        Genric genric = new Genric<>("hello");
        System.out.println(genric.getKey());

        //泛型类根据不同数据类型 创建的对象,本质上是同一类型：Genric类型
        System.out.println(stringGenric.getClass());
        System.out.println(integerGenric.getClass());
        System.out.println(stringGenric.getClass() == integerGenric.getClass());


        //泛型类：没有指定数据类型，操作类型是Object类型
        //泛型的类型参数只能是类 类型，不能是基本数据类型
        //泛型类型在逻辑上可以看成是多个不同类型，实际上都是相同类型
        System.out.println("-----------------------------------------------------------------------");
        ProductGetter<String>  stringProductGetter = new ProductGetter<>();
        String[] strProducts = {"aaa","bbb","ccc"};

        for(int i = 0; i < strProducts.length; i++) {
            stringProductGetter.addProduct(strProducts[i]);
        }

        String product1 = stringProductGetter.getProduct();
        System.out.println(product1);

        System.out.println("==========================================================================");



        ProductGetter<Integer>  intProductGetter = new ProductGetter<>();
        Integer[] intProducts = {100,500,1000};

        for(int i = 0; i < strProducts.length; i++) {
            intProductGetter.addProduct(intProducts[i]);
        }
        Integer product2 = intProductGetter.getProduct();
        System.out.println(product2);



    }

}
