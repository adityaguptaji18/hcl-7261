
class Genericss<T extends Number, E> {

    T a;
    E b;

    Genericss(T a, E b) {
        this.a = a;
        this.b = b;
    }

//    public T myMethod(E value) {
//        return a;
//    }

    public void display() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

public class Generics {
    public static void main(String[] args) {

        Genericss<Integer, String> obj =
                new Genericss<>(10, "Hello");

        obj.display();
    }
}
