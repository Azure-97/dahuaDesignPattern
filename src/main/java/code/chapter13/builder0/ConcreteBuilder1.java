package code.chapter13.builder0;

//具体建造者1
class ConcreteBuilder1 extends Builder {
    private Product product = new Product();

    public void buildPartA() {
        product.add("部件A");
    }

    public void buildPartB() {
        product.add("部件B");
    }

    public Product getResult() {
        return product;
    }
}
