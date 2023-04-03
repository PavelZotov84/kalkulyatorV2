public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        String str = input.vvod();
        System.out.println(calc(str));
    }

    public static String calc(String input){
      //  System.out.println("вы ввели- "+input);
        Chek chek = new Chek(input);
        chek.cheking();
        Result result = new Result(chek.getNum1(), chek.getNum2(), chek.getZn());
        return result.res();
    }
}
