// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println("Задание 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = firstName + ' ' + middleName + ' ' + lastName;
        System.out.println("Ф.И.О. сотредника - " + fullName);

    // Task 2
        System.out.println(" ");
        System.out.println("Задание 2");
        System.out.println("Данные сотрудника для заполнения отчета - " + fullName.toUpperCase());

        // Task 3
        System.out.println(" ");
        System.out.println("Задание 3");
        String fullNameRussian = "Иванов Семён Иванович";
        System.out.println("Данные сотрудника для заполнения отчета - " + fullNameRussian.replace('ё', 'е'));
    }
}