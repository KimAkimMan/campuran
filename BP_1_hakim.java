import java.awt.*;
public class BP_1_hakim extends Frame{
    public static void main(String[] args) {
        BP_1_hakim test = new BP_1_hakim();
 
    }
    public BP_1_hakim(){
        super ("Bp 1 hakim");
        setSize(300,100);
        Panel panelTombol = new Panel();
        panelTombol.add(new Button ("mulai"));
        panelTombol.add(new Button ("selesai"));
        add("South", panelTombol);

        show();
    }
}
