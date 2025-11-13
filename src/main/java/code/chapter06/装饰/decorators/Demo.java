package code.chapter06.装饰.decorators;


/**
 * @description: TODO
 * @author: Azure
 * @date: 2024/8/29 周四 10:41
 * @Version 1.0
 **/
public class Demo {
    public static void main(String[] args) {
        run();
    }
    public static void run() {

        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";

        DataSource plain = new FileDataSource("OutputDemo.txt");
        //  压缩装饰器  + 加密装饰器
        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(plain));
        //先压缩再加密
        encoded.writeData(salaryRecords);



        System.out.println("- Input 原文 ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded 加密 --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded 解密 --------------");
        // 先解密再解压
        System.out.println(encoded.readData());
    }
}
