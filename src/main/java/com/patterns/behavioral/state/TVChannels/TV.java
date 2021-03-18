public class TV {
    Channel channel;

    void setChannel(Channel channel) {
        this.channel = channel;
    }

    void nextChannel() {
        if (channel instanceof FirstChannel) {
            channel = new SecondChannel();
        } else if (channel instanceof SecondChannel) {
            channel = new ThirdChannel();
        } else if (channel instanceof ThirdChannel) {
            channel = new FirstChannel();
        }
    }

    void previousChannel() {
        if (channel instanceof FirstChannel) {
            channel = new ThirdChannel();
        } else if (channel instanceof ThirdChannel) {
            channel = new SecondChannel();
        } else if (channel instanceof SecondChannel) {
            channel = new FirstChannel();
        }
    }

    void play() {
        channel.play();
    }

}
