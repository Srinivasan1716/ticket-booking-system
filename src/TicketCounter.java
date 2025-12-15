public class TicketCounter {

    private int availableSeats = 5;

    public synchronized void bookTicket(String user, int seats) {

        System.out.println(user + " trying to book " + seats + " seat(s)");

        if (availableSeats >= seats) {
            availableSeats -= seats;
            System.out.println("Booking successful for " + user);
            System.out.println("Seats left: " + availableSeats);
        } else {
            System.out.println("Booking failed for " + user);
        }

        System.out.println("----------------------------");
    }
}
