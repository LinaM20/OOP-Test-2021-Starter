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

	public void printScore()
	{
		for (Note n:notes)
		{		
			println(n);						
		}
	}

	public void charAt(int num)
	{
		for (int i = 0; i < num; i++)
		{
			strings = score.charAt(i);
		}

	}

	
	

	public void setup() 
	{
		loadScore();
		printScore();
		
	}

	public void draw()
	{
		background(255);
		
	}

	void drawNotes()
	{

	}
}
