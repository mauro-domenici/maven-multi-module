package it.ats.app.domain;

public class Search {
	private String portion;
	private int lenght;
	
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
		return lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}
}
