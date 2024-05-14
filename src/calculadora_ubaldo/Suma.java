package calculadora_ubaldo;

import java.util.*;

/**
 *
 */
public class Suma extends Calculadora {

    @Override
    public float calcular() {
        return (getNum1() + numero2);
    }
    
    public Suma() {
        
    }
    
    public Suma(int val1, int val2) {
        setNum1(val1);
        numero2 = val2;
    }

}
