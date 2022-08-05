package tests;

import entities.Pessoa;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.ServicoVacinarProxy;
import service.Vacinar;

import java.time.LocalDate;

public class PessoaTest {
    LocalDate diaDaVacinaAnterior, diaDaVacinaHoje;
    Pessoa p1, p2;

    @BeforeEach
    void doBefore(){
        diaDaVacinaAnterior = LocalDate.now().minusDays(4);
        diaDaVacinaHoje = LocalDate.now();
        p1 = new Pessoa("Jonas", "Block", "213456879", diaDaVacinaAnterior, "Coronavac");
        p2 = new Pessoa("Paola", "Marques", "798546132", diaDaVacinaHoje, "Pfizer");
    }

    @Test
    public void vac1(){
        Vacinar vacinar = new ServicoVacinarProxy();
        vacinar.vacinarPessoa(p1.getRg(), p1.getDataVacina(), p1.getNomeVacina());
        System.out.println(p1);
        System.out.println("");
    }

    @Test
    public void vac2(){
        Vacinar vacinar = new ServicoVacinarProxy();
        vacinar.vacinarPessoa(p2.getRg(), p2.getDataVacina(), p2.getNomeVacina());
        System.out.println(p2);
        System.out.println("");
    }
}
