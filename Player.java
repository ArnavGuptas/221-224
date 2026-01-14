/*
 * Activity 2.2.2
 * 
 * A Player class the PhraseSolverGame
 */

import java.util.Scanner;

public class Player
{
  /* your code here - attributes */
  private String name;
  private int points;

  /* your code here - constructor(s) */
  public Player(){ 
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Name: ");
    String name1 = sc.nextLine();
    name = name1;
    points = 0;
    System.out.println("Welcome " + name);
  }

  /* your code here - accessor(s) */ 
  public String getName(){
    return name;
  }
  
  public int getPoints(){
    return points;
  }


  /* your code here - mutator(s) */ 
  public void setPoints(int n){
    points = n;
  }

  public void setName(String n){
    name = n;
  }

  public void addPoints(int n){
    points += n;
  }
}