public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        String str = input.vvod().toUpperCase();
        System.out.println(calc(str));
    }

    public static String calc(String input){

        Chek chek = new Chek(input);
        int ra=chek.romOrArab(chek.parse());
        if (ra==1) {
            Result result= new Result(chek.num1, chek.num2, chek.zn);
            return result.resAr();
        }

        if (ra==2) {
            Result result= new Result(chek.convertorRomtoArab(chek.rom1), chek.convertorRomtoArab(chek.rom2), chek.zn);
            result.resAr();
            return "out: "+ chek.convertorArabtoRom(result.res);
        }
        else return "error";
    }
}
