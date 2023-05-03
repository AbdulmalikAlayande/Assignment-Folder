package Chapter6;

import java.util.Scanner;

public class Nokia {

	public String displayMenu() {
		return """
    			WELCOME!!!
    			Enter 1 for Phonebook
    			Enter 2 for Messages
    			Enter 3 for Call Register
    			Enter 4 for settings
    			Enter 5 for Games
    			Enter 6 for Extras 
				""";

	}
	public void MessageMenu(){

		System.out.println("""
				Enter 1 to create message
				Enter 2 to check inbox
				Enter 3 to check outbox
				Enter 4 to view drafts
				""");

		}


	public void callRegisterMenu() {
		System.out.println("""
				Enter 1 for dialed calls
				Enter 2 for recieved calls
				Enter 3 for missed calls
				""");
	}

	public void settingsMenu() {
		System.out.println("""
				""");
	}
}



