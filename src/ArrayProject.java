import java.util.Scanner;
import java.util.Random;

public class ArrayProject {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();


        int[] rightNumbers = new int[3];
        rightNumbers[0] = 1;
        rightNumbers[1] = 2;
        rightNumbers[2] = 3;



        int[] inputNumbers = new int[3];
        int countRightAnswers = 0;
        //boolean Alltrue = false;
        int countAttempts = 5;




        while (countAttempts > 0) {
            for (int i = 0; i < 3; i ++) {
                inputNumbers[i] = sc.nextInt();
                if (inputNumbers[i] == rightNumbers[i]) {
                    countRightAnswers ++;
                }
            }
            countAttempts --;
            if (countRightAnswers == 3) {
                System.out.println("all boxes are found");
                break;
                //Alltrue = true;
            }
            if (countRightAnswers == 1) {
                System.out.println("1 out of 3 is correct. " + countAttempts + " attempts left");
            }
            if (countRightAnswers == 2) {
                System.out.println("2 out of 3 are correct. " + countAttempts + " attempts left");
            }
            if (countRightAnswers == 0) {
                System.out.println("0 out of 3 are correct. " + countAttempts + " attempts left");
            }

            countRightAnswers = 0;

            if (countAttempts == 0) {
                countAttempts = 5;
                System.out.println("5 attempts are over, boxes replaced");
                for (int i = 0; i < 3; i++) {
                    rightNumbers[i] = random.nextInt(3) + 1;

                }
            }

        }









    }
}