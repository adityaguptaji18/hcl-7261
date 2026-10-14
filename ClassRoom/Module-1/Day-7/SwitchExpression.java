import java.util.Scanner;

public class SwitchExpression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String day=sc.nextLine();
        String result = switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "WeekDay";
            case "Saturday", "Sunday" -> "Weekend";
            default -> "Invalid day";
        };
        System.out.println(result);
    }
}
