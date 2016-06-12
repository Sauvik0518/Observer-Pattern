package observer.pattern;

public class GirlFriend extends Girls {

	public GirlFriend(String girlName) {
		this.girlName=girlName;
	}
	
	@Override
	void getMessage() {
		// TODO Auto-generated method stub
		System.out.println(girlName + " has got a new message via whatsapp!");
	}

}
