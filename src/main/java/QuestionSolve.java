public class QuestionSolve {
    public static void main(String[] args) {

        int totalQuestions = 15;
        int totalMarks = 100;

        int x = (totalMarks - 10 * totalQuestions) / (-5);
        int y = totalQuestions - x;

        System.out.println("5 marks question is " + x);
        System.out.println("10 marks question is " + y);
    }
}

