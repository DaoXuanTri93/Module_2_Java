package generic.demo_generic;

public class Box_2<T> {
    private T value ;

    public Box_2(T value){
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
