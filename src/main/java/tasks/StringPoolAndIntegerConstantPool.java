package tasks;

public class StringPoolAndIntegerConstantPool{
	

	public static void main(String[] args) {
		 String s1 = new String("abc");
		 String s2 = "abc";
		 
		 System.out.println(System.identityHashCode(s1));
		 System.out.println(System.identityHashCode(s1.intern()));
		 System.out.println(System.identityHashCode(s2));
		 System.out.println(System.identityHashCode(s2.intern()));

		 Integer i1 = new Integer(1);
		 Integer i2 = new Integer(1);
		 Integer i3 = 127;
		 Integer i4 = 127;
		 Integer i5 = 128;
		 Integer i6 = 128;

		 System.out.println(System.identityHashCode(i1));
		 System.out.println(System.identityHashCode(i2));
		 
		 System.out.println(System.identityHashCode(i3));
		 System.out.println(System.identityHashCode(i4));
		 
		 System.out.println(System.identityHashCode(i5));
		 System.out.println(System.identityHashCode(i6));
		 
	}

}
