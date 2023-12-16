package Cap4.Ejercicio12;

import java.util.Vector;

public class AppMedico {
    public static void main(String[] args) {
        Vector listaMedicos = new Vector();
        Medico medico = new Medico();
        Ortopedista ortopedista = new Ortopedista();
        Pediatra pediatra = new Pediatra();
        listaMedicos.add(medico);
        listaMedicos.add(ortopedista);
        listaMedicos.add(pediatra);

        for(int k = 0; k <listaMedicos.size(); k++){
            Medico me = (Medico) listaMedicos.elementAt(k);
            if (me instanceof Ortopedista){
                System.out.println(k + " Es de la clase ortopedista");
                continue;
            }
            if (me instanceof Pediatra){
                System.out.println(k + " Es de la clase pediatra");
                continue;
            }
            if (me instanceof Medico){
                System.out.println(k + " Es de la clase médico");
                continue;
            }
        }
    }
}
