public class ExceptionHandling {
    public static void main(String[] args) throws InterruptedException{
        Thread.sleep(2000); // because of thread.sleep the program pauses for 10 seconds
        try{
            int a=10;
            int b=0;
            int result=a/b;
            System.out.println(result);
        }
        catch (ArithmeticException e){
            System.out.println(e+" : "+"Cannot divide by zero");
        }
        try {
            int[] arr = {10, 20, 30};

            System.out.println(arr[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds!");
        }
        finally {
            System.out.println("This always executes");
        }
    }
}
