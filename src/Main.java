public class Main {
    public static void main(String[] args) {
        tasck1();
        task2();
    }

    public static void tasck1() {

        System.out.println("Задание 1");
        String firstName = "Семён ";
        String middleName = "Семёнович ";
        String lastName = "Иванов ";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        System.out.println("Задание 2");
        String capitalLetters = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + capitalLetters);

        System.out.println("Задание 3");

        if (fullName.contains("ё")) {
            fullName = fullName.replace("ё", "e");
            System.out.println("Данные ФИО сотрудника — " + fullName);
        } else {
            System.out.println("Данные ФИО сотрудника — " + fullName);
        }
    }

    static public void task2() {

        System.out.println("Задание 5");
        String fullName = "Ivanov Ivan Ivanovich";
        int a = fullName.indexOf(" ");
        int b = fullName.indexOf(" ", a + 1);

        String lastName = fullName.substring(0,a);
        String firstName = fullName.substring(a + 1, b);
        String middleName = fullName.substring(b + 1);
        System.out.println("Имя сотрудника — " + firstName + "\nФамилия сотрудника — " + lastName + "\nОтчество сотрудника — " + middleName);

        System.out.println("Задание 6");
        fullName = "ivanov ivan ivanovich";
        String newS = "";
        boolean toUpper =  true;
        for(char ss : fullName.toCharArray()) {
            if(toUpper) {
                newS += "" + Character.toUpperCase(ss);
                toUpper = false;
            } else {
                newS += "" + ss;
            }
            if(ss == ' ') {
                toUpper = true;}
        }
        System.out.println("Верное написание Ф. И. О. сотрудника с заглавных букв — " + newS);
    }
}