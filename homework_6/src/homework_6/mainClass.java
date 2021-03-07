package homework_6;

public class mainClass {

	public static void main(String[] args) {

		hourly_worker hw = new hourly_worker();
		employee_monthly_salary ems = new employee_monthly_salary();

		hw.getSalary();
		ems.getSalary();

		hw.pay();
		ems.pay();

		System.out.println("-------another_option---------");

		salary[] sal = new salary[2];
		sal[0] = new hourly_worker();
		sal[1] = new employee_monthly_salary();

		for (int i = 0; i < sal.length; i++) {
			sal[i].getSalary();
			sal[i].pay();

		}

	}

}
