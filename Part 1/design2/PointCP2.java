public class PointCP2{
	//instance variables
	private double Rho;
	private double Theta;
	
	//constructor
	public PointCP2(double Rho, double Theta) {
		this.Rho = Rho;
		this.Theta = Theta;
	}
	//instance methods
	//-----------------


	//Calculates cartesien X and returns it
	public double getX()
	  {
	      return (Math.cos(Math.toRadians(Theta)) * Rho);
	  }


	  //Calculates cartesian Y and returns it
	  public double getY()
	  {
	      return (Math.sin(Math.toRadians(Theta)) * Rho);
	  }

	  //Simply return Rho
	  public double getRho()
	  {
	    return Rho;
	  }
	  //Simply returns Theta
	  public double getTheta()
	  {
	    return Theta;
	  }

	/**
	 * Calculates the distance in between two points using the Pythagorean
	 * theorem  (C ^ 2 = A ^ 2 + B ^ 2). Not needed until E2.30.
	 *
	 * @param pointA The first point.
	 * @param pointB The second point.
	 * @return The distance between the two points.
	 */
	public double getDistance(PointCP pointB)
	{
		// Obtain differences in X and Y, sign is not important as these values
		// will be squared later.
		double deltaX = getX() - pointB.getX();
		double deltaY = getY() - pointB.getY();

		return Math.sqrt((Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
	}

	/**
	 * Rotates the specified point by the specified number of degrees.
	 * Not required until E2.30
	 *
	 * @param point The point to rotate
	 * @param rotation The number of degrees to rotate the point.
	 * @return The rotated image of the original point.
	 */
	public PointCP rotatePoint(double rotation)
	{
		double radRotation = Math.toRadians(rotation);
		double X = getX();
		double Y = getY();

		return new PointCP('C',
				(Math.cos(radRotation) * X) - (Math.sin(radRotation) * Y),
				(Math.sin(radRotation) * X) + (Math.cos(radRotation) * Y));
	}

	public String toString(){
		return "Stored as Polar (" + getRho() + "," + getTheta() + ")";
	}

	


}