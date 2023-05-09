public class Nota {
    private String materia;
    private double valor;

    @Override
    public String toString() {
        String texto = " ";
        texto += "Matéria: " + materia;
        texto += " - Valor: " + valor;
        return texto;
    }


    public String getMateria() {
        return materia;
    }
    public void setMateria(String materia) {
        this.materia = materia;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
}
