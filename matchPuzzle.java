import java.utils.Scanner;

class matchPuzzle{
  public static void print(String words){
    System.out.println(words);
    return;
  }

  public static int[] makeNum(int len, int max){
    int[] numbers = new int[len];

    for (int i = 0; i < max; ++i){
      int[i] = i+1;
    }

    
  }


  public static void main(String[] args){
    print("Welcome to Master Match!");
    print("");
    print("You will have 8 guesses to fint the 4 digit number.");
    print("The digits are between 1 and 8 and no number is repeated!")
    print("------------------------------------------------------------------")
    print();

  }
}
