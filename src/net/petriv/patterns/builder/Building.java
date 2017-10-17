package net.petriv.patterns.builder;

public class Building {
    private String location;
    private String contractor;
    private int price;

    public void setLocation(String location) {
        this.location = location;
    }

    public void setContractor(String contractor) {
        this.contractor = contractor;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Building{" +
                "location='" + location + '\'' +
                ", contractor='" + contractor + '\'' +
                ", price=" + price +
                '}';
    }
}
