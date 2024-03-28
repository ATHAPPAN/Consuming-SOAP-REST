package com.Dog.DogApi.entity;

public class Joke {

	private int id;
	private String punchline;
	private String setup;
	private String type;
	
	
	public Joke() {
		super();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPunchline() {
		return punchline;
	}
	public void setPunchline(String punchline) {
		this.punchline = punchline;
	}
	public String getSetup() {
		return setup;
	}
	public void setSetup(String setup) {
		this.setup = setup;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	
}
