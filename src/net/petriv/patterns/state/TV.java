package net.petriv.patterns.state;

public class TV {
    TVChannel tvChannel;

    void setTvChannel(TVChannel tv) {
        tvChannel = tv;
    }

    void nextTvChannel() {
        if (tvChannel instanceof CNN) {
            setTvChannel(new Discavery());
        }else if (tvChannel instanceof Sport1) {
            setTvChannel(new CNN());
        } else if (tvChannel instanceof Discavery)
            setTvChannel(new Sport1());
    }

    void show() {
        tvChannel.show();
    }
}
