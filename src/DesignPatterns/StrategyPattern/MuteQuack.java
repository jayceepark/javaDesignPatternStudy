package DesignPatterns.StrategyPattern;

public class MuteQuack implements QuackBehavior{


    @Override
    public void quack() {
        System.out.println("...(아무런 소리도 나지 않는다.)");
    }
}
