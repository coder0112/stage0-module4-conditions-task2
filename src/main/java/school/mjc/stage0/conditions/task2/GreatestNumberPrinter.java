package school.mjc.stage0.conditions.task2;

public class GreatestNumberPrinter {
    public void printGreatest(int first, int second) {
        int max = 0;
        if (first > second) {
            max = first;
        } else {
            max = second;
        }
        System.out.println(max);
    }
}
