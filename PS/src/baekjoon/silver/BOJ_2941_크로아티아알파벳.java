package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2941_크로아티아알파벳 {

    private static String str;
    private static int cnt;
    private static char ch;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (ch == 'c') {
                if (i < str.length() - 1) {
                    if (str.charAt(i + 1) == '=') {
                        i++;
                    } else if (str.charAt(i + 1) == '-') {
                        i++;
                    }
                }
            } else if (ch == 'd') {
                if (i < str.length() - 1) {
                    if (str.charAt(i + 1) == 'z') {
                        if (i < str.length() - 2) {
                            if (str.charAt(i + 2) == '=') {
                                i += 2;
                            }
                        }
                    } else if (str.charAt(i + 1) == '-') {
                        i++;
                    }
                }
            } else if (ch == 'l') {
                if (i < str.length() - 1) {
                    if (str.charAt(i + 1) == 'j') {
                        i++;
                    }
                }
            } else if (ch == 'n') {
                if (i < str.length() - 1) {
                    if (str.charAt(i + 1) == 'j') {
                        i++;
                    }
                }
            } else if (ch == 's') {
                if (i < str.length() - 1) {
                    if (str.charAt(i + 1) == '=') {
                        i++;
                    }
                }
            } else if (ch == 'z') {
                if (i < str.length() - 1) {
                    if (str.charAt(i + 1) == '=') {
                        i++;
                    }
                }
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}
