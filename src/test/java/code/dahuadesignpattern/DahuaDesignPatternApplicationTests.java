package code.dahuadesignpattern;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DahuaDesignPatternApplicationTests {

    @Test
    void contextLoads() {
        class Animal{

        }
        class Dog extends  Animal{

        }
        Animal animal = new Dog();
// 向下转型前需用 instanceof 判断，否则可能抛 ClassCastException
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal; // 强制转换
        }
    }




}
