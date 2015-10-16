/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ngarciacarrillo
 */
public class Consumo {
    private float km;
    private float litros;
    private float vMedia;
    private float pGas;
    private float tempEmpre;
    
public Consumo(){}

public Consumo( float kmI,float litrosI,float pGasI,float vMediaI){

    km = kmI;
    litros =litrosI;
    pGas = pGasI;
    vMedia = vMediaI;
}

public float gettempEmpre(){
    return km / vMedia ;
}

public float getConsumoMedio(){
    return (litros/km)*100;
}
public float getEuros(){
    return pGas*litros;
}
public void setLitros (float litrosI){
litros = litrosI;
}


}
