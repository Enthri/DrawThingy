import java.awt.Polygon;


@SuppressWarnings("serial")
public class Triangle extends Polygon{
	int[] x_points = new int[3];
	int[] y_points = new int[3];
	int l;
	int x_final;
	int y_final;
	public Triangle(int x, int y, int length){
		l = length;
		x_final = x;
		y_final = y;
		x_points[0] = x_final;
		x_points[1] = x_final + length/2;
		x_points[2] = x_final - length/2;
		
		y_points[0] = y_final;
		y_points[1] = (int) (y_final + (length/2) * Math.sqrt(3));
		y_points[2] = y_points[1];
		
		for(int i = 0; i < 3; i++){
			this.addPoint(x_points[i], y_points[i]);
			}
	}
	public Triangle(int x, int y, int length, int rotation){
		x_points[0] = x;
		x_points[1] = x + length/2;
		x_points[2] = x - length/2;
		
		y_points[0] = y;
		y_points[1] = (int) (y + Math.cbrt(length/2));
		y_points[2] = y_points[1];
		this.addPoint(x_points[0], y_points[0]);
		this.addPoint(x_points[1], y_points[1]);
		this.addPoint(y_points[2], y_points[2]);
	}
	
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
