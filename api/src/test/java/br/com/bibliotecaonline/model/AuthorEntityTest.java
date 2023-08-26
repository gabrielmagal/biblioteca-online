package br.com.bibliotecaonline.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class AuthorEntityTest {
    @Test
    void nomeComDeclaracaoCorretaDeveRetornarSucesso() {
        AuthorEntity authorEntity = new AuthorEntity();
        authorEntity.setName("Uncle Bob");
        Assertions.assertNotNull(authorEntity.getName());
    }

    @Test
    void nascimentoComDeclaracaoCorretaDeveRetornarSucesso() {
        AuthorEntity authorEntity = new AuthorEntity();
        authorEntity.setDateOfBirth(LocalDate.now());
        Assertions.assertNotNull(authorEntity.getDateOfBirth());
    }

    @Test
    void nomeNaoPodeSerNulo() {
        AuthorEntity authorEntity = new AuthorEntity();
        Assertions.assertThrows(AuthorEntity.NameNullException.class, () -> authorEntity.setName(null));
    }

    @Test
    void nascimentoNaoPodeSerNulo() {
        AuthorEntity authorEntity = new AuthorEntity();
        Assertions.assertThrows(AuthorEntity.DateOfBirthNullException.class, () -> authorEntity.setDateOfBirth(null));
    }
}
