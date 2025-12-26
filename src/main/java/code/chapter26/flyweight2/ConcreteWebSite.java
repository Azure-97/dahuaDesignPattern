package code.chapter26.flyweight2;

/**
 * 具体网站类
 */
class ConcreteWebSite extends WebSite {
    private String name = "";

    public ConcreteWebSite(String name) {
        this.name = name;
    }

    public void use() {
        System.out.println("网站分类：" + name);
    }
}