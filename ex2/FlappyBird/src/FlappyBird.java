import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.*;

public class FlappyBird extends JPanel {
        int boardWidth = 360;
        int boardHeight = 640;

        // Imagens 9:00 minutos que fiquei 
        Image backgroundImg;

        FlappyBird(){
                this.setPreferredSize(new Dimension(boardWidth, boardHeight));
                this.setBackground(Color.blue);
        }
}
