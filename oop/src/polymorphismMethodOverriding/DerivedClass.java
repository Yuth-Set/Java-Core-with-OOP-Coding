package polymorphismMethodOverriding;

public class DerivedClass extends BaseClass{

	public void methodToOverride() {
		super.methodToOverride();
		System.out.println("I'm the method of DerivedClass");
	}
}
