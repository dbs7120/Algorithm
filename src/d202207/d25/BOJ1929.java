package d202207.d25;

import java.io.*;

class BOJ1929 { // need to fix d0725.Main
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        bw.append(solution(Integer.valueOf(input[0]), Integer.valueOf(input[1])));
        bw.flush();
        bw.close();
        br.close();
    }

    public static String solution(int M, int N) {
        StringBuilder sb = new StringBuilder();
        for (int i = M; i <= N; i++) {
            if (isPrime(i)) {
                sb.append(i).append("\n");
            }
        }
        return sb.toString();
    }

    private static boolean isPrime(int number) {
        if (number == 1)
            return false;
        for (int i = 2; i <= (int) Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}