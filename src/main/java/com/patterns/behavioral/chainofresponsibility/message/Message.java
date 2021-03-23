public abstract class Message {
    private Message next;
    protected String type;

    public void setNext(Message next) {
        this.next = next;
    }

    public void notify(String message) {
        if (message.equals(type)) {
            write();
        }
        if (next != null) next.notify(message);
    }

    public abstract void write();
}
