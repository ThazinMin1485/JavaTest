package myoperatortest;

public class TernaryOperators {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int x = 15;
        int y = 40;
        int z = 80;
        int maximumNumber = (x > y) ? (x > z ? x : z) : (y > z ? y : z);
        System.out.println("Largest Number is " + maximumNumber);
    }

}
