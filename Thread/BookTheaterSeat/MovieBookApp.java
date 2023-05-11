package moviebookapp;

class BookTheaterSeat {
    int total_seats = 10;

    void bookseat(int seats) {
        if (total_seats >= seats) {
            System.out.println(seats + " seats booked successfully");
            total_seats = total_seats - seats;
            System.out.println("seats left : " + total_seats);
        } else {
            System.out.println("sorry seats cannot be booked...!!");
            System.out.println("seats left : " + total_seats);
        }
    }
}

public class MovieBookApp extends Thread {
    static BookTheaterSeat b;
    int seats;

    public void run() {
        b.bookseat(seats);
    }

    public static void main(String[] args) {
        b = new BookTheaterSeat();

        MovieBookApp deepak = new MovieBookApp();
        deepak.seats = 7;
        deepak.start();

        MovieBookApp amit = new MovieBookApp();
        amit.seats = 6;
        amit.start();
    }
}