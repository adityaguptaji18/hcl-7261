package FunctionalInterfaces;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {

        // Predicate
        Predicate<Integer> evenOrOdd = x -> x % 2 == 0;
        System.out.println("Is 10 even? " + evenOrOdd.test(10));
        System.out.println("Is 15 even? " + evenOrOdd.test(15));



        //Function
        Function<Integer, Integer> square = x -> x * x;
        System.out.println("Square of 5: " + square.apply(5));

        // for two arguments in Function we use Bifunction

        BiFunction<Integer,Integer,Integer> fun=(a,b)->a*b;
        System.out.println(fun.apply(3,6));

        // consumer
        Consumer<String> printName = name -> System.out.println("Name: " + name);
        printName.accept("Aditya");

        // Supplier
        Supplier<Double> randomNumber = () -> Math.random();
        System.out.println("Random number: " + randomNumber.get());
    }
}
