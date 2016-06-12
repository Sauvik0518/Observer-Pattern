package observer.pattern;

import observer.pattern.Girls;
import observer.pattern.GirlFriend;
import observer.pattern.John;

public class ObserverPatternMain {
	

	public static void main(String[] args) {

		John john = new John();
		
		

		Girls Maria = new GirlFriend("Maria");

		john.registerGirl(Maria);
		john.setmessageAvailability(true); 
		john.sendMessage(Maria);

		Girls Sofie = new GirlFriend("Sofie");

		john.registerGirl(Sofie);
		john.setmessageAvailability(true);
		john.sendMessage(Sofie);

		john.unRegisterGirl(Maria);

		john.setmessageAvailability(false);
		Girls Ritu = new GirlFriend("Ritu");
		john.sendMessage(Ritu);

	}
}
