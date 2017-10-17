package net.petriv.patterns.builder;

public class Director {
    BuildingBuilder builder;

    public void setBuilder(BuildingBuilder builder) {
        this.builder = builder;
    }

    Building buildBuilding() {
        builder.buildBuilding();
        builder.buildLocation();
        builder.buildContractor();
        builder.builPrice();
        Building building = builder.getBuilding();

        return building;
    }
}
