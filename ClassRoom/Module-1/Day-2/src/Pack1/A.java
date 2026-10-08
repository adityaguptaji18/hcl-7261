package Pack1;

public class A {
    public A(){
        System.out.println("This is constructor of A with no parameters");
    }
    int a;
    int b;
    public A(int a){
        this.a=a;
        System.out.println("This is cons of A with 1 parameter");
    }
    public A(int a ,int b){
        this.a=a;
        this.b=b;
        System.out.println("This is cons of A with 2 parameter");
    }
}
