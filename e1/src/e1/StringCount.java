package e1;

import java.util.Locale;

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
        int cnt = 0, pos,n=0,i=0;
        if(text == null){
            return 0;
        }
        String textominusculas[] = text.split("");
        while (n< textominusculas.length){
            textominusculas[n] = textominusculas[n].toLowerCase();
            n++;
        }
        while (i< textominusculas.length){
            if(textominusculas[i] == c){

            }
            i++;
        }
        while(pos!=-1){
            cnt++;
            pos = textominusculas.indexOf(c, pos + 1);
        }
        return cnt;


    }

    public static boolean isPasswordSafe(String password){
        char ch;
        int cntlength;
        int cntuc = 0, cntlc = 0, cntdig = 0, cntchar = 0;


        if(password.length()<8){
            return false;
        }else{
            for(int n = 0; n<=password.length(); n++){
                if(Character.isUpperCase(password.charAt(n))){
                    cntuc++;
                }
            }
            if(cntuc<1){
                return false;
            } else{
                for(int n = 0; n<=password.length(); n++) {
                    if (Character.isLowerCase(password.charAt(n))) {
                     cntlc++;
                    }
                }
                if(cntlc<1){
                    return false;
                } else{
                    for(int n = 0; n<=password.length(); n++) {
                        if (Character.isDigit(password.charAt(n))) {
                            cntdig++;
                        }
                    }
                    if(cntdig<1){
                        return false;
                    }else{

                    }
                }
            }


        }

        return true;
    }
}
