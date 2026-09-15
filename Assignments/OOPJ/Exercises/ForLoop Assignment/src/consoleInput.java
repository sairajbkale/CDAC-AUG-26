
public class consoleInput {
		
		int getInt() {
			return Integer.parseInt(getString());
		}
		
		float getFloat() {
			return Float.parseFloat(getString());
		}
	
	
		String getString(){
		try {
		byte[] arrInput = new byte[100];
		int length = System.in.read(arrInput);
		byte[] arrInput2 = new byte[length-2];
		System.arraycopy(arrInput,0,arrInput2,0,length-2);
		String objString = new String(arrInput2);
		return objString;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
		}
}