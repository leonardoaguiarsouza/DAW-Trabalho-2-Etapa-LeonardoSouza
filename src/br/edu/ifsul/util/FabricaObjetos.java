/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.util;

import br.edu.ifsul.modelo.Condominio;
import br.edu.ifsul.modelo.Pessoa;
import br.edu.ifsul.modelo.UnidadeCondominial;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Leonardo
 */
public class FabricaObjetos {

    public static List<Condominio> carregaCondominios() {
        List<Condominio> lista = new ArrayList<>();
        Pessoa p = new Pessoa();
        p.setId(1);
        p.setNome("Leonardo Souza");
        p.setCpf("707.465.080-34");
        p.setTelefone("54992433633");
        p.setEmail("leonardo.aguiarsouza@gmail.com");

        UnidadeCondominial uc = new UnidadeCondominial();
        uc.setId(1);
        uc.setNumero("101");
        uc.setDescricao("1º Andar");
        uc.setNumeroQuarto(5);
        uc.setArea(50.00);
        uc.setPessoa(p);

        Condominio c = new Condominio();
        c.setId(1);
        c.setNome("Condominio Teste");
        c.setEndereco("Av. Brasil");
        c.setNumero("250");
        c.setCep("99062390");
        c.adicionarUC(uc);

        lista.add(c);
        return lista;

    }
}
