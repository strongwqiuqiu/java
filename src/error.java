public class error {
    public static void main(String[] args) {
        double a = 0.625;
        String s = "0.";
        StringBuilder stringBuilder = new StringBuilder("0.");
        while (a > 0){
            a = a * 2;
            int c = (int)a;
            stringBuilder.append(c);
            a = a - c;
        }

        if (stringBuilder.length() > 30){
            stringBuilder.replace(0,stringBuilder.length(),"ERROR");
        }
        System.out.println(stringBuilder.toString());
    }
}
