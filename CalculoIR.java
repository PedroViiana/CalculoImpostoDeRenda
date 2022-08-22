/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadecapitulo5;


/**
 *
 * @author Pedro Viana
 */
public class CalculoIR {
    
    private double rendaAnual;
    private int tipo;
    
    public CalculoIR(double r, int t){
        rendaAnual = r;
        tipo = t;
        
        if (tipo == 1){
            if(rendaAnual <= 21.450){
                rendaAnual = r*0.15;
            } else if(rendaAnual > 21.450 || rendaAnual <= 51.900){
                rendaAnual = r*0.28;
            } else if(rendaAnual > 51.900){
                rendaAnual = r*0.31;
            }  
        } else if (tipo == 2){
            if(rendaAnual <= 35.800){
                rendaAnual = r*0.15;
        } else if(rendaAnual > 35.800 || rendaAnual <= 86.500){
                rendaAnual = r*0.28;
        } else if(rendaAnual > 86.500){
                rendaAnual = r*0.31;
          } 
        }   
    }

    public double getImpostoDevido( ){
        return rendaAnual;
    }
    }
