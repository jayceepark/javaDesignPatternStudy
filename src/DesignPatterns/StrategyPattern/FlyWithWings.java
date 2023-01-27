package DesignPatterns.StrategyPattern;

public class FlyWithWings implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("날개를 펼쳐 하늘을 날고 있습니다.");
    }
}
