import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Please input your numbers");

        int num;       // integer will be stored in this variable

        ArrayList<Integer> List = new ArrayList<>();

        while (reader.hasNextInt())
        {
            num = reader.nextInt();
            List.add(num);
        }

        var average = List.stream().mapToInt(a -> a).average();

        System.out.println(average);
    }
}