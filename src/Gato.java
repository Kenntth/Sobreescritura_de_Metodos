public class Gato extends animal{

    @Override//indica la sobreescritura del metodo comer de la clase animal
    public void comer() {
        System.out.println("estoy comiendo pescado");
    }
}
