import java.util.Scanner;

class Input {
    String vvod(){
        System.out.println("Введите пример с арабскими или римскими числами от 1 до 10 включительно через пробел : ");
        Scanner sc = new Scanner(System.in);
        return  sc.nextLine();
    }
}
