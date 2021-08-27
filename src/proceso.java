
import java.awt.Color;
import static java.lang.Thread.sleep;
import javax.swing.*;

public class proceso implements Runnable {//IDs de los botones 
    JButton rojo;
    JButton amarillo;
    JButton verde;
    JTextField texto;
    //contadores de los colores 
    int contador=0,tiempo_total=0,tiempo_rojo=0,tiempo_amarillo=0,tiempo_verde=0;
    
    public proceso(JButton entrada1,JButton entrada2,JButton entrada3,JTextField entrada4){
       this.rojo=entrada1;
       this.amarillo=entrada2;
       this.verde=entrada3;
       this.texto=entrada4;
    }

    @Override
    public void run() {//CORREMOS EL CONTRADOR 
        while(true){
            contador++;
            if(contador>=1 && contador<=60){//CONTRADOR DE TIEMPO INICAL ENTR 1 Y 60 SEG
                tiempo_total++;//AUMENTAMOS TIEMPO TOTAL
                texto.setText(""+tiempo_total);//mostramos el tiempo en la etiqueta
            }
            if(contador==1){//INICIO EN EL SEGUNDO 1 A ROJO 
                rojo.setBackground(Color.red);//rojo activo 
                amarillo.setBackground(Color.gray);//amarillo es gris
                verde.setBackground(Color.gray); //verde a gris
            }

            if(contador>=5 && contador<=10){//si el contador pasa entre 5 y 10 seg
                tiempo_rojo++;//AUMENTAMOS TIEMPO ROJO
                texto.setText(""+tiempo_rojo);//pasamos del rojo 
            }
            if(contador==5){//INICIO EN EL SEGUNDO 5 A AMARILLO
              rojo.setBackground(Color.gray);//rojo pasa a gris
              amarillo.setBackground(Color.yellow);//amarillo activo
              verde.setBackground(Color.gray); //verde es gris 
            }
            if(contador>=7 && contador<=10){//si el contador pasa entre 7 y 10 seg
                tiempo_amarillo++;//AUMENTAMOS TIEMPO AMARILLO 
                texto.setText(""+tiempo_amarillo);//pasamos del amarillo
            }
            if(contador==10){//INICIO DEL VERDE EN EL SEGUNDO 10 
              rojo.setBackground(Color.gray); //rojo es gris 
              amarillo.setBackground(Color.gray);//amarillo pasa a gris 
              verde.setBackground(Color.green);   //verdre activo 
            }
 
            if(contador>=9 && contador<=14){//si el contador pasa entre 9 y 14
                tiempo_verde++;//AUMENTAMOS TIEMPO VERDE
                texto.setText(""+tiempo_verde);//pasamos del verde 
            }
            if(contador==15){//INICIO DEL AMARILLO OTRA VEZ AL SEGUNDO 15
              rojo.setBackground(Color.gray);
              amarillo.setBackground(Color.yellow);
              verde.setBackground(Color.gray);   
            }
              if(contador==20){//SI LLEGAMOS A 2O SEG TODO A CERO
                contador=0;
                tiempo_total=0;
                tiempo_rojo=0;
                tiempo_amarillo=0;
                tiempo_verde=0;
            }

            try { //INICIO DEL HILO 
                sleep(1000);
            } catch (Exception e) {
            } 
        }   
    }
    
    public void inicio_hilo() {//COMIENZO 
        new Thread(this).start();
    }  
}
