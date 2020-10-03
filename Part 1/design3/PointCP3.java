

public class PointCP3{
	//instance variables
	private double X;
	private double Y;
	
	//constructor
	
	public PointCP3(double X,double Y) {
		this.X = X;
		this.Y = Y;
	}
	
	//instance methods
	
	public double getX()
	  {
	    return X;
	  }
	  
	  public double getY()
	  {
	    return Y;
	  }
	  
	  public double getRho()
	  {
	      return (Math.sqrt(Math.pow(X, 2) + Math.pow(Y, 2)));
	  }
	  
	  public double getTheta()
	  {
	      return Math.toDegrees(Math.atan2(Y, X));
	  }
	  
	  public double getDistance(PointCP3 pointB)
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
	  public PointCP3 rotatePoint(double rotation)
	  {
	    double radRotation = Math.toRadians(rotation);
	    double X = getX();
	    double Y = getY();
	        
	    return new PointCP3(
	      (Math.cos(radRotation) * X) - (Math.sin(radRotation) * Y),
	      (Math.sin(radRotation) * X) + (Math.cos(radRotation) * Y));
	  }

	  /**
	   * Returns information about the coordinates.
	   *
	   * @return A String containing information about the coordinates.
	   */
	  public String toString()
	  {
	    return "Stored as Cartesian  (" + getX() + "," + getY() + ")";
	  }
	  
	  
	  
	  
	  
}