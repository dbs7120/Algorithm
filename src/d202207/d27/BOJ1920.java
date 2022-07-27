package d202207.d27;

import java.io.*;
import java.util.*;

public class BOJ1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            numbers[i] = Integer.parseInt(st.nextToken());

        int M = Integer.parseInt(br.readLine());
        int[] check = new int[M];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++)
            check[i] = Integer.parseInt(st.nextToken());

        int[] answer = solution(N, M, numbers, check);
        for (int e : answer)
            bw.append(String.valueOf(e)).append("\n");

        bw.flush();
        bw.close();
        br.close();

    }


    public static int[] solution(int N, int M, int[] numbers, int[] check) {
        int[] answer = new int[M];
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < N; i++)
            set.add(numbers[i]);
        for (int i = 0; i < M; i++)
            if (set.contains(check[i]))
                answer[i] = 1;

        return answer;
    }
}
