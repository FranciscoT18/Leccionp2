public class Pajaro extends Animal implements Volador {
    private String nombre;

    public String cantar(String tipo) {
        System.out.println("El Pollito Dice Pio");
       return "El Pollito dice Pio: " + tipo;
    }

    @Override
    public void volar() {
        System.out.println("pollito: vuela");
    }
    @Override
    public void comer(){
        System.out.println("pollito: come");
    }

    public Pajaro(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
