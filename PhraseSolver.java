/*
 * Activity 2.2.2
 *
 *  The PhraseSolver class the PhraseSolverGame
 */
import java.util.ArrayList;
import java.util.Scanner;
  
public class PhraseSolver
{
  /* your code here - attributes */
  Player player1;
  Player player2;
  Board board;
  boolean solved;
  ArrayList<String> guessedLetters = new ArrayList<>();
  /* your code here - constructor(s) */ 
  public PhraseSolver(){
     player1 = new Player();
     player2 = new Player();
     board = new Board();
     solved = false;
  }

  public void play()
  {
    boolean solved = false;
    int currentPlayer = 1;

    Scanner input = new Scanner(System.in);
    
    boolean correct = true;
    while (!solved) 
    {
      if ((board.getSolvedPhrase().indexOf("_")) == -1){
        if (currentPlayer == 1) {
            System.out.println(player2.getName() + " won!");
            solved = true;
          }
        else{
            System.out.println(player1.getName() + " won!");
            solved = true;
          }
      }
      /* your code here - game logic */
      if (currentPlayer == 1){
        System.out.println(player1.getName() + "'s turn.");
        System.out.println(player1.getName() + " is at " + player1.getPoints() + " points.");
        currentPlayer = 2;
      }
      else{
        System.out.println(player2.getName() + "'s turn.");
        System.out.println(player2.getName() + " is at " + player2.getPoints() + " points.");
        currentPlayer = 1;
      }
      System.out.println(board.getSolvedPhrase());
      System.out.println("Current letter value: " + board.getCurrentLetterValue());
      System.out.println("Guessed Letters: " + guessedLetters);
      Scanner sc = new Scanner(System.in);
      String guessString = sc.nextLine();
      if (guessString.length() > 1){
       if (board.isSolved(guessString)){
          if (currentPlayer == 1) {
            System.out.println(player2.getName() + " won!");
          }
          else{
            System.out.println(player1.getName() + " won!");
          }
          solved = true;
       } 
       else{
        System.out.println("Wrong guess");
       }
      }
      else{  
        String guess = guessString.substring(0,1);
        if (board.guessLetter(guess)){
          if (currentPlayer == 1) {
            player1.addPoints(board.getCurrentLetterValue());
          }
          else{
            player1.addPoints(board.getCurrentLetterValue());
          }
        }
        else{
          guessedLetters.add(guess);
        }
      }
      /* your code here - determine how game ends */
    } 
   
  }
  
}