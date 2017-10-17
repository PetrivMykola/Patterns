package net.petriv.patterns.template;

public class Print {
    public static void main(String[] args) {
        PrintC printA = new PrintA();
        printA.templateMethod();

        PrintC printB = new PrintB();
        printB.templateMethod();
    }
}
