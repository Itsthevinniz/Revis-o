import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        int cont = 0;
        String matricula;
        Aluno [] lista = new Aluno[100];

        do{
            System.out.print("\033[H\033[2J");
            System.out.flush(); 

            System.out.println("1 - Adicionar novo aluno");
            System.out.println("2 - Listar todos os alunos");
            System.out.println("3 - Consultar aluno por matrícula");
            System.out.println("4 - Adicionar nota ao aluno");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();

                if(opcao == 1){
                    Aluno aluno = new Aluno();
                    System.out.println("Insira respectivamente nome, CPF e Matrícula do aluno.");
                    aluno.setNome(sc.next());
                    aluno.setCpf(sc.next());
                    aluno.setMatricula(sc.next());
                    lista [cont] = aluno;
                    cont++;
                }

                else if(opcao == 2){
                    if(lista[0] != null){
                    for (Aluno aluno : lista) {
                            if(aluno != null){
                                System.out.println(aluno);
                            }
                        }
                    }
                    else{   
                        System.out.println("A lista não possui cadastro.");
                    }
                    sc.next();

                }

                else if(opcao == 3){
                    Boolean achou = false;
                    System.out.println("Informe a matrícula do aluno:");
                    matricula = sc.next();
                    for (Aluno aluno : lista) {
                        if(aluno != null && matricula .equals(aluno.getMatricula())){
                            System.out.println(aluno);
                            achou = true;
                        }
                    }
                    if(!achou){
                        System.out.println("Matrícula não encontrada.");
                    }
                    sc.next();
                }

                else if(opcao == 4){
                    System.out.println("Informe a matrícula do aluno:");
                    matricula = sc.next();
                    for (Aluno aluno : lista) {
                        if(aluno != null && matricula .equals(aluno.getMatricula())){
                            System.out.println("Informe a matéria e a nota do aluno:");
                            Nota nota = new Nota();
                            nota.setMateria(sc.next());
                            nota.setValor(sc.nextDouble());
                            aluno.setNota(nota);
                        }
                    }
                    sc.next();
                }

                else if(opcao == 0){
                    System.out.println("Programa finalizado.");
                }

                else{
                    System.out.println("Número invalido, tente novamente.");
                }
        }while(opcao != 0);

        
    }
}
