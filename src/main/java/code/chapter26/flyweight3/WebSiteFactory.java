package code.chapter26.flyweight3;

import java.util.Hashtable;

//网站工厂
class WebSiteFactory {
    private Hashtable<String, WebSite> flyweights = new Hashtable<String, WebSite>();

    //获得网站分类
    public WebSite getWebSiteCategory(String key) {
        if (!flyweights.contains(key))
            flyweights.put(key, new ConcreteWebSite(key));
        return (WebSite) flyweights.get(key);
    }

    //获得网站分类总数
    public int getWebSiteCount() {
        return flyweights.size();
    }
}

