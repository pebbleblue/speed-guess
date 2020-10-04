//This program is written in java programming language.

import java.util.Scanner;



public class SpeedGuess
{
    
	//Ion Engines description and facts
	public static void ionEngine(int caseNum) {

	    switch(caseNum) {
	
      		case 1:

			System.out.println("Ion Engines:");

			System.out.println("This type of propulsion can efficiently use fuel and electrical power,");

			System.out.println("which can let the spacecraft travel farther, faster and cheaper. The trade-off");

			System.out.println("for the high speed is the low thrust of ion thrusters. So this cannot");

			System.out.println("put a spacecraft in space due to the low thrust it produces which cannot be used");

		       	System.out.println("to escape Earth’s gravity and atmosphere.");

			System.out.println("\nSo, any ideas of how fast this will go? (Please answer in km/s units and only enter the number)");

			break;

 

		case 2:

			System.out.println("Did you know that chemical rockets have showed fuel efficiencies up to");

			System.out.println("35% whereas ion thrusters have fuel efficiencies above 90%.");

			System.out.println("\nFun Fact: Ion thrusters are currently being used to keep communication");

		       	System.out.println("satellites in proper position relative to Earth and also used for");

		       	System.out.println("propulsion on deep space probes!");

			break;



            //Resource: https://www.nasa.gov/centers/glenn/technology/Ion_Propulsion1.html#:~:text=Spacecraft%20powered%20by%20these%20thrusters,thrust%20(or%20low%20acceleration).


            }

    	}



    //VASIMR description and facts
    public static void vasimr(int caseNum) {

	    switch(caseNum) {

	        case 1:
 
    		    System.out.println("VASIMR (Variable Specific Impulse Magnetoplasma Rocket):");

    		    System.out.println("This is a plasma based propulsion system which uses an electric power source");

    		    System.out.println("to ionize fuel into plasma, then the electrical fields heat and accelerate the");

    		    System.out.println("plasma whereas the magnetic fields lead the plasma in the correct direction");

    		    System.out.println("while it is being ejected from the engine. This creates thrust for the spacecraft!");

    		    System.out.println("Varing amounts of thrust produced can be performed by this engine which allows the");

    		    System.out.println("spacecraft to increase or decrease its speed.");

    		    System.out.println("\nBut what do you think the average speed it could go?");
    
                    break;



		case 2:

		    System.out.println("Fun Fact: This consists of an afterburner mode which sacrifices fuel efficiency for more speed.");

		    break;

    
		//Resource: https://www.nasa.gov/vision/space/travelinginspace/future_propulsion.html


	    }

    	} 

    

	//SEP description and facts
	public static void sep(int caseNum) {

	    switch(caseNum) {

		case 1:

		    System.out.println("Solar Electric Propulsion:");

		    System.out.println("With this propulsion system, energy is fed into fuel-efficient thrusters to give a");

		    System.out.println("gentle but nonstop thrust throughout the mission. This uses Hall thrusters which generates");

		    System.out.println("and traps electrons in a magnetic field. Then the thruster uses them to ionize the");

		    System.out.println("propellant so that it can shoot out as plasma making the spacecraft move forward.");

        	    System.out.println("\nAny ideas as to how fast a spacecraft with this propulsion system can go?");
	
            	    break;



    		case 2:

    		    System.out.println("Fun Fact: By adding more Hall thrusters can increase the power!");
		    break;

		
		//Resource: https://www.nasa.gov/mission_pages/tdm/sep/index.html

       	   }

    	}



    
    	/**
	This method asks for the user input and turns it from a string into an integer.
	*/
	public static int guess() {

        	Scanner guess = new Scanner(System.in);

		String guessString = guess.nextLine();

		int guessInt = Integer.parseInt(guessString);

		return guessInt;

    	}


	/**
	This method checks to see if the guess is too high or too low compared to the correct answer; 
	and then prints the appropriate message.
	*/
    	public static void check(int answer, int guess){

        	if (guess > answer) {

            		System.out.println("Whoa too high, try guessing lower!");

        	} else {

            		System.out.println("Not quite, try something higher!");

        	}

    	}



	/**
	This method allows the user to go to the next round.
	*/
    	public static void next(){

		System.out.println("\nPlease press enter key to go to the next round");

		Scanner next = new Scanner(System.in);

		String letter = next.nextLine();

	}

	/**
	This method takes in the correct answer as an argument.
	It also contains the loop for guessing and allows the user to escape the loop
	by entering 0. This method also prints out the congratulatory message if
	the user guesses the correct answer. 
	*/
	public static void format(int num) {

	    int userInput;
	    while((userInput = guess()) != num) {

	        if(userInput == 0) {

		        System.out.println(num);
  
		        break;
 
	        }

            	check(num, userInput);

	    }



            System.out.println("Woohoo! You're correct!!\n");

	}



	public static void main(String[] args) {
		
		//welcome message
		System.out.println("Welcome to Speed Guess!");

        	System.out.println("Where you enter the world of speed in space!");
  
        	System.out.println("\nHow to play: You are given a type of spacecraft propulsion with some basic info");
	
        System.out.println("about it and are required to try and guess how fast it will go in kilometers per second (km/s)");

        	System.out.println("(Note: While guessing, if you would like to know the answer: enter '0')");

     	
        
		System.out.println("\nType 'start' to start the game.");
		Scanner start = new Scanner(System.in);


        	
		String ok = start.nextLine();

        	while(!ok.equals("start")) {	//checks to see if 'start' is entered, if not then insists the user to enter 'start'. Round 1 does not begin until 'start' is entered.

            		System.out.println("Please type 'start'");

         		start = new Scanner(System.in);

            		ok = start.nextLine();
	 
        
		}


		//Round 1
        	System.out.println("\nRound 1:");
        	ionEngine(1);
	    	format(90);       	
		ionEngine(2);


	    
		next();


        	//Round 2
		System.out.println("\nRound 2:"); 
	   	vasimr(1);
	    	format(50);
		vasimr(2);



	    	next();

 
	    	//Round 3
		System.out.println("\nRound 3:");
	    	sep(1);
	    	format(29);
		sep(2);



		next();

	

		System.out.println("\nGame Over.");	//game ends

	}

}
