public class Main {
    public static void main(String[] args) {

        int x =2;
        while (x>1){
            if (checkPrime(x)){
                System.out.print(" "+x);
            }
            x++;
            if (x>100)break;
        }
    }
    public static boolean checkPrime(int numb){
        boolean flag = true;
        for(int i = 2; i < Math.sqrt(numb);i++){
            if (numb%i==0) {
                flag= false;
                break;
            }
        }return flag;
    }
}