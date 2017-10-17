package net.petriv.patterns.builder;

public class BuildBuildingRunner {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new ManhattanBuildingBuilder());

        Building building = director.buildBuilding();

        System.out.println(building);
    }
}
