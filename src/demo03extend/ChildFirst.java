package demo03extend;

//子类也是泛型类，子类和父类的泛型类型要一致
public class ChildFirst<E> extends Parent<E>{

    @Override
    public E getValue() {return super.getValue();}
}
