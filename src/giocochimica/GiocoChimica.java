package giocochimica; 

import java.awt.MouseInfo;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class GiocoChimica extends JFrame {
    
    private JLabel Fuoco;
    private JLabel Fuoco1;
    private JLabel Acqua;
    private JLabel Acqua1;
    private JLabel Terra;
    private JLabel Terra1;
    private JLabel Vento;
    private JLabel Vento1;
    private JLabel Energia;
    private JLabel Oceano;
    private JLabel Pianeta;
    
    private boolean mousepressedFuoco = false;
    private boolean mousereleasedFuoco = true;
    private boolean mousepressedFuoco1 = false;
    private boolean mousereleasedFuoco1 = true;
    private boolean mousepressedAcqua = false;
    private boolean mousereleasedAcqua = true;
    private boolean mousepressedAcqua1 = false;
    private boolean mousereleasedAcqua1 = true;
    private boolean mousepressedTerra = false;
    private boolean mousereleasedTerra = true;
    private boolean mousepressedTerra1 = false;
    private boolean mousereleasedTerra1 = true;
    private boolean mousepressedVento = false;
    private boolean mousereleasedVento = true;
    private boolean mousepressedVento1 = false;
    private boolean mousereleasedVento1 = true;
    private boolean mousepressedEnergia = false;
    private boolean mousereleasedEnergia = true;
    private boolean mousepressedOceano = false;
    private boolean mousereleasedOceano = true;
    private boolean mousepressedPianeta = false;
    private boolean mousereleasedPianeta = true;
    
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
        Fuoco.setLocation(40,50);
        Fuoco.setIcon(new ImageIcon("fuocoMoltoBello.png"));
        Fuoco.addMouseListener(mlFuoco);
        this.add(Fuoco);
        
        Fuoco1=new JLabel("");
        Fuoco1.setSize(200, 200);
        Fuoco1.setLocation(390,50);
        Fuoco1.setIcon(new ImageIcon("fuocoMoltoBello.png"));
        Fuoco1.addMouseListener(mlFuoco1);
        this.add(Fuoco1);
        
        Acqua=new JLabel("");
        Acqua.setSize(198, 200);
        Acqua.setLocation(60,250);
        Acqua.setIcon(new ImageIcon("acqua.png"));
        Acqua.addMouseListener(mlAcqua);
        this.add(Acqua);
        
        Acqua1=new JLabel("");
        Acqua1.setSize(198, 200);
        Acqua1.setLocation(410,250);
        Acqua1.setIcon(new ImageIcon("acqua.png"));
        Acqua1.addMouseListener(mlAcqua1);
        this.add(Acqua1);
        
        Terra=new JLabel("");
        Terra.setSize(200, 200);
        Terra.setLocation(50,500);
        Terra.setIcon(new ImageIcon("Terra.png"));
        Terra.addMouseListener(mlTerra);
        this.add(Terra);
        
        Terra1=new JLabel("");
        Terra1.setSize(200, 200);
        Terra1.setLocation(370,500);
        Terra1.setIcon(new ImageIcon("Terra.png"));
        Terra1.addMouseListener(mlTerra1);
        this.add(Terra1);
        
        Vento=new JLabel("");
        Vento.setSize(200, 200);
        Vento.setLocation(65,750);
        Vento.setIcon(new ImageIcon("vento.png"));
        Vento.addMouseListener(mlVento);
        this.add(Vento);
        
        Vento1=new JLabel("");
        Vento1.setSize(200, 200);
        Vento1.setLocation(390,750);
        Vento1.setIcon(new ImageIcon("vento.png"));
        Vento1.addMouseListener(mlVento1);
        this.add(Vento1);
        
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
            /*if(mousepressedFuoco1 && !mousereleasedFuoco1){
                Fuoco1.setLocation(Mousex  - 100 , Mousey  - 150);
            }*/
            if(mousepressedAcqua && !mousereleasedAcqua){
                Acqua.setLocation(Mousex -85  , Mousey  -155); 
            }
            /*if(mousepressedAcqua1 && !mousereleasedAcqua1){
                Acqua1.setLocation(Mousex -85  , Mousey  -155); 
            }*/
            if(mousepressedTerra && !mousereleasedTerra){
                Terra.setLocation(Mousex  - 100 , Mousey  - 125);
            }
            /*if(mousepressedTerra1 && !mousereleasedTerra1){
                Terra1.setLocation(Mousex  - 100 , Mousey  - 125);
            }*/
            if(mousepressedVento && !mousereleasedVento){
                Vento.setLocation(Mousex  - 100 , Mousey  - 73);
            }
            /*if(mousepressedVento1 && !mousereleasedVento1){
                Vento1.setLocation(Mousex  - 100 , Mousey  - 73);
            }*/
            if(mousepressedEnergia && !mousereleasedEnergia){
                Energia.setLocation(Mousex  - 100 , Mousey  - 100);
            }
            if(mousepressedOceano && !mousereleasedOceano){
                Oceano.setLocation(Mousex  - 100 , Mousey  - 100);
            }
            if(mousepressedPianeta && !mousereleasedPianeta){
                Pianeta.setLocation(Mousex  - 100 , Mousey  - 100);
            }
            
            /*if(mousereleasedFuoco && Fuoco.getX() - Acqua.getX()>=10 && Fuoco.getY() - Acqua.getY()>=10){
                
                Vento=new JLabel("");
                Vento.setSize(200, 200);
                Vento.setLocation(700,400);
                Vento.setIcon(new ImageIcon("vento.png"));
                Vento.addMouseListener(mlVento);
                this.add(Vento);
                
                Terra=new JLabel("");
                Terra.setSize(200, 200);
                Terra.setLocation(960,540);
                Terra.setIcon(new ImageIcon("Terra.png"));
                Terra.addMouseListener(mlTerra);
                this.add(Terra);
                Fuoco.setLocation(1700,50);
                Acqua.setLocation(1700,350);
                
            }*/
            
            if(mousereleasedFuoco && ((Fuoco1.getX()-Fuoco.getX()>=0 && Fuoco1.getX()-Fuoco.getX()<=100) || (Fuoco1.getX()-Fuoco.getX()<=0 && Fuoco1.getX()-Fuoco.getX()>=-100))  &&    ((Fuoco1.getY()-Fuoco.getY()>=0 && Fuoco1.getY()-Fuoco.getY()<=100) || (Fuoco1.getY()-Fuoco.getY()<=0 && Fuoco1.getY()-Fuoco.getY()>=-100))){      
                
                Energia=new JLabel("");
                Energia.setSize(200, 200);
                Energia.setLocation(700,50);
                Energia.setIcon(new ImageIcon("energia.png"));
                Energia.addMouseListener(mlEnergia);
                this.add(Energia);
                Fuoco.setLocation(40,50);
                Fuoco1.setLocation(390,50);
                
            }
            
            if(mousereleasedAcqua && ((Acqua1.getX()-Acqua.getX()>=0 && Acqua1.getX()-Acqua.getX()<=100) || (Acqua1.getX()-Acqua.getX()<=0 && Acqua1.getX()-Acqua.getX()>=-100))  &&    ((Acqua1.getY()-Acqua.getY()>=0 && Acqua1.getY()-Acqua.getY()<=100) || (Acqua1.getY()-Acqua.getY()<=0 && Acqua1.getY()-Acqua.getY()>=-100))){  
                
                Oceano=new JLabel("");
                Oceano.setSize(200, 200);
                Oceano.setLocation(750,250);
                Oceano.setIcon(new ImageIcon("oceano.png"));
                Oceano.addMouseListener(mlOceano);
                this.add(Oceano);
                Acqua.setLocation(60,250);
                Acqua1.setLocation(410,250);
                
            }
            
            if(mousereleasedTerra && ((Terra1.getX()-Terra.getX()>=0 && Terra1.getX()-Terra.getX()<=100) || (Terra1.getX()-Terra.getX()<=0 && Terra1.getX()-Terra.getX()>=-100))  &&    ((Terra1.getY()-Terra.getY()>=0 && Terra1.getY()-Terra.getY()<=100) || (Terra1.getY()-Terra.getY()<=0 && Terra1.getY()-Terra.getY()>=-100))){
                
                Pianeta=new JLabel("");
                Pianeta.setSize(200, 200);
                Pianeta.setLocation(750,500);
                Pianeta.setIcon(new ImageIcon("pianeta.png"));
                Pianeta.addMouseListener(mlPianeta);
                this.add(Pianeta);
                Terra.setLocation(50,500);
                Terra1.setLocation(370,500);
                
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
    
    MouseListener mlAcqua1 = new MouseListener(){
        @Override
        public void mouseClicked(MouseEvent me) {}
        @Override
        public void mousePressed(MouseEvent me) {
            mousepressedAcqua1=true;
            mousereleasedAcqua1=false;
        }
        @Override
        public void mouseReleased(MouseEvent me) {
            mousepressedAcqua1=false;
            mousereleasedAcqua1=true;
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
    
    MouseListener mlTerra1 = new MouseListener(){
        @Override
        public void mouseClicked(MouseEvent me) {}
        @Override
        public void mousePressed(MouseEvent me) {
            mousepressedTerra1=true;
            mousereleasedTerra1=false;
        }
        @Override
        public void mouseReleased(MouseEvent me) {
            mousepressedTerra1=false;
            mousereleasedTerra1=true;
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
    
    MouseListener mlVento1 = new MouseListener(){
        @Override
        public void mouseClicked(MouseEvent me) {}
        @Override
        public void mousePressed(MouseEvent me) {
            mousepressedVento1=true;
            mousereleasedVento1=false;
        }
        @Override
        public void mouseReleased(MouseEvent me) {
            mousepressedVento1=false;
            mousereleasedVento1=true;
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
    
    MouseListener mlOceano = new MouseListener(){
        @Override
        public void mouseClicked(MouseEvent me) {}
        @Override
        public void mousePressed(MouseEvent me) {
            mousepressedOceano=true;
            mousereleasedOceano=false;
        }
        @Override
        public void mouseReleased(MouseEvent me) {
            mousepressedOceano=false;
            mousereleasedOceano=true;
        }
        @Override
        public void mouseEntered(MouseEvent me) {}
        @Override
        public void mouseExited(MouseEvent me) {}  
    };
    MouseListener mlPianeta = new MouseListener(){
        @Override
        public void mouseClicked(MouseEvent me) {}
        @Override
        public void mousePressed(MouseEvent me) {
            mousepressedPianeta=true;
            mousereleasedPianeta=false;
        }
        @Override
        public void mouseReleased(MouseEvent me) {
            mousepressedPianeta=false;
            mousereleasedPianeta=true;
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
