public class EmployeePayroll {
    public void processMonthlyPayroll(List<Employee> employees) {
        for (Employee e : employees) {
            double baseSalary = e.getBaseSalary();
            double bonus = e.getMonthlyBonus();
            double deductions = e.getMonthlyDeductions();
            double total = baseSalary + bonus - deductions;
            System.out.println("Employee: " + e.getName());
            System.out.println("Base: " + baseSalary);
            System.out.println("Bonus: " + bonus);
            System.out.println("Deductions: " + deductions);
            System.out.println("Total: " + total);
            System.out.println("----------");
        }
    }

    public void processAnnualPayroll(List<Employee> employees) {
        for (Employee e : employees) {
            double baseSalary = e.getBaseSalary() * 12;
            double bonus = e.getAnnualBonus();
            double deductions = e.getAnnualDeductions();
            double total = baseSalary + bonus - deductions;
            System.out.println("Employee: " + e.getName());
            System.out.println("Base: " + baseSalary);
            System.out.println("Bonus: " + bonus);
            System.out.println("Deductions: " + deductions);
            System.out.println("Total: " + total);
            System.out.println("----------");
        }
    }
}