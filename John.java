package observer.pattern;

import java.util.ArrayList;
import java.util.List;

import observer.pattern.Girls;

public class John {
	List<Girls> listOfgirlFriends = new ArrayList<Girls>();

	boolean messageAvailable = false;

	

	void registerGirl(Girls GirlFriend) {
		listOfgirlFriends.add(GirlFriend);
	}

	void unRegisterGirl(Girls GirlFriend) {

		listOfgirlFriends.remove(GirlFriend);
		

		setMessageAvailability(false);
		System.out.println(GirlFriend.girlName + " unregisterd");

	}

	private void setMessageAvailability(boolean b) {
		// TODO Auto-generated method stub
		
	}

	void setmessageAvailability(boolean messageAvailablity) {
		this.messageAvailable = messageAvailablity;
	}

	void sendMessage(Girls GirlFriend) {
		if (messageAvailable) {
			GirlFriend.getMessage();
		}

		else {
			System.out.println("Message is not available for "
					+ GirlFriend.girlName);
		}
	}
	/*private int state;
	
	public int getState(){
		return state;
	}
	public void setState(int state){
		this.state = state;
		notifyAllGirls();
	}

	public void notifyAllGirls() {
		// TODO Auto-generated method stub
		for(Girls girls : listOfgirlFriends){
			girls.getMessage();
		}
	}*/
	

}
