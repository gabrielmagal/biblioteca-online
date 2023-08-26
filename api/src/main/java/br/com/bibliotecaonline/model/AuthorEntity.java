package br.com.bibliotecaonline.model;

import lombok.Getter;

import javax.persistence.Entity;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Getter
public class AuthorEntity {
    private String name;
    private LocalDate dateOfBirth;
    public void setName(String name) {
        if(Objects.isNull(name))
            throw new NameNullException();
        this.name = name;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        if(Objects.isNull(dateOfBirth))
            throw new DateOfBirthNullException();
        this.dateOfBirth = dateOfBirth;
    }

    public static class NameNullException extends RuntimeException {
        private static final String MSG_NAME_NULL = "O nome do author não pode ser vazio.";
        NameNullException() {
            super(MSG_NAME_NULL);
        }
    }

    public static class DateOfBirthNullException extends RuntimeException {
        private static final String MSG_DATE_NULL = "A data de nascimento do author não pode ser vazia.";
        DateOfBirthNullException() {
            super(MSG_DATE_NULL);
        }
    }
}
