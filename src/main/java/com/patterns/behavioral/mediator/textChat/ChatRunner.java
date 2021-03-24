public class ChatRunner {
    public static void main(String[] args) {
        TextChat textChat = new TextChat();


        User admin = new Admin(textChat, "Администратор");
        User user1 = new SimpleUser(textChat, "Пользователь Гоша");
        User user2 = new SimpleUser(textChat, "Пользователь Гриша");

        textChat.setAdmin(admin);
        textChat.addUser(user1);
        textChat.addUser(user2);

        user1.sendMessage("Привет от Гоши!");
        System.out.println();
        user2.sendMessage("Привет от Гриши!");
        System.out.println();
        admin.sendMessage("Я здесь Администратор");


    }
}
