import java.util.HashSet;
import java.util.Set;

public class CuentasUsuarios {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Cristiano Ronaldo", "7", 819, "El bicho");
        Cliente cliente2 = new Cliente("Lionel Messi", "10", 793, "D10s");
        Cliente cliente3 = new Cliente("Luis Suarez", "9", 528, "Pistolero" );
        Cliente cliente4 =new Cliente("Erling Braut Haaland", "23", 180, "Androide");


        Set<Cliente> goleadores = new HashSet<Cliente>();
        goleadores.add(cliente1);
        goleadores.add(cliente2);
        goleadores.add(cliente3);
        goleadores.add(cliente4);

        for(Cliente cliente : goleadores) {
            System.out.println("Delantero: " +cliente.getNombre()+ " Alias: " + cliente.getAlias() + ". Dorsal: "+cliente.getNumeroCuenta() + ". Numero de goles: "+cliente.getSaldo() + " Goles.");
        }

    }
}
