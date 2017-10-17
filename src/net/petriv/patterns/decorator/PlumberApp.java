package net.petriv.patterns.decorator;

public class PlumberApp {

    public static void main(String[] args) {

        Plumber plumber = new LicensePlumber(new MechanicPlumber(new HelperPlumber()));

        System.out.println(plumber.doJob());
    }

}
