import javax.swing.*; 
import java.awt.*;  

public class m2aplet extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        Font f = new Font("Comic Sans MS", Font.BOLD, 20);
        g.setFont(f);
        g.setColor(Color.BLUE);
        
        int xPusat = this.getWidth() / 2;
        int yPusat = this.getHeight() / 2;
        String s = "ayo belajar java aplikasi";
        
        FontMetrics fm = g.getFontMetrics(f);
        int posisiX = xPusat - (fm.stringWidth(s) / 2);
        g.drawString(s, posisiX, yPusat);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Java Aplikasi");
        m2aplet panel = new m2aplet();  // Create an instance of m2aplet
        
        frame.add(panel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
