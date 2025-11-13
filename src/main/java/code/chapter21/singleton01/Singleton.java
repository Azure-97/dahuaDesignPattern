package code.chapter21.singleton01;

//单例模式类
class Singleton {

    private static Singleton instance;

    //构造方法private化
    private Singleton() {
    }

    //得到Singleton的实例（唯一途径）
    public static synchronized Singleton getInstance() {

        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}
