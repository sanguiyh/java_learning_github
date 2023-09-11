package demo04interfaca;

//实现泛型接口的类不是泛型类， 需要明确实现泛型接口的类型
public class Apple implements Generator<String>{
    @Override
    public String getKey() {
        return "hello generic";
    }

}
