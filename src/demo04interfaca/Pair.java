package demo04interfaca;

public class Pair<T,E> implements Generator<T>{
    private T key;
    private E value;

    Pair(T key, E value){
        this.key = key;
        this.value =value;
    }
    @Override
    public T getKey() {
        return key;
    }
    public E getValue(){
        return value;
    }
}
