public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        String str = input.vvod();
        System.out.println(calc(str));
    }

    public static String calc(String input){
        Chek chek = new Chek(input);
String res= Integer.toString(chek.romOrArab(chek.parse()));
    return res;

    //    Result result = new Result(chek.getNum1(), chek.getNum2(), chek.getZn());
     //   return result.res();
    }
}
