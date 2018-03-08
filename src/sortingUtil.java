import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class sortingUtil {

    private String answer;
    private int numberInput[];

    public void run(){
        printHeader();
        answer = stopNumberInput();
        numberInput = getNumberInput();
    }

    private void printHeader(){
        System.out.println("SORT YOUR NUMBERS!!!");
        System.out.println("Enter your numbers. If finished press Q.");
    }

    private String stopNumberInput(){
        boolean repeat = true;
        List<String> possibleAnswer = getPossibleAnswer();
        do{
            Scanner input = new Scanner(System.in);
            answer = input.nextLine();
            repeat = !possibleAnswer.contains(answer);
        }while (repeat);
        return answer;
    }

    private List<String> getPossibleAnswer(){
        return Arrays.asList("Q", "q");
    }

    private int[] getNumberInput(){
        Scanner input2 = new Scanner(System.in);
        int userIn = 0;
        while (input2.hasNextInt()){
            numberInput[userIn] = input2.nextInt();
            userIn++;
            if (answer.equals(getPossibleAnswer())){
                break;
            }
        }
        return numberInput;
    }
}
