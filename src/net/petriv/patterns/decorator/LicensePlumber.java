package net.petriv.patterns.decorator;

public class LicensePlumber extends PlumberDecorator {

    public LicensePlumber(Plumber plumber) {
        super(plumber);
    }

    public String inspectJob() {
        return "Weekly inspect job ";
    }

    @Override
    public String doJob() {
        return super.doJob() + inspectJob();
    }
}
