package com.whiteGas;

import com.pedido.Pedido;
import org.junit.Test;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.*;

public class WhiteGasTest {

    @Test
    public void deveCadastrarPedidoParaWhiteGasComSucesso() throws Exception {
        int qtdNovosCilindros = 1;
        Date dataPedido = new SimpleDateFormat("yyyyMMdd").parse("20180212");;
        Date dataEnvioPedido = new SimpleDateFormat("yyyyMMdd").parse("20180316");

        WhiteGas whiteGas = new WhiteGas(qtdNovosCilindros, dataPedido, dataEnvioPedido);
        assertThat(whiteGas, is(not(nullValue())));
    }

    @Test(expected = Exception.class)
    public void deveRetornarErroSeDataPedidoForDepoisDeQuintaFeira() throws Exception {
        int qtdNovosCilindros = 1;
        Date dataPedido = new Date();
        Date dataEnvioPedido = new SimpleDateFormat("yyyyMMdd").parse("20180316");

        new WhiteGas(qtdNovosCilindros, dataPedido, dataEnvioPedido);
    }

    @Test(expected = Exception.class)
    public void deveRetornarErroSeDataEnvioPedidoForAntesDeSextaFeira() throws Exception {
        int qtdNovosCilindros = 1;
        Date dataPedido = new SimpleDateFormat("yyyyMMdd").parse("20180308");
        Date dataEnvioPedido = new SimpleDateFormat("yyyyMMdd").parse("20180315");

        new WhiteGas(qtdNovosCilindros, dataPedido, dataEnvioPedido);
    }
}