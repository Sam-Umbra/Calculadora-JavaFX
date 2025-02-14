/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package local.sasouza.calculadora.javafx.operacoes;

import local.sasouza.calculadora.javafx.TipoOperador;

/**
 *
 * @author sesidevb
 */
public class Calcula {
    
    double total;
    TipoOperador ultimaOperacao;
    
    public Calcula() {
        reset();
    }
    
    public void reset() {
        this.total = 0;
        this.ultimaOperacao = null;
    }
    
    public double calcular(double n, TipoOperador op) {
        if (ultimaOperacao == null || ultimaOperacao == TipoOperador.IGUAL) {
            this.total = n;
            this.ultimaOperacao = op;
        } else {
            
            switch(ultimaOperacao) {
                case SOMA:  
                    this.total += n;
                    this.ultimaOperacao = op;
                    break;
                            
                case SUBTRACAO:
                    this.total -= n;
                    this.ultimaOperacao = op;
                    break;
                    
                case MULTIPLICACAO:
                    this.total *= n;
                    this.ultimaOperacao = op;
                    break;
                    
                case DIVISAO:
                    this.total /= n;
                    this.ultimaOperacao = op;
                    break;
                    
                case POTENCIA:
                    /*
                    int pot = 1;
                    for(int c = 0; c < n; c++) {
                        pot = pot * this.total;
                    }
                    this.ultimaOperacao = op;
                    this.total = pot;
                    break;*/
                    double pot = Math.pow(total, n);
                    this.total = pot;
                    this.ultimaOperacao = op;
                    break;
                    
                case RAIZ:
                    
                    double raiz = Math.pow(total, (1/n));
                    this.total = raiz;
                    this.ultimaOperacao = op;
                    break;
                    
                default:
                    System.out.println("Nao Implementado!");
            }
        }
        
        return this.total;
        
    }
    
}
