import java.util.Random;
class RollDice{

public RollDice(){
}

public int Roll(){
Random rand = new Random();
return rand.nextInt(6);
}

public int Implement(int a,int b){
return a+b;
}
}

public class DiceGame{
public static void  main(String[] args){

RollDice rd = new RollDice();
  int total;

System.out.println("Rolling the dice...");

int[] die = {rd.Roll()+1,rd.Roll()+1};

System.out.println("Die 1: "+die[0]);
System.out.println("Die 2: "+die[1]);
total = rd.Implement(die[0],die[1]);

System.out.println("Total value: " + total);