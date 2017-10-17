package net.petriv.patterns.builder;

public class ManhattanBuildingBuilder extends BuildingBuilder {

    @Override
    void buildLocation() {
        building.setLocation("Manhattan");
    }

    @Override
    void buildContractor() {
        building.setContractor("MGN");

    }

    @Override
    void builPrice() {
        building.setPrice(1000000);

    }
}
