package net.petriv.patterns.decorator;

public class MechanicPlumber extends PlumberDecorator {

    public MechanicPlumber(Plumber plumber) {
        super(plumber);
    }

    public String instalBoilers() {
        return "Establish boilers ";
    }

    @Override
    public String doJob() {
        return super.doJob() + instalBoilers();
    }
}
