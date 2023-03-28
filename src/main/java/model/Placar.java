package model;

public class Placar {

    private String timeCasa;
    private String timeVisitante;
    private int tempoJogo;

    public Placar(String timeCasa, String timeVisitante, int tempoJogo){
        this.timeCasa = timeCasa;
        this.timeVisitante = timeVisitante;
        this.tempoJogo = tempoJogo;
    }

    public Placar() {
    }

    public String getTimeCasa() {
        return timeCasa;
    }

    public void setTimeCasa(String timeCasa) {
        this.timeCasa = timeCasa;
    }

    public String getTimeVisitante() {
        return timeVisitante;
    }

    public void setTimeVisitante(String timeVisitante) {
        this.timeVisitante = timeVisitante;
    }

    public int getTempoJogo() {
        return tempoJogo;
    }

    public void setTempoJogo(int tempoJogo) {
        this.tempoJogo = tempoJogo;
    }
}
