package encapsulations;

public class EncapsTest{
	public static void main(String[] args) {
		EncapsulationDemo obj = new EncapsulationDemo();
		obj.setEmpName("Mario");
		obj.setEmpAge(33);
		obj.setEmpSSN(1112233);
		System.out.println("Employee Name: "+ obj.getEmpName());
		System.out.println("Employee Age: "+ obj.getEmpAge());
		System.out.println("Employee SSN: "+ obj.getEmpSSN());
	}
}
