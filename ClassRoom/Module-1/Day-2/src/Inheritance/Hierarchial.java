package Inheritance;

public class Hierarchial extends A{
    public Hierarchial(){
        System.out.println("This is constructor of hierarchial");
    }
    // class B and class Hierarchial both extends to A

    public static void main(String[] args) {
        Hierarchial obj=new Hierarchial();
    }
}
