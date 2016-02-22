package edu.htc.pets;

/**
 * Created by marymosman on 2/1/16.
 */
public class Dog {

    private String name;
    private int age;

    public Dog(String name){
        this.name = name;
    }

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

        if (age <= 2){
            humanAge = age * 10.5;
        } else {
            // first two years, gets you 21 human years
            humanAge = 21;

            // every other year after is 4 human years
            humanAge += 4 * (age-2);
        }

        return humanAge;
    }
}
