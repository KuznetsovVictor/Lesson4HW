package geek.lesson4.hw;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Ivanov Ivan Ivanovich", "engineer", "9150564432", 50000, 55);
        System.out.println(employee.getId() + ") " +"New employee " + employee.getFio() + " his position " + employee.getPosition());
        System.out.println(employee.increaseSalary());

        System.out.println("\n");

        Employee employeeArray1 = new Employee("Petrov Konstantin Ivanovich", "konsultant", "9208464432", 35000, 44);
        Employee employeeArray2 = new Employee("O Kim He", "konsultant", "9208485432", 67000, 52);
        Employee employeeArray3 = new Employee("Vasilieva Olga Vitalievna", "buhgalter", "9807564432", 44000, 56);
        Employee employeeArray4 = new Employee("Kim Robert Chan", "Specialist", "9208464432", 28000, 19);
        Employee employeeArray5 = new Employee("Kim Anastasiya Valerievna", "direktor", "9208464432", 41500, 33);
        Employee[] setArray = {employeeArray1, employeeArray2, employeeArray3, employeeArray4, employeeArray5};


        for (int i = 0; i < setArray.length; i++) {
            if (setArray[i].getAge() > 40) {
                System.out.println(setArray[i].getId() +") " + setArray[i].getFio() + " " + setArray[i].getAge());
            }
        }
        System.out.println("\n");

        double countSalary = 0;
        double countAge = 0;
        for (int i = 0; i < setArray.length; i++) {
            countSalary += setArray[i].getSalary();
            countAge += setArray[i].getAge();
            }
        System.out.println(countSalary/setArray.length);
        System.out.println(countAge/setArray.length + "\n");

        }

}
