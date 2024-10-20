package br.com.alura.screenmatch.model;

import java.util.OptionalDouble;

public class Serie {

    private String titulo;
    private String Ano;
    private Integer totalTemporadas;
    private Double avalicao;
    private Categoria genero;
    private String atores;
    private String poster;
    private String sinopse;

    public Serie(DadosSerie dadosSerie) {
        this.titulo = dadosSerie.titulo();
        this.Ano = dadosSerie.Ano();
        this.totalTemporadas = dadosSerie.totalTemporadas();
        this.avalicao = OptionalDouble.of(Double.valueOf(dadosSerie.avalicao())).orElse(0);
        this.genero = Categoria.fromString(dadosSerie.genero().split(",")[0].trim());
        this.atores = dadosSerie.atores();
        this.poster = dadosSerie.poster();
        this.sinopse = dadosSerie.sinopse();
    }

    

    /**
     * @return String return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return String return the Ano
     */
    public String getAno() {
        return Ano;
    }

    /**
     * @param Ano the Ano to set
     */
    public void setAno(String Ano) {
        this.Ano = Ano;
    }

    /**
     * @return Integer return the totalTemporadas
     */
    public Integer getTotalTemporadas() {
        return totalTemporadas;
    }

    /**
     * @param totalTemporadas the totalTemporadas to set
     */
    public void setTotalTemporadas(Integer totalTemporadas) {
        this.totalTemporadas = totalTemporadas;
    }

    /**
     * @return Double return the avalicao
     */
    public Double getAvalicao() {
        return avalicao;
    }

    /**
     * @param avalicao the avalicao to set
     */
    public void setAvalicao(Double avalicao) {
        this.avalicao = avalicao;
    }

    /**
     * @return Categoria return the genero
     */
    public Categoria getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(Categoria genero) {
        this.genero = genero;
    }

    /**
     * @return String return the atores
     */
    public String getAtores() {
        return atores;
    }

    /**
     * @param atores the atores to set
     */
    public void setAtores(String atores) {
        this.atores = atores;
    }

    /**
     * @return String return the poster
     */
    public String getPoster() {
        return poster;
    }

    /**
     * @param poster the poster to set
     */
    public void setPoster(String poster) {
        this.poster = poster;
    }

    /**
     * @return String return the sinopse
     */
    public String getSinopse() {
        return sinopse;
    }

    /**
     * @param sinopse the sinopse to set
     */
    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }



    @Override
    public String toString() {
        return   "genero= [" + genero + 
                 ", titulo=" + titulo +
                 ", Ano=" + Ano + 
                 ", totalTemporadas=" + totalTemporadas + 
                 ", avalicao=" + avalicao + 
                 ", atores=" + atores + 
                 ", poster=" + poster + 
                 ", sinopse=" + sinopse + "]";
    }

    

}
