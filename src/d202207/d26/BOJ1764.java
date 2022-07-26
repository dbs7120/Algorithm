package d202207.d26;

import java.io.*;
import java.util.*;

class BOJ1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.valueOf(st.nextToken());
        int M = Integer.valueOf(st.nextToken());
        String[] namesA = new String[N];
        String[] namesB = new String[M];

        for (int i = 0; i < N; i++)
            namesA[i] = br.readLine();

        for (int i = 0; i < M; i++)
            namesB[i] = br.readLine();

        ArrayList<String> answer = solution(N, M, namesA, namesB);
        bw.append(answer.size() + "\n");
        for (String name : answer)
            bw.append(name + "\n");

        bw.flush();
        bw.close();
        br.close();

    }


    public static ArrayList<String> solution(int N, int M, String[] namesA, String[] namesB) {
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < N; i++)
            map.put(namesA[i], map.getOrDefault(namesA[i], 0) + 1);
        for (int i = 0; i < M; i++)
            map.put(namesB[i], map.getOrDefault(namesB[i], 0) + 1);

        for (String str : map.keySet())
            if (map.get(str) == 2)
                result.add(str);

        Collections.sort(result);
        return result;

    }

}


