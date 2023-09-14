import java.awt.event.*; 
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
class HandlerClass implements ActionListener{

  public static void main(String[] args){
    HandlerClass handler = new HandlerClass();
     final JFrame f = new JFrame("Testing out these JPanels");
     f.setSize(400, 100); 
     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
     f.setLocationRelativeTo(null); 
     f.setLayout(new GridLayout(2, 3));
     JButton b = new JButton("button 1");
     b.addActionListener(new HandlerClass());
     JButton butt = new JButton("button 2");

     JButton bug = new JButton("button 3");

     JButton button = new JButton("button 4");

     JButton button5 = new JButton("button 5");

     JButton button6 = new JButton("button 6");

     JPanel p = new JPanel();
     p.setVisible(true);
     JPanel pnl = new JPanel();
     p.add(b);
     p.add(butt);
     p.add(bug);
     pnl.add(button);
     pnl.add(button5);
     pnl.add(button6);
     f.add(p, BorderLayout.CENTER);
     f.add(pnl, BorderLayout.SOUTH);
     f.setVisible(true);
     f.setBackground(Color.RED);
   }
     public void actionPerformed(ActionEvent e){
        f.setBackground(Color.WHITE);
       }
    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

     }