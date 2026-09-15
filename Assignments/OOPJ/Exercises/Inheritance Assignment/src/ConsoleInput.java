
public class ConsoleInput {
	
	int getInt() {
		return Integer.parseInt(getString());
	}
	
	float getFloat() {
		return Float.parseFloat(getString());
	}
	
	boolean getBool() {
		return Boolean.parseBoolean(getString());
	}
	
	String getString() {
	try {
	byte[] arrInput = new byte[100];
	int length = System.in.read(arrInput);
	byte[] finalarr = new byte[length-2];
	System.arraycopy(arrInput,0,finalarr,0,length-2);
	String  strobj = new String(finalarr);
	return strobj;
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	return null;
	}
	
}
