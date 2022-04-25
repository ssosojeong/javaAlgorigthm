package section7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exam1 {
    public static void DFS(int N){
        if(N==0){
            return;
        }

        DFS(N-1);
        System.out.print(N + " ");
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        DFS(N);
    }
}
