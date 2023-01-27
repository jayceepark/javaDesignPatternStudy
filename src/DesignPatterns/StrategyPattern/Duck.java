package DesignPatterns.StrategyPattern;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    String name;

    public Duck(){
    }

    //오리가 난다.
    public void performFly(){//나는 행위를 실행하도록 위임한다.
        flyBehavior.fly();
    }

    //오리가 소리를 낸다.
    public void performQuack(){//소리내는 행위를 실행하도록 위임한다.
        quackBehavior.quack();
    }

    //오리가 자기소개를 한다.
    public void sayMyName(){
        System.out.println("============================");
        System.out.println("내 이름은 "+ this.name +"입니다.");
    }
}
