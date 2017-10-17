package net.petriv.patterns.template;

public abstract class PrintC {
   final void templateMethod() {
        System.out.println("1");
        different();
        System.out.println("3");
    }
    abstract void different();
}
