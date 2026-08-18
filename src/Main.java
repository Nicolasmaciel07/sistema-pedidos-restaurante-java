import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidade de Hot: ");
        int qtdHot = scanner.nextInt();

        System.out.print("Quantidade de Yakisoba: ");
        int qtdYakisoba = scanner.nextInt();

        System.out.print("Quantidade de Sashimi: ");
        int qtdSashimi = scanner.nextInt();

        System.out.print("Quantidade de Temaki: ");
        int qtdTemaki = scanner.nextInt();

        System.out.print("Quantidade de Uramaki: ");
        int qtdUramaki = scanner.nextInt();

        double precoHot = 12.00;
        double precoYakisoba = 18.00;
        double precoSashimi = 15.00;
        double precoTemaki = 14.00;
        double precoUramaki = 13.00;

        double totalHot = qtdHot * precoHot;
        double totalYakisoba = qtdYakisoba * precoYakisoba;
        double totalSashimi = qtdSashimi * precoSashimi;
        double totalTemaki = qtdTemaki * precoTemaki;
        double totalUramaki = qtdUramaki * precoUramaki;
        double totalGeral = totalHot + totalYakisoba + totalSashimi + totalTemaki + totalUramaki;

        System.out.println("\n--- Resumo da conta ---");
        System.out.printf("Hot: %d x R$ %.2f = R$ %.2f\n", qtdHot, precoHot, totalHot);
        System.out.printf("Yakisoba: %d x R$ %.2f = R$ %.2f\n", qtdYakisoba, precoYakisoba, totalYakisoba);
        System.out.printf("Sashimi: %d x R$ %.2f = R$ %.2f\n", qtdSashimi, precoSashimi, totalSashimi);
        System.out.printf("Temaki: %d x R$ %.2f = R$ %.2f\n", qtdTemaki, precoTemaki, totalTemaki);
        System.out.printf("Uramaki: %d x R$ %.2f = R$ %.2f\n", qtdUramaki, precoUramaki, totalUramaki);
        System.out.printf("Total: R$ %.2f\n", totalGeral);

        System.out.println("\n--- O que gostou ---");
        System.out.println("Hot: " + qtdHot);
        System.out.println("Yakisoba: " + qtdYakisoba);

        System.out.println("\n--- O que não gostou ---");
        System.out.println("Sashimi: " + qtdSashimi);
        System.out.println("Temaki: " + qtdTemaki);
        System.out.println("Uramaki: " + qtdUramaki);

        String perfil = "";

        if (qtdHot == 0 && qtdYakisoba == 0 && qtdSashimi == 0 && qtdTemaki == 0 && qtdUramaki == 0) {
            perfil = "Nem comeu";
        }
        else if (qtdSashimi > 0 || qtdTemaki > 0 || qtdUramaki > 0) {
            perfil = "Aventureiro";
        }
        else {
            perfil = "Cauteloso";
        }

        System.out.println("\nPerfil: " + perfil);

        scanner.close();
    }
}