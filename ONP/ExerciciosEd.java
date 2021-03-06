package exercicios.ed;
import java.util.Scanner;


class Pilha {

    private static char car[];
    private static int tam;
    private static int topo;

    public Pilha() {
        tam = 100;
        car = new char[tam];
        topo = -1;
    }

    public Pilha(int tam) {
        this.tam = tam;
        car = new char[tam];
        topo = -1;
    }

    public static boolean vazia() {
        if (topo == -1) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean cheia() {
        if (topo == (tam - 1)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean push(char exp) {
        if (cheia()) {
            return false;
        }
        topo++;
        car[topo] = exp;
        return true;
    }

    public static char pop() {
        if (vazia()) {
            return 'N';
        }
        char exp = car[topo];
        topo--;
        return exp;
    }




    public static void main(String[] args) {
        int quantidade;

        Pilha pilha = new Pilha();
        char alg;
        Scanner s = new Scanner(System.in);
        quantidade = s.nextInt() + 1;
        String in;
        String out = new String();
        String fall[] = new String[quantidade];
        for (int c = 0; c < quantidade; c++) {
            in = s.nextLine();
            out = "";
            for (int i = 0; i < in.length(); i++) {

                alg = in.charAt(i);
                if (alg == '(') {
                    continue;
                } else if (alg == '+') {
                    pilha.push(alg);
                } else if (alg == '-') {
                    pilha.push(alg);
                } else if (alg == '*') {
                    pilha.push(alg);
                } else if (alg == '/') {
                    pilha.push(alg);
                } else if (alg == '^') {
                    pilha.push(alg);
                } else if (alg == ')') {
                    out = out + pilha.pop();
                } else {
                    out = out + alg;
                }

            }
            System.out.print(out + "\n");
        }

    }

}