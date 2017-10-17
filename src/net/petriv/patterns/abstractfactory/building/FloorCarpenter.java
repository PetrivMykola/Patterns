package net.petriv.patterns.abstractfactory.building;

import net.petriv.patterns.abstractfactory.Carpenter;

public class FloorCarpenter implements Carpenter {
    @Override
    public void createFloors() {
        System.out.println("Carpenter create floors");
    }
}
