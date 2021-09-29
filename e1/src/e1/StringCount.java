package e1;

public class StringCount {

    public static int countWords(String text){
        char ch;
        int cnt = 0;

        if(text == null){
            return 0;
        }else{
            for (int n = 0;n<=text.length();n++){
                ch = text.charAt(n);
                if(ch == ' '){
                    cnt++;
                }
            }
            return cnt;
        }

    }

    public static int countChar(String text,char c){
        char ch;
        int cnt = 0;

        if(text == null){
            return 0;
        }else{
            for (int n = 0;n<=text.length();n++){
                ch = text.charAt(n);
                if(ch == c){
                    cnt++;
                }
            }
            return cnt;
        }

    }

    public static int countCharIgnoringCase(String text,char c){
        char ch;
        int cnt = 0;

        char d = Character.toLowerCase(c);
        char C = Character.toUpperCase(c);
        if (text == null){
            return 0;
        }else {
            for (int n = 0; n <= text.length(); n++) {
                ch = text.charAt(n);
                if (ch == d || ch == C) {
                    cnt++;
                }
            }
            return cnt;
        }
    }

    public static boolean isPasswordSafe(String password){
        char ch;
        int cntlength;
        int cntuc;
        int cntlc;
        int cntdig;
        int cntchar;


        return true;
    }
}
