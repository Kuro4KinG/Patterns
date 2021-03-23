public class Notification {
    public static void main(String[] args) {
        Message textMessage = new TextMessage();
        Message audioMessage = new AudioMessage();
        Message videoMessage = new VideoMessage();

        textMessage.setNext(audioMessage);
        audioMessage.setNext(videoMessage);

        textMessage.notify("Audio");
    }
}
