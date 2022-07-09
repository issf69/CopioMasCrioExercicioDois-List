package copiomascrio.com.br;

import java.util.*;

/*
Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
6. "Prefere responder para juiz?"

Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" a 5 como "Assassina" prefere responder para juiz "IR A JULGAMENTO". Caso contrário, ele será classificado como "Inocente".
*/
public class CopioMasCrioExercicioDois {
    public static void main(String[] args) {
        List<String> respostas = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Perguntas: ");
        System.out.print("\nTelefonou para vitima? ");
        String resposta = scanner.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("Esteve no local do crime? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("Mora perto da vitima? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("Devia para vitima? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("Ja trabalhou com a vitima? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());
        System.out.println("Prefere responder para juiz? ");
        resposta =  scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.println(respostas);

        int count = 0;
        Iterator<String> contador = respostas.iterator();
        while(contador.hasNext()){
            String resp = contador.next();
            if(resp.contains("s")) {
                count ++;
            }
        }

        switch(count) {
            case 2:
                System.out.println(">> SUSPEITA <<"); break;
            case 3:
            case 4:
                System.out.println(">> CÚMPLICE <<"); break;
            case 5:
                System.out.println(">> ASSASSINO <<"); break;
            default:
                System.out.println(">> INOCENTE <<"); break;
            case 6:
                System.out.println(">> IR A JULGAMENTO <<"); break;
        }
    }
}