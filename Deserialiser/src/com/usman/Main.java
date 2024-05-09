package com.usman;
import java.io.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.*;
// Deserialization is away of converting the already stored file containing thr objects that is info that we staored back to the language that we understand

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user = null;

        FileInputStream fileIn = new FileInputStream("C:\\Users\\Nafis\\IdeaProjects\\Serialisation\\UserInfo.ser"); // Note that this is the file location of the file created in the serialisation project where the objects are saved and secure as bytes that the computer understands only
        ObjectInputStream in = new ObjectInputStream(fileIn);
        user = (User) in.readObject();
        in.close();
        fileIn.close();

        System.out.println(user.name);
        System.out.println(user.password);

        user.sayHello();

        // SERIAL VERSION UID
        //This is used to ensure correlation between the serialisation project and the deserialiser project in terms of digits that is, if the digits are the same then it is perfect
        long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
        System.out.println(serialVersionUID);



    }
}
