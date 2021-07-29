package tes_studi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean validate = false;
        String email = br.readLine();

        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+\\.+[a-z]+";

        if (email.matches(emailPattern)) {
            String []pisah = email.split("@");
            int length = pisah[1].length();
            if (pisah[0].length()<=20){
                if (String.valueOf(pisah[1].charAt(0)).equals(".")){
                    if (pisah[1].substring(length - 3).equals(".id")||pisah[1].substring(length - 6).equals(".co.id")){
                        validate = true;
                    }
                }
            }
        }
        System.out.println(validate);
    }
}
