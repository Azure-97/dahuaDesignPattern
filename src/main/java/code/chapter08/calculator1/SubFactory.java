package code.chapter08.calculator1;

//减法工厂
public class SubFactory implements IFactory {

    public Operation createOperation() {
        return new Sub();
    }

}
