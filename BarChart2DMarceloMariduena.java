package application;

/* @author: Marcelo Mariduena */

import java.util.Scanner;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BarChart2DMarceloMariduena extends Application{

	public void start(Stage primaryStage) throws Exception{
		/* Variables */
		Scanner input = new Scanner(System.in);
		int numOfBars, barSeparation;
		boolean randomColors;
		
		System.out.print("Enter the number of bars: ");
		numOfBars = input.nextInt();
		
		System.out.print("Enter the percentages separated by spaces: ");
		double[] percentArray = new double[numOfBars];
		for (int i = 0; i < numOfBars; i++) {
			percentArray[i] = input.nextDouble();
		}
		
		System.out.print("Enter the categories separated by spaces: ");
		String[] captionArray = new String[numOfBars];
		for (int i = 0; i < numOfBars; i++) {
			captionArray[i] = input.next();
		}
		
		System.out.print("Should the bars be colored? [true/false]: ");
		randomColors = input.nextBoolean();
		
		System.out.print("Enter the bar spacing [positive integer]: ");
		barSeparation = input.nextInt();
		
		input.close();
		
		/* Instantiation with user input as attributes */
		Bar2D test = new Bar2D("AAA");
		test.addAllBars(percentArray, captionArray, randomColors, barSeparation);
		
		/* Display */
		Scene scene = new Scene(test, 900, 500); // Scene: test, width: 800px, height 400px
		primaryStage.setTitle("Bar2DChart by Marcelo Mariduena"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
		
	}

}
