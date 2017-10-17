package net.petriv.patterns.builder;

public class BrooklynBuildingBuilder extends BuildingBuilder {
    @Override
    void buildLocation() {
        building.setLocation("Brooklyn");
    }

    @Override
    void buildContractor() {
        building.setContractor("ABC");

    }

    @Override
    void builPrice() {
        building.setPrice(10254);

    }
}
