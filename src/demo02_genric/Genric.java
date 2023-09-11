package demo02_genric;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @param <T> 泛型标识符，具体类型由传入的参数确定
 */
public class Genric <T>{
    //T由外部使用类的时候确定
    private T key;

    public Genric(){}
    public Genric(T key) {this.key = key;}
    public T getKey() {return key;}
    public void setKey(T key) {this.key = key;}
}

class ProductGetter<T>{
    private T product;
    private Random random = new Random();
    ArrayList<T> list = new ArrayList<>();
    public void addProduct(T t){
        list.add(t);
    }
    public T getProduct(){
        product = list.get(random.nextInt(list.size()));
        return product;
    }

    /**
     *
     * @param list 参数
     * @return
     * @param <T> 泛型标识符，具体类型由调用方法的时候指定
     */
    //泛型方法独立于泛型类型，及时使用相同的标识符
    //ProductGetter<Integer> productGetter = new ProductGetter<>();
    //创建对象时指定T为Interger类型,泛型方法还可以接受String类型的参数
    public  <T> T getProduct(ArrayList<T> list){
        return list.get(random.nextInt(list.size()));
    }

    /**
     * 静态的泛型方法，采用多个泛型类型
     * @param t
     * @param e
     * @param k
     * @param <T>
     * @param <E>
     * @param <K>
     */
    public static <T,E,K> void priiType(T t , E e,K k){
        System.out.println(t +"\t"+ t.getClass().getSimpleName());
        System.out.println(e +"\t"+ e.getClass().getSimpleName());
        System.out.println(k +"\t"+ k.getClass().getSimpleName());
    }

    /**
     * 泛型可变参数的定义
     * @param e
     * @param <E>
     */
    public static <E> void print(E...e){
        for (int i = 0; i < e.length; i++) {
            System.out.println(e[i]);
        }
    }
}