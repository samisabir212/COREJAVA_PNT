package Getters_Return;


class dog {

    String name;
    int age;

    void bark() {
        System.out.println("woof woof");

    }

    int calculateDogYearsTillDeath() {

        int yearsLeftTillDeath = 16 - age;

        System.out.println(yearsLeftTillDeath + " years until the death of my dog");

        return yearsLeftTillDeath;
    }

    int getAge() {

        return age;

    }

}


public class DogYears {

    public static void main(String[] args) {

        dog doggy = new dog();
        doggy.age = 5;
        doggy.name = "penny";

        doggy.bark();

        doggy.calculateDogYearsTillDeath();

        int passReturnstatmentHere = doggy.calculateDogYearsTillDeath();

        System.out.println("my dog will die in " + passReturnstatmentHere + " years");

        int age = doggy.getAge();
        System.out.println("my dogs age is "+  age);
    }



}


