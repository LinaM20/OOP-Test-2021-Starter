package ie.tudublin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import processing.core.PApplet;

public class ScoreDisplay extends PApplet
{
	String score = "DEFGABcd";
	//String score = "D2E2F2G2A2B2c2d2";
	//String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";

	//ArrayList
	ArrayList<Note> notes = new ArrayList<Note>();
	
	char strings;
	

	
	public void settings()
	{
		size(1000, 500);

		// How to convert a character to a number
		char c = '7'; // c holds the character 7 (55)
		int i = c - '0'; // i holds the number 7 (55 - 48) 
		//println(i);
	}

	//loadScore method to populate ArrayList
	public void loadScore()
	{
		for (int i = 0; i < score.length(); i++)
		{
			char aNote = score.charAt(i);
			int duration = 1;

			Note note = new Note(aNote, duration);
			notes.add(note);

		

		
		}
		String str[] = score.split("");

		List<String> notes = new ArrayList<String>(Arrays.asList(str));
		
		for (String s : notes)
		{
				println(s);
		}
		
		
	}

	//printing the arraylist
	public void printScore()
	{
		String noteType;
		
		for (Note n:notes)
		{
			if (n.getDuration() == 1)
			{
				noteType = "Quaver";
			}	
			else
			{
				noteType = "Crotchet";
			}
			println(n.getNote() + " " + n.getDuration()+ " " + noteType);						
		}

	}

	
	private int maxNotes = 8;
	private float names = 150;
	private float border = 0.9f;
	void drawNotes()
	{
		
		line(100, 200, 850, 200);
		line(100, 220, 850, 220);
		line(100, 240, 850, 240);
		line(100, 260, 850, 260);
		line(100, 280, 850, 280);
	

		fill(0);
		ellipse(170, 250, width/40, height/20); 
		ellipse(200, 250, width/40, height/20);
		ellipse(230, 250, width/40, height/20);
		ellipse(260, 250, width/40, height/20);
		ellipse(290, 250, width/40, height/20);
		ellipse(320, 250, width/40, height/20);
		ellipse(350, 250, width/40, height/20);
		ellipse(380, 250, width/40, height/20);
	
	}
	public void setup() 
	{
		//background(255);
		
		loadScore();
		printScore();
		//drawNotes();
		
	}

	public void draw()
	{
		background(255);
		drawNotes();
	}


	
}
