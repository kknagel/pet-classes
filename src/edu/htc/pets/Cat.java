package edu.htc.pets;

/**
 * Created by marymosman on 2/1/16.
 *
 * Simple Cat class.
 *
 * Cats have a name and age.
 * There is also a function to calculate their human age.
 */
public class Cat {

    private String name;
    private int age;

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

    public double getHumanAge() {
        double humanAge = 0;

        if (age == 1) {
            humanAge = 15;
        } else if (age == 2) {
            humanAge = 25;
        } else {
            // first two years, gets you 25 human years
            humanAge = 25;

            // every other year after is 4 human years
            humanAge += 4 * (age-2);
        }

        return humanAge;
    }

    public String toString() {
        return "Cat: " + name;
    }

}
