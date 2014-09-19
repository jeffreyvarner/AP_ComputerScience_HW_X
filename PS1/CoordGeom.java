
import java.util.Scanner;

/**	This class will take the coordinates of any two points
 * and calculate the slope of the line, the length of the line, the 
 * midpoint, and the minimum x-coordinate of all the point
 * 
 * @author Christian Varner
 * @version 9/18/14
 */

public class CoordGeom 
{

	public static void main(String[] args) 
	{
		double[] midpoint_array;
		double x = 0.0;
		double x2 = 0.0;
		double y = 0.0;
		double y2 = 0.0;
		
		Scanner sc = new Scanner (System.in);
		
		// Ask the user for two points (x,y) and (x2,y2)
		// However, we need to check to make sure they don't enter
		// crazy data ...
		System.out.println("Enter the value of x:" );
		boolean loop_flag = true;
		do 
		{
			while (!sc.hasNextDouble())
			{
				System.out.println("Ooops! Please enter a numerical value for x:");
				sc.next();
			}
			
			x = sc.nextDouble();
			loop_flag = false;
			
		} while (loop_flag);
		
		System.out.println("Enter the value of y: ");
		loop_flag = true;
		do 
		{
			while (!sc.hasNextDouble())
			{
				System.out.println("Ooops! Please enter a numerical value for y:");
				sc.next();
			}
			
			y = sc.nextDouble();
			loop_flag = false;
			
		} while (loop_flag);
		
		System.out.println("Enter the value of x2: ");
		loop_flag = true;
		do 
		{
			while (!sc.hasNextDouble())
			{
				System.out.println("Ooops! Please enter a numerical value for x2:");
				sc.next();
			}
			
			x2 = sc.nextDouble();
			loop_flag = false;
			
		} while (loop_flag);
		
		System.out.println("Enter the value of y2: ");
		loop_flag = true;
		do 
		{
			while (!sc.hasNextDouble())
			{
				System.out.println("Ooops! Please enter a numerical value for y2:");
				sc.next();
			}
			
			y2 = sc.nextDouble();
			loop_flag = false;
			
		} while (loop_flag);
		
		System.out.println("\n");
		System.out.println("------------------------------------------------------------");
		System.out.println("Compute data for P1 = ("+x+","+y+") and P2 = ("+x2+","+y2+")");
		System.out.println("The length is: "
								+ getLength(x, x2, y, y2));
		System.out.println("The minimum x-coordinate of all points: "
								+ getMinimumXCoord(x,y));
		midpoint_array = getMidpoint(x, x2, y, y2);
		System.out.println("The midpoint is: ("
									+ midpoint_array[0] + "," + midpoint_array[1] +")");
		
		if( x2 - y == 0)
		{
			System.out.println("Slope is undefined");
		}
		else
		{	
			System.out.println("The slope is: "
								  + getSlope(x, x2, y, y2));	
		}
		System.out.println("------------------------------------------------------------");
	}
	
	/** This method is used to calculate the length
	 * of the line.
	 * 
	 * @param x User-defined point.
	 * @param x2 User-defined point.
	 * @param y2 User-defined point,
	 * @param y User-defined point.
	 * @return Returns the result of the length equation.
	 */
	public static double getLength(double x, double x2, double y2, double y)
	{
		double temp = 0.0;
		double result = 0.0;
	    temp = Math.pow((x - x2), 2) + Math.pow((y - y2), 2);
		result = Math.sqrt(temp);
	    
		return result;
	}
	
	
	/** This method, getSlope is used to calculate the
	 * slope of the line.
	 * 
	 * @param x User-defined point.
	 * @param x2 User-defined point.
	 * @param y User-defined point.
	 * @param y2 User-defined point.
	 * @return Returns the result of the slope equation
	 */
	public static double getSlope(double x, double x2, double y, double y2)
	{
		double result = 0.0;
		result = (y2 - y) / (x2 - x);	
		
		return result;
	}
	
	
	/** This method, getMidpoint is used to calculate 
	 * the midpoint of the line.
	 * 
	 * @param x User-defined point
	 * @param x2 User-defined point
	 * @param y  User-defined point
	 * @param y2 User-defined point
	 * @return Returns an array with the points on it.
	 */
	public static double[] getMidpoint(double x, double x2, double y, double y2)
	{
		double[] result_array = new double[2];
		double xmidpoint = 0.0;
		double ymidpoint = 0.0;
		
		
		xmidpoint = (x2 + x)/2;
        ymidpoint = (y2 + y)/2;
		result_array[0] = xmidpoint;
		result_array[1] = ymidpoint;
		
        return result_array;
	}
	
	
	/** This method is used to calculate 
	 * the minimum x-coordinate of the line.
	 * 
	 * @param x User-defined point
	 * @param x1 User-defined point
	 * @return Returns the minimum x-coordinate
	 */
	public static double getMinimumXCoord(double x, double x2)
	{
		if ( x <= x2 )
		{
			return x;
		}
		else
		{
			return x2;
		}	
	}
}
