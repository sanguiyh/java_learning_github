package demo03extend;

public class ChildSecond extends Parent<Integer> {

    @Override
    public Integer getValue() {
        return super.getValue();
    }

    @Override
    public void setValue(Integer value) {
        super.setValue(value);
    }
}
