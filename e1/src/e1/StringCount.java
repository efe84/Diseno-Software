package e1;

import java.util.Locale;
import java.util.*;

public class StringCount {

    public static int countWords(String text) {
        if(text == null){
            return 0;
        }
        text.trim();
        String Datos[] = text.split(" ");
        int cnt = 0;
        for(int i = 0; i<Datos.length; i++){
            Datos[i].trim();
            if(Datos[i].length()==0){
                continue;
            }
            cnt++;
        }
        return cnt;

    }

    public static int countChar(String text,char c){
        int cnt = 0, pos;
        if(text == null){
            return 0;
        }
        pos = text.indexOf(c);
        while(pos!=-1){
            cnt++;
            pos = text.indexOf(c, pos + 1);
        }
        return cnt;
    }

    public static int countCharIgnoringCase(String text,char c){
        int cnt = 0, pos1,pos2;
        if(text == null){
            return 0;
        }
        String textb = text.toLowerCase();
        String textc = text.toUpperCase();
        pos1 = textb.indexOf(c);
        pos2 = textc.indexOf(c);
        while (pos1 != -1){
            cnt++;
            pos1 = textb.indexOf(c,pos1+1);
        }
        while (pos2 != -1){
            cnt++;
            pos2 = textc.indexOf(c,pos2+1);
        }

        return cnt;
    }

    public static boolean isPasswordSafe(String password) {
        char[] c = password.toCharArray();
        int cnt1 = 0, cnt2 = 0, cnt3 = 0, cnt4 = 0;
        if (password.length() < 8) {
            return false;
        } else {
            for (int i = 0; i < c.length; i++) {
                if (!Character.isUpperCase(c[i])) {
                    cnt1++;
                }}
            if(cnt1>= c.length){
                return false;
            }
            else {
                for (int j = 0; j < c.length; j++) {
                    if (!Character.isLowerCase(c[j])) {
                        cnt2++;
                    }}
                if(cnt2>= c.length) {
                    return false;
                }
                else {
                    for (int k = 0; k < c.length; k++) {
                        if (!Character.isDigit(c[k])) {
                            cnt3++;
                        }}
                    if(cnt3>= c.length) {
                        return false;
                    }
                    else {
                        for (int d = 0; d < c.length; d++) {
                            if (!(c[d] == '?' || c[d] == '@' || c[d] == '#' || c[d] == '$' || c[d] == '.' || c[d] == ',')) {
                                cnt4++;
                            }}
                        if(cnt4>= c.length) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
    }
}
