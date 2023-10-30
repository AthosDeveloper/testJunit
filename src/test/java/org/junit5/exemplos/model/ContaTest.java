package org.junit5.exemplos.model;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ContaTest {
    String esperado = "athos";
    String realidade = "athos";
    double meuSaldo = 1.000;
    Conta conta = new Conta(realidade);
    Conta cconta1 = new Conta(new BigDecimal("1.000"));
@Test
void testNomeConta(){

assertEquals(esperado, conta.getPessoa());
assertTrue(conta.getPessoa().equals(esperado));
}
@Test
    public void  testarSaldoConta (){
    assertNotNull(cconta1.getSaldo());
assertEquals(1.000, cconta1.getSaldo().doubleValue());
assertFalse(cconta1.getSaldo().compareTo(BigDecimal.ZERO)<0);
}



}