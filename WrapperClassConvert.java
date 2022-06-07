package coreassignment;

public class WrapperClassConvert {
   
	public static void main(String[] args) {
		int i = 10;
		
		System.out.println(convertToWrapper(10));
	}

public static Object convertToWrapper(Object primitive){
		
		if(primitive instanceof Integer) {
			Integer in = (Integer) primitive;
			return in;
		}
		else if(primitive instanceof Character) {
				Character ch = (Character) primitive;
				return ch;
				
			}
		else if(primitive instanceof Byte) {
				Byte by = (Byte) primitive;
				return by;
			}
		
		else if(primitive instanceof Short) {
				Short sh = (Short) primitive;
				return sh;
			}
		else if(primitive instanceof Long) {
				Long l = (Long) primitive;
				return l;
			}
		else if(primitive instanceof Float) {
				Float f = (Float) primitive;
				return f;
				}
		else if(primitive instanceof Double) {
				Double d = (Double) primitive;
				return d;
			}
		else if(primitive instanceof Boolean) {
				Boolean boo = (Boolean) primitive;
				return boo;
			}
		else if(primitive == null) {
			System.out.println("Give proper primitive as input");
		}
		else
			{
			System.out.println("Give proper primitive as input");
			}
		
		return null;
	}
}
