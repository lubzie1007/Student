package za.ac.cput.domain;
import java.util.Objects;
public class Teacher {
    private String teacherID;
    private String name;

    private Teacher(TeacherBuilder builder) {
        this.teacherID = builder.teacherID;
        this.name = builder.name;
    }

    public String getTeacherID() {
        return teacherID;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Teacher teacher = (Teacher) obj;
        return Objects.equals(teacherID, teacher.teacherID) &&
                Objects.equals(name, teacher.name);
    }

    // Override hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(teacherID, name);
    }

    public static class TeacherBuilder {
        private String teacherID;
        private String name;

        public TeacherBuilder() {
            // Set default values if needed
            this.teacherID = "";
            this.name = "";
        }

        public TeacherBuilder setTeacherID(String teacherID) {
            this.teacherID = teacherID;
            return this;
        }

        public TeacherBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public Teacher build() {
            return new Teacher(this);
        }
    }
}
