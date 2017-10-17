package net.petriv.patterns.state;

public class StateApp {
    public static void main(String[] args) {
        TVChannel tvChannel = new Discavery();
        TV tv = new TV();
        tv.setTvChannel(tvChannel);

        for (int i = 0; i<10; i++){
            tv.nextTvChannel();
            tv.show();
        }
    }
}
