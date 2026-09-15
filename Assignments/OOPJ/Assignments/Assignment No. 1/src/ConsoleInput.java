public class ConsoleInput {

    static int getInteger() {

        return Integer.parseInt(getString());
    }

    static float getFloat() {

        return Float.parseFloat(getString());
    }

    static String getString() {

        try {

            byte[] arrInput = new byte[100];

            int length = System.in.read(arrInput);

            String objString = new String(arrInput, 0, length).trim();

            return objString;
        }

        catch(Exception e) {

            e.printStackTrace();
        }

        return null;
    }
}