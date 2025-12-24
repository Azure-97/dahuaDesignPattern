package code.chapter13.builder0;

//指挥者
class Director {
    public void construct(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
    }
}
