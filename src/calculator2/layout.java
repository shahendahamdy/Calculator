/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator2;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.math.BigInteger;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author nice
 */
public class layout extends JFrame implements ActionListener,KeyListener,ItemListener{
 
double z=0;
     double x=0,y=0,result=0;
     String currentText="";
    int operator=0;
    double h=1;
    
    
    
    JPanel p =new JPanel();
    JPanel p1 =new JPanel();
    JPanel p2 =new JPanel();
    JPanel p3 =new JPanel();
    JPanel p4 =new JPanel();

    JTextField t1=new JTextField();
    
    JMenuBar mbar =new JMenuBar();
    JMenu m1=new JMenu("file");
    JMenu m2=new JMenu("help");
    
    JButton del = new JButton("DEL");
    JButton clr = new JButton("CLR");
    JButton ans = new JButton("ANS");
    JButton exit = new JButton("EXIT");
    JButton zero = new JButton(" 0 ");
    JButton one = new JButton(" 1 ");
    JButton two = new JButton(" 2 ");
    JButton three = new JButton(" 3 ");
    JButton four = new JButton(" 4 ");
    JButton five = new JButton(" 5 ");
    JButton six = new JButton(" 6 ");
    JButton seven = new JButton(" 7 ");
    JButton eight = new JButton(" 8 ");
    JButton nine = new JButton(" 9 ");
    JButton plus = new JButton(" + ");
    JButton minus = new JButton(" - ");
    JButton mul = new JButton(" * ");
    JButton div =new JButton(" / ");
    JButton dot = new JButton(" . ");
    JButton posOrNeg = new JButton(" ± ");
    JButton xSqr  = new JButton(" χ2 ");
    JButton xPower3 = new JButton(" χ3 ");
    JButton xPowerY = new JButton(" χy ");
    JButton reciporcal = new JButton(" 1/x ");
    JButton qos1= new JButton(" ( ");
    JButton root2 = new JButton(" √ ");
    JButton root3 = new JButton(" ∛ ");
    JButton rooty = new JButton(" y√ ");
    JButton fact = new JButton(" n! ");
    JButton qos2 = new JButton(" ) ");
    JButton sin = new JButton(" sin ");
    JButton cos= new JButton(" cos ");
    JButton tan = new JButton(" tan ");
    JButton exp = new JButton(" exp ");
    JButton npr = new JButton(" nPr ");
    JButton asin = new JButton(" asin ");
    JButton acos = new JButton(" acos ");
    JButton atan = new JButton(" atan ");
    JButton log = new JButton(" log ");
    JButton ncr = new JButton(" nCr ");
    JButton sinh = new JButton(" sinh ");
    JButton cosh = new JButton(" cosh ");
    JButton tanh = new JButton(" tanh ");
    JButton log10 = new JButton(" log10 ");
    JButton pi = new JButton(" ∏ ");
    
