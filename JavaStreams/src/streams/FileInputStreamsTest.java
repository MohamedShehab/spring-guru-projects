package streams;

import streams.models.Student;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class FileInputStreamsTest {

    public static void main(String[] args) {

        try {
            File file = new File("C:\\Users\\mega\\Desktop\\Files\\file3.txt");
            FileInputStream input = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(input);
            Student student = (Student) objectInputStream.readObject();
            System.out.println(student.toString());
            input.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }

    }
}
