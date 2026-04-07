import algossssss.GreedyAlgs;
import resolve_problems.Problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        Supplier<Integer> supplier = () -> new Random().nextInt(100) + 1;
        List<Integer> list = Problem.genarateList(supplier, 100);

        int[] next = {1};
        Supplier<Integer> supplier2 = () -> next[0]++;
        List<Integer> list2 = Problem.genarateList(supplier2, 100);
    }
}
