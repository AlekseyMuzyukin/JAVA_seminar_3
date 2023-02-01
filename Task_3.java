import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task_3 {

    public static void main(String[] args) {
        List<Integer> list1 = FillList(100);
        System.out.println(list1);
        double[] metrics = MinMaxAv(list1);
        System.out.println("Minimum: " + metrics[0]);
        System.out.println("Maximum: " + metrics[1]);
        System.out.println("Average: " + metrics[2]);
    }

    public static double[] MinMaxAv(List<Integer> list) {
        double[] minmaxav = new double[3];
        minmaxav[0] = list.get(0);
        minmaxav[1] = list.get(0);
        minmaxav[2] = 0;
        int count = list.size();
        for (int item : list) {
            minmaxav[2] += item;
            if (minmaxav[0] > item) minmaxav[0] = item;
            if (minmaxav[1] < item) minmaxav[1] = item;
        }
        minmaxav[2] = (count != 0) ? minmaxav[2] / count : 0;
        return minmaxav;
    }

    public static List<Integer> FillList(int j) {
        Random random = new Random();
        List<Integer> outList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int rand = random.nextInt(100);
            outList.add(rand);
        }
        return outList;
    }

}