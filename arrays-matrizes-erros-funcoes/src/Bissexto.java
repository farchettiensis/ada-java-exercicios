import java.util.Scanner;

public class Bissexto {
    public static void main(String[] args) {
        /*
        Crie um enum chamado MesAno representando os meses do
        ano.
        Escreva uma função que recebe um mês como entrada e
        ano, utilize um Scanner para obter um ano e o mês
        escolhido.
        A função deve imprimir a quantidade de days no mês e
        considerar se o ano é bissexto.
        */
        Scanner scanner = new Scanner(System.in);
        int year;
        String month;

        System.out.println("Ano: ");
        year = Integer.parseInt(scanner.nextLine());

        System.out.println("Mês: ");
        month = scanner.nextLine().toUpperCase();

        checkLeapYear(year, month);
    }

    public static void checkLeapYear(int year, String month) {
        int days = 0;
        MesAno monthInYear = null;
        boolean isLeapYear = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        monthInYear = switch (month) {
            case "JANEIRO" -> MesAno.JANEIRO;
            case "FEVEREIRO" -> MesAno.FEVEREIRO;
            case "MARCO" -> MesAno.MARCO;
            case "ABRIL" -> MesAno.ABRIL;
            case "MAIO" -> MesAno.MAIO;
            case "JUNHO" -> MesAno.JUNHO;
            case "JULHO" -> MesAno.JULHO;
            case "AGOSTO" -> MesAno.AGOSTO;
            case "SETEMBRO" -> MesAno.SETEMBRO;
            case "OUTUBRO" -> MesAno.OUTUBRO;
            case "NOVEMBRO" -> MesAno.NOVEMBRO;
            case "DEZEMBRO" -> MesAno.DEZEMBRO;
            default -> monthInYear;
        };
        
        switch (monthInYear) {
            case JANEIRO, MARCO, MAIO, JULHO, AGOSTO, OUTUBRO, DEZEMBRO -> days = 31;
            case ABRIL, JUNHO, SETEMBRO, NOVEMBRO -> days = 30;
            case FEVEREIRO -> days = isLeapYear ? 29 : 28;
            case null -> {
                System.out.println("Mês inválido.");
            }
        }

        if (isLeapYear) {
            System.out.printf("O ano de %d é bissexto.%n", year);
        } else {
            System.out.printf("O ano de %d não é bissexto.%n", year);
        }
        if (monthInYear != null) System.out.printf("O mês de %s no ano %d tem %d dias.%n", month, year, days);
    }
}

enum MesAno {
    JANEIRO,
    FEVEREIRO,
    MARCO,
    ABRIL,
    MAIO,
    JUNHO,
    JULHO,
    AGOSTO,
    SETEMBRO,
    OUTUBRO,
    NOVEMBRO,
    DEZEMBRO;
}