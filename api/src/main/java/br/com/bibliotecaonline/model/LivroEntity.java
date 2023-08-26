package br.com.bibliotecaonline.model;

import lombok.Getter;

import javax.persistence.Entity;
import java.util.Objects;

@Entity
@Getter
public class LivroEntity {
    private String name;
    private String author;

    public void setName(String name) {
        if(Objects.isNull(name))
            throw new NameNullException();
        this.name = name;
    }

    public void setAuthor(String author) {
        if(Objects.isNull(author))
            throw new AuthorNullException();
        this.author = author;
    }

    public static class NameNullException extends RuntimeException {
        private static final String MSG_NAME_NULL = "O nome do livro não pode ser vazio.";
        NameNullException() {
            super(MSG_NAME_NULL);
        }
    }

    public static class AuthorNullException extends RuntimeException {
        private static final String MSG_NAME_NULL = "O nome do autor não pode ser vazio.";
        AuthorNullException() {
            super(MSG_NAME_NULL);
        }
    }
}
