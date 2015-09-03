/*
 * Author: Ryan Chen
 * Date: September 2nd, 2015
 * Description: This class draws Triangles.
 */
import java.awt.Polygon;


@SuppressWarnings("serial")
//This is the Triangle class that creates Triangles.
public class Triangle extends Polygon{
	//Declaring variables needed to make a triangle.
	int[] x_points = new int[3];
	int[] y_points = new int[3];
	int l;
	int x_final;
	int y_final;
	//The constructor for making triangles.
	public Triangle(int x, int y, int length){
		//I use math to figure out the points, which makes it universally applicable.
		l = length;
		x_final = x;
		y_final = y;
		x_points[0] = x_final;
		x_points[1] = x_final + length/2;
		x_points[2] = x_final - length/2;
		
		y_points[0] = y_final;
		y_points[1] = (int) (y_final + (length/2) * Math.sqrt(3));
		y_points[2] = y_points[1];
		
		//I also save three lines of code to add in three lines of code.
		for(int i = 0; i < 3; i++){
			this.addPoint(x_points[i], y_points[i]);
			}
	}
	//Obligatory accessor and mutator methods.
	public int getLength(){
		return l;
	}
	
	public int getX(){
		return x_final;
	}
	public int getY(){
		return y_final;
	}
	public void setX(int x){
		x_final = x;
	}
	public void setY(int y){
		y_final = y;
	}
}
