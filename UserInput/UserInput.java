package UserInput;
import java.util.*;
public class UserInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        float totalMarks = sc.nextFloat();
        float marksObtained = sc.nextFloat();
        sc.close();

        System.out.println((marksObtained/totalMarks)*100);
    }
}
