public class casting{
    public static void main(String[] args){
        int myint = 9;
        
        double mydouble = myint; //automatic casting - wide casting
        int x = (int) mydouble; //manual casting - narrow casting
        System.out.println(myint); //prints the integer variable.
        System.out.println(mydouble); //prints the double variable.
        System.out.println(x); //prints the double variable by converting into int value.
    }
}
