package code.chapter26.flyweight1;

//网站
class WebSite {
    private String name = "";

    public WebSite(String name) {
        this.name = name;
    }

    public void use() {
        System.out.println("网站分类：" + name);
    }
}

