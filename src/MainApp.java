public class MainApp {

    public static void main(String[] args) {

        TicketCounter counter = new TicketCounter();

        UserThread u1 = new UserThread(counter, "User1", 2);
        UserThread u2 = new UserThread(counter, "User2", 2);
        UserThread u3 = new UserThread(counter, "User3", 2);

        u1.start();
        u2.start();
        u3.start();
    }
}
