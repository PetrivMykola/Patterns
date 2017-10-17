package net.petriv.patterns.builder;

public abstract class BuildingBuilder {
    Building building;

    void buildBuilding() {
        building = new Building();
    }

    abstract void buildLocation();

    abstract void buildContractor();

    abstract void builPrice();

    Building getBuilding () {
        return building;
    }
}
