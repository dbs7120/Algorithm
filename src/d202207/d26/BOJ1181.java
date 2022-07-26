package d202207.d26;

import java.io.*;
import java.util.*;

class BOJ1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.valueOf(br.readLine());
        String[] words = new String[N];

        for (int i = 0; i < N; i++)
            words[i] = br.readLine();

        words = solution(N, words);
        for (String word : words)
            bw.append(word + "\n");

        bw.flush();
        bw.close();
        br.close();

    }


    public static String[] solution(int N, String[] words) {
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < N; i++)
            set.add(words[i]);

        String[] result = set.toArray(new String[0]);
        Arrays.sort(result, (o1, o2) -> {
            if (o1.length() == o2.length()) {
                return o1.compareTo(o2);
            } else {
                return o1.length() - o2.length();
            }
        });

        return result;

    }

}


