package emp;

public class Company {

	public static void main(String[] args) {
		Employee[] em = new Employee[2];
		em[0] = new Secretary("Duke", 1, "secretary", 800);
		em[1] = new Sales("Tuxi", 2, "sales", 1200);
		printEmployee(em, false);
		((Bonus)em[0]).incentive(100);
		((Bonus)em[1]).incentive(100);
		System.out.println();
		System.out.println("[인센티브 100 지급]");
		printEmployee(em, true);
	}

	public static void printEmployee(Employee[] emp, boolean isTax) {
		System.out.println("name\tdepartment\tsalary" + (isTax ? "\ttax" : "") + "\textra pay");
		System.out.println("-----------------------------------------------");

		for (Employee em : emp) {

			System.out.println(em.getName() + "\t" + em.getDepartment() + "\t" + (em instanceof Sales ? "\t" : "")
					+ em.getSalary() + (isTax ? "\t" + em.tax() : "")
					+ (em instanceof Sales ? "\t" + ((Sales) em).getExtraPay() : ""));

			
		}
	}

}
