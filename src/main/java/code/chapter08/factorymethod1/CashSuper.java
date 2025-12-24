package code.chapter08.factorymethod1;

public class CashSuper implements ISale {


    protected ISale component;

    //装饰对象
    public void decorate(ISale component) {
        this.component = component;
    }

    /**
     * @Description: 抽象方法，子类实现 计算金额
     * @Author: Azure
     * @Date: 2025/12/22 16:39
     * @Param: [price, num]
     * @Return: double
     */
    public double acceptCash(double price, int num) {
        if (this.component != null) {
            //若装饰对象存在，则执行装饰的算法运算
            return this.component.acceptCash(price, num);
        } else
            return 0d;
    }

}
