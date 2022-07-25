package d0725;

import java.io.*;

class BOJ10870 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.append(String.valueOf(solution(Integer.valueOf(br.readLine()))));
        bw.flush();
        bw.close();
        br.close();
    }

    public static int solution(int number) {
        return Fibo(number);
    }

    public static int Fibo(int number) {
        if (number == 0)
            return 0;
        if (number == 1)
            return 1;
        return Fibo(number - 1) + Fibo(number - 2);
    }
}