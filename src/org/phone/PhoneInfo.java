package org.phone;

public class PhoneInfo {

	public void phoneInformation() {
		// TODO Auto-generated method stub
System.out.println("This is about phone info");
	}
	public void phoneInformation(long a) {
		// TODO Auto-generated method stub
System.out.println("phoneinformation is" +a);
	}
	public void phoneInformation(int b) {
		// TODO Auto-generated method stub
System.out.println("Camera Mega pixel is" +b);
	}
	public void phoneInformation(float c) {
		// TODO Auto-generated method stub
System.out.println("storage"+c);
	}
	public void phoneInformation(String d, int a) {
		// TODO Auto-generated method stub
System.out.println("osName is " +d +a);
	}
	public static void main(String[] args) {
		PhoneInfo c=new PhoneInfo();
		c.phoneInformation();
		c.phoneInformation(987654321l);
		c.phoneInformation(48);
		c.phoneInformation(256.00f);
		c.phoneInformation("Android",10);
		
		
		
		
		
		
	}
}
