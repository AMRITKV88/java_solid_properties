package LSP_Solved;

public class Square extends ShapeNew
{
	
	protected int length;
	
	Square(int length){
		
		this.length = length;
	}

	public int getArea() {
		return length * length;
	}
}
