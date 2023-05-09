public class Aluno extends Pessoa {
    private String matricula;
    private Nota nota;

    public Nota getNota() {
        return nota;
    }

    public void setNota(Nota nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        String texto = " ";
        texto += "Nome: " + nome;
        texto += " - CPF: " + cpf;
        texto += " - Matricula: " + matricula;
        if(nota != null){
            texto += " - Nota: " + nota;
        }
        return texto;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double calcularMedia(){
        return 0;
    }
}
