class persona {
    String nombre;
}

public class eje3 {
    public static void main(String[] args) {
        persona persona = new persona();
        persona.nombre = "juan";
        System.out.println("el nombre despues de la reasignar persona:" + persona.nombre);
    }

    public static void cambiarNombre(persona persona) {
        persona = new persona();
        persona.nombre = "andres";
    }
}
