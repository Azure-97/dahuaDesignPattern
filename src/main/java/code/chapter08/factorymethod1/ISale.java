package code.chapter08.factorymethod1;

/**
 * 销售模式接口
 */
public interface ISale {
    /**
     * @Description: 抽象方法，计算收费
     * @Author: Azure
     * @Date: 2025/12/22 16:38
     * @Param: [price, num]
     * @Return: double
     */
    public double acceptCash(double price, int num);

}



