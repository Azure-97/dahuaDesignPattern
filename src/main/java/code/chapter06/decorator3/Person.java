package code.chapter06.decorator3;

/**
 * @Description: 具体人类
 * @Author: Azure
 * @Date: 2025/11/12 15:13
 * @Param:
 * @Return:
 */
public class Person implements ICharacter {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void show() {
        System.out.println("装扮的" + name);
    }
}



