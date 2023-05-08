package ThreadJoinDemo;

class Medical extends Thread {
    public void run() {
        try {
            System.out.println("Medical starts");
            Thread.sleep(3000);
            System.out.println("Medical Completed");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class TestDriver extends Thread {
    public void run() {
        try {
            System.out.println("Test drive starts");
            Thread.sleep(5000);
            System.out.println("Test drive completed");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class OfficeSign extends Thread {

    public void run() {
        try {
            System.out.println("Offer take the file");
            Thread.sleep(2000);
            System.out.println("Officer works completed");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class LicenceDemo {

    public static void main(String[] args) throws InterruptedException {

        Medical medical = new Medical();
        medical.start();

        medical.join();

        TestDriver td = new TestDriver();
        td.start();

        td.join();

        OfficeSign os = new OfficeSign();
        os.start();

    }
}
