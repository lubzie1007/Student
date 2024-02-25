package za.ac.cput.domain;

import java.util.Objects;

public class Student {
    private String studentID;
    private String major;

    private Student(StudentBuilder builder) {
        this.studentID = builder.studentID;
        this.major = builder.major;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getMajor() {
        return major;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return Objects.equals(studentID, student.studentID) &&
                Objects.equals(major, student.major);
    }

    // Override hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(studentID, major);
    }

    public static class StudentBuilder {
        private String studentID;
        private String major;

        public StudentBuilder() {
            // Set default values if needed
            this.studentID = "";
            this.major = "";
        }

        public StudentBuilder setStudentID(String studentID) {
            this.studentID = studentID;
            return this;
        }

        public StudentBuilder setMajor(String major) {
            this.major = major;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
}
