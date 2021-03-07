package homework_6;

public class employee_monthly_salary implements salary {

	@Override
	public void getSalary() {

		int SalaryForMonth = 5000;
		System.out.println("Salary employee for month = " + SalaryForMonth + "$");

	}

	@Override
	public void pay() {
		salary.super.pay();
	}

}
