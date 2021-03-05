public interface Observed {
    void registerSub(Observer sub);

    void removeSub(Observer sub);

    void notifySubs();
}
