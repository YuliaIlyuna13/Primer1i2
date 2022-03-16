import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

class SotrudnikWC{
    String im, fam, otch, dolj;
    int countChild;
    Child[] childrens = null;
}
class Child{
    String name;
    int age;
}
public class Sotrudnik2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Количество сотрудников");
        int count = sc.nextInt();
        sc.nextLine();
        SotrudnikWC[] sotr = new SotrudnikWC[count];
        System.out.println("Введите информацию о каждом сотруднкие");
        for (int i = 0; i < count; i++) {
            sotr[i] = new SotrudnikWC();
            System.out.println("Введите имя " + (i+1) + " сотрудника");
            sotr[i].im = sc.nextLine();
            System.out.println("Введите фамилию " + (i+1) + " сотрудника");
            sotr[i].fam = sc.nextLine();
            System.out.println("Введите отчество " + (i+1) + " сотрудника");
            sotr[i].otch = sc.nextLine();
            System.out.println("Введите должность " + (i+1) + " сотрудника");
            sotr[i].dolj = sc.nextLine();
            System.out.println("Введите количество детей " + (i+1) + " сотрудника");
            sotr[i].countChild = sc.nextInt();
            sc.nextLine();
            if(sotr[i].countChild!=0){
                sotr[i].childrens = new Child[sotr[i].countChild];
                for (int j = 0; j < sotr[i].countChild; j++) {
                    sotr[i].childrens[j] = new Child();
                    System.out.println("Введите имя ребенка");
                    sotr[i].childrens[j].name = sc.nextLine();
                    System.out.println("Введите возраст ребенка");
                    sotr[i].childrens[j].age = sc.nextInt();
                    sc.nextLine();
                }
            }
        }
        System.out.println( "Сотрудники фирмы: \n фам \t имя \t отч \t должность \t Количество детей");
        for (int i = 0; i < sotr.length; i++) {
            System.out.println(sotr[i].im + "\t" + sotr[i].fam + "\t" + sotr[i].otch + "\t" +
                    sotr[i].dolj+ "\t" + sotr[i].countChild);
            if(sotr[i].countChild!=0) {
                System.out.println( "имя \t возраст ребенка");
                for (int j = 0; j < sotr[i].countChild; j++) {
                    System.out.println(sotr[i].childrens[i].name + "\t" + sotr[i].childrens[j].age);
                }
            }
        }
    }
}