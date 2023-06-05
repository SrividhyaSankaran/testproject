package testproject.designPatterns;

interface CastingVote {  
    public void eligibleToVote();  
}  

public class Users implements CastingVote {

	private String name;  
	private int age;
	
	public Users(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public void eligibleToVote() {
		// TODO Auto-generated method stub
		System.out.println("As your age is "+ age +". You are eligible to cast your vote : "+ name);  
	}


}
