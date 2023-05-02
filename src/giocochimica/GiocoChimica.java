package giocochimica; 

import java.awt.MouseInfo;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class GiocoChimica extends JFrame {
    
    private JLabel Fuoco;
    private JLabel Fuoco1;
    private JLabel Vulcano;
    private JLabel Vapore;
    private JLabel Nuvola;
    private JLabel Acqua;
    private JLabel Acqua1;
    private JLabel Lago;
    private JLabel Terra;
    private JLabel Terra1;
    private JLabel Continente;
    private JLabel Vento;
    private JLabel Vento1;
    private JLabel Tornado;
    private JLabel Energia;
    private JLabel Oceano;
    private JLabel Pianeta;
    
    private boolean mousepressedFuoco = false;
    private boolean mousereleasedFuoco = true;
    private boolean mousepressedVulcano = false;
    private boolean mousereleasedVulcano = true;
    private boolean mousepressedVapore = false;
    private boolean mousereleasedVapore = true;
    private boolean mousepressedNuvola = false;
    private boolean mousereleasedNuvola = true;
    private boolean mousepressedFuoco1 = false;
    private boolean mousereleasedFuoco1 = true;
    private boolean mousepressedAcqua = false;
    private boolean mousereleasedAcqua = true;
    private boolean mousepressedLago = false;
    private boolean mousereleasedLago = true;
    private boolean mousepressedAcqua1 = false;
    private boolean mousereleasedAcqua1 = true;
    private boolean mousepressedTerra = false;
    private boolean mousereleasedTerra = true;
    private boolean mousepressedTerra1 = false;
    private boolean mousereleasedTerra1 = true;
    private boolean mousepressedContinente = false;
    private boolean mousereleasedContinente = true;
    private boolean mousepressedVento = false;
    private boolean mousereleasedVento = true;
    private boolean mousepressedVento1 = false;
    private boolean mousereleasedVento1 = true;
    private boolean mousepressedTornado = false;
    private boolean mousereleasedTornado = true;
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
        setTitle("LITTLE ALCHEMY");
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
        
        Lago=new JLabel("");
        Lago.setSize(200, 200);
        Lago.setLocation(750,250);
        Lago.setIcon(new ImageIcon("lago.png"));
        Lago.addMouseListener(mlLago);
        this.add(Lago);
        Lago.setVisible(false);
        
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
        
        Continente=new JLabel("");
        Continente.setSize(200, 200);
        Continente.setLocation(750,500);
        Continente.setIcon(new ImageIcon("continente.png"));
        Continente.addMouseListener(mlContinente);
        this.add(Continente);
        Continente.setVisible(false);
        
        Vento=new JLabel("");
        Vento.setSize(200, 200);
        Vento.setLocation(65,750);
        Vento.setIcon(new ImageIcon("vento.png"));
        Vento.addMouseListener(mlVento);
        this.add(Vento);
        
        Vapore=new JLabel("");
        Vapore.setSize(200, 200);
        Vapore.setLocation(1250,50);
        Vapore.setIcon(new ImageIcon("vapore.png"));
        Vapore.addMouseListener(mlVapore);
        this.add(Vapore);
        Vapore.setVisible(false);
        
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
            if(mousepressedVulcano && !mousereleasedVulcano){
                Vulcano.setLocation(Mousex  - 100 , Mousey  - 150);
            }
            if(mousepressedVapore && !mousereleasedVapore){
                Vapore.setLocation(Mousex  - 100 , Mousey  - 150);
            }
            if(mousepressedNuvola && !mousereleasedNuvola){
                Nuvola.setLocation(Mousex  - 100 , Mousey  - 150);
            }
            if(mousepressedAcqua && !mousereleasedAcqua){
                Acqua.setLocation(Mousex -85  , Mousey  -155); 
            }
            /*if(mousepressedAcqua1 && !mousereleasedAcqua1){
                Acqua1.setLocation(Mousex -85  , Mousey  -155); 
            }*/
            if(mousepressedLago && !mousereleasedLago){
                Lago.setLocation(Mousex -85  , Mousey  -155); 
            }
            if(mousepressedTerra && !mousereleasedTerra){
                Terra.setLocation(Mousex  - 100 , Mousey  - 125);
            }
            /*if(mousepressedTerra1 && !mousereleasedTerra1){
                Terra1.setLocation(Mousex  - 100 , Mousey  - 125);
            }*/
            if(mousepressedContinente && !mousereleasedContinente){
                Continente.setLocation(Mousex  - 100 , Mousey  - 125);
            }
            if(mousepressedVento && !mousereleasedVento){
                Vento.setLocation(Mousex  - 100 , Mousey  - 73);
            }
            /*if(mousepressedVento1 && !mousereleasedVento1){
                Vento1.setLocation(Mousex  - 100 , Mousey  - 73);
            }*/
            if(mousepressedTornado && !mousereleasedTornado){
                Tornado.setLocation(Mousex  - 100 , Mousey  - 73);
            }
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
            
            if(mousereleasedTerra && ((Fuoco1.getX()-Terra.getX()>=0 && Fuoco1.getX()-Terra.getX()<=100) || (Fuoco1.getX()-Terra.getX()<=0 && Fuoco1.getX()-Terra.getX()>=-100))  &&    ((Fuoco1.getY()-Terra.getY()>=0 && Fuoco1.getY()-Terra.getY()<=100) || (Fuoco1.getY()-Terra.getY()<=0 && Fuoco1.getY()-Terra.getY()>=-100))){      
                
                Vulcano=new JLabel("");
                Vulcano.setSize(200, 200);
                Vulcano.setLocation(1000,50);
                Vulcano.setIcon(new ImageIcon("vulcano.png"));
                Vulcano.addMouseListener(mlVulcano);
                this.add(Vulcano);
                Terra.setLocation(50,500);
                Fuoco1.setLocation(390,50);
                
            }
            
            if(mousereleasedAcqua && ((Fuoco1.getX()-Acqua.getX()>=0 && Fuoco1.getX()-Acqua.getX()<=100) || (Fuoco1.getX()-Acqua.getX()<=0 && Fuoco1.getX()-Acqua.getX()>=-100))  &&    ((Fuoco1.getY()-Acqua.getY()>=0 && Fuoco1.getY()-Acqua.getY()<=100) || (Fuoco1.getY()-Acqua.getY()<=0 && Fuoco1.getY()-Acqua.getY()>=-100))){      
                
                Vapore=new JLabel("");
                Vapore.setSize(200, 200);
                Vapore.setLocation(1250,50);
                Vapore.setIcon(new ImageIcon("vapore.png"));
                Vapore.addMouseListener(mlVapore);
                this.add(Vapore);
                Vapore.setVisible(true);
                Acqua.setLocation(60,250);
                Fuoco1.setLocation(390,50);
                
            }
            
            if(mousereleasedVapore && ((Vento1.getX()-Vapore.getX()>=0 && Vento1.getX()-Vapore.getX()<=100) || (Vento1.getX()-Vapore.getX()<=0 && Vento1.getX()-Vapore.getX()>=-100))  &&    ((Vento1.getY()-Vapore.getY()>=0 && Vento1.getY()-Vapore.getY()<=100) || (Vento1.getY()-Vapore.getY()<=0 && Vento1.getY()-Vapore.getY()>=-100))){
                
                Nuvola=new JLabel("");
                Nuvola.setSize(200, 200);
                Nuvola.setLocation(750,750);
                Nuvola.setIcon(new ImageIcon("nuvola.png"));
                Nuvola.addMouseListener(mlNuvola);
                this.add(Nuvola);
                Vapore.setLocation(1250,50);
                Vento1.setLocation(390,750);
                
            }
            
            if(mousereleasedAcqua && ((Acqua1.getX()-Acqua.getX()>=0 && Acqua1.getX()-Acqua.getX()<=100) || (Acqua1.getX()-Acqua.getX()<=0 && Acqua1.getX()-Acqua.getX()>=-100))  &&    ((Acqua1.getY()-Acqua.getY()>=0 && Acqua1.getY()-Acqua.getY()<=100) || (Acqua1.getY()-Acqua.getY()<=0 && Acqua1.getY()-Acqua.getY()>=-100))){  
                
                Lago=new JLabel("");
                Lago.setSize(200, 200);
                Lago.setLocation(750,250);
                Lago.setIcon(new ImageIcon("lago.png"));
                Lago.addMouseListener(mlLago);
                this.add(Lago);
                Lago.setVisible(true);
                Acqua.setLocation(60,250);
                Acqua1.setLocation(410,250);
                
            }
            
            if(mousereleasedLago && ((Acqua1.getX()-Lago.getX()>=0 && Acqua1.getX()-Lago.getX()<=100) || (Acqua1.getX()-Lago.getX()<=0 && Acqua1.getX()-Lago.getX()>=-100))  &&    ((Acqua1.getY()-Lago.getY()>=0 && Acqua1.getY()-Lago.getY()<=100) || (Acqua1.getY()-Lago.getY()<=0 && Acqua1.getY()-Lago.getY()>=-100))){  
                
                Oceano=new JLabel("");
                Oceano.setSize(200, 200);
                Oceano.setLocation(1000,250);
                Oceano.setIcon(new ImageIcon("oceano.png"));
                Oceano.addMouseListener(mlOceano);
                this.add(Oceano);
                Lago.setLocation(750,250);
                Acqua1.setLocation(410,250);
                
            }
            
            if(mousereleasedTerra && ((Terra1.getX()-Terra.getX()>=0 && Terra1.getX()-Terra.getX()<=100) || (Terra1.getX()-Terra.getX()<=0 && Terra1.getX()-Terra.getX()>=-100))  &&    ((Terra1.getY()-Terra.getY()>=0 && Terra1.getY()-Terra.getY()<=100) || (Terra1.getY()-Terra.getY()<=0 && Terra1.getY()-Terra.getY()>=-100))){
                
                Continente=new JLabel("");
                Continente.setSize(200, 200);
                Continente.setLocation(750,500);
                Continente.setIcon(new ImageIcon("continente.png"));
                Continente.addMouseListener(mlContinente);
                this.add(Continente);
                Terra.setLocation(50,500);
                Terra1.setLocation(370,500);
                
            }
            
            if(mousereleasedContinente && ((Terra1.getX()-Continente.getX()>=0 && Terra1.getX()-Continente.getX()<=100) || (Terra1.getX()-Continente.getX()<=0 && Terra1.getX()-Continente.getX()>=-100))  &&    ((Terra1.getY()-Continente.getY()>=0 && Terra1.getY()-Continente.getY()<=100) || (Terra1.getY()-Continente.getY()<=0 && Terra1.getY()-Continente.getY()>=-100))){
                
                Pianeta=new JLabel("");
                Pianeta.setSize(200, 200);
                Pianeta.setLocation(1000,500);
                Pianeta.setIcon(new ImageIcon("pianeta.png"));
                Pianeta.addMouseListener(mlPianeta);
                this.add(Pianeta);
                Continente.setVisible(true);
                Continente.setLocation(750,500);
                Terra1.setLocation(370,500);
                
            }
            
            if(mousereleasedVento && ((Vento1.getX()-Vento.getX()>=0 && Vento1.getX()-Vento.getX()<=100) || (Vento1.getX()-Vento.getX()<=0 && Vento1.getX()-Vento.getX()>=-100))  &&    ((Vento1.getY()-Vento.getY()>=0 && Vento1.getY()-Vento.getY()<=100) || (Vento1.getY()-Vento.getY()<=0 && Vento1.getY()-Vento.getY()>=-100))){
                
                Tornado=new JLabel("");
                Tornado.setSize(200, 200);
                Tornado.setLocation(750,750);
                Tornado.setIcon(new ImageIcon("tornado.png"));
                Tornado.addMouseListener(mlTornado);
                this.add(Tornado);
                Vento.setLocation(65,750);
                Vento1.setLocation(390,750);
                
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
    
    MouseListener mlVulcano = new MouseListener(){
        @Override
        public void mouseClicked(MouseEvent me) {}
        @Override
        public void mousePressed(MouseEvent me) {
            mousepressedVulcano=true;
            mousereleasedVulcano=false;
        }
        @Override
        public void mouseReleased(MouseEvent me) {
            mousepressedVulcano=false;
            mousereleasedVulcano=true;
        }
        @Override
        public void mouseEntered(MouseEvent me) {}
        @Override
        public void mouseExited(MouseEvent me) {}  
    };
    
    MouseListener mlVapore = new MouseListener(){
        @Override
        public void mouseClicked(MouseEvent me) {}
        @Override
        public void mousePressed(MouseEvent me) {
            mousepressedVapore=true;
            mousereleasedVapore=false;
        }
        @Override
        public void mouseReleased(MouseEvent me) {
            mousepressedVapore=false;
            mousereleasedVapore=true;
        }
        @Override
        public void mouseEntered(MouseEvent me) {}
        @Override
        public void mouseExited(MouseEvent me) {}  
    };
    
    MouseListener mlNuvola = new MouseListener(){
        @Override
        public void mouseClicked(MouseEvent me) {}
        @Override
        public void mousePressed(MouseEvent me) {
            mousepressedNuvola=true;
            mousereleasedNuvola=false;
        }
        @Override
        public void mouseReleased(MouseEvent me) {
            mousepressedNuvola=false;
            mousereleasedNuvola=true;
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
    
    MouseListener mlLago = new MouseListener(){
        @Override
        public void mouseClicked(MouseEvent me) {}
        @Override
        public void mousePressed(MouseEvent me) {
            mousepressedLago=true;
            mousereleasedLago=false;
        }
        @Override
        public void mouseReleased(MouseEvent me) {
            mousepressedLago=false;
            mousereleasedLago=true;
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
    
    MouseListener mlContinente = new MouseListener(){
        @Override
        public void mouseClicked(MouseEvent me) {}
        @Override
        public void mousePressed(MouseEvent me) {
            mousepressedContinente=true;
            mousereleasedContinente=false;
        }
        @Override
        public void mouseReleased(MouseEvent me) {
            mousepressedContinente=false;
            mousereleasedContinente=true;
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
    
    MouseListener mlTornado = new MouseListener(){
        @Override
        public void mouseClicked(MouseEvent me) {}
        @Override
        public void mousePressed(MouseEvent me) {
            mousepressedTornado=true;
            mousereleasedTornado=false;
        }
        @Override
        public void mouseReleased(MouseEvent me) {
            mousepressedTornado=false;
            mousereleasedTornado=true;
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
