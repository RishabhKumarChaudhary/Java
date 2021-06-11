import java.util.Scanner;
interface Score
{
	public void setScore(int a,int b);
	public void displayScore();
}

abstract class Sum1 implements Score
{
   public int x,y;
   public boolean gameLevel;
}

