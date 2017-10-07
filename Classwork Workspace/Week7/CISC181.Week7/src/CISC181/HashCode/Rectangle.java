package CISC181.HashCode;

public class Rectangle {

	public int iWidth;
	public int iLength;
	public Rectangle(int iWidth, int iLength) {
		super();
		this.iWidth = iWidth;
		this.iLength = iLength;
	}
	public int getiWidth() {
		return iWidth;
	}
	public void setiWidth(int iWidth) {
		this.iWidth = iWidth;
	}
	public int getiLength() {
		return iLength;
	}
	public void setiLength(int iLength) {
		this.iLength = iLength;
	}
/*	@Override
	public int hashCode() {
		
		return 1;
	}*/
	
}
