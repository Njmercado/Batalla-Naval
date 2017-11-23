package Model;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Scanner;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
/**
 *
 * @author Guest
 */
public class BattleCamp {

    private static Cell[][] campCell = new Cell[10][10];

    public BattleCamp(JPanel camp, boolean drow) {

        int x = camp.getWidth();
        x = x / 10;
        int y = camp.getHeight();
        y = y / 10;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                Cell cell = new Cell(new Point(i, j), new Dimension(x, y), drow);
                campCell[i][j] = cell;
                camp.add(((Cell) campCell[i][j]).getCell());
            }
        }
        camp.updateUI();
    }

    public void startGame(String opponentNickName, Server server){
        
        Scanner s = new Scanner(System.in);
        
        while(true){
            
            System.out.println(s.nextLine());
        }
    }
    
    public Point getSelected(){
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (((Cell) campCell[i][j]).isSelected()) {
                    return ((Cell) campCell[i][j]).getPoint();
                }
            }
        }
        
        return null;
    }
}

class Cell implements Runnable {

    private Point point;
    private JButton cell;
    private String type;
    private Dimension dimension;
    private boolean isSelected = false;

    public Cell(Point point, Dimension dimension, boolean drow) {

        this.dimension = dimension;
        this.point = point;
        cell = new JButton();
        cell.setSize(dimension);
        cell.setOpaque(false);
        cell.setLayout(null);
        cell.setLocation(point.x * dimension.width, point.y * dimension.height);
        cell.setVisible(true);
        cell.setBorderPainted(!drow);
        cell.setContentAreaFilled(false);
        if (drow) {
            ImageIcon im = null;

            if (Math.floor(Math.random() * 100 + 1) == 1) {

                im = new ImageIcon(getClass().getResource("/Images/sunkenShip.png"));
                Icon ic = new ImageIcon(im.getImage().getScaledInstance(dimension.width + 30, dimension.height + 30, Image.SCALE_DEFAULT));
                cell.setIcon(ic);
                this.type = "faro";
            } else if (Math.floor(Math.random() * 100 + 1) == 2) {

                im = new ImageIcon(getClass().getResource("/Images/rock.png"));
                Icon ic = new ImageIcon(im.getImage().getScaledInstance(dimension.width, dimension.height, Image.SCALE_DEFAULT));
                cell.setIcon(ic);
                this.type = "island";
            } else {

                this.type = "water";
            }
        }
        cell.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                isSelected = true;
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
    }

    public boolean isSelected() {

        if (isSelected) {
            isSelected = false;
            return !isSelected;
        }
        return this.isSelected;
    }

    public String getType() {
        return this.type;
    }

    public Point getPoint() {
        return this.point;
    }

    public JButton getCell() {
        return this.cell;
    }

    private void thread() {
        Thread t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        try {
            ImageIcon im = new ImageIcon(getClass().getResource("/Images/explotion.gif"));
            Icon ic = new ImageIcon(im.getImage().getScaledInstance(dimension.width, dimension.height, Image.SCALE_DEFAULT));
            this.cell.setIcon(ic);
            Thread.sleep(1400);
            this.cell.setIcon(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
