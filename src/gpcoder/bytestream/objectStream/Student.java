package gpcoder.bytestream.objectStream;

import java.io.Serializable;

public class Student implements Serializable {

    // khi mot class implements interface Serializable thi
    // cac doi tuong cua no co the chuyen doi thanh Steam
    private static final long serID = 1L;

    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
