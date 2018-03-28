package quizapp;

import java.util.Scanner;

public class QuizApp {

    public static void main(String[] args) {


        String q1= "What Color are Apples?\n"
                + "(a)red/green\n (b)Orange\n (c)Cyan";

        String q2= "What Color are Bannas?\n"
                + "(a)red/green\n (b)Yellow\n (c)Blue";

        Question[] questions ={
                new Question(q1,"a"),
                new Question(q2,"b")};
        takeTest(questions);

        System.out.println("********************************\n");

        int choices;
        int song;
        int song2;
        int song3;
        int song4;
        int song5;
        int correctAnswers = 0;
        int wronganswers = 0;
        //scanner for input options
        Scanner scan = new Scanner(System.in);
        System.out.println("Who sing this the song 'Locked Away':");
        //choose singer from these 4 options
        System.out.println("Choose 1 for R. City & Adam Levine's. \nChoose 2 for Justin Bieber.  \nChoose 3 for Selena Gomez. \nChoose 4 for Katy Perry.");
        song = scan.nextInt();
        if (song != 1) {
            //if select wrong options
            System.out.println("Your answer is incorrect  R. City & Adam Levine's is the right answer .");
            wronganswers++;
        } else {
            System.out.println("Congrate you answer is correct");
            song++;
            correctAnswers++;
        }

        System.out.println("********************************\n");
    }
    public static void takeTest(Question [] questions){
        int score =0;
        Scanner keyboardInput = new Scanner(System.in);
        for(int i=0; i< questions.length;i++){
            System.out.println(questions[i].prompt);
            String answer = keyboardInput.next();
            if(answer.equals(questions[i].answer)){
                score++;
            }
        }
        System.out.println("You got " + score + "/ " +questions.length);
    }
}
