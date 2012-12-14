package olimpiadarusa;

/**
 *
 * @author viti
 */
public class OlimpiadaRusa {

    public static void main(String[] args) {
        int aux = calculo( 10 );     
        aux = calculo( 11 );
        aux = calculo( 12 );
        aux = calculo( 21 );
        
    }
    
    
    private static int calculo( int posicion ){
        
        if( posicion <= 9 ) return posicion;
        
        //Establecer variables auxiliares
        int cotaInferior = 0 ;
        int indice = 9;
        int potencia = 1;
        
        while( posicion > indice ){
            
            cotaInferior = indice ;
            //Calcula la cota superior según la potencia de 10
            indice = (int) (indice + 9 * ( potencia + 1) * Math.pow( 10 , potencia ) ); 
            potencia += 1 ;
        }
        
        
        
        
        System.out.println("Número: " + posicion );
        System.out.println("Cota inferior: " + cotaInferior );   
        System.out.println("Cota superior: " + indice );
        System.out.println("Potencia: " + potencia );
        
        System.out.println( "AUX: " + ( posicion - cotaInferior ) );
        System.out.println( "AUX: " + (( posicion - cotaInferior )/ potencia)  );
        
        System.out.println(" ");
        return 0;
    }
}
