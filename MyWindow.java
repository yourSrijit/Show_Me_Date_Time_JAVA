package Show_me_Time;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.PublicKey;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyWindow extends JFrame {
    private JLabel heading;
    private JLabel clockLabel;
    private Font font=new Font("",Font.BOLD,35);
    MyWindow(){
        super.setTitle("My Clock");

        super.setSize(500,300);
        super.setLocation(300,50);
        this.createGUI();
        this.startClock();
        super.setVisible(true);
    }
        public  void createGUI(){
        heading =new JLabel("Srijit's Clock");
        clockLabel=new JLabel("Clock");
        heading.setFont(font);
        clockLabel.setFont(font);
        this.setLayout(new GridLayout(2,1));
        this.add(heading);
        this.add(clockLabel);


    }
    public void startClock(){
//        Timer timer=new Timer(1000, new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
// 1.or           String dateTime =new Date().toString();

// 2.or               String dateTime =new Date().toLocaleString();


// 3. or              Date d =new Date();
//                SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy E hh:mm:ss a");
//                String dateTime =sdf.format(d);
//
//
//            clockLabel.setText(dateTime);
//            }
//        });
//        timer.start();


        //Using Thraec
        Thread t =new Thread(){
            public void run(){
                try{
                    while(true){
                        Date d =new Date();
                        SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy E hh:mm:ss a");
                        String dateTime =sdf.format(d);
                        clockLabel.setText(dateTime);
                        Thread.sleep(1000);
                    }

                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        t.start();


    }

}
