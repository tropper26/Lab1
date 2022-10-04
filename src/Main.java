import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        var liste = new ArrayList<Integer>() {
            {
                add(1);
                add(2);
                add(3);
            }
        };
        var average = liste.stream().mapToInt(a -> a).average();

        System.out.println(average);
    }
}