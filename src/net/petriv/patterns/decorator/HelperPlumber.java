package net.petriv.patterns.decorator;

public class HelperPlumber implements Plumber {
    @Override
    public String doJob() {
        return "Connect pipes ";
    }
}
