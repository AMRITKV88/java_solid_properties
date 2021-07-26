package LSP_Issue;

public class Area {
	
//	public static void main(String[] args) {
//		
//		Rectangle objRect = new Rectangle();
//		objRect.setLength(2);
//		objRect.setWidth(4);
//		int area = objRect.getArea();
//		System.out.println("The area is : " + area);
//	}
	
	public static void main(String[] args) {
		
		Rectangle objRect = new Square();
		objRect.setLength(4);
		objRect.setWidth(2);
		int area = objRect.getArea();
		System.out.println("The area is : " + area);
	}

}
