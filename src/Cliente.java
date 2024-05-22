import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Cliente  {

    private String name;
    private String lastName;
    private String moneyTipe ;
    private double moneyToChange;





    public Cliente() {
            this.name = JOptionPane.showInputDialog("ingresa tu primer nombre");
            this.lastName =JOptionPane.showInputDialog("ingresa tu primer apellido");
            this.moneyTipe = JOptionPane.showInputDialog("Ingresa la moneda que quieres cambiar").toUpperCase();
            this.moneyToChange = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el monto a convertir"));
    }


    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMoneyTipe() {
        return moneyTipe;
    }

    public double getMoneyToChange() {
        return moneyToChange;
    }

    public void setMoneyToChange(double moneyToChange) {
        this.moneyToChange = moneyToChange;
    }
}
