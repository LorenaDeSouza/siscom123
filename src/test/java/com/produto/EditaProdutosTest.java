package com.produto;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class EditaProdutosTest {


    @Test
    public void editaNomeDoProduto() throws Exception {
        Produto produto2 = new Produto(1, "Nome1", 0, 1, 2, new SimpleDateFormat("yyyyMMdd").parse("20180118"));
        List<Produto> produtos = new ArrayList<Produto>();
        produtos.add(produto2);

        EditaProdutos editaProdutos = new EditaProdutos(produtos);

        Produto produto = editaProdutos.editaNome(1, "Nome2");

        assertThat(produto.getNome(), is("Nome2"));
    }

    @Test
    public void retornaExceptionQuandoNaoEncontraProduto() throws Exception {
        //Erica fazer
    }

    //Erica criar novos testes que ela achar que pode ser legal para os produtos..
}