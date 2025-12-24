package code.chapter10.templatemethod3;

//学生乙答的试卷
class TestPaperB extends TestPaper {
    //试题1
    protected String answer1() {
        return "d";
    }

    //试题2
    protected String answer2() {
        return "b";
    }

    //试题3
    protected String answer3() {
        return "a";
    }
}
