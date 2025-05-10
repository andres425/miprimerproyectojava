class persona {
    String nombre;
}

public class Eje2 {

    public static void main(String[] args) {
        persona persona = new persona();
        persona.nombre = "carlos";
        cambiarNombre(persona);
        System.out.println("el nombre de la persona despues de cambiar es:"+ persona.nombre);
    }
        public static void cambiarNombre(persona persona) {
        persona.nombre="juan";
        
        }
    }
