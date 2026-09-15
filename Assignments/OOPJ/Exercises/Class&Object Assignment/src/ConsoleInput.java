
public class ConsoleInput{
	
	public int getInt() {
		return Integer.parseInt(getString());
	}
	
	public float getFloat() {
		return Float.parseFloat(getString());
	}
	
	public double getDouble() {
		return Double.parseDouble(getString());
	}
	
	public String getString() {
	try {
	byte[] arrInput = new byte[100];
	int length = System.in.read(arrInput);
	byte[] finalInput = new byte[length-2];
	System.arraycopy(arrInput,0,finalInput,0,length-2);
	String strobj = new String(finalInput);
	return strobj;
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	return null;
	}
}
