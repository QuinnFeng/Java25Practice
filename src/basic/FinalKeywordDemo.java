package basic;

public class FinalKeywordDemo {

    // Final variable
    final int MAX_SCORE = 100;

    // Normal variable
    int score;

    // Constructor
    FinalKeywordDemo(int score) {
        this.score = score;
    }

    // Final method
    final void showScore() {
        System.out.println("Score: " + score);
    }

    public static void main(String[] args) {

        FinalKeywordDemo student = new FinalKeywordDemo(85);

        student.showScore();

        System.out.println("Maximum score: " + student.MAX_SCORE);

        // Cannot change a final variable
        // student.MAX_SCORE = 200;  // ERROR
    }
}


// A final class cannot be inherited
final class FinalClassExample {

    void display() {
        System.out.println("This is a final class.");
    }
}