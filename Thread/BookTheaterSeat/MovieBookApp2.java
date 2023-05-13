package moviebookapp;

class BookTheaterSeat1 {
    int total_seats = 10;

    void bookseat(int seats) {

        System.out.println("hi : " + Thread.currentThread().getName());
        System.out.println("hi : " + Thread.currentThread().getName());
        System.out.println("hi : " + Thread.currentThread().getName());
        System.out.println("hi : " + Thread.currentThread().getName());
        System.out.println("hi : " + Thread.currentThread().getName());

        synchronized (this) {
            if (total_seats >= seats) {
                System.out.println(seats + " seats booked successfully");
                total_seats = total_seats - seats;
                System.out.println("seats left : " + total_seats);
            } else {
                System.out.println("sorry seats cannot be booked...!!");
                System.out.println("seats left : " + total_seats);
            }
        }
        System.out.println("hi : " + Thread.currentThread().getName());
        System.out.println("hi : " + Thread.currentThread().getName());
        System.out.println("hi : " + Thread.currentThread().getName());
        System.out.println("hi : " + Thread.currentThread().getName());
        System.out.println("hi : " + Thread.currentThread().getName());

    }
}

public class MovieBookApp2 extends Thread {
    static BookTheaterSeat1 b1;
    int seats;

    public void run() {
        b1.bookseat(seats);
    }

    public static void main(String[] args) {
        b1 = new BookTheaterSeat1();

        MovieBookApp2 deepak2 = new MovieBookApp2();
        deepak2.seats = 7;
        deepak2.start();

        MovieBookApp1 amit1 = new MovieBookApp1();
        amit1.seats = 6;
        amit1.start();
    }
}