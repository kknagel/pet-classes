package edu.htc.pets;

/**
 * Created by Administrator on 2/29/16.
 */
public class Turtle extends Pet {

    public Turtle(String name){
        super(name);
    }

    //•A turtle is 15 in human years after its first year. And then 25 years
    // old when it’s 2, and then it adds on four every year.
    public double getHumanAge() {
        double humanAge = 0;

        if (getAge() == 1){
            humanAge = 15;
        } else {
            // first two years, gets you 21 human years
            humanAge = 25;

            // every other year after is 4 human years
            humanAge += 4 * (getAge()-2);
        }
        return humanAge;
    }

}
