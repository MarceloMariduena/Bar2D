package application;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class Bar2D extends Pane{

	/* Constructor which sets background color of pane */
	public Bar2D(String bgColor) { 
		this.setStyle("-fx-background-color: #" + bgColor); 
	}
	
	/* Method which adds the bars onto the application */
	public void addAllBars(double[] percentArray, String[] captionArray, boolean randomColors, double barSeparation){
		double currentX = 0;
		
		/* Iterates through attributes passed by the user and draws bars according to them */
		for (int i = 0; i < captionArray.length; i++) {
			
			/* Text( x, y, text )*/
			Text tempText = new Text(currentX, 498 - (500 * percentArray[i]), captionArray[i] + " (" + (percentArray[i] * 100) + " %)");
			
			/* Rectangle( x, y, width, height) */
			Rectangle tempRect = new Rectangle(currentX, 500 - (500 * percentArray[i]), 100, 500 * percentArray[i]);
			
			if(randomColors) {
				double r = Math.random();
				double g = Math.random();
				double b = Math.random();
				tempRect.setFill(Color.color(r, g, b));
			}else {
				double g = Math.random(); // random gray-scale color
				tempRect.setFill(Color.color(g, g, g));
			}
			
			getChildren().add(tempText);
			getChildren().add(tempRect);
			currentX += 100 + barSeparation;
		}
		
	}
	
}
