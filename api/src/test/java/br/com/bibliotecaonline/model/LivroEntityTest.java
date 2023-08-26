package br.com.bibliotecaonline.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LivroEntityTest {
    @Test
    void nomeComDeclaracaoCorretaDeveRetornarSucesso() {
        LivroEntity livroEntity = new LivroEntity();
        livroEntity.setName("Clean Code");
        Assertions.assertNotNull(livroEntity.getName());
    }

    @Test
    void autorComDeclaracaoCorretaDeveRetornarSucesso() {
        LivroEntity livroEntity = new LivroEntity();
        livroEntity.setAuthor("Uncle Bob");
        Assertions.assertNotNull(livroEntity.getAuthor());
    }

    @Test
    void nomeNaoPodeSerNulo() {
        LivroEntity livroEntity = new LivroEntity();
        Assertions.assertThrows(LivroEntity.NameNullException.class, () -> livroEntity.setName(null));
    }

    @Test
    void authorNaoPodeSerNulo() {
        LivroEntity livroEntity = new LivroEntity();
        Assertions.assertThrows(LivroEntity.AuthorNullException.class, () -> livroEntity.setAuthor(null));
    }
}
