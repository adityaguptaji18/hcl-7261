package Streams;

import java.util.Arrays;
import java.util.List;
public class StreamBasic {
    public static void main(String[] args) {




//        Intermediate Operations
//        filter(), map(), sorted(), distinct()
//        These transform or process the stream and return another stream. They are generally lazy, meaning they do not process elements until a terminal operation triggers the pipeline.
//
//
//        Terminal Operations
//        forEach(), collect(), count(), reduce(), min(), max(), findFirst()
//        These finish the stream pipeline and produce a result or perform an action.
        // We cant perform any operation after terminal operations



//        List<Integer> l1= Arrays.asList(10,15,20,25,30);
//        l1.stream().filter(n->n%2==0).forEach(n-> System.out.println(n));
//        List<Integer> l2=Arrays.asList(2,4,6,8,10,12,14,16);
//        l2.stream().map(n->{n=n*2;n=n+10;return n;}).forEach(n-> System.out.println(n));

        List<String> l3=Arrays.asList("Aditya","Rahul","Rakesh","Ravi","Simran");
        long count=l3.stream().filter(n->n.startsWith("R")).filter(n->n.endsWith("h")).count();
        System.out.println(count);
    }
}
