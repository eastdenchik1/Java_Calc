package Base;

public class Base {

    // Declare Lexems
    final private int NONE = 0;
    final private int DELIMETER = 1;
    final private int VARIABLE = 2;
    final private int NUMBER = 3;

    // Errors
    final int SYNTAXERROR = 0;
    final int UNBALPARENS = 1;
    final int NOEXP = 2;
    final int BIVBYZERO = 3;

    final String EOF = "\0";

    private String exp;
    private String token;
    private int explds;
    private int tokType;

    public String toString(){
        return String.format("Exp: {0}\nexplds: {1}\nToken: {2}\nTokType: {3}",
                exp.toString(), explds, token.toString(), tokType);
    }

    private boolean isDelim(char charAt){
        if ((" +-/*%^=()".indexOf(charAt)) != -1) {
            return true;
        }
        return false;
    }

    private void getToken() {
        tokType = NONE;
        token = "";

        if (explds == exp.length()) {
            token = EOF;
            return;
        }

        while (explds < exp.length() && Character.isWhitespace(exp.charAt(explds))){
            ++ explds;
        }

        if (explds == exp.length()) {
            token = EOF;
            return;
        }

        if (isDelim(exp.charAt(explds))){
            token += exp.charAt(explds);
            explds ++;
            tokType = DELIMETER;
        } else if (Character.isLetter(exp.charAt(explds))) {
            while (!isDelim(exp.charAt(explds))) {
                token += exp.charAt(explds);
                explds ++;
                if (explds >= exp.length()) {
                    break;
                }
                tokType = VARIABLE;
            }
        } else if (Character.isDigit(exp.charAt(explds))) {
            while (!isDelim(exp.charAt(explds))) {
                token += exp.charAt(explds);
                explds ++;
                if (explds >= exp.length()) {
                    break;
                }
                tokType = NUMBER;
            }
        } else {
            token = EOF;
            return;
        }

    }



}
