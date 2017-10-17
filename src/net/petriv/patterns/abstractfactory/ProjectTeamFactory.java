package net.petriv.patterns.abstractfactory;

public interface ProjectTeamFactory {
    Plumber getPlumber();
    Painter getPainter();
    Carpenter getCarpenter();
}
