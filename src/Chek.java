class Chek {
    private  int num1;
    private  int num2;
    private String line;
    public String zn;

    Chek(String line){
        this.line = line;
    }
    Chek(){}



    void cheking(){
        String [] mas= line.split(" ");

            num1=Integer.parseInt(mas[0]);
            num2=Integer.parseInt(mas[2]);
            zn=mas[1];
            System.out.println(num1+zn+num2);
    }
    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public String getZn() {
        return zn;
    }
}
