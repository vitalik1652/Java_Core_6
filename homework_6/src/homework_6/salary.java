package homework_6;

public interface salary {

	void getSalary();

	default void pay() {
		System.out.println("You were thrown for money;");
	}

}
