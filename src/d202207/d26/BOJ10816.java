package d202207.d26;

import java.io.*;
import java.util.*;

class BOJ10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int N = Integer.valueOf(br.readLine());
        int[] cards = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            cards[i] = Integer.valueOf(st.nextToken());

        int M = Integer.valueOf(br.readLine());
        int[] resultCardList = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++)
            resultCardList[i] = Integer.valueOf(st.nextToken());

        int[] result = solution(N, M, cards, resultCardList);
        for (int e : result)
            bw.append(e + " ");

        bw.flush();
        bw.close();
        br.close();

    }


    public static int[] solution(int N, int M, int[] cards, int[] resultCardList) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[M];

        for (int i = 0; i < N; i++)
            map.put(cards[i], map.getOrDefault(cards[i], 0) + 1);

        for (int i = 0; i < M; i++)
            result[i] = map.getOrDefault(resultCardList[i], 0);

        return result;

    }

}


