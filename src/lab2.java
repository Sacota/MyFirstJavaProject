public class lab2 {
    public static void main(String[] args) {
        System.out.println(sum(3,4));
        System.out.println(sub(8,6));
        System.out.println(mult(4,5));
        System.out.println(divide(8,4));


    }
        static int sum (int first, int second){

        int result = first + second;
        return result;
    }

        static float sub(float first, float second){
        float result=first - second;
        return result;

    }
    static float mult(float first, float second){
        float result=first*second;
        return result;
    }
    static double divide (double first, double second){
        double result= first/second;
        return result;
    }


}



