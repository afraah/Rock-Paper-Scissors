import java.util.*;

public class RPSgame {
	static List<String> list=new ArrayList<String>();

   public static int comp=0;
   public static int player=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sin= new Scanner(System.in);
		list.add("r");
		list.add("p");
		list.add("s");
		
		  System.out.println("Welcome to R-P-S!");
       System.out.println("Select number of rounds:");
       int rounds=sin.nextInt();
       
       for(int r=0; r<rounds; r++){
    	   System.out.println("Rock, Paper, or Scissors?\n(Press r/p/s)");
    	   String p_choice=sin.next();
    	   
    	   Random rand=new Random();
    	  int randInd=rand.nextInt(list.size());
    	   String c_choice=list.get(randInd);
    	   
    	   System.out.println("Computer: "+c_choice);
    	   
    	   evaluator(p_choice,c_choice);
       }
       System.out.println("FINAL SCORES: \nPlayer:"+player+"\nComputer: "+comp);
       if(player==comp) System.out.println("It's a TIE!");
       else if(player<comp) System.out.println("Oh no, you lost! :(");   
       else System.out.println("Congratulations! You won! :D");     
	}
	
	public static void evaluator(String p_choice, String c_choice) {
		if(p_choice.equals(c_choice)) {
			player++;
			comp++;
			
		}
		else if(p_choice.equals("r") && c_choice.equals("s")) {
			player++;
			System.out.println("You gained a point!\n");
		}
		else if(p_choice.equals("p") && c_choice.equals("r")) {
			player++;
			System.out.println("You gained a point!\n");
		}
		else if(p_choice.equals("s") && c_choice.equals("p")) {
			player++;
			System.out.println("You gained a point!");
		}
		else {
			comp++;
			System.out.println("Computer gained a point!\n");
		}
		
		System.out.println("Current Scores:\nPlayer: "+player+"\nComputer: "+comp);
			
	}

}
