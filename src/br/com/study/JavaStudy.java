package br.com.study;

import br.com.study.model.Gato;

public class JavaStudy {
    public static void main(String[] args){
        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro = new Livro( "Vencedor", 20);
        System.out.println(livro);
    }
    
}
class Livro {
    private String title;
    private Integer pages;

    public Livro(String title, Integer pages) {
        this.title = title;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                '}';
    }
}