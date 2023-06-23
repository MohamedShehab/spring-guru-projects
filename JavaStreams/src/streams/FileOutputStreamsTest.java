package streams;

import streams.models.Student;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class FileOutputStreamsTest {

    public static void main(String[] args) {

        try {
            File file = new File("C:\\Users\\mega\\Desktop\\Files\\file3.txt");
            FileOutputStream outputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            Student student = new Student("Ahmed","Cairo",25);
            objectOutputStream.writeObject(student);
            outputStream.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }

    }
}
