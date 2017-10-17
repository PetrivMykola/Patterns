package net.petriv.patterns.abstractfactory.building;

import net.petriv.patterns.abstractfactory.Carpenter;
import net.petriv.patterns.abstractfactory.Painter;
import net.petriv.patterns.abstractfactory.Plumber;
import net.petriv.patterns.abstractfactory.ProjectTeamFactory;

public class BuildingTeamFactory implements ProjectTeamFactory {
    @Override
    public Plumber getPlumber() {
        return new BoilerPlumber();
    }

    @Override
    public Painter getPainter() {
        return new WallPainter();
    }

    @Override
    public Carpenter getCarpenter() {
        return new FloorCarpenter();
    }
}
