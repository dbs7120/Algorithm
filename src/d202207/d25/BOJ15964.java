package d202207.d25;

import java.io.*;

class BOJ15964 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        bw.append(String.valueOf(solution(Long.valueOf(input[0]), Long.valueOf(input[1]))));
        bw.flush();
        bw.close();
        br.close();
    }

    public static long solution(long A, long B) {
        return (A + B) * (A - B);
    }
}