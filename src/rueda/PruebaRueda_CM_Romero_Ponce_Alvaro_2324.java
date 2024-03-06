package rueda;

public class PruebaRueda_CM_Romero_Ponce_Alvaro_2324 {

    public static void main(String[] args) {

        Rueda_CM_Romero_Ponce_Alvaro_2324 rueda = new Rueda_CM_Romero_Ponce_Alvaro_2324(40, 1.539, 50);

        viaje1_CM_Romero_Ponce_Alvaro_2324(rueda);

        viaje2_CM_Romero_Ponce_Alvaro_2324(rueda);

        viaje3_CM_Romero_Ponce_Alvaro_2324(rueda);

        rellenar1_CM_Romero_Ponce_Alvaro_2324(rueda);

        rellenar2_CM_Romero_Ponce_Alvaro_2324(rueda);
        
        // Vamos a rellenarDeposito con unos cuantos litros y poco importe
        
        try {
            
            System.out.println("\nVamos a intentar rellenar el depósito con unos litros y poco importe.");
            
            rueda.rellenarDeposito(1, 0.1, 1.539);
            
            System.out.println("PRINCIPAL. Quedan: " + rueda.getcombustible() + " litros de combustible.");
            
        } catch (Exception e) {
            
            System.out.println("No se ha podido rellenar el depósito: " + e.getMessage());
        }
    }

    private static void rellenar2_CM_Romero_Ponce_Alvaro_2324(Rueda_CM_Romero_Ponce_Alvaro_2324 rueda) {
        // Vamos a rellenarDeposito con muchos litros y un importe
        
        try {
            
            System.out.println("\nVamos a intentar rellenar el depósito con muchos litros y un importe.");
            
            rueda.rellenarDeposito(100, 40, 1.539);
            
            System.out.println("PRINCIPAL. Quedan: " + rueda.getcombustible() + " litros de combustible.");
           
        } catch (Exception e) {
            
            System.out.println("No se ha podido rellenar el depósito: " + e.getMessage());
        }
    }

    private static void rellenar1_CM_Romero_Ponce_Alvaro_2324(Rueda_CM_Romero_Ponce_Alvaro_2324 rueda) {
        // Vamos a rellenarDeposito con unos cuantos litros y un importe
        
        try {
            
            System.out.println("\nVamos a intentar rellenar el depósito con unos litros y un importe.");
            
            rueda.rellenarDeposito(10, 40, 1.539);
            
            System.out.println("PRINCIPAL. Quedan: " + rueda.getcombustible() + " litros de combustible.");
           
        } catch (Exception e) {
            
            System.out.println("No se ha podido rellenar el depósito: " + e.getMessage());
        }
    }

    private static void viaje3_CM_Romero_Ponce_Alvaro_2324(Rueda_CM_Romero_Ponce_Alvaro_2324 rueda) {
        // Vamos a intentar realizar un viaje y recorrer muchos kilómetros
        
        try {
            
            System.out.println("\nVamos a intentar hacer un viaje y recorrer muchos kilómetros.");
            
            rueda.viaje(800);
            
            System.out.println("PRINCIPAL. Quedan: " + rueda.getcombustible() + " litros de combustible.");
            
        } catch (Exception e) {
            
            System.out.println("Error al hacer el viaje: " + e.getMessage());
        }
    }

    private static void viaje2_CM_Romero_Ponce_Alvaro_2324(Rueda_CM_Romero_Ponce_Alvaro_2324 rueda) {
        // Vamos a intentar realizar un viaje, con kilómetros negativos
        
        try {
            
            System.out.println("\nVamos a intentar hacer un viaje y recorrer unos kilómetros negativos.");
            
            rueda.viaje(-80);
            
            System.out.println("PRINCIPAL. Quedan: " + rueda.getcombustible() + " litros de combustible.");
            
        } catch (Exception e) {
            
            System.out.println("Error al hacer el viaje: " + e.getMessage());
        }
    }

    private static void viaje1_CM_Romero_Ponce_Alvaro_2324(Rueda_CM_Romero_Ponce_Alvaro_2324 rueda) {
        // Vamos a intentar realizar un viaje y recorreremos unos kilómetros
        
        try {
            
            System.out.println("Vamos a intentar hacer un viaje y recorrer unos kilómetros.");
            
            rueda.viaje(80);
            
            System.out.println("PRINCIPAL. Quedan: " + rueda.getcombustible() + " litros de combustible.");
            
        } catch (Exception e) {
            
            System.out.println("Error al hacer el viaje: " + e.getMessage());
        }
    }
}