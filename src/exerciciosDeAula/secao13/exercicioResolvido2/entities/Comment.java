package exerciciosDeAula.secao13.exercicioResolvido2.entities;

public class Comment {

    private String text;
    
    public Comment(){
    }

    public Comment(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
}
