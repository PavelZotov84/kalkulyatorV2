class Chek {
    private  int num1;
    private  int num2;
    private String line;
    public String zn;

    Chek(String line) {
        this.line = line;
    }




    String[] parse() {
        String[] mas = line.split(" ");
        return mas;
    }

    int romOrArab(String [] x) {
        String arab = "1,2,3,4,5,6,7,8,9,10";
        String rome = "I,II,III,IV,V,VI,VII,VIII,IX,X";

        if (arab.contains(x[0]) && arab.contains(x[2])) {
            System.out.println("Арабская система счисления");
            return 1;
        }

        else if (rome.contains(x[0]) && rome.contains(x[2])) {
            System.out.println("Римская система счисления");
            return 2;
        }
        else {
            System.out.println("Error-ошибка,введенные числа должны быть в диапазоне от 1 до 10 включительно и" +
                    " принадлежать к одной системе счисления.");
        }
        return 0;
    }
    public String getZn() {
        return zn;
    }

}
