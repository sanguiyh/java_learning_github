package demo03extend;

public class Main {
    public static void main(String[] args) {
        ChildFirst<String> childFirst = new ChildFirst<>();
        childFirst.setValue("abc");
        System.out.println(childFirst.getValue());


        ChildSecond childSecond = new ChildSecond();
        childSecond.setValue(100);
        System.out.println(childSecond.getValue());
    }
}
