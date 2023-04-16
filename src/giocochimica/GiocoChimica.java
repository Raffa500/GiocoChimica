package giocochimica; 
import java.awt.MouseInfo;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class GiocoChimica extends JFrame {
    
    private JLabel Fuoco;
    private JLabel Acqua;
    private JLabel Terra;
    private JLabel Vento;
    
    private boolean mousepressed1 = false;
    private boolean mousereleased1 = true; 
    private boolean mousepressed2 = false;
    private boolean mousereleased2 = true;
    private boolean mousepressed3 = false;
    private boolean mousereleased3 = true;
    private boolean mousepressed4 = false;
    private boolean mousereleased4 = true;
    
    
    
    public GiocoChimica(){
        init();
        loop();
    }
    
    public void init(){
        
        setSize(1920,1080);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("SE NON FUNZIONA GUARDA");
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);
        
        Fuoco=new JLabel("");
        Fuoco.setSize(200, 200);
        Fuoco.setLocation(1700,50);
        Fuoco.setIcon(new ImageIcon("fuocoMoltoBello.png"));
        Fuoco.addMouseListener(ml1);
        this.add(Fuoco);
        
        Acqua=new JLabel("");
        Acqua.setSize(198, 250);
        Acqua.setLocation(500,300);
        Acqua.setIcon(new ImageIcon("acqua.png"));
        Acqua.addMouseListener(ml2);
        this.add(Acqua);
        
        
        
        
    }
    
    public void loop(){
        int i=0;
        int Mousex = 0;
        int Mousey = 0;
        
        while(i<1){
            Mousex = (int) MouseInfo.getPointerInfo().getLocation().getX();
            Mousey = (int) MouseInfo.getPointerInfo().getLocation().getY();
            
            if(mousepressed1 && !mousereleased1){
                Fuoco.setLocation(Mousex  - 100 , Mousey  - 73);
            }
            if(mousepressed2 && !mousereleased2){
                Acqua.setLocation(Mousex  - 200 , Mousey  - 110); 
            }
            if(mousepressed3 && !mousereleased3){
                Terra.setLocation(Mousex  - 100 , Mousey  - 73);
            }
            if(mousepressed4 && !mousereleased4){
                Vento.setLocation(Mousex  - 100 , Mousey  - 73);
            }
            
            if(mousereleased1 && Fuoco.getX() - Acqua.getX()<200){
                /*Vento=new JLabel("");
                Vento.setSize(200, 200);
                Vento.setLocation(700,400);
                Vento.setIcon(new ImageIcon("vento.png"));
                Vento.addMouseListener(ml4);
                this.add(Vento);*/
                
                Terra=new JLabel("");
                Terra.setSize(200, 200);
                Terra.setLocation(500,300);
                Terra.setIcon(new ImageIcon("Terra.png"));
                Terra.addMouseListener(ml3);
                this.add(Terra);
                Fuoco.setLocation(1000,500);
                Acqua.setLocation(200,500);
                
            }
        }
    }
    
    
    
    MouseListener ml1 = new MouseListener(){
        @Override
        public void mouseClicked(MouseEvent me) {}
        @Override
        public void mousePressed(MouseEvent me) {
            mousepressed1=true;
            mousereleased1=false;
        }
        @Override
        public void mouseReleased(MouseEvent me) {
            mousepressed1=false;
            mousereleased1=true;
        }
        @Override
        public void mouseEntered(MouseEvent me) {}
        @Override
        public void mouseExited(MouseEvent me) {}  
    };
    
    
    
    MouseListener ml2 = new MouseListener(){
        @Override
        public void mouseClicked(MouseEvent me) {}
        @Override
        public void mousePressed(MouseEvent me) {
            mousepressed2=true;
            mousereleased2=false;
        }
        @Override
        public void mouseReleased(MouseEvent me) {
            mousepressed2=false;
            mousereleased2=true;
        }
        @Override
        public void mouseEntered(MouseEvent me) {}
        @Override
        public void mouseExited(MouseEvent me) {}  
    };
    
    MouseListener ml3 = new MouseListener(){
        @Override
        public void mouseClicked(MouseEvent me) {}
        @Override
        public void mousePressed(MouseEvent me) {
            mousepressed3=true;
            mousereleased3=false;
        }
        @Override
        public void mouseReleased(MouseEvent me) {
            mousepressed3=false;
            mousereleased3=true;
        }
        @Override
        public void mouseEntered(MouseEvent me) {}
        @Override
        public void mouseExited(MouseEvent me) {}  
    };
    
    MouseListener ml4 = new MouseListener(){
        @Override
        public void mouseClicked(MouseEvent me) {}
        @Override
        public void mousePressed(MouseEvent me) {
            mousepressed4=true;
            mousereleased4=false;
        }
        @Override
        public void mouseReleased(MouseEvent me) {
            mousepressed4=false;
            mousereleased4=true;
        }
        @Override
        public void mouseEntered(MouseEvent me) {}
        @Override
        public void mouseExited(MouseEvent me) {}  
    };

    public static void main(String[] args) {
        new GiocoChimica();
    }
    
}
