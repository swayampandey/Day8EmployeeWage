package EmpWage;

public class EmpWage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome to employee Wage Computation");
		System.out.println();
		int employeePresent=1;
		int ispresent = (int) (Math.floor(Math.random()*10)%2);
		if(ispresent == employeePresent)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");

	}

}
