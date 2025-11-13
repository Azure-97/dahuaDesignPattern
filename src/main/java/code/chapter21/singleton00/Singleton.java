package code.chapter21.singleton00;

//单例模式类
class Singleton {

    private static Singleton instance;

    //构造方法private化
    private Singleton() {
    }

    //得到Singleton的实例（唯一途径）
    public static Singleton getInstance() {

        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}