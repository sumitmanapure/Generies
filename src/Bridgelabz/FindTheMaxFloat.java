package Bridgelabz;

public class FindTheMaxFloat {
    public static Float compareTo(Float a,Float b,Float c)
    {
        if (a > b && a > c) {
            return a;
        } else if (b > c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        FindTheMaxFloat s = new FindTheMaxFloat();
        System.out.println("max Number for 1st test case="+s.compareTo(5.7f,3.2f,2.5f));//Test case 1 :given max number for 1st position.
        System.out.println("max Number for 2nd test case="+s.compareTo(2.8f,6.5f,3.9f));//Test case 2:given max number for 2nd position.
        System.out.println("max Number for 3rd test case="+s.compareTo(1.5f,2.5f,3.9f));//Test case 3:given max number for the 3rd position.
    }
}

