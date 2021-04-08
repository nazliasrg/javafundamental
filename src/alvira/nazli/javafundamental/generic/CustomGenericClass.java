package alvira.nazli.javafundamental.generic;

public class CustomGenericClass<T> {
    private T t;

    public T getResult() {
        return t;
    }

    public void setData(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        CustomGenericClass<Integer> integer = new CustomGenericClass<>();
        CustomGenericClass<String> string = new CustomGenericClass<>();
        integer.setData(10);
        string.setData("Ini adalah generic class");
        System.out.println(integer.getResult());
        System.out.println(string.getResult());
    }
}
