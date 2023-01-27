package DesignPatterns.StrategyPattern;

public class WoodDuck extends Duck{

    public WoodDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new MuteQuack();
        this.name = "목각오리";
    }

}
