public class mensaje {
        
    public static void main(String[] args) {
    	double suma; int i; int cont = 0;	
    	
    	do
    		{
    			double NUM1 = Math.random() * 10; double NUM2 = Math.random() * 10;
    			suma = NUM1 + NUM2;
    			
    			System.out.println("la suma es: " + suma);
    				if(suma > 9)
    		{
    			System.out.println("EL NUMERO AH ALCANZADO LA DECENA .");
    			System.out.println();
    		}else{ System.out.println("EL NUMERO SOLO ALCANZA LA UNIDAD .");
    		System.out.println();}
    		
    			cont = cont + 1;	
    		}while (cont < 5);		    	
    }
}
