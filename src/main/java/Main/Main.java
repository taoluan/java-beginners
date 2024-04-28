package Main;

import Encapsulation.Person;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.setId(1001);
        p.setName("Quynh");
        p.setAge(24);
        p.setAddress("Ha Noi");
        System.out.println("Id: " + p.getId());
        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
        System.out.println("Address: " + p.getAddress());
    }
}

