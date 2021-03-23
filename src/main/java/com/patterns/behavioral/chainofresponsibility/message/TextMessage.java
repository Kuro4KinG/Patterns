public class TextMessage extends Message {
    public TextMessage() {
        type = "Text";
    }

    public void write() {
        System.out.println("You've got a Text message");
    }
}
