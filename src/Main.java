import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args){
        Scanner menuScan = new Scanner(System.in);
        System.out.println("Библиотека");
        System.out.println(
                "1.Регистрация книги.\n" +
                "2.Книги в библиотеке.\n"+
                "3.Удаление книги по указаному жанру\n"
        );

        int inputMenuScan = menuScan.nextInt();

        switch (inputMenuScan){
            case 1:
                Actions.writeBook();
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.out.println("Введите число от 1 до 3");
                break;
        }


    }
}

class Actions{

    static void writeBook() {
        try(BufferedWriter  bw= new BufferedWriter(new FileWriter("D:\\IntelliJIDEA projects\\Library\\Books Library\\books.txt"))){
            String text ="Hello world19";
            bw.append(text).flush();

        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

}