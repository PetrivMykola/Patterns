package net.petriv.patterns.strategy;

public class StrategyApp {
    public static void main(String[] args) {
        StrategyClient sc = new StrategyClient();

        int[] arr0 = {1, -5, 4, 0,};
        sc.setStrategy(new BubbleSort());
        sc.executeStrategy(arr0);

        int[] arr1 = {56125, 4122, -9658, 0,};
        sc.setStrategy(new InsertionSort());
        sc.executeStrategy(arr1);


    }
}
