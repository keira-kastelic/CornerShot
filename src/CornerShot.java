import java.awt.*;
import java.util.Random;

public class CornerShot {
    public static void main(String[] args) {
        // first Shot
        System.out.println("First shot"); // printing shot number
        Random x = new Random (); // declaring the random method
        int xBoundary = x.nextInt(300); // creating a random x value
        int yBoundary = x.nextInt(300); // creating a random y value
        System.out.println("("+xBoundary+","+" "+yBoundary+")"); // printing out the point
        Point shot = new Point (xBoundary,yBoundary); // creating the point
        Point center = new Point (150,150); // creating the center of the bullseye
        double distance = center.distance(shot);// creating the distance between the shot and the center of the circle
        boolean bullseye = distance <= 125; // setting the size of the bullseye, and checking to see if the random shot was a bullseye
        System.out.println("Is it a bullseye? "+bullseye);// printing the bullseye statement
        boolean woodShot; // creating a wood boolean
        woodShot = (xBoundary < 25 && xBoundary > 275)|| (yBoundary < 25 && yBoundary > 275);// creating the wood shot boundries
        boolean cornerShot; // creating a corner shot boolean
        cornerShot = (bullseye == false && woodShot == false);// creating the cornershot boiundray (is it is not a bullseye or wood shot)
        System.out.println("is it a corner shot? "+cornerShot); // printing corner shot
        System.out.println("Is it a wood shot? "+woodShot); // printing wood shot

        // Second Shot
        System.out.println("Second Shot"); // printing shot number
        xBoundary = x.nextInt(300); // creating a random x value
        yBoundary = x.nextInt(300); // creating a random y value
        System.out.println("("+xBoundary+","+" "+yBoundary+")"); // printing out the point
        shot = new Point (xBoundary,yBoundary); // creating the point
        center = new Point (150,150); // creating the center of the bullseye
        distance = center.distance(shot);// creating the distance between the shot and the center of the circle
        bullseye = distance <= 125; // setting the size of the bullseye, and checking to see if the random shot was a bullseye
        System.out.println("Is it a bullseye? "+bullseye);// printing the bullseye statement
        woodShot = (xBoundary < 25 && xBoundary > 275)|| (yBoundary < 25 && yBoundary > 275);// creating the wood shot boundries
        cornerShot = (bullseye == false && woodShot == false);// creating the cornershot boiundray (is it is not a bullseye or wood shot)
        System.out.println("is it a corner shot? "+cornerShot); // printing corner shot
        System.out.println("Is it a wood shot? "+woodShot); // printing wood shot

        // Thrid Shot
        System.out.println("Third Shot"); // printing shot number
        xBoundary = x.nextInt(300); // creating a random x value
        yBoundary = x.nextInt(300); // creating a random y value
        System.out.println("("+xBoundary+","+" "+yBoundary+")"); // printing out the point
        shot = new Point (xBoundary,yBoundary); // creating the point
        center = new Point (150,150); // creating the center of the bullseye
        distance = center.distance(shot);// creating the distance between the shot and the center of the circle
        bullseye = distance <= 125; // setting the size of the bullseye, and checking to see if the random shot was a bullseye
        System.out.println("Is it a bullseye? "+bullseye);// printing the bullseye statement
        woodShot = (xBoundary < 25 && xBoundary > 275)|| (yBoundary < 25 && yBoundary > 275);// creating the wood shot boundries
        cornerShot = (bullseye == false && woodShot == false);// creating the cornershot boiundray (is it is not a bullseye or wood shot)
        System.out.println("is it a corner shot? "+cornerShot); // printing corner shot
        System.out.println("Is it a wood shot? "+woodShot); // printing wood shot

        // Fourth Shot
        System.out.println("Fourth Shot"); // printing shot number
        xBoundary = x.nextInt(300); // creating a random x value
        yBoundary = x.nextInt(300); // creating a random y value
        System.out.println("("+xBoundary+","+" "+yBoundary+")"); // printing out the point
        shot = new Point (xBoundary,yBoundary); // creating the point
        center = new Point (150,150); // creating the center of the bullseye
        distance = center.distance(shot);// creating the distance between the shot and the center of the circle
        bullseye = distance <= 125; // setting the size of the bullseye, and checking to see if the random shot was a bullseye
        System.out.println("Is it a bullseye? "+bullseye);// printing the bullseye statement
        woodShot = (xBoundary < 25 && xBoundary > 275)|| (yBoundary < 25 && yBoundary > 275);// creating the wood shot boundries
        cornerShot = (bullseye == false && woodShot == false);// creating the cornershot boiundray (is it is not a bullseye or wood shot)
        System.out.println("is it a corner shot? "+cornerShot); // printing corner shot
        System.out.println("Is it a wood shot? "+woodShot); // printing wood shot

        // Fifth Shot
        System.out.println("Fifth Shot"); // printing shot number
        xBoundary = x.nextInt(300); // creating a random x value
        yBoundary = x.nextInt(300); // creating a random y value
        System.out.println("("+xBoundary+","+" "+yBoundary+")"); // printing out the point
        shot = new Point (xBoundary,yBoundary); // creating the point
        center = new Point (150,150); // creating the center of the bullseye
        distance = center.distance(shot);// creating the distance between the shot and the center of the circle
        bullseye = distance <= 125; // setting the size of the bullseye, and checking to see if the random shot was a bullseye
        System.out.println("Is it a bullseye? "+bullseye);// printing the bullseye statement
        woodShot = (xBoundary < 25 && xBoundary > 275)|| (yBoundary < 25 && yBoundary > 275);// creating the wood shot boundries
        cornerShot = (bullseye == false && woodShot == false);// creating the cornershot boiundray (is it is not a bullseye or wood shot)
        System.out.println("is it a corner shot? "+cornerShot); // printing corner shot
        System.out.println("Is it a wood shot? "+woodShot); // printing wood shot


        //Sixth Shot
        System.out.println("Sixth Shot"); // printing shot number
        xBoundary = x.nextInt(300); // creating a random x value
        yBoundary = x.nextInt(300); // creating a random y value
        System.out.println("("+xBoundary+","+" "+yBoundary+")"); // printing out the point
        shot = new Point (xBoundary,yBoundary); // creating the point
        center = new Point (150,150); // creating the center of the bullseye
        distance = center.distance(shot);// creating the distance between the shot and the center of the circle
        bullseye = distance <= 125; // setting the size of the bullseye, and checking to see if the random shot was a bullseye
        System.out.println("Is it a bullseye? "+bullseye);// printing the bullseye statement
        woodShot = (xBoundary < 25 && xBoundary > 275)|| (yBoundary < 25 && yBoundary > 275);// creating the wood shot boundries
        cornerShot = (bullseye == false && woodShot == false);// creating the cornershot boiundray (is it is not a bullseye or wood shot)
        System.out.println("is it a corner shot? "+cornerShot); // printing corner shot
        System.out.println("Is it a wood shot? "+woodShot); // printing wood shot

        //Seventh Shot
        System.out.println("Seventh Shot"); // printing shot number
        xBoundary = x.nextInt(300); // creating a random x value
        yBoundary = x.nextInt(300); // creating a random y value
        System.out.println("("+xBoundary+","+" "+yBoundary+")"); // printing out the point
        shot = new Point (xBoundary,yBoundary); // creating the point
        center = new Point (150,150); // creating the center of the bullseye
        distance = center.distance(shot);// creating the distance between the shot and the center of the circle
        bullseye = distance <= 125; // setting the size of the bullseye, and checking to see if the random shot was a bullseye
        System.out.println("Is it a bullseye? "+bullseye);// printing the bullseye statement
        woodShot = (xBoundary < 25 && xBoundary > 275)|| (yBoundary < 25 && yBoundary > 275);// creating the wood shot boundries
        cornerShot = (bullseye == false && woodShot == false);// creating the cornershot boiundray (is it is not a bullseye or wood shot)
        System.out.println("is it a corner shot? "+cornerShot); // printing corner shot
        System.out.println("Is it a wood shot? "+woodShot); // printing wood shot

        //Eighth Shot
        System.out.println("Eighth Shot"); // printing shot number
        xBoundary = x.nextInt(300); // creating a random x value
        yBoundary = x.nextInt(300); // creating a random y value
        System.out.println("("+xBoundary+","+" "+yBoundary+")"); // printing out the point
        shot = new Point (xBoundary,yBoundary); // creating the point
        center = new Point (150,150); // creating the center of the bullseye
        distance = center.distance(shot);// creating the distance between the shot and the center of the circle
        bullseye = distance <= 125; // setting the size of the bullseye, and checking to see if the random shot was a bullseye
        System.out.println("Is it a bullseye? "+bullseye);// printing the bullseye statement
        woodShot = (xBoundary < 25 && xBoundary > 275)|| (yBoundary < 25 && yBoundary > 275);// creating the wood shot boundries
        cornerShot = (bullseye == false && woodShot == false);// creating the cornershot boiundray (is it is not a bullseye or wood shot)
        System.out.println("is it a corner shot? "+cornerShot); // printing corner shot
        System.out.println("Is it a wood shot? "+woodShot); // printing wood shot

        //Ninth Shot
        System.out.println("Ninth Shot"); // printing shot number
        xBoundary = x.nextInt(300); // creating a random x value
        yBoundary = x.nextInt(300); // creating a random y value
        System.out.println("("+xBoundary+","+" "+yBoundary+")"); // printing out the point
        shot = new Point (xBoundary,yBoundary); // creating the point
        center = new Point (150,150); // creating the center of the bullseye
        distance = center.distance(shot);// creating the distance between the shot and the center of the circle
        bullseye = distance <= 125; // setting the size of the bullseye, and checking to see if the random shot was a bullseye
        System.out.println("Is it a bullseye? "+bullseye);// printing the bullseye statement
        woodShot = (xBoundary < 25 && xBoundary > 275)|| (yBoundary < 25 && yBoundary > 275);// creating the wood shot boundries
        cornerShot = (bullseye == false && woodShot == false);// creating the cornershot boiundray (is it is not a bullseye or wood shot)
        System.out.println("is it a corner shot? "+cornerShot); // printing corner shot
        System.out.println("Is it a wood shot? "+woodShot); // printing wood shot

        //Tenth Shot
        System.out.println("Tenth Shot"); // printing shot number
        xBoundary = x.nextInt(300); // creating a random x value
        yBoundary = x.nextInt(300); // creating a random y value
        System.out.println("("+xBoundary+","+" "+yBoundary+")"); // printing out the point
        shot = new Point (xBoundary,yBoundary); // creating the point
        center = new Point (150,150); // creating the center of the bullseye
        distance = center.distance(shot);// creating the distance between the shot and the center of the circle
        bullseye = distance <= 125; // setting the size of the bullseye, and checking to see if the random shot was a bullseye
        System.out.println("Is it a bullseye? "+bullseye);// printing the bullseye statement
        woodShot = (xBoundary < 25 && xBoundary > 275)|| (yBoundary < 25 && yBoundary > 275);// creating the wood shot boundries
        cornerShot = (bullseye == false && woodShot == false);// creating the cornershot boiundray (is it is not a bullseye or wood shot)
        System.out.println("is it a corner shot? "+cornerShot); // printing corner shot
        System.out.println("Is it a wood shot? "+woodShot); // printing wood shot


    }
}
