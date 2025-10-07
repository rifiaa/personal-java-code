package com.example.helloworld;

import java.util.Objects;

public class dog {
        private int age;
        private String name;
        private double tall;

        public dog(int age, String name, double tall) {
            this.age = age;
            this.name = name;
            this.tall = tall;
        }

        public dog() {
            this.age = 0;
            this.name = "";
            this.tall = 0.0;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        public double getTall() {
            return tall;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setTall(double tall) {
            this.tall = tall;
        }
        @Override
        public String toString() {
            return "dog [age=" + age + ", name=" + name + ", tall=" + tall + "]";
        }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        dog dog = (dog) o;
        return age == dog.age && Double.compare(tall, dog.tall) == 0 && Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, tall);
    }
}

