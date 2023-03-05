import java.net.Inet4Address;

public class change {
    public static void main(String[] args) {
        int A = 29;
        int B = 15;
        int cnt = 0;
        String s = Integer.toBinaryString((A ^ B));
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1'){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
