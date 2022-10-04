package BTemploy;

public class entry {
    public static void main(String[] args) {
        IEmployee employee1 = new PartTimeEmployee("Nghia", 300000, 8);
        System.out.println("Name: " + employee1.getName());
        System.out.println("Luong moi ngay: " + employee1.calculateSalary());

        IEmployee employee2 = new FullTimeEmployee("Hoa", 100000000);
        System.out.println("Name: " + employee2.getName());
        System.out.println("Luong moi ngay: " + employee2.calculateSalary());
    }
}
