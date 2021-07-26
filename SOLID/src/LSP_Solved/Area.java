package LSP_Solved;

public class Area {
	
	public static void main(String[] args) {
		
//		Shape objRect = new Rectangle(2,81);
//		int areaRect = objRect.getArea();
//		System.out.println("The area of Rectnagle is : " + areaRect);
		
		ShapeNew objSquare = new Square(4);
		int areaSquare = objSquare.getArea();
		System.out.println("The area of the Square is : " + areaSquare);
	}
}
