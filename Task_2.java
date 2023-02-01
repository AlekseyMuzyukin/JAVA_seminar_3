
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task_2 {

    public static void main(String[] args) {
        List<Integer> list2 = FillList(10);
        System.out.println(list2);
        System.out.println(DeleteEven(list2));
    }

    public static List<Integer> DeleteEven(List<Integer> list) {
        List<Integer> newList = new ArrayList<>();
        for (int i : list) {
            if (i % 2 != 0)
                newList.add(i);
        }
        return newList;
    }

    public static List<Integer> FillList(int j) {
        Random random = new Random();
        List<Integer> OutList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int rand = random.nextInt(100);
            OutList.add(rand);
        }
        return OutList;
    }
}
