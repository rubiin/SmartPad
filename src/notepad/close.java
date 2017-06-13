package notepad;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;

public class close extends JPanel implements ActionListener,MouseListener{

    private final JTabbedPane pane;
    private  int index;
    JPanel jps;
    private JButton closeButton;

    private JLabel titleLabel;

    public close(final JTabbedPane pane,  int index){
        super(new BorderLayout());
        setOpaque(false);

        this.pane = pane;
        this.index = index;
        String txt ="tab"+(pane.getTabCount());
        titleLabel = new JLabel(txt);
        titleLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 12));
        titleLabel.setHorizontalAlignment(JLabel.CENTER);

        closeButton = new JButton("   x");
        closeButton.setBorder(new EmptyBorder(-5, 2, -5, 0));
        closeButton.setOpaque(false);
        closeButton.setContentAreaFilled(false);
        closeButton.setFont(closeButton.getFont().deriveFont(15F));
        closeButton.setForeground(Color.gray);
        closeButton.addActionListener(this);
        closeButton.addMouseListener(this);

        add(titleLabel, BorderLayout.CENTER);
        add(closeButton, BorderLayout.EAST);

        setPreferredSize(getPreferredSize());
    }

    public void actionPerformed(ActionEvent e){
        final Object source = e.getSource();
        if(source.equals(closeButton)){
            pane.remove(pane.indexOfTabComponent(this));
            pane.revalidate();
            pane.repaint();
        }
    }

    
    

    @Override
    public void mouseEntered(MouseEvent e) {
    
        closeButton.setForeground(Color.red);
        
        
    }
    
 
    @Override
    public void mouseExited(MouseEvent e) {
        closeButton.setForeground(Color.gray);
    }
    
    
    
    public void apply(){
        
        pane.setTabComponentAt(index, this);
        pane.revalidate();
        pane.repaint();
    }

    public static void apply(final JTabbedPane pane, final int index){
        new close(pane, index).apply();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}