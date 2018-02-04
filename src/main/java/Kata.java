import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kata {

    public static int[] sortArray(int[] array) {
        List<Integer> resultList = new ArrayList<>();

        final int[] sortedOdds = Arrays.stream(array).filter(val -> isOdd(val)).sorted().toArray();

        int sortedIndex = 0;
        for ( int i : array) {
            if (isOdd(i)) {
                resultList.add(sortedOdds[sortedIndex]);
                sortedIndex++;
            } else {
                resultList.add(i);
            }
       }

        return resultList.stream().mapToInt(Integer::intValue).toArray();
    }

    private static boolean isOdd(int val) {
        return val % 2 != 0;
    }
}
