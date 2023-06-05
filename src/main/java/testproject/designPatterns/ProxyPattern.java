package testproject.designPatterns;

public class ProxyPattern {

	public static void main(String[] args) {
		CastingVote vote1 = new Election("Srividhya", 25);
		vote1.eligibleToVote();
		
		CastingVote vote2 = new Election("Sandhiya", 15);
		vote2.eligibleToVote();
	}
}
 