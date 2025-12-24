package code.chapter13.myDemo;

/**
 * @Description: 电脑通常由很多复杂的部件组成（CPU、内存、显卡、屏幕等）。
 * 使用建造者模式，我们可以一步一步地配置这些部件，
 * 最后生成一个完整的电脑对象，
 * 而不需要去关心几十个参数的构造函数。
 * @Author: Azure
 * @Date: 2025/12/24 15:36
 * @Param:
 * @Return:
 */
public class BuilderDemo {
    public static void main(String[] args) {
        System.out.println("--- 场景 1: 购买一台基础办公电脑 ---");
        Computer officePC = new Computer.Builder("Intel i5", "16GB")
                .build();
        System.out.println(officePC);
        System.out.println("\n-----------------------------\n");

        System.out.println("--- 场景 2: 购买一台顶级游戏电脑 ---");
        Computer gamingPC = new Computer.Builder("Intel i9", "64GB")
                .graphicsCard("RTX 4090")
                .screen("4K OLED 144Hz")
                .keyboard("Mechanical RGB")
                .hasBluetooth(true)
                .build();
        System.out.println(gamingPC);
    }
}
