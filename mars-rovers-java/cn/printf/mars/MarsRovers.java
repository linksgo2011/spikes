

import java.util.Scanner;

public class MarsRovers {

    public static void main(String []args) {
        startApp();
    }

    private static void startApp() {
        printTip("Please input the size of ordinates, like 4,4");

        boolean readyForInputOrdinates = true;
        while (readyForInputOrdinates) {
            Scanner input = new Scanner(System.in);
            String result = input.next();

            String[] ordinatesSize = result.split(",");
            if(ordinatesSize.length != 2){
                printTip("Error input");
            }
            Grid grid = new
            Rover[][]



            System.out.print(ordinatesSize);

        }
    }



    private static void printTip(String content){
        System.out.print(content);
    }
}
