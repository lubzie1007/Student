package za.ac.cput.domain;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    private Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && Objects.equals(name, person.name);
    }

    // Override hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }


    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Override toString method using StringBuilder
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Person{")
                .append("name='").append(name).append('\'')
                .append(", age=").append(age)
                .append('}');
        return sb.toString();
    }

    public static class Builder {
        private String name;
        private int age;

        public Builder() {
            // Set default values if needed
            this.name = "";
            this.age = 0;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
