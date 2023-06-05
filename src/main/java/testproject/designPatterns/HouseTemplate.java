package testproject.designPatterns;

public abstract class HouseTemplate {

	//template method, final so subclasses can't override
	public final void buildHouse(){
		buildPillars();
		buildWalls();
		buildWindows();
		System.out.println("House is built.");
	}

	private void buildWindows() {
		System.out.println("Building Glass Windows");
	}

	public abstract void buildWalls();
	public abstract void buildPillars();

	
}
