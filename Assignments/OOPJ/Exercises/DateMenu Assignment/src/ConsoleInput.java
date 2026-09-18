
public class ConsoleInput {
	
	int getInt() {
		return Integer.parseInt(getString());
	}
	
	String getString() {
	try {
		byte[] arrInput = new byte[100];
		int length = System.in.read(arrInput);
		byte[] finalArray = new byte[length-2];
		System.arraycopy(arrInput,0,finalArray,0,length-2);
		String strObject = new String(finalArray);
		return strObject;
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	return null;
	}
	
}
