package org.example.homework.S18;
// Create a Student class with name, age, studentId, and email fields. Implement the equals() method to check all fields except the studentId. Implement the hashCode() method to use all fields except the studentId to calculate the hash code.
public class Student {
    private String name;
    private int age;
    private long studentId;
    private String email;

    public Student(String name, int age, long studentId, String email) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.email = email;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;
        Student student = (Student) obj;
        return age == student.age && name.equals(student.name) && email.equals(student.email);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        result = 31 * result + email.hashCode();
        return result;
    }
}