    JCheckBox scientific =new JCheckBox();
    
        
    public layout(){
        
        this.setTitle("Calculator");
        this.setSize(1100, 800);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        //main panel
        p.setBackground(new Color(51,127,92));
        this.add(p);
        p.setLayout(null); //t7kom fl main layout tb2a absolute
        //menu
        mbar.setBounds(0,0,1100,20);
        mbar.add(m1);
        mbar.add(m2);
        p.add(mbar);
        
        //add the first part textfield
        t1.setBounds(50,30,1000,40);
        p.add(t1);
        //second part add panel
        p1.setBounds(50,90,1000,70);
        p.add(p1);
        p1.setBackground(new Color(102,178,143));
        //third part 2 sub panels
        p2.setBounds(50,210,400,400);
        p.add(p2);
        p2.setBackground(new Color(102,178,143));
        
        p3.setBounds(500,210,550,400);
        p.add(p3);
        p3.setBackground(new Color(102,178,143));
        //h7ot buttons l tani part
        p1.setLayout(null);
        del.setBounds(10,15,80,40);
        p1.add(del);
        
        clr.setBounds(100,15,80,40);
        p1.add(clr);
        
        ans.setBounds(810,15,80,40);
        p1.add(ans);
        
        exit.setBounds(900,15,80,40);
        p1.add(exit);
        
        // hn3mll el layout p2 array 4*4
        p2.setLayout(new GridLayout(4,4,5,10));
        p2.add(seven);p2.add(eight);p2.add(nine);p2.add(plus);
        p2.add(four);p2.add(five);p2.add(six);p2.add(minus);
        p2.add(one);p2.add(two);p2.add(three);p2.add(mul);
        p2.add(zero);p2.add(dot);p2.add(posOrNeg);p2.add(div);
        
        
        // hn3mll el layout p3 array 5*5
        p3.setLayout(new GridLayout(5,5,5,10));
        p3.setVisible(false);
        p3.add(xSqr);p3.add(xPower3);p3.add(xPowerY);p3.add(reciporcal);p3.add(qos1);
        p3.add(root2);p3.add(root3);p3.add(rooty);p3.add(fact);p3.add(qos2);
        p3.add(sin);p3.add(cos);p3.add(tan);p3.add(exp);p3.add(npr);
        p3.add(asin);p3.add(acos);p3.add(atan);p3.add(log);p3.add(ncr);
        p3.add(sinh);p3.add(cosh);p3.add(tanh);p3.add(log10);p3.add(pi);

        
        //last checkbox
      p4.setBounds(50,650,100,40);
     p.add(p4);
      p4.setBackground(new Color(102,178,143));
      scientific.setText("Scientific");
      scientific.setBackground(new Color(102,178,143));
      p4.add(scientific);
      
      //--------------------Action Listnner
       del.addActionListener(this);
      clr.addActionListener(this);
      ans.addActionListener(this);
      exit.addActionListener(this);
      
      one.addActionListener(this);
      two.addActionListener(this);
      three.addActionListener(this);
      four.addActionListener(this);
      five.addActionListener(this);
      six.addActionListener(this);
      seven.addActionListener(this);
      eight.addActionListener(this);
      nine.addActionListener(this);
      zero.addActionListener(this);
      plus.addActionListener(this);
      minus.addActionListener(this);
      div.addActionListener(this);
      dot.addActionListener(this);
      posOrNeg.addActionListener(this);
      mul.addActionListener(this);
    
      xSqr.addActionListener(this);
      xPower3.addActionListener(this);
      xPowerY.addActionListener(this);
      reciporcal.addActionListener(this);
      root2.addActionListener(this);
      root3.addActionListener(this);
      rooty.addActionListener(this);
      qos1.addActionListener(this);
      qos2.addActionListener(this);
      fact.addActionListener(this);
      sin.addActionListener(this);
      sinh.addActionListener(this);
      cos.addActionListener(this);
      cosh.addActionListener(this);
      acos.addActionListener(this);
      asin.addActionListener(this);
    atan.addActionListener(this);
      tan.addActionListener(this);
      tanh.addActionListener(this);
      exp.addActionListener(this);
      ncr.addActionListener(this);
      npr.addActionListener(this);
      log.addActionListener(this);
      log10.addActionListener(this);
      pi.addActionListener(this);
         scientific.addActionListener(this);
   
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        //numbers
        System.out.println(ae.getSource());
        if(ae.getSource()==one)
            t1.setText(t1.getText().concat("1"));
         if(ae.getSource()==two)
            t1.setText(t1.getText().concat("2"));
         if(ae.getSource()==three)
            t1.setText(t1.getText().concat("3"));
         if(ae.getSource()==four)
            t1.setText(t1.getText().concat("4")); 
         if(ae.getSource()==five)
            t1.setText(t1.getText().concat("5")); 
         if(ae.getSource()==six)
            t1.setText(t1.getText().concat("6")); 
         if(ae.getSource()==seven)
            t1.setText(t1.getText().concat("7"));
         if(ae.getSource()==eight)
            t1.setText(t1.getText().concat("8"));
         if(ae.getSource()==nine)
            t1.setText(t1.getText().concat("9"));
          if(ae.getSource()==zero)
            t1.setText(t1.getText().concat("0"));
           if(ae.getSource()==dot)
            t1.setText(t1.getText().concat("."));
      
       
       
        //   actions
      if(ae.getSource()==plus){
         x=Double.parseDouble(t1.getText());
            operator=1;
            t1.setText("");
         }
      //---------------------------------------------
         if(ae.getSource()==minus){
           x=Double.parseDouble(t1.getText());
             operator=2;
            t1.setText("");
       }
         //----------------------------------------
        if(ae.getSource()==mul){
             x=Double.parseDouble(t1.getText());
             operator=3;
             t1.setText("");}
             //-------------------------------------------
         if(ae.getSource()==div){
             x=Double.parseDouble(t1.getText());
             operator=4;
             t1.setText("");
         }
         //----------------------------------------------
         if(ae.getSource()==posOrNeg){
             x=Double.parseDouble(t1.getText());
              z=-x;
             t1.setText(""+z);
             z=0;
         }
         //-----------------------------------------
         if(ae.getSource()==reciporcal){
             x=Double.parseDouble(t1.getText());
             if (x==0) z=0;
             else{  z=1/x;}
             t1.setText(""+z);
             z=0;
         }
         //------------------------------------------------
         if(ae.getSource()==xSqr){
             x=Double.parseDouble(t1.getText());
             z=Math.pow(x, 2);
             t1.setText(""+z);
             z=0;
         }
         //--------------------------------------------
           if(ae.getSource()==xPower3){
             x=Double.parseDouble(t1.getText());
             z=Math.pow(x, 3);
             t1.setText(""+z);
             z=0;
         }
           //---------------------------------------------
             if(ae.getSource()==xPowerY){
             x=Double.parseDouble(t1.getText());
             operator=5;
             t1.setText("");
         }//------------------------------------------------
              if(ae.getSource()==root2){
                  if(t1.getText()==null){ t1.setText("");}

                  else{ x=Double.parseDouble(t1.getText());
             z=Math.sqrt(x);
             t1.setText(""+z);
             z=0;}
         }//---------------------------------------------------------
              
              if(ae.getSource()==root3){
                  if(t1.getText()==null){ t1.setText("");}
                  else{ x=Double.parseDouble(t1.getText());
             z=Math.cbrt(x);
             t1.setText(""+z);
             z=0;}}
              //---------------------------------------------
              if(ae.getSource()==rooty){
                x=Double.parseDouble(t1.getText());
                  operator=20;
                  t1.setText("");}
                  
                  //-------------------------------------------------
              if(ae.getSource()==fact){
                  if (Double.parseDouble(t1.getText())<0 ){
                      t1.setText("it's not integer or not positive");
                  }
                //   x=Integer.parseInt(t1.getText());
                  else{
                  x=Integer.parseInt(t1.getText());

                    t1.setText("" + factorial( (int)x));}
         }
             //bayezz 
             //------------------------------------------------------
           if(ae.getSource()==sin){
            //   if(t1.getText()==""){ x=1; t1.setText("");}
              // else{    x=Double.parseDouble(t1.getText());
                t1.setText("");//}
                                 
            operator=6;
            
         }//--------------------------------------------
            if(ae.getSource()==cos){
           //  x=Double.parseDouble(t1.getText());
                t1.setText("");
            
            operator=7;
            //---------------------------------------------
         }
             if(ae.getSource()==tan){
             //x=Double.parseDouble(t1.getText());
                t1.setText("");
            
            operator=8;
            
         }//--------------------------------------------
              if(ae.getSource()==sinh){
                  
             //x=Double.parseDouble(t1.getText());
                t1.setText("");
            
            operator=9;
            
         }//----------------------------------------
               if(ae.getSource()==cosh){
             //x=Double.parseDouble(t1.getText());
                t1.setText("");
            
            operator=10;
            //-------------------------------------
         }
                if(ae.getSource()==tanh){
             //x=Double.parseDouble(t1.getText());
                t1.setText("");
            
            operator=11;
            //--------------------------------------------
         }
             
              if(ae.getSource()==asin){

             //x=Double.parseDouble(t1.getText());
                t1.setText("");
                                 
            operator=12;
            
         }//---------------------------------------------
            if(ae.getSource()==acos){
             //x=Double.parseDouble(t1.getText());
                t1.setText("");
            
            operator=13;
            
         }//-----------------------------------------
             if(ae.getSource()==atan){
             //x=Double.parseDouble(t1.getText());
                t1.setText("");
            
            operator=14;
             }//----------------------------------------
               if(ae.getSource()==exp){
                // x=Double.parseDouble(t1.getText());
               t1.setText("");
                operator=15;
            
         }

        //----------------------------------------------------
               if(ae.getSource()==log10){

                t1.setText("");
                   operator=16;    
            
         }//---------------------------------------------------------
                 if(ae.getSource()==log){

                t1.setText("");
                   operator=17;    
            
         }//--------------------------------------------------------------
               if(ae.getSource()==pi){

                t1.setText(""+Math.PI);
            
         }  //------------------------------------------------------------
                if(ae.getSource()==npr){
         x=Double.parseDouble(t1.getText());
         
            operator=18;
            t1.setText("");
         }//-------------------------------------------------
                 if(ae.getSource()==ncr){
         x=Double.parseDouble(t1.getText());
            operator=19;
            t1.setText("");
         }
               //  -----------------------------------------------
          //      -----------------------------------------------
               
                 
               //------------------------------------
             
             //--------------------------------------
        if(scientific.isSelected()){
            p3.setVisible(true);
        }
        else{ p3.setVisible(false);}
         
        if(ae.getSource()==exit){
            System.exit(0);}
        
             
             // -------------------------------------------------equality with add sub div mul
             String  s="";
             
         if(ae.getSource()==ans)
                {
                 y=Double.parseDouble(t1.getText());

                switch(operator)
                {
                case 1: result=x+y; t1.setText(""+result+s);  break;
                case 2: result=x-y;  t1.setText(""+result+s);   break;
                case 3: result=x*y;    t1.setText(""+result+s); break;
                case 4:  if(y==0) { t1.setText("Math ERROR"); } else{ result=x/y; t1.setText(""+result+s);}    break;
                case 5: result=Math.pow(x,y);  t1.setText(""+result+s);break;
                case 6: result = Math.sin(Math.toRadians(y));   t1.setText(""+result+s);break;
                case 7: result =Math.cos(Math.toRadians(y));  t1.setText(""+result+s);break;
                case 8: if(y==90){t1.setText("MATH ERRORR!!");}else{ result=Math.tan(Math.toRadians(y));  t1.setText(""+result);} break;
                case 9: result =Math.sinh(y); t1.setText(""+result+s); break;
                case 10: result =Math.cosh(y); t1.setText(""+result+s); break;
                case 11:  result =Math.tanh(y);  t1.setText(""+result+s);break;
                case 12:if(y>1&&y<-1){t1.setText("MATH ERROR!");}else{ result =180*Math.asin(y)/Math.PI;   t1.setText(""+result);}break;
                case 13:if(y>1&&y<-1){t1.setText("MATH ERROR!");}else{ result =180*Math.acos(y)/Math.PI;   t1.setText(""+result);}break;
                case 14: result =180*Math.atan(y)/Math.PI;  t1.setText(""+result+s);break;
                case 15: result=Math.exp(y); t1.setText(""+result+s); break;
                case 16: result=Math.log10(y); break;
                case 17: result=Math.log(y); t1.setText(""+result+s); break;
                case 18: if(y>x){t1.setText("MATH ERRORR");} else{result=(factorial((int)x) / (factorial((int)x-(int)y)));  t1.setText(""+result+s); }break;
                case 19:if(y>x){t1.setText("MATH ERRORR");} else{result=(factorial((int)x) / (factorial((int)x -(int)y)* factorial((int)y)));   t1.setText(""+result+s); }break;
                case 20: result=Math.round(Math.pow(x, 1.0 / y)); t1.setText(""+result+s); break;

                default: result=0;  t1.setText(""+result+s);
                }
                //t1.setText(""+result+s);
                }  
//-------------------------------------------action on delete and clear button
                if(ae.getSource()==clr)
                t1.setText("");
                
                if(ae.getSource()==del){
               String s1= t1.getText();
               String s2 =s1.substring(0,s1.length()-1);
                   t1.setText(s2);
                    }
         //--------------------------       


         
       }//bracket of constructor
//--------------------------some methods    
    public static int factorial(int n) {
      //  if(n<0){System.out.println("noo"); return 0;}
       // else{
                int fact = 1;
       
        for (int i = 1; i <= n; i++) {
            
            fact = fact * i;}
        return fact;
    }//}
;


    @Override
    public void keyTyped(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
            if(scientific.isSelected())
       one.setVisible(false);
    }
}



   
