public class BLogRunner {
    public static void main(String[] args) {
        Blogger firstBlogger = new Blogger("SuperStar");

        Subscriber firstSub = new Subscriber("Petr", firstBlogger);
        Subscriber secondSub = new Subscriber("Alex", firstBlogger);

        firstBlogger.createNewPost("Hello everyone!");
        System.out.println();
        firstBlogger.createNewPost("How are you?!");
    }
}
