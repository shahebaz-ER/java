public class Gambler
 {
    public static void main(String[] args)
     {
	int $stake=Integer.parseInt(args[0]);
	int $goal=Integer.parseInt(args[1]);
	int numOfTimes=Integer.parseInt(args[2]);
	int wins=0;
	int bets=0;
	int loss=0;
	int i;
	System.out.println("start Stake goal and numoftime respectevly "+$stake+" "+$goal+" "+numOfTimes);
	for(i=0;i<numOfTimes;i++)
	 {
	   int cash=$stake;
           while(cash>0 && cash<$goal)
	    {
	      bets++;
              if(Math.random()<=0.5)
		{cash++;}
	      else
		{cash--;}
              System.out.println("while executing..");
	    }
           if(cash==0)
		{loss++;System.out.println("cash 0 now");}System.out.println("for loop excution completed wins > "+wins +" bets > "+bets+" cash > "+cash);
	   if(cash==$goal)
		{wins++;System.out.println("cash == goal");}
          }
	System.out.println((wins/numOfTimes)*100+"% wins");
	System.out.println("average bets: "+bets/numOfTimes);
     }
 }
