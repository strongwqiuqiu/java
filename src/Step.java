public class Step {
    public static void main(String[] args) {
        int num = 16;
        int step = 0;
        while(num != 0){
            if (num % 2 == 0){
                num /= 2;
            }else {
                num -= 1;
            }
            step++;
        }
        System.out.println(step);
    }
}
