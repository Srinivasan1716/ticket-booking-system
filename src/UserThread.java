public class UserThread extends Thread {

    TicketCounter counter;
    String user;
    int seats;

    public UserThread(TicketCounter counter, String user, int seats) {
        this.counter = counter;
        this.user = user;
        this.seats = seats;
    }

    public void run() {
        counter.bookTicket(user, seats);
    }
}
