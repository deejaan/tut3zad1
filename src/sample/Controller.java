package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Controller {
    public TextField unesi_n;
    public Label ispis;

    private static int SumaCifara(int n) {
        int suma=0;
        while(n>0) {
            suma += n % 10;
            n /= 10;
        }
        return suma;
    }

    public void Izracunaj(ActionEvent actionEvent) {
        int n = Integer.parseInt(unesi_n.getText());
        String rezultat = "";
        for(int i=1; i<=n; i++) {
            if(i % SumaCifara(i)==0) {
                rezultat += i + " ";
            }
        }
        ispis.setText(rezultat);
    }
}
