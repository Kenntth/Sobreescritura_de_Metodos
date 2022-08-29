public class principal {

    public static void main(String[] args) {
        //Los metodos se ejecutan segun la sobreescritura deseada
        persona uno=new persona();
        uno.comer();
        Perro dog =new Perro();
        dog.comer();
        Gato cat=new Gato();
        cat.comer();
    }
}
