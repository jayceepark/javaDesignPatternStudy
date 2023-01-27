package DesignPatterns.StrategyPattern;

public class FlyNoWay implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("난 날 수가 없어......");
    }
}
