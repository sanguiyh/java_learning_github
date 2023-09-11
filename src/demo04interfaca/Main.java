package demo04interfaca;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        System.out.println(apple.getKey());

        Pair<Integer,String> pair = new Pair<>(10,"String10");
        System.out.println(pair.getKey() + " " + pair.getValue());
    }
}
