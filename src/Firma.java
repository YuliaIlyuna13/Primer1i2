import java.sql.SQLOutput;
import java.util.Scanner;

class Sotrudnik{
    String im, fam, otch, dolj;
    int oklad;
}
public class Firma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Количество сотрудников");
        int count = sc.nextInt();
        sc.nextLine();
        Sotrudnik[] sotr = new Sotrudnik[count];
        System.out.println("Введите информацию о каждом сотруднике");
        for (int i = 0; i < count; i++) {
            sotr[i] = new Sotrudnik();
            System.out.println("Введите имя " + (i+1) + " сотрудника");
            sotr[i].im = sc.nextLine();
            System.out.println("Введите фамилию " + (i+1) + " сотрудника");
            sotr[i].fam = sc.nextLine();
            System.out.println("Введите отчество " + (i+1) + " сотрудника");
            sotr[i].otch = sc.nextLine();
            System.out.println("Введите должность " + (i+1) + " сотрудника");
            sotr[i].dolj = sc.nextLine();
            System.out.println("Введите оклад " + (i+1) + " сотрудника");
            sotr[i].oklad = sc.nextInt();
            sc.nextLine();
        }
        System.out.println( "\n Сотрудники фирмы:\n Фамилия \t Имя  \t Отчество \t Должность  \tОклад");
        for (int i = 0; i < sotr.length; i++) {
            System.out.println(sotr[i].im +  "\t" + sotr[i].fam +  "\t" + sotr[i].otch +  "\t" +
                    sotr[i].dolj+ "\t" + sotr[i].oklad);
        }
    }
}