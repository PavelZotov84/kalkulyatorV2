class Result {
    int x;
    int y;
    String znak;
    int res;

    Result(int x, int y, String znak) {
         this.x=x;
         this.y=y;
         this.znak = znak;
    }

    String resAr() {
        if(znak.equals("+")){res= x+y;  return ("out: " + res);}
        if(znak.equals("-")){res= x-y;  return ("out: " + res);}
        if(znak.equals("*")){res= x*y;  return ("out: " + res);}
        if(znak.equals("/")){res= x/y;  return ("out: " + res);}
        return "";
    }
}
