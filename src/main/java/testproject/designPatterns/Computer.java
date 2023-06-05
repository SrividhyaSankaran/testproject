package testproject.designPatterns;

public abstract class Computer {

	public abstract String getKeyboard();
	public abstract String getMouse();
	
	@Override
	public String toString(){
		return "KeyBoard = "+this.getKeyboard()+", Mouse ="+this.getMouse();
	}
}
