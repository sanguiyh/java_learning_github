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
}