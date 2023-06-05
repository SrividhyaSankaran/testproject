package testproject.designPatterns;

public class PC extends Computer {

	private String keyboard;
	private String mouse;
	
	public PC(String keyboard, String mouse){
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
