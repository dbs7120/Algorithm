package d202207.d26;

import java.io.*;
import java.util.*;

class BOJ1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = 0;
        while ((input = Integer.valueOf(br.readLine())) != 0)
            bw.append(solution(input)).append("\n");

        bw.flush();
        bw.close();
        br.close();

    }


    public static String solution(int number) {
        String str = String.valueOf(number);
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return "no";
            }
        }
        return "yes";
    }
}


