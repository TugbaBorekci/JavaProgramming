package day08_ifStatements;

public class SalaryCalculator {
    public static void main(String[] args) {
        int hourlyRate = 65,
            weeklyHours = 40;  // 2.ye data turunu yazmadik 1.ile ayni data turu olunca 1.nin sonuna, koyunca 2.ninde ayni data turu oldugunu gosteriyor

    double stateTaxRate = 0,
            federalTaxRate = 26.2;// 2.ye data turunu yazmadik 1.ile ayni data turu olunca 1.nin sonuna, koyunca 2.ninde ayni data turu oldugunu gosteriyor

    //-------------------------------------------------
//formula:
        int salaryBeforeTax = hourlyRate * weeklyHours * 52;//salary is equal to one week salary *52
        double stateTax = salaryBeforeTax * stateTaxRate / 100;//
        double federalTax = salaryBeforeTax * federalTaxRate / 100;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salaryBeforeTax - totalTax;

        System.out.println("Gross pay is : $" + salaryBeforeTax);
        System.out.println("State tax = $" + stateTax );
        System.out.println("Federal tax = $" + federalTax);
        System.out.println("Total tax = $" + totalTax );
        System.out.println("Net income = $" + salaryAfterTax);


    }
}
