/**
 * 
 */

/**
 * @author Hana Luong
 *
 */
public class Rectangle implements Shape {
	Number area = 0;

	@Override
	public Number calculateArea(Number length, Number width) {
		area = length.doubleValue() * width.doubleValue()/2;
		return area; 
	}
	@Override
	public void display(){
		System.out.println("The rectangle area is: " + area);
	}

}

