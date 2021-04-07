/**
 * 
 */

/**
 * @author Hana Luong
 *
 */
public class Circle implements Shape {
	
	Number area = 0;

	@Override
	public Number calculateArea(Number radius, Number unused) {
		area = Math.PI * radius.doubleValue() * radius.doubleValue();
		return area; 
	}
	@Override
	public void display(){
		System.out.println("The circle area is: " + area);
	}

}
