package code.chapter22.bridge1;

public class Test {

    public static void main(String[] args) {

        System.out.println("**********************************************");       
        System.out.println("《大话设计模式》代码样例");
        System.out.println();

        HandsetGame game=new HandsetBrandNGame();
        game.run();

        HandsetGame game2 = new HandsetBrandMGame();
        game2.run();

        System.out.println();
        System.out.println("**********************************************");
    }
}














