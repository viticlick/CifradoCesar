/**
 * @author viticlick
 */
public class CifradoCesar {

    private static short unicodeAmayuscula=65;
    private static short unicodeAminuscula=97;
    private static short tamañoAlfabeto = 26;
    
    public static void main(String[] args) {

        String frase = "Todo lo que se preguntaba eran las mismas respuestas que buscamos el resto de nosotros. ¿De dónde vengo? ¿A dónde voy? ¿Cuánto tiempo tengo? Todo lo que pude hacer fue sentarme y ver como moría.";
        System.out.println( "cifrado: " + cifrador( frase , 3 ) );     
    }
    
    private static String cifrador( String cadena , int n ){      
    /**
     * para traducir solo minúsculas solo hay que añadir:
     * cadena = cadena.toLowerCase();
     */ 
        String toret="";
        
        //Recorrido de la cadena
        for( int i = 0 ; i < cadena.length() ; i++ ){
            //Sustitución mayúsculas
            if( cadena.codePointAt(i) >= unicodeAmayuscula && 
                    cadena.codePointAt(i) <= ( unicodeAmayuscula + tamañoAlfabeto ) ){
              
                toret += (char) ( ( cadena.codePointAt( i ) - unicodeAmayuscula + n ) %  tamañoAlfabeto +  unicodeAmayuscula ) ;
            //Sustitución minúsculas
            }else if( cadena.codePointAt(i) >= unicodeAminuscula && 
                    cadena.codePointAt(i) <= ( unicodeAminuscula + tamañoAlfabeto ) ){

                toret += (char) ( ( cadena.codePointAt( i ) - unicodeAminuscula + n ) %  tamañoAlfabeto +  unicodeAminuscula ) ;    
            }else{
                //Resto de letras
                toret += cadena.charAt( i );
            }
        }
        return toret;  //Retorna la cadena resultado
    }   
}
