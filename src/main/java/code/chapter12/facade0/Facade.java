package code.chapter12.facade0;

//外观类
//它需要了解所有的子系统的方法或属性，进行组合，以备外界调用
class Facade {
    SubSystemOne one;
    SubSystemTwo two;
    SubSystemThree three;
    SubSystemFour four;

    public Facade() {
        one = new SubSystemOne();
        two = new SubSystemTwo();
        three = new SubSystemThree();
        four = new SubSystemFour();
    }

    public void methodA() {
        one.methodOne();
        two.methodTwo();
        three.methodThree();
        four.methodFour();
    }

    public void methodB() {
        two.methodTwo();
        three.methodThree();
    }

}