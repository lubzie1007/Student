package za.ac.cput.domain;

import java.util.Objects;

public class University {
    private String name;
    private String location;

    private University(UniversityBuilder builder) {
        this.name = builder.name;
        this.location = builder.location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        University university = (University) obj;
        return Objects.equals(name, university.name) &&
                Objects.equals(location, university.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location);
    }

    public static class UniversityBuilder {
        private String name;
        private String location;

        public UniversityBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UniversityBuilder setLocation(String location) {
            this.location = location;
            return this;
        }

        public University build() {
            return new University(this);
        }
    }
}

