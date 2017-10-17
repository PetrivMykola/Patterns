package net.petriv.patterns.decorator;

public class PlumberDecorator implements Plumber {
    Plumber plumber;

    public PlumberDecorator(Plumber plumber) {
        this.plumber = plumber;
    }

    @Override
    public String doJob() {
        return plumber.doJob();
    }
}
