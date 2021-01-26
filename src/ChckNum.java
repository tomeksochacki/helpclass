class ChckNum {
    public boolean isEven(int x){
        if ((x%2) == 0) return true;
        return false;
    }
}

class ParmDemo{
    public static void main(String[] args) {
        ChckNum chckNum1 = new ChckNum();
        if (chckNum1.isEven(10)) System.out.println(10 + " is even");
        if (chckNum1.isEven(3)) System.out.println(3 + " is even");
    }
}
