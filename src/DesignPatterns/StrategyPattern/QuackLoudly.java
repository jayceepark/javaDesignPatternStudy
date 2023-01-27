package DesignPatterns.StrategyPattern;

public class QuackLoudly implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("꽥!!!!!!");
    }
}
