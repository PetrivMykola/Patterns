package net.petriv.patterns.abstractfactory.building;

import net.petriv.patterns.abstractfactory.Carpenter;
import net.petriv.patterns.abstractfactory.Painter;
import net.petriv.patterns.abstractfactory.Plumber;
import net.petriv.patterns.abstractfactory.ProjectTeamFactory;

public class BuildingInManhattan {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BuildingTeamFactory();
        Plumber plumber = projectTeamFactory.getPlumber();
        Carpenter carpenter = projectTeamFactory.getCarpenter();
        Painter painter = projectTeamFactory.getPainter();

        System.out.println("Build building : ");
        painter.paintWall();
        plumber.connectPipe();
        carpenter.createFloors();
    }
}
