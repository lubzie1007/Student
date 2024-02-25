package za.ac.cput.domain;

import java.util.Objects;

public class Course {
    private String courseCode;
    private String courseName;
    private Teacher teacher;

    private Course(CourseBuilder builder) {
        this.courseCode = builder.courseCode;
        this.courseName = builder.courseName;
        this.teacher = builder.teacher;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Course course = (Course) obj;
        return Objects.equals(courseCode, course.courseCode) &&
                Objects.equals(courseName, course.courseName) &&
                Objects.equals(teacher, course.teacher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseCode, courseName, teacher);
    }

    public static class CourseBuilder {
        private String courseCode;
        private String courseName;
        private Teacher teacher;

        public CourseBuilder setCourseCode(String courseCode) {
            this.courseCode = courseCode;
            return this;
        }

        public CourseBuilder setCourseName(String courseName) {
            this.courseName = courseName;
            return this;
        }

        public CourseBuilder setTeacher(Teacher teacher) {
            this.teacher = teacher;
            return this;
        }

        public Course build() {
            return new Course(this);
        }
    }
}

