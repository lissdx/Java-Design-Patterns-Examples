package JFrame;

import java.awt.Graphics;

import javax.swing.JFrame;

public class MyJFrame extends JFrame {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public MyJFrame(final String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(300, 300);
        this.setVisible(true);
    }

    public void paint(Graphics graphics) {
        super.paint(graphics);
        String msg = "I rule!!!";
        graphics.drawString(msg, 100, 100);
    }

    public static void main(String[] args) {
        MyJFrame myJFrame = new MyJFrame( "Template Desighn Pattern" );        
    }

}
