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

        //for (int i = 0; i < 3; i++) {
        //    rightNumbers[i] = random.nextInt(7) + 1;
        //}


        int[] inputNumbers = new int[3];
        int countRightAnswers = 0;

        int numberAttempts = 5;

        System.out.println("Enter three numbers (1, 2, 3, 4, 5, 6, 7)");

        while (numberAttempts > 0) {
            for (int i = 0; i < 3; i++) {
                inputNumbers[i] = sc.nextInt();
                if (inputNumbers[i] == rightNumbers[i]) {
                    countRightAnswers++;
                }
            }
            numberAttempts--;
            if (countRightAnswers == 3) {
                System.out.println("all boxes are found \uD83E\uDDF0 \uD83D\uDDC3\uFE0F");
                break;

            }
            if (countRightAnswers == 1) {
                System.out.println("1 out of 3 is correct. " + numberAttempts + " attempts left");
            }
            if (countRightAnswers == 2) {
                System.out.println("2 out of 3 are correct. " + numberAttempts + " attempts left");
            }
            if (countRightAnswers == 0) {
                System.out.println("0 out of 3 are correct. " + numberAttempts + " attempts left");
            }

            countRightAnswers = 0;

            if (numberAttempts == 0) {
                numberAttempts = 5;
                System.out.println("5 attempts are over, boxes replaced");
                for (int i = 0; i < 3; i++) {
                    rightNumbers[i] = random.nextInt(3) + 1;

                }
                while (rightNumbers[0] == rightNumbers[1] || rightNumbers[1] == rightNumbers[2] || rightNumbers[0] == rightNumbers[2]) {
                    for (int i = 0; i < 3; i++) {
                        rightNumbers[i] = random.nextInt(7) + 1;


                    }

                }

            }


        }
    }
}