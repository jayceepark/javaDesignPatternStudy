package DesignPatterns.StrategyPattern;

public class DuckTest {

    public static void main(String[] args){
        Duck malladDuck = new MalladDuck();
        malladDuck.sayMyName();
        malladDuck.performQuack();
        malladDuck.performFly();

        Duck rubberDuck = new RubberDuck();
        rubberDuck.sayMyName();
        rubberDuck.performQuack();
        rubberDuck.performFly();

        Duck woodDuck = new WoodDuck();
        woodDuck.sayMyName();
        woodDuck.performQuack();
        woodDuck.performFly();

    }

}
