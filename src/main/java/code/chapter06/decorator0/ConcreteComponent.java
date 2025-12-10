package code.chapter06.decorator0;

//ConcreteComponent类
class ConcreteComponent extends Component {
    @Override
    public void Operation() {
        System.out.println("具体对象的实际操作");
    }

}