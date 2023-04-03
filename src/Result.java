class Result {
    int x;
    int y;
    String znak;

    Result(int x, int y, String znak) {
        this.x = x;
        this.y = y;
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
