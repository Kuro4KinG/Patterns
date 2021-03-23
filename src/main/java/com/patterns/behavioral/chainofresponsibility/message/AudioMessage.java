public class AudioMessage extends Message {
    public AudioMessage() {
        type = "Audio";
    }

    @Override
    public void write() {
        System.out.println("You've got an Audio message");
    }
}
