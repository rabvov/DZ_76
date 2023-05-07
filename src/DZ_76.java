import java.util.Scanner;

public class DZ_76 {
    public static void main(String[] args) {
        String name, lastName,age1;
        int age=-1;
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        lastName = scanner.next();
        age1 = scanner.next();
            for (int i = 0; i < 1;) {
                try {
                age=Integer.parseInt(age1);
                if (age>-1)
                    i++;
                if (age<0){
                    System.out.println("Возраст не может быть меньше 0");
                    age1=scanner.next();}
            } catch (NumberFormatException e) {
                    System.out.println("Введен некорректный возраст, попробуйте ввести возраст с помощью цифр");
                    age1=scanner.next();
                }
            }
        scanner.close();

        System.out.printf("Пользователя зовут %s %s. Его возраст - %d",name,lastName,age);


    }
}
