package questao1;

public class Main {
    public static void main(String[] args) {

        System.out.println(descriptografar("1-HOME-SWEET-HOME MY-MISERABLE-JOB"));
        System.out.println(descriptografar("MY LOVE"));
    }

    public static String descriptografar(String expressao){
        String telefone = "";

        for(int i = 0; i < expressao.length(); i++){
            char c = expressao.charAt(i);

            if(Character.isLetter(c)){
                c = letraEmNumero(c);
            }
            telefone += c;

        }
        return telefone;
    }


    private static char letraEmNumero(char c) {

        c = Character.toUpperCase(c);

        switch (c){
            case 'A':
            case 'B':
            case 'C':
                c = '2';
                break;
            case 'D':
            case 'E':
            case 'F':
                c = '3';
                break;
            case 'G':
            case 'H':
            case 'I':
                c = '4';
                break;
            case 'J':
            case 'K':
            case 'L':
                c = '5';
                break;
            case 'M':
            case 'N':
            case 'O':
                c = '6';
                break;
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
                c = '7';
                break;
            case 'T':
            case 'U':
            case 'V':
                c = '8';
                break;
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                c = '9';
                break;


        }

        return c;
    }

}
