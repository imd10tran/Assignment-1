
/**
 * This class stores both cartesian and polar coordinates at the same time, 
 * and provides functionality for calculating distance. Based on class PointCP.
 *
 * @author Katada 
 * 
 */
public class PointCP4 {
	// Instance variables ************************************************

	/**
	 * Contains the x coordinate in cartesian
	 */
	private double x;

	/**
	 * Contains y coordinate in cartesian
	 */

	private double y;

	/**
	 * Contains the rho of the polar coordinates
	 */

	private double rho;

	/**
	 * Contains the theta of the polar coordinates
	 */
	private double theta;

	// Constructors ******************************************************

	/**
	 * Constructs a coordinate using cartesian coordinates.
	 * Type: Type of parameters being passed
	 * 'c' = cartesian, polar otherwise
	 * 
	 * X: Can also be rho  (if using polar)
	 * Y: Can also be theta (if using polar, degrees)
	 * 
	 * @param type
	 * @param x
	 * @param y
	 */
	public PointCP4(char type, double x, double y) {
		
		if(type != 'C' && type != 'P') {
			throw new IllegalArgumentException("Invalid Parameters!");
		}
		
		
		if(type == 'C') {
		this.x = x;
		this.y = y;

		this.rho = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		this.theta = Math.toDegrees(Math.atan(x / y));
		}else if(type == 'P'){
			this.rho = x;
			this.theta = y;

			this.x = rho * Math.cos(Math.toRadians(theta));
			this.y = rho * Math.sin(Math.toRadians(theta));
		}
	}



	// Instance methods **************************************************

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getRho() {
		return rho;
	}

	
	/**
	 * Returns theta in degrees
	 * @return
	 */
	public double getTheta() {
		return theta;
	}


	/**
	 * Calculates the distance in between two points using the Pythagorean theorem
	 * (C ^ 2 = A ^ 2 + B ^ 2). Not needed until E2.30.
	 *
	 * @param pointA The first point.
	 * @param pointB The second point.
	 * @return The distance between the two points.
	 */
	public double getDistance(PointCP4 pointB) {
		// Obtain differences in X and Y, sign is not important as these values
		// will be squared later.
		double deltaX = getX() - pointB.getX();
		double deltaY = getY() - pointB.getY();

		return Math.sqrt((Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
	}

	/**
	 * Rotates the specified point by the specified number of degrees. Not required
	 * until E2.30
	 *
	 * @param point    The point to rotate
	 * @param rotation The number of degrees to rotate the point.
	 * @return The rotated image of the original point.
	 */
	public PointCP4 rotatePoint(double rotation) {
		double radRotation = Math.toRadians(rotation);
		double X = getX();
		double Y = getY();

		return new PointCP4('C', (Math.cos(radRotation) * X) - (Math.sin(radRotation) * Y),
				(Math.sin(radRotation) * X) + (Math.cos(radRotation) * Y));
	}

	/**
	 * Returns information about the coordinates.
	 *
	 * @return A String containing information about the coordinates.
	 */
	public String toString() {
		return "The coordinates stored are: [Cartesian: (" + x + " , " + y + ")]"
				+ " [Polar: (" + rho + " , " + theta + ")]";
	}
}
