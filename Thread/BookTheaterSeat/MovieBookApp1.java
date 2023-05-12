package moviebookapp;

class BookTheaterSeat {
    int total_seats = 10;

    synchronized void bookseat(int seats) {
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

public class MovieBookApp1 extends Thread {
    static BookTheaterSeat b;
    int seats;

    public void run() {
        b.bookseat(seats);
    }

    public static void main(String[] args) {
        b = new BookTheaterSeat();

        MovieBookApp1 deepak1 = new MovieBookApp1();
        deepak1.seats = 7;
        deepak1.start();

        MovieBookApp1 amit1 = new MovieBookApp1();
        amit1.seats = 6;
        amit1.start();
    }
}