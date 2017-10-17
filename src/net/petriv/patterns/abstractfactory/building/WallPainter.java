package net.petriv.patterns.abstractfactory.building;

import net.petriv.patterns.abstractfactory.Painter;

public class WallPainter implements Painter {
    @Override
    public void paintWall() {
        System.out.println("Painter paint wall");
    }
}
