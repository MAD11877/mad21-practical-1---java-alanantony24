import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
    Scanner in = new Scanner(System.in);
    // System.out.print("Enter the number of inputs to be taken: ");
    int numberOfInputs = in.nextInt();
    int[] numberArray = new int[numberOfInputs];
    for(int i = 0; i < numberArray.length; i++){
        // System.out.print("Enter the value(s):");
        int value = in.nextInt();
        numberArray[i] = value;
    }
    int maxVal = 0;
    int maxCount = 0;
    for(int i = 0; i < numberArray.length; i++){
        int count = 0;
        for(int j = 0; j < numberArray.length; j++){
            if(numberArray[i] == numberArray[j]){
                ++count;
            }
            if(count > maxCount){
                maxCount = count;
                maxVal = numberArray[i];
            }
        }
    }
    System.out.println(maxVal);
  }
}
