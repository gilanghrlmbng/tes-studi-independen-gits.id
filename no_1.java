package tes_studi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int bil = Integer.parseInt(br.readLine());

        if (bil % 3==0 && bil % 5 != 0){
            System.out.println("Hello");
        }else if (bil % 5==0 && bil % 3 != 0){
            System.out.println("World");
        }else if (bil % 3 == 0 && bil % 5 == 0){
            System.out.println("Hello World");
        }
    }
}
