//Team class which has the team object

package application;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Team {

	private String teamName;
	private int score;
	
	
	public Team() {
		this.teamName = "";
		this.score = 0;
	}
	
	public Team(String teamName, int score) {
		this.teamName = teamName;
		this.score = score;
	
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}

   /* 
    java.io.File file = new java.io.File("TeamList.txt");{
    
    	// writes data to text file
    	try {
		java.io.PrintWriter output = new java.io.PrintWriter(file);
		output.print("Manchester ");
		output.print(4);
	} catch (FileNotFoundException e11) {
		// TODO Auto-generated catch block
		e11.printStackTrace();
	}
    
    	// reads from text file
    Scanner input = null;{
	try {
		input = new Scanner(file);
	} catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
    while (input.hasNext()) {
    	String name = input.next();
    	System.out.println(name);
    }
    input.close();
    

}

}

}
	*/
	