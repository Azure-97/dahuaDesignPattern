package code.chapter15.abstractfactory2;

/**
 * @Description: Access工厂
 */
public class AccessFactory implements IFactory {

    public IUser createUser(){
        return new AccessUser();
    }

}

