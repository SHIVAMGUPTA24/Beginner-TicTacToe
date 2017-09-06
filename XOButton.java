import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by prince on 4/6/17.
 */
public class XOButton extends JButton implements ActionListener{
    ImageIcon X,O;
    byte value=0;
    public XOButton(){
        X=new ImageIcon(this.getClass().getResource("X.png"));
        O=new ImageIcon(this.getClass().getResource("O.jpeg"));
        this.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        value++;
        value%=3;
        switch (value)
        {
            case 0:
                setIcon(null);

                break;
            case 1:
                setIcon(X);
                break;
            case 2:
                setIcon(O);
                break;
        }
    }
}
