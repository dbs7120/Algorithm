package d202207.d27;

import java.io.*;

import java.util.*;

class BOJ10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int K = Integer.parseInt(br.readLine());
        int[] numbers = new int[K];

        for (int i = 0; i < K; i++)
            numbers[i] = Integer.parseInt(br.readLine());

        int answer = solution(K, numbers);
        bw.append(String.valueOf(answer)).append("\n");

        bw.flush();
        bw.close();
        br.close();

    }


    public static int solution(int K, int[] numbers) {
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < K; i++) {
            int number = numbers[i];
            if (number != 0)
                st.push(number);
            else
                st.pop();
        }
        while (!st.isEmpty())
            answer += st.pop();
        return answer;
    }

}

