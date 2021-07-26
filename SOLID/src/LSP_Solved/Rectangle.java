package LSP_Solved;

public class Rectangle implements Shape {
	
	protected int width;
	protected int length;

	Rectangle(int width, int length){
		this.length = length;
		this.width = width;
	}
	
	@Override
	public int getArea()
	{
		return width*length;
	}
}
