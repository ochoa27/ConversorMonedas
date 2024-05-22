import javax.swing.*;

public class prueba {


    public static void main(String[] args) {
        boolean iniciador=true;
        Cliente cliente = new Cliente();
        Conversor conversor = new Conversor();
        FindMoney consulta = new FindMoney();

        while(iniciador) {
            Money money = consulta.findMoney(cliente);
            String varSwitch= JOptionPane.showInputDialog(null, """
                    1) para seleccionar moneda a convertir
                    2) para cambiar la cantidad que quiere convertir
                    3) para mostrar la lista de conversiones 
                    4) para salir
                    """);
           switch (varSwitch){
               case "1":
                   conversor.llenarListaMonedasDelMundo(money);
                   conversor.converter(money, cliente);
                   break;
               case "2":
                   cliente.setMoneyToChange(Double.parseDouble(JOptionPane.showInputDialog(null,"ingresa un valor nuevo")));
                   break;
               case "3" :
                   JOptionPane.showMessageDialog(null,conversor.imprimirListaDeConversiones());
                   break;
               case "4" :
                   JOptionPane.showMessageDialog(null, "el programa finalizo...");
                   iniciador=false;
                   break;
               default:
                   JOptionPane.showMessageDialog(null,"esta opcion no esta en el sistema");
            }
        }
    }
}




