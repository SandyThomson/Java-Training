/**
 * 
 */
package main.java;

/**
 * @author Mike
 *
 */
public abstract class TwoDShape {

	private double height;
	private double width;
	private String name;

	/**
	 * 
	 */
	public TwoDShape() {
		width = height = 0.0;
		name = "none";
	}

	TwoDShape(double w, double h, String n) {
		width = w;
		height = h;
		name = n;
	}

	TwoDShape(double x, String n) {
		width = height = x;
		name = n;
	}
	
	TwoDShape( TwoDShape ob){
		width = ob.width;
		height = ob.height;
		name = ob.name;
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		this.width = width;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	void showDim(){
		System.out.println("Width and height are " + width + " and " + height);
	}
	
	abstract double area();

}
