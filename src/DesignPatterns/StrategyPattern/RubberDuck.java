package DesignPatterns.StrategyPattern;

public class RubberDuck extends Duck{

    public RubberDuck(){
        this.quackBehavior = new QuackLoudly();
        this.flyBehavior = new FlyNoWay();
        this.name = "러버덕";
    }

}
