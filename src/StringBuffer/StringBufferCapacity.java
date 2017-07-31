package StringBuffer;

public class StringBufferCapacity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * declaring StringBuffer
		 */
		StringBuffer strBff = new StringBuffer();
		/**
		 *  In here calling capacity method of StringBuffer.
		 *  Default capacity of StringBuffer is 16 
		 */
		System.out.println("Default capacity");
		System.out.println(strBff.capacity());
		/**
		 * In here appending a sting "ACADGILD" number of character is 8
		 * which is not exceeding the the default capacity of StringBuffer 
		 * which is 16.
		 * thats mean the output will be 16 again.
		 */
		System.out.println("String character not exceeding the the default capacity");
		strBff.append("ACADGILD");
		// In here again checking capacity method of StringBuffer.
		System.out.println(strBff.capacity());
		/**
		 * In here again appending a sting "Work at ACADGILD".
		 * now the default capacity 16 of StringBuffer is exceeding.
		 */
		System.out.println("String of character is exceeding");
		strBff.append("Work at ACADGILD");
		/**
		 * now the capacity of StringBuffer will increase 16 to 34
		 * ( defaultCapacity*2)+2
		 */
		System.out.println(strBff.capacity());
		
		
	}

}
