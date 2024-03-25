import java.util.Scanner;

public class calculateSalary {

    public static double salary(int employeDaysPerMonth,double employeSalary,int employeHours,int employeDays,int employeVacation) {
        double employeHourSalary = employeSalary / employeDaysPerMonth;
        double result =  employeHourSalary * (employeHours * ((employeDays * 4) - employeVacation));
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Let's start calculating what is the salary of an employe.");

        System.out.println("What is the employe's name?");
        Scanner inputName = new Scanner(System.in);
       String employeName = inputName.next();

       System.out.println("How many hours per month should " + employeName + " work?");
        Scanner inputDaysPerMonth = new Scanner(System.in);
       int employeDaysPerMonth = inputDaysPerMonth.nextInt();

       System.out.println("What is the employe's salary?");
        Scanner inputSalary = new Scanner(System.in);
       double employeSalary = inputSalary.nextDouble();

       System.out.println("How many hours does " + employeName + " work per day?");
       Scanner inputHours = new Scanner(System.in);
       int employeHours = inputHours.nextInt();

       System.out.println("How many days does " + employeName + " work per week?");
       Scanner inputDays = new Scanner(System.in);
       int employeDays = inputDays.nextInt();

       System.out.println("Did " + employeName + " take any vacation days? If yes, how many? If not, write 0.");
       Scanner inputVacation = new Scanner(System.in);
       int employeVacation = inputVacation.nextInt();

        double employeFinalSalary = salary(employeDaysPerMonth,employeSalary,employeHours,employeDays,employeVacation);

        // Limitando o resultado para duas casas decimais
        String formattedSalary = String.format("%.2f", employeFinalSalary);

        System.out.println("The salary of " + employeName + " is: " + formattedSalary);
        
        inputName.close();
        inputDaysPerMonth.close();
        inputSalary.close();
        inputHours.close();
        inputDays.close();
        inputVacation.close();
    }
}
