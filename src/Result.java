class Result {
    int x;
    int y;
    String znak;

    Result(int x, int y, String znak) {
     if   (x<=10)this.x = x;
     else {System.out.println("ошибка ввода,первое число больше 10");
         System.exit(0);
     }

        if   (y<=10)this.y = y;
        else {System.out.println("ошибка ввода,второе число больше 10");
            System.exit(0);
        }

        this.znak = znak;
    }

    String res() {
        if(znak.equals("+"))  return ("out: " + (x+y));
        if(znak.equals("-"))  return ("out: " + (x-y));
        if(znak.equals("*"))  return ("out: " + (x*y));
        if(znak.equals("/"))  return ("out: " + (x/y));
        return "";
    }
}
