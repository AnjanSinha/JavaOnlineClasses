public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(-1));
    }
    public static boolean isPerfectNumber(int number){
        if (number>1){
            int sum = 0;
            for (int i=1; i<=number/2; i++){
                if (number%i == 0){
                    sum +=i;
                }
            }
            if (sum==number){
                return true;
            }
        }
        return false;
    }
}
