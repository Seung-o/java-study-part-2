package chapter24;

import java.io.*;

class Person implements Externalizable {

    private static final long serialVersionUID = 1L;
    String job;
    String name;

    public Person() {
    }

    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String toString() {
        return name + "," + job;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(job);
        out.writeUTF(name);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        job = in.readUTF();
        name = in.readUTF();
    }
}

public class SerializableTest {
    public static void main(String[] args) {
        Person personKim = new Person("Kim", "Manager");
        Person personLee = new Person("Lee", "Leader");

        try (FileOutputStream fos = new FileOutputStream("serial.out");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(personKim);
            oos.writeObject(personLee);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fis = new FileInputStream("serial.out");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Person person1 = (Person) ois.readObject();
            Person person2 = (Person) ois.readObject();

            System.out.println(person1);
            System.out.println(person2);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
