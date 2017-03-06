package polymorphismMethodOverriding;

public class TestMethod {

	public static void main(String args[]) {
		BaseClass obj2 = new DerivedClass();
		obj2.methodToOverride();
	}
}
