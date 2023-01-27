package DesignPatterns.StrategyPattern;

public class MalladDuck extends Duck{

    public MalladDuck(){
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new QuackLoudly();
        this.name = "천둥오리";
    }
}
