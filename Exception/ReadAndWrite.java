import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileInputStream;

class ReadAndWrite {

    void readFile() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("E:/abc.txt");
    }

    void saveFile() throws FileNotFoundException {
        String test = "this is demo";
        FileInputStream fos = new FileInputStream("E:/abc.txt");
    }
}

class Test {
    public static void main(String[] args) {

        ReadAndWrite rw = new ReadAndWrite();
        try {
            rw.readFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Hello");

    }
}
