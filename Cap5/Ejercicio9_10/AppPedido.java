package Cap5.Ejercicio9_10;

public class AppPedido {
    public static void main(String[] args) {
        Producto producto1 = new Producto(1,1000, "Carpeta", "Carpeta Anillada metálica");
        Producto producto2 = new Producto(2,3000, "Tinta", "Tinta china de color negro");
        Producto producto3 = new Producto(3,800, "Cinta pegante", "Cinta adhesiva de color transparente");
        Producto producto4 = new Producto(4,600, "Cartulina", "Pliego de cartulina 60x40 cms");
        Producto producto5 = new Producto(5,900, "Esfero", "Esfero de color naranja");
        Producto producto6 = new Producto(6,900, "Marcador", "Marcador de color rojo");

        Cliente persona = new Persona("Abigail","namur 299", "927878327");
        Cliente personaParticular = new PersonaParticular("Mourev" , "kekmi2m", "0927837837", 83882333);
        Cliente empresa = new Empresa("DanyEnterprise", "8838222", "moasmomd", "msmms");

        Orden ordenPersona = new Orden(1, persona);
        Orden ordenPersonaParticular = new Orden(2, personaParticular);
        Orden ordenEmpresa = new Orden(3, empresa);

        ordenPersona.anadirItem(1,5,producto1);
        ordenPersona.anadirItem(2,3,producto2);

        ordenPersonaParticular.anadirItem(1,5,producto3);
        ordenPersonaParticular.anadirItem(2,3,producto4);

        ordenEmpresa.anadirItem(1,5,producto5);
        ordenEmpresa.anadirItem(2,3,producto6);


        ordenPersona.calcularOrdenPedido();
        ordenPersonaParticular.calcularOrdenPedido();
        ordenEmpresa.calcularOrdenPedido();
        System.out.println("Orden de persona: " + ordenPersona);
        System.out.println("Orden de persona particular: " + ordenPersonaParticular);
        System.out.println("Orden de empresa: " + ordenEmpresa);


    }
}
