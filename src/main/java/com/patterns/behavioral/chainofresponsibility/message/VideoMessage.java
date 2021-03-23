public class VideoMessage extends Message {
    public VideoMessage() {
        type = "Video";
    }

    public void write() {
        System.out.println("You've got a Video message!");
    }
}
