@FunctionalInterface
public interface lambdaexp {

    int calculate(int a , int b);

    public static void main(String[] args) {
        int a=10;
        int b=20;
        lambdaexp obj1 = (x, y) -> x + y;
        System.out.println(obj1.calculate(a, b));
        lambdaexp obj2 = (x, y) -> x - y;
        System.out.println(obj2.calculate(a,b));
        lambdaexp obj3 = (x, y) -> x * y;
        System.out.println(obj3.calculate(a,b));
        lambdaexp obj4 = (x, y) -> x / y;
        System.out.println(obj4.calculate(a,b));
    }

}

