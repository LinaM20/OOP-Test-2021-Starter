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
		println(i);
	}

	//loadScore method to populate ArrayList
	public void loadScore()
	{
		for (int i = 0; i < score.length(); i++)
		{
			char n = score.charAt(i);
			int duration = 1;
		
			Note note = new Note(n, duration);
			notes.add(note);
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

	// public void charAt(int num)
	// {
	// 	for (int i = 0; i < num; i++)
	// 	{
	// 		strings = score.charAt(i);
	// 	}

	// }

	
	

	public void setup() 
	{
		background(255);
		loadScore();
		printScore();
		
	}

	public void draw()
	{
		background(255);
		
		
		line(100, 200, 850, 200);
		line(100, 220, 850, 220);
		line(100, 240, 850, 240);
		line(100, 260, 850, 260);
		line(100, 280, 850, 280);


	
		
		
	}

	// private float border = 40;
	// private float rowHeight = 40;
	// private int maxNotes = 10;
	// float noteName = 150;
	void drawNotes()
	{
		for (int i = 0; i < notes.size(); i++)
		{
			// noStroke();
			// fill(map(i, 0, notes.size(), 0, 255), 255, 255);
			// float x1 = map(notes.get(i).getNote(), 1, maxNotes, noteName, width - border);
			// float x2 = map(notes.get(i).getDuration(), 1, maxNotes, noteName, width - border);
			// ellipse(x1, x2 - x1, rowHeight - 5, 5.0f);
		}
	}
}
