package slo.controller;

import slo.character.SloCharacter;
import slo.view.SloDisplay;
import slo.view.SloDisplayTwo;

import java.util.ArrayList;

public class SloController
{
	 private SloDisplay myPopups;
	 private SloCharacter myThing;
	 private ArrayList<String> firstWords;
	 private SloDisplayTwo popupDisplay;
	 
	 public SloController()
		{
			firstWords = new ArrayList<String>();
			popupDisplay = new SloDisplayTwo();
			
			myPopups = new SloDisplay(); 
		}
		
	 
	public void start()

	 {
		firstWords.add("djahfa8usfhaisufhaisufhkjsafhniusahf");
		firstWords.add("babababababababababababababababababa");
		firstWords.add(1, "CRYING INSANELY");
		firstWords.set(2, "mamamamamamamamamamamamama");
		displayList();
		showOtherLoop();

		 String name = myPopups.getAnswer("Type in your name");
		 
		 myPopups.displayResponse("You typed in " + name);
		 
		 int age;
		 String tempAge = myPopups.getAnswer("Type in your age");
		 
		 while(!isInterger(tempAge))
		 {
			 tempAge = myPopups.getAnswer("Type in an interger value!!!!");
			
		 }
		 
		 if(isInterger(tempAge))
		 {
			 age= Integer.parseInt(tempAge);
		 }
		 else
		 {
			 age = -12345678;
		 }
		 
		 myPopups.displayResponse("You typed in " + age);
		 
		 double weight;
		 String tempWeight = myPopups.getAnswer("Type in your weight");
		 
		 while(!isDouble(tempWeight))
		 {
			 tempWeight = myPopups.getAnswer("Type ina valid double answer!!!");
		 }
		 
		 if(isDouble(tempWeight))
		 {
			 weight = Double.parseDouble(tempWeight);
		 }
		 else
		 {
			 weight = -.99990001;
		 }
		 
		 myPopups.displayResponse("You typed in " + weight);
		 
		 myThing = new SloCharacter(name,age, weight);
		 
		 myPopups.displayResponse(myThing.toString());
	 }
		 


		 private boolean isInterger(String input)
	 {
		 boolean isInt = false;
		 
		 try
		 {
			 int validInterger = Integer.parseInt(input);
			 isInt = true;
		 }
		 catch(NumberFormatException error)
		 {
			 myPopups.displayResponse("You did not type in a valid interger :(");
		 }
				 
		 return isInt;
	 }
	 
	 private boolean isDouble(String input)
	 {
		 boolean isDouble = false;
		 
		 try
		 {
			 Double validDouble = Double.parseDouble(input);
			 isDouble = true;
		 }
		 catch(NumberFormatException error)
		 {
			 myPopups.displayResponse("You did not type in a valid double :(");
		 }
				 
		 return isDouble;
	 }
	 
		private void displayList()
		{
			popupDisplay.showList(" The size of the list is " + firstWords.size());
			for(int spot = 0; spot < firstWords.size(); spot++)
			{
				popupDisplay.showList("The contents at " + spot + " are " + firstWords.get(spot));
			}
		}
		
		private void showOtherLoop()
		{
			for(String words : firstWords)
			{
				popupDisplay.showList(words);
			}
		}
}