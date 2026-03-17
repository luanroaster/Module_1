package ss6_method;

public class B6_3 {
    static void main(String[] args) {
        System.out.println(Sum(5));
        System.out.println(Square(5));
        System.out.println(Sum3(5));
        System.out.println(Sum5(5));
        System.out.println(Sum6(5));
    }

    public static int Sum (int n){
       int sum = 0;
        for (int i = 0; i<= n ; i++){
            sum += i;
        }
        return sum;
    }
    public static int Square(int n){
        int square = 0;
        for (int i = 1; i<= n ; i++){
            square += i * i ;
        }
        return square;
    }
    public static double Sum3( int n){
        double sum = 0;
        for(int i = 1; i <= n; i++){
            sum += (double) 1/i;
        }
        return sum;
    }


    public static int Sum5( int n){
        int sum = 1;
        for(int i = 1; i <= n; i++){
            sum *= i ;
        }
        return sum;
    }

    public static int Sum6( int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += Sum5(i) ;
        }
        return sum;
    }

}
