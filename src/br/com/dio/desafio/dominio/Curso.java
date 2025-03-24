package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso() {
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        if (cargaHoraria > 0) { // Verifica se a carga horária é válida
            this.cargaHoraria = cargaHoraria;
        } else {
            throw new IllegalArgumentException("Carga horária deve ser maior que zero.");
        }
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

    // Novo metodo para verificar se a carga horária é válida
    public boolean isCargaHorariaValida() {
        return cargaHoraria > 0;
    }
}