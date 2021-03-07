package homework_6;

public class hourly_worker implements salary {

	@Override
	public void getSalary() {
		int SalaryForAnHour = 20;
		int HoursAdays = 8;
		int WorkingDays = 20;

		int a = SalaryForAnHour;
		int b = HoursAdays;
		int c = WorkingDays;

		int SalaryForMonth = a * b * c;

		System.out.println("Salary employee hourly worker = " + SalaryForMonth + "$");

	}

	@Override
	public void pay() {
		System.out.println("Good job, you be receiving a promotion;");

	}

}
