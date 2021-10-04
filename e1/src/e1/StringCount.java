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
        StringTokenizer passwordt = new StringTokenizer(password);
        if (passwordt.countTokens()>=8){

        }else{
            return false;
        }
    }
}
