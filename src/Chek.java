class Chek {
    public int num1;
    public int num2;
    private String line;
    public String zn;
    public String rom1;
    public String rom2;

    Chek(String line) {
        this.line = line;
    }


    String[] parse() {
        String[] mas = line.split(" ");
        return mas;
    }

    int romOrArab(String[] x) {
        String arab = "1,2,3,4,5,6,7,8,9,10";
        String rome = "I,II,III,IV,V,VI,VII,VIII,IX,X";

        try {
            if (arab.contains(x[0]) && arab.contains(x[2])) {
                num1 = Integer.parseInt(parse()[0]);
                num2 = Integer.parseInt(parse()[2]);
                zn = parse()[1];
                return 1;

            } else if (rome.contains(x[0]) && rome.contains(x[2])) {
                rom1 = parse()[0];
                rom2 = parse()[2];
                zn = parse()[1];
                return 2;

            } else {
                System.out.println("Ошибка ввода,вводимые числа должны быть в диапазоне от 1 до 10 включительно и" +
                        " принадлежать к одной системе счисления.");
                System.exit(0);
            }
            return 0;
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("строка не является математической операцией");
            System.exit(0);
        }
return 0;
    }

    public String getZn() {
        return zn;
    }

    int convertorRomtoArab(String a) {
        switch (a) {
            case "I":
                return 1;
            case "II":
                return 2;
            case "III":
                return 3;
            case "IV":
                return 4;
            case "V":
                return 5;
            case "VI":
                return 6;
            case "VII":
                return 7;
            case "VIII":
                return 8;
            case "IX":
                return 9;
            case "X":
                return 10;
            default:
                break;
        }
        return 0;
    }

    String convertorArabtoRom(int b) {
        int d = b / 10;
        int e = b % 10;
        String des[] = {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC", "C"};
        String ed[] = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        try {
            if (d < 1) {
                return ed[e - 1];
            } else if (d > 0 && e > 0) {
                return des[d - 1] + ed[e - 1];
            } else if (d > 0 && e < 1) {
                return des[d - 1];
            }
        }
        catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("В римских цифрах не существует нуля и отрицательных чисел");
            System.exit(0);
        }
        return "0";
    }
}


