import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

;

public class Conversor {
     List<String> convertidasList=new ArrayList<>();
    private String toChange;



    public boolean llenarListaMonedasDelMundo(Money monedas) {
         Object[] monedasDelMundo = monedas.conversion_rates().keySet().toArray();
            this.toChange= (String) JOptionPane.showInputDialog(null,"Selecciona una moneda para cambiar",
                    "Elegir",JOptionPane.QUESTION_MESSAGE,null, monedasDelMundo,monedasDelMundo[0]);
        return false;
    }
    public void converter(Money converter,Cliente cliente){
        try {
            double value= (double) converter.conversion_rates().get(toChange);
            double valorParaConvertir=cliente.getMoneyToChange();
            double convertida=valorParaConvertir*value;
            convertidasList.add(new String(cliente.getName()+" "+cliente.getLastName()+" convirtio "+
                    cliente.getMoneyToChange()+" "+cliente.getMoneyTipe()+" en "+convertida+" "+toChange));
            String mensaje= String.valueOf(convertida);
            JOptionPane.showMessageDialog(null,"la conversion es: "+mensaje);
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
            System.out.println("El programa no ha podido encontrar una modeda para cambiar.");
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }

    public String imprimirListaDeConversiones(){
        String returnStringList = "";
        for (int i=0; i<convertidasList.size();i++){
            returnStringList+=convertidasList.get(i)+"\n";
        }
        return returnStringList;
    }

}
