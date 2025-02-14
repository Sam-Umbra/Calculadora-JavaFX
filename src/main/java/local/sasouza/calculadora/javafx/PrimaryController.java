package local.sasouza.calculadora.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import local.sasouza.calculadora.javafx.operacoes.Calcula;

public class PrimaryController {

    @FXML
    Label lblDisplay;
    String display = "0";
    Calcula calcula = new Calcula();
    boolean isOperador = false;
    
    public void mostraNumero() {
        lblDisplay.setText(this.display);
    }
    
   public void addNumero(int n) {
       if (isOperador) {
           
           isOperador = false;
           this.display = Integer.toString(n);
           
           
       } else {
           if (this.display.substring(0, 1) == "0") {
               this.display = Integer.toString(n);
               
           } else {
               this.display += Integer.toString(n);
           }
       }
       
       mostraNumero();
   }
    
    public void btnIgualClick() {
        isOperador = true;
        double resultado = this.calcula.calcular(Double.parseDouble(this.display), TipoOperador.IGUAL);
        this.display = String.valueOf(resultado);
        mostraNumero();
    }
    
    public void btnSomaClick() {
        isOperador = true;
        double resultado = this.calcula.calcular(Double.parseDouble(this.display), TipoOperador.SOMA);
        this.display = String.valueOf(resultado);
        mostraNumero();
    }
    
    public void btnSubtracaoClick() {
        isOperador = true;
        double resultado = this.calcula.calcular(Double.parseDouble(this.display), TipoOperador.SUBTRACAO);
        this.display = String.valueOf(resultado);
        mostraNumero();
    }
    
    public void btnDivisaoClick() {
        isOperador = true;
        double resultado = this.calcula.calcular(Double.parseDouble(this.display), TipoOperador.DIVISAO);
        this.display = String.valueOf(resultado);
        mostraNumero();
    }
    
    public void btnMultiplicacaoClick() {
        isOperador = true;
        double resultado = this.calcula.calcular(Double.parseDouble(this.display), TipoOperador.MULTIPLICACAO);
        this.display = String.valueOf(resultado);
        mostraNumero();
    }
    
    public void btnPotenciaClick() {
        isOperador = true;
        double resultado = this.calcula.calcular(Double.parseDouble(this.display), TipoOperador.POTENCIA);
        this.display = String.valueOf(resultado);
        mostraNumero();
    }
    public void btnRaizClick() {
        isOperador = true;
        double resultado = this.calcula.calcular(Double.parseDouble(this.display), TipoOperador.RAIZ);
        this.display = String.valueOf(resultado);
        mostraNumero();
    }
    
    public void btn0Click() {
        addNumero(0);
    }
    
    public void btn1Click() {
        addNumero(1);
    }
    
    public void btn2Click() {
        addNumero(2);
    }
    
    public void btn3Click() {
        addNumero(3);
    }
    
    public void btn4Click() {
        addNumero(4);
    }
    
    public void btn5Click() {
        addNumero(5);
    }
    
    public void btn6Click() {
        addNumero(6);
    }
    
    public void btn7Click() {
        addNumero(7);
    }
    
    public void btn8Click() {
        addNumero(8);
    }
    
    public void btn9Click() {
        addNumero(9);
    }
    
    public void btnPontoClick() {
        if (lblDisplay.getText().contains(".")) {
            mostraNumero();
        } else {
            this.display += ".";
            mostraNumero();
        }
    }
    
    public void btnClearClick() {
        calcula.reset();
        this.display = "0";
        mostraNumero();
    }
    
    /*
    public void btnSomaClick() {
        
        this.operacao = Integer.parseInt(lblDisplay.getText());
        
        lblDisplay.setText("");
        
        soma = true;
        
    }
    
    public void btnIgualClick() {
        if(soma == true) {
            
            int temp = Integer.parseInt(lblDisplay.getText());
            this.resultado = this.operacao + temp;
            
            lblDisplay.setText("");
            mostraNumero(this.resultado);
        }
    }
    
    public void mostraNumero(int numero) {
        
        String txt = lblDisplay.getText();
        
        txt += Integer.toString(numero);
        
        lblDisplay.setText(txt);
        
        //lblDisplay.setText(String.valueOf(numero));
    }
    */
}
