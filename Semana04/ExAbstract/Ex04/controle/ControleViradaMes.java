package Semana04.ExAbstract.Ex04.controle;

import Semana04.ExAbstract.Ex04.dominio.ContaBancaria;
import Semana04.ExAbstract.Ex04.dominio.ContaCorrente;
import Semana04.ExAbstract.Ex04.dominio.ContaEmpresarial;
import java.util.ArrayList;
import java.util.List;

public class ControleViradaMes {
    public static void main(String[] args) {
        List<ContaBancaria> contas = new ArrayList<>();
        contas.add(new ContaCorrente("1001-CC", 1000.00));
        contas.add(new ContaEmpresarial("2002-PJ", 50000.00));
        contas.add(new ContaCorrente("1002-CC", 250.00));

        System.out.println("=== SALDOS ANTES DA VIRADA DE MES ===");
        for (ContaBancaria c : contas) {
            c.consultarSaldo();
        }

        System.out.println("\n=== EXECUTANDO ROTINA DE VIRADA DE MES ===");
        for (ContaBancaria c : contas) {
            c.cobrarTaxaMensal();
        }

        System.out.println("\n=== SALDOS APOS A VIRADA DE MES ===");
        for (ContaBancaria c : contas) {
            c.consultarSaldo();
        }
    }
}