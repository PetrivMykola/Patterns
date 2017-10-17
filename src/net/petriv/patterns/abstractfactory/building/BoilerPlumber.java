package net.petriv.patterns.abstractfactory.building;

import net.petriv.patterns.abstractfactory.Plumber;

public class BoilerPlumber implements Plumber {

    @Override
    public void connectPipe() {
        System.out.println("Boiler Plumber connect boilers");
    }
}
