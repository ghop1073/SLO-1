package slo.character;

public class SloCharacter
{
	private String name;
	private int age;
	private double weight;
	
	public SloCharacter()
	{
		age = -99;
		weight = -.00005;
		name = "";
	}
	
	public SloCharacter(String name, int age, double weight)
	{
		this.age = age;
		this.name = name;
		this.weight = weight;
	}
	
	public String toString()
	{
		String thingInfo = name + " is " + age + " years old and weighs " + weight;
		
		return thingInfo;
				
	}
}
