package testproject.designPatterns;


public class Election implements CastingVote {
	
	private String name;
	private int age;
	private Users user;
	
	public Election(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public void eligibleToVote() {
		// TODO Auto-generated method stub
		if(age >= 18) {
			user = new Users(name, age);
			user.eligibleToVote();
		}else {
			System.out.println("As you are under age of 18. You are not eligible to cast the Vote : "+name);
		}
		
	}
	
	
}
