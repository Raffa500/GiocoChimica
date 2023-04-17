package giocochimica; 

import java.awt.MouseInfo;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class GiocoChimica extends JFrame {
    
    private JLabel Fuoco;
    private JLabel Fuoco1;
    private JLabel Acqua;
    private JLabel Terra;
    private JLabel Vento;
    private JLabel Energia;
    
    private boolean mousepressedFuoco = false;
    private boolean mousereleasedFuoco = true;
    private boolean mousepressedFuoco1 = false;
    private boolean mousereleasedFuoco1 = true;
    private boolean mousepressedAcqua = false;
    private boolean mousereleasedAcqua = true;
    private boolean mousepressedTerra = false;
    private boolean mousereleasedTerra = true;
    private boolean mousepressedVento = false;
    private boolean mousereleasedVento = true;
    private boolean mousepressedEnergia = false;
    private boolean mousereleasedEnergia = true;
    
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
        Fuoco.setLocation(1675,50);
        Fuoco.setIcon(new ImageIcon("fuocoMoltoBello.png"));
        Fuoco.addMouseListener(mlFuoco);
        this.add(Fuoco);
        
        Fuoco1=new JLabel("");
        Fuoco1.setSize(200, 200);
        Fuoco1.setLocation(1000,50);
        Fuoco1.setIcon(new ImageIcon("fuocoMoltoBello.png"));
        Fuoco1.addMouseListener(mlFuoco1);
        this.add(Fuoco1);
        
        Acqua=new JLabel("");
        Acqua.setSize(198, 250);
        Acqua.setLocation(1700,250);
        Acqua.setIcon(new ImageIcon("acqua.png"));
        Acqua.addMouseListener(mlAcqua);
        this.add(Acqua);
        
        Terra=new JLabel("");
        Terra.setSize(200, 200);
        Terra.setLocation(1700,550);
        Terra.setIcon(new ImageIcon("Terra.png"));
        Terra.addMouseListener(mlTerra);
        this.add(Terra);
        
        Vento=new JLabel("");
        Vento.setSize(200, 200);
        Vento.setLocation(1700,650);
        Vento.setIcon(new ImageIcon("vento.png"));
        Vento.addMouseListener(mlVento);
        this.add(Vento);
        
        
    }
    
    public void loop(){
        
        int i=0;
        int Mousex = 0;
        int Mousey = 0;
        
        while(i<1){
            Mousex = (int) MouseInfo.getPointerInfo().getLocation().getX();
            Mousey = (int) MouseInfo.getPointerInfo().getLocation().getY();
            
            if(mousepressedFuoco && !mousereleasedFuoco){
                Fuoco.setLocation(Mousex  - 100 , Mousey  - 150);
            }
            if(mousepressedFuoco1 && !mousereleasedFuoco1){
                Fuoco1.setLocation(Mousex  - 100 , Mousey  - 150);
            }
            if(mousepressedAcqua && !mousereleasedAcqua){
                Acqua.setLocation(Mousex -85  , Mousey  -155); 
            }
            if(mousepressedTerra && !mousereleasedTerra){
                Terra.setLocation(Mousex  - 100 , Mousey  - 125);
            }
            if(mousepressedVento && !mousereleasedVento){
                Vento.setLocation(Mousex  - 100 , Mousey  - 73);
            }
            if(mousepressedEnergia && !mousereleasedEnergia){
                Energia.setLocation(Mousex  - 100 , Mousey  - 100);
            }
            
            if(mousereleasedFuoco && Fuoco.getX() - Acqua.getX()>=10 && Fuoco.getY() - Acqua.getY()>=10){
                
                /*Vento=new JLabel("");
                Vento.setSize(200, 200);
                Vento.setLocation(700,400);
                Vento.setIcon(new ImageIcon("vento.png"));
                Vento.addMouseListener(mlVento);
                this.add(Vento);*/
                
                Terra=new JLabel("");
                Terra.setSize(200, 200);
                Terra.setLocation(960,540);
                Terra.setIcon(new ImageIcon("Terra.png"));
                Terra.addMouseListener(mlTerra);
                this.add(Terra);
                Fuoco.setLocation(1700,50);
                Acqua.setLocation(1700,350);
                
            }
            
            if(mousereleasedFuoco && Fuoco1.getX() - Fuoco.getX()>=10 && Fuoco1.getY() - Fuoco.getY()>=10){
                
                Energia=new JLabel("");
                Energia.setSize(200, 200);
                Energia.setLocation(960,540);
                Energia.setIcon(new ImageIcon("energia.png"));
                Energia.addMouseListener(mlEnergia);
                this.add(Energia);
                Fuoco.setLocation(1700,50);
                Fuoco1.setLocation(1000,50);
                
            }
            
            
        }
    }
    
    MouseListener mlFuoco = new MouseListener(){
        @Override
        public void mouseClicked(MouseEvent me) {}
        @Override
        public void mousePressed(MouseEvent me) {
            mousepressedFuoco=true;
            mousereleasedFuoco=false;
        }
        @Override
        public void mouseReleased(MouseEvent me) {
            mousepressedFuoco=false;
            mousereleasedFuoco=true;
        }
        @Override
        public void mouseEntered(MouseEvent me) {}
        @Override
        public void mouseExited(MouseEvent me) {}  
    };
    
    MouseListener mlFuoco1 = new MouseListener(){
        @Override
        public void mouseClicked(MouseEvent me) {}
        @Override
        public void mousePressed(MouseEvent me) {
            mousepressedFuoco1=true;
            mousereleasedFuoco1=false;
        }
        @Override
        public void mouseReleased(MouseEvent me) {
            mousepressedFuoco1=false;
            mousereleasedFuoco1=true;
        }
        @Override
        public void mouseEntered(MouseEvent me) {}
        @Override
        public void mouseExited(MouseEvent me) {}  
    };
    
    MouseListener mlAcqua = new MouseListener(){
        @Override
        public void mouseClicked(MouseEvent me) {}
        @Override
        public void mousePressed(MouseEvent me) {
            mousepressedAcqua=true;
            mousereleasedAcqua=false;
        }
        @Override
        public void mouseReleased(MouseEvent me) {
            mousepressedAcqua=false;
            mousereleasedAcqua=true;
        }
        @Override
        public void mouseEntered(MouseEvent me) {}
        @Override
        public void mouseExited(MouseEvent me) {}  
    };
    
    MouseListener mlTerra = new MouseListener(){
        @Override
        public void mouseClicked(MouseEvent me) {}
        @Override
        public void mousePressed(MouseEvent me) {
            mousepressedTerra=true;
            mousereleasedTerra=false;
        }
        @Override
        public void mouseReleased(MouseEvent me) {
            mousepressedTerra=false;
            mousereleasedTerra=true;
        }
        @Override
        public void mouseEntered(MouseEvent me) {}
        @Override
        public void mouseExited(MouseEvent me) {}  
    };
    
    MouseListener mlVento = new MouseListener(){
        @Override
        public void mouseClicked(MouseEvent me) {}
        @Override
        public void mousePressed(MouseEvent me) {
            mousepressedVento=true;
            mousereleasedVento=false;
        }
        @Override
        public void mouseReleased(MouseEvent me) {
            mousepressedVento=false;
            mousereleasedVento=true;
        }
        @Override
        public void mouseEntered(MouseEvent me) {}
        @Override
        public void mouseExited(MouseEvent me) {}  
    };
    
    MouseListener mlEnergia = new MouseListener(){
        @Override
        public void mouseClicked(MouseEvent me) {}
        @Override
        public void mousePressed(MouseEvent me) {
            mousepressedEnergia=true;
            mousereleasedEnergia=false;
        }
        @Override
        public void mouseReleased(MouseEvent me) {
            mousepressedEnergia=false;
            mousereleasedEnergia=true;
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
