class Factor {
    public boolean isFactor(int x, double y){
        if ((x%y) == 0) return true;
        return false;
    }
}

class IsFactor{
    public static void main(String[] args) {
        Factor factor1 = new Factor();
        if (factor1.isFactor(3, 7)) System.out.println("3 is factor");
        else System.out.println("3 isn't factor");
        if (factor1.isFactor(4, 8)) System.out.println("4 is factor");
        else System.out.println("4 isn't factor");
    }
}
