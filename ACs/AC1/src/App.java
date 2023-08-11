public class App {
    public static void main(String[] args) throws Exception {
        apNotas(8.5,7.5,9.5);
        nums();
        ePrimo(11);
        diaSemana(5);
        eBissexto(1900);
    }

    public static void apNotas(double ap1, double ap2, double ac) {
        double media = (ap1 + ap2) * 0.4 + ac * 0.2;
        System.out.println(media);
    }

    public static void nums() {
        int x;
        for (x = 150; x <= 200; x++) {
            System.out.print(x + " ");
        }
    }

    public static void ePrimo(int num) {
        System.out.println();
        boolean éPrimo = true;
        String divisores = "";

        if (num <= 1) {
            éPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    éPrimo = false;
                    divisores += i + " ";
                }
            }
        }

        if (éPrimo) {
            System.out.println(num + " é um número primo.");
        } else {
            System.out.println(num + " não é um número primo. Ele é divisível por: " + divisores);
        }
    }

    public static void diaSemana(int num) {
        switch (num) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Valor inválido");
            }

        /*
        if (num == 1 || num == 8 || num == 15 || num == 22 || num == 29) {
            System.out.println("Domingo");
        } else if (num == 2 || num == 9 || num == 16 || num == 23 || num == 30) {
            System.out.println("Segunda");
        } else if (num == 3 || num == 10 || num == 17 || num == 24 || num == 31) {
            System.out.println("Terça");
        } else if (num == 4 || num == 11 || num == 18 || num == 25) {
            System.out.println("Quarta");
        } else if (num == 5 || num == 12 || num == 19 || num == 26) {
            System.out.println("Quinta");
        } else if (num == 6 || num == 13 || num == 20 || num == 27) {
            System.out.println("Sexta");
        } else if (num == 7 || num == 14 || num == 21 || num == 28) {
            System.out.println("Sábado");
        }else {
            System.out.println("Número Inválido");
        }
        */

        }

    public static void eBissexto(int ano) {
        if (ano % 4 == 0) {
            if(ano % 100 == 0 && ano % 400 != 0) {
                System.out.println(ano + " não é bissexto");
            } else {
                System.out.println(ano + " é bissexto.");
            }
        } else {
            System.out.println(ano + " não é bissexto");
        }
    }
}
