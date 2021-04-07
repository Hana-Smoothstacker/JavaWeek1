
public class ShapeTest {

	public static void main(String[] args) {
		Rectangle myRec = new Rectangle();
		Circle myCirc = new Circle();
		Triangle myTria = new Triangle();
		myRec.calculateArea(4,5);
		myRec.display();
		myCirc.calculateArea(2,0);
		myCirc.display();
		myTria.calculateArea(3,4);
		myTria.display();
	}

}
