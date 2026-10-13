public class customException extends Exception{
    customException(String msg){
        super(msg);
    }

    public static void main(String[] args) {
        int age=16;
        try{
            if(age<18){
                throw new customException("Under Age");
            }
            System.out.println("Right Age");
        }
        catch (customException e){
            System.out.println(e.getMessage());
        }
    }

}
