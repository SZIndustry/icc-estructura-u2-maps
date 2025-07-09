import controllers.Mapa;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("----Practica Mapas----");
        System.out.println("Nombre: Cristopher Salinas"); /// Cambiar por su nombre
        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        runMapExamlpe();

        // // Ejecuta el ejemplo de gestión de empleados usando HashMap
        // runEmpleadoExample();

        // // Ejecuta los ejercicios de sumatoria y anagramas
        // runEjerccios();
    }

    private static void runMapExamlpe() {
        Mapa mapa = new Mapa();

        System.out.println("\nRun TreeMap:");
        mapa.runTreeMap();

        System.out.println("\nRun LinkedHashMap:");
        mapa.runLinkedHashMap();
        
        System.out.println("\nRun TreeMap:");
        mapa.runTreeMap();

        System.out.println("\nRun HashMap Obj:");
        mapa.runHashMapObj();

        System.out.println("\nRun TreeMap Obj:");
        mapa.runTreeMapObj();
    }

    private static void runEmpleadoExample() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private static void runEjerccios() {
        throw new UnsupportedOperationException("Not implemented yet");

    }
}
