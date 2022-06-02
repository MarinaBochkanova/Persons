package com.company;

public class PersonBuilder {
    String name;
    String surname;
    int age;
    String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() throws IllegalStateException, IllegalArgumentException {
        if (name == null || surname == null) {
            throw new IllegalStateException("Обязательно нужно указать Имя и Фамилию."
                    + " Одно из этих значений не указано.");
        }
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Указано некорректное значение возраста.");
        }
        return new Person(name, surname, age, address);

    }
}
