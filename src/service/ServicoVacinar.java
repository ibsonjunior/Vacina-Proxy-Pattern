package service;

import java.time.LocalDate;

public class ServicoVacinar implements Vacinar{
    @Override
    public void vacinarPessoa(String rg, LocalDate dataVacina, String tipoVacina) {
        System.out.println("Usuario(a) "+rg + " vacinado(a) em " + dataVacina + " com sucesso.");
    }
}
