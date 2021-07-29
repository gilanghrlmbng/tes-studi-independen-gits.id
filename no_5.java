package tes_studi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String kalimat,dibalik="";
        kalimat = br.readLine();
        for (int i = kalimat.length()-1;i>= 0;i--){
            dibalik = dibalik + kalimat.charAt(i);

        }
        if (kalimat.equalsIgnoreCase(dibalik)){
            System.out.println("True");
        }else {
            System.out.println("False");

        }
    }
}
