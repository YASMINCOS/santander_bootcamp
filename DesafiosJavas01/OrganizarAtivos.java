package DesafiosJavas01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OrganizarAtivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeAtivos = scanner.nextInt();
        scanner.nextLine(); 
        List<String> ativos = new ArrayList<>();

        for (int i = 0; i < quantidadeAtivos; i++) {
            String nomeAtivo = scanner.nextLine();
            ativos.add(nomeAtivo);
        }

        Collections.sort(ativos);

        for (String ativo : ativos) {
            System.out.println(ativo);
        }

        scanner.close();
    }
}
