package testproject.designPatterns;

public class Laptop extends Computer {

	private String keyboard;
	private String mouse;
	
	public Laptop(String keyboard, String mouse){
		this.keyboard=keyboard;
		this.mouse=mouse;
	}
	@Override
	public String getKeyboard() {
		return this.keyboard;
	}

	@Override
	public String getMouse() {
		return this.mouse;
	}
}
