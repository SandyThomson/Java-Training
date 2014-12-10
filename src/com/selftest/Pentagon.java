package com.selftest;

/**
 * Five sided shape
 * 
 * ... I was bored.
 * 
 * @author sdt
 *
 */
public class Pentagon extends TwoDShape {

	// Make a triangle from the center to connecting points on the edges of the
	// shape. What are the angles?
	public static final double TRIANGLE_ANGLE_SHAPE_CENTER = 360 / 5;
	public static final double TRIANGLE_ANGLE_SHAPE_OUTER_CORNERS = (180 - 360 / 5) / 2;

	private int edgeLength;

	public Pentagon(int edgeLength) {

		// Sweet, now we can call the superclass constructor;
		super((int) getPentagonWidth(edgeLength),
				(int) getPentagonHeight(edgeLength));
		this.setEdgeLength(edgeLength);
	}

	@Override
	public double getArea() {

		// 5 triangles - ((W*H)/2)*5

		double width = edgeLength;
		double height = getLengthShapeCenterToCenterOfEdge(edgeLength,
				getLengthCenterToCorner(edgeLength));

		return ((width * height) / 2) * 5;
	}

	private static double getPentagonHeight(int edgeLength) {

		// Height - this will be the dimension from the middle of
		// a side to the opposite corner

		double centerToCornerLength = getLengthCenterToCorner(edgeLength);

		// Cool, we now have one part of the puzzle, now we need to calculate
		// the
		// shape center to center of an outer edge
		double centerToCenterOfEdge = getLengthShapeCenterToCenterOfEdge(
				edgeLength, centerToCornerLength);

		return centerToCornerLength + centerToCenterOfEdge;
	}

	private static double getLengthShapeCenterToCenterOfEdge(int edgeLength,
			double centerToCorner) {
		//
		// a2 + b2 = c2
		// b = sqrt( c2 - a2 )

		double c = centerToCorner;
		double a = edgeLength / 2;

		return Math.sqrt((c * c) - (a * a));
	}

	private static double getLengthCenterToCorner(int edgeLength) {

		// We know all triangle angles and a side length, so can work the first
		// part out (shape center to corner) using the Sine rule
		//
		// a/SIN A = b/SIN B = c/SIN C
		// b = (a/SIN A) * SIN B

		double a = edgeLength;
		double A = Math.toRadians(TRIANGLE_ANGLE_SHAPE_CENTER);
		double B = Math.toRadians(TRIANGLE_ANGLE_SHAPE_OUTER_CORNERS);

		return (a / Math.sin(A)) * Math.sin(B);
	}

	private static double getPentagonWidth(int edgeLength) {
		// This is difficult to explain, but now we need to work out the width,
		// which is the distance between two corners that aren't directly
		// connected by an edge
		// Use the Cosine rule
		// c2 = a2 + b2 − 2ab cos(C)
		// c = sqrt( a2 + b2 − 2ab cos(C) )

		double a = edgeLength;
		double b = edgeLength;
		double C = Math.toRadians(TRIANGLE_ANGLE_SHAPE_CENTER * 2);

		return Math.sqrt((a * a) + (b * b) - (2 * a * b * Math.cos(C)));
	}

	public int getEdgeLength() {
		return edgeLength;
	}

	public void setEdgeLength(int edgeLength) {
		this.edgeLength = edgeLength;
	}

}
