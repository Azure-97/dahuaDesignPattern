package code.chapter06.decorator3;

/**
 * @Description: 服饰类
 */
public class Finery implements ICharacter {

    protected ICharacter component;

    /**
     * 装饰
     * @param component
     */
    public void decorate(ICharacter component) {
        this.component=component;
    }

    @Override
    public void show() {
        if (this.component != null){
            this.component.show();
        }
    }

}



