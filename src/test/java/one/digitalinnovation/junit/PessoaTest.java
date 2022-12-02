package one.digitalinnovation.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PessoaTest {

    @Test // -> Anotação é primordial para testar
    void validarCalculoDeIdade(){
        Pessoa pessoa = new Pessoa("Dani", LocalDate.of(2020, 1, 23)); // -> cria uma cénario
        Assertions.assertEquals(2, pessoa.getIdade()); // --> Executa as validações
    }

    @Test
    void deveCalcularIdadeCorretamente(){
        Pessoa pessoa = new Pessoa("Daniela", LocalDate.of(1984, 4, 23));
        Assertions.assertEquals(38, pessoa.getIdade());
    }

    @Test
    void deveRetornarSeEhMaiorDeIdade(){
        Pessoa pessoa = new Pessoa("Frank", LocalDate.of(2000,1, 1));
        Assertions.assertTrue(pessoa.ehMaiorDeIdade());

        Pessoa joao = new Pessoa("João", LocalDate.now());
        Assertions.assertFalse(joao.ehMaiorDeIdade());
    }
}
