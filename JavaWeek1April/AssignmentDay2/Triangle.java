/**
 * 
 */

/**
 * @author Hana Luong
 *
 */
public class Triangle implements Shape {
	Number area = 0;

	@Override
	public Number calculateArea(Number height, Number base) {
		area = height.doubleValue() * base.doubleValue()/2;
		return area; 
	}
	@Override
	public void display(){
		System.out.println("The triangle area is: " + area);
	}

}
