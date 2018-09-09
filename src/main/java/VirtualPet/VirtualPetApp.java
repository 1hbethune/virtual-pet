package VirtualPet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		VirtualPet myPet = new VirtualPet(35, 40, 20, 50, 30, 40);

		System.out.println("Please enter your pet's name: ");
		String nameEntered = input.nextLine();
		System.out.println("Hello " + nameEntered);

		System.out.println("Below is the current state of your pet, what would you like to do?");
		System.out.println("For options please type Help");
		System.out.println(myPet);
		String response = input.nextLine();
		String option;
		while (response.toLowerCase().equals("help")) {
			System.out.println("Press 1 to feed " + nameEntered);
			System.out.println("Press 2 to give " + nameEntered + " water");
			System.out.println("Press 3 to take " + nameEntered + " to the potty");
			System.out.println("Press 4 to play with " + nameEntered);
			System.out.println("Press 5 to take " + nameEntered + " to the vet");
			System.out.println("Press 6 to put " + nameEntered + " to bed");
			System.out.println("Press 7 to check status");
			System.out.println("Please enter an option.");
			response = input.nextLine();

			while (!response.equals("8")) {

				if (response.equals("1")) {
					System.out.println("Please enter food amount.");
					int foodAmount = input.nextInt();
					myPet.feed(foodAmount);
					System.out.println(nameEntered + " has been fed. He's full now.");
					System.out.println("Is there anything else you would like to do?");
					input.nextLine();
				} else if (response.equals("2")) {
					System.out.println("Please enter an amount of water.");
					int waterAmount = input.nextInt();
					myPet.giveWater(waterAmount);
					System.out.println(nameEntered + " has been given water. Wow, that was refreshing.");
					System.out.println("Is there anything else you would like to do?");
					input.nextLine();
				} else if (response.equals("3")) {
					System.out.println("How long did " + nameEntered + " potty.");
					int usedPotty = input.nextInt();
					myPet.takenOut(usedPotty);
					System.out.println(nameEntered + " has been taken to the potty. Aahh, relief.");
					System.out.println("Is there anything else you would like to do?");
					input.nextLine();
				} else if (response.equals("4")) {
					System.out.println("How long did " + nameEntered + " play.");
					int play = input.nextInt();
					myPet.playWith(play);
					System.out.println(nameEntered + " has burned some calories today. Good work " + nameEntered + ".");
					System.out.println("Is there anything else you would like to do?");
					input.nextLine();
				} else if (response.equals("5")) {
					System.out.println("How long was " + nameEntered + " at the vet.");
					int vet = input.nextInt();
					myPet.takeToVet(vet);
					System.out.println("The vet appointment has been completed. All better now.");
					System.out.println("Is there anything else you would like to do?");
					input.nextLine();
				} else if (response.equals("6")) {
					System.out.println("How long did " + nameEntered + " sleep.");
					int sleep = input.nextInt();
					myPet.putToSleep(sleep);
					System.out.println(nameEntered + " is now hyper and full of engery. Have fun!");
					System.out.println("Is there anything else you would like to do?");
					input.nextLine();
				} else if (response.equals("7")) {
					System.out.println(nameEntered + "'s status is: " + myPet);
				} else {
					System.out.println("Goodbye...Thanks for playing with " + nameEntered + " today, have a good one.");
					System.exit(0);

				}

				System.out.println("Press 1 to feed " + nameEntered);
				System.out.println("Press 2 to give " + nameEntered + " water");
				System.out.println("Press 3 to take " + nameEntered + " to the potty");
				System.out.println("Press 4 to play with " + nameEntered);
				System.out.println("Press 5 to take " + nameEntered + " to the vet");
				System.out.println("Press 6 to put " + nameEntered + " to bed");
				System.out.println("Press 7 to check status");
				System.out.println("Please enter an option.");
				response = input.nextLine();

			}
		}
	}
}
