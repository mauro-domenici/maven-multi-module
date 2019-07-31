package it.ats.app.domain;

public class Search {
	private String portion;
	private int length;
	private boolean initial;
	
	public Search() {
		this.portion = "";
	}
	
	public Search(String portion) {
		this.portion = portion;
	}
	
	public String getPortion() {
		return portion;
	}

	public void setPortion(String portion) {
		this.portion = portion;
	}

	public int getLenght() {
		return length;
	}

	public void setLenght(int lenght) {
		this.length = lenght;
	}

	public boolean getStartsWith() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isInitial() {
		return initial;
	}

	public void setInitial(boolean initial) {
		this.initial = initial;
	}
}
