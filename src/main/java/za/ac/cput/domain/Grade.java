package za.ac.cput.domain;

import java.util.Objects;

public class Grade {
    private int gradeValue;
    private String gradeDescription;

    private Grade(GradeBuilder builder) {
        this.gradeValue = builder.gradeValue;
        this.gradeDescription = builder.gradeDescription;
    }

    // Getters and setters
    public int getGradeValue() {
        return gradeValue;
    }

    public void setGradeValue(int gradeValue) {
        this.gradeValue = gradeValue;
    }

    public String getGradeDescription() {
        return gradeDescription;
    }

    public void setGradeDescription(String gradeDescription) {
        this.gradeDescription = gradeDescription;
    }

    // Override equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Grade grade = (Grade) obj;
        return gradeValue == grade.gradeValue &&
                Objects.equals(gradeDescription, grade.gradeDescription);
    }

    // Override hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(gradeValue, gradeDescription);
    }

    public static class GradeBuilder {
        private int gradeValue;
        private String gradeDescription;

        public GradeBuilder setGradeValue(int gradeValue) {
            this.gradeValue = gradeValue;
            return this;
        }

        public GradeBuilder setGradeDescription(String gradeDescription) {
            this.gradeDescription = gradeDescription;
            return this;
        }

        public Grade build() {
            return new Grade(this);
        }
    }
}

