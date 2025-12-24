package code.chapter08.calculator1;

//除法工厂
public class DivFactory implements IFactory {

    public Operation createOperation() {
        return new Div();
    }

}
