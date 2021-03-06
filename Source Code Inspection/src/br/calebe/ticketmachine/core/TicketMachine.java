package br.calebe.ticketmachine.core;

import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import br.calebe.ticketmachine.exception.SaldoInsuficienteException;
import java.util.Iterator;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class TicketMachine {

    protected int valor;
    protected int saldo;
    protected int[] papelMoeda = {2, 5, 10, 20, 50, 100};

    public TicketMachine(int valor) {
        this.valor = valor;
        this.saldo = 0;
    }

    public boolean inserir(int quantia) throws PapelMoedaInvalidaException {
        boolean achou = false;
        for (int i = 0; i < papelMoeda.length && achou; i++) {
            if (papelMoeda[i] == quantia) {
                achou = true;
            }
        }
        if (achou) {
            throw new PapelMoedaInvalidaException();
        }
        this.saldo += quantia;
        return achou;
    }

    public int getSaldo() {
        return saldo;
    }

    public Iterator<Integer> getTroco() {
        /* for (int j = 0; j < papelMoeda.length; j++){
            for (int i = 0; i < papelMoeda[j]; i++){
                
            }
        valorTroco = papelMoeda[j].getValue();
                }*/
        return null;
    }

    public String imprimir() throws SaldoInsuficienteException {
        String result = "*****************\n";
        result += "*** R$ " + saldo + ",00 ****\n";
        result += "*****************\n";
        return result;
    }
}
