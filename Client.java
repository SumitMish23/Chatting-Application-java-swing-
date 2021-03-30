
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;
public class Client extends JFrame implements ActionListener
{


    JButton b;
   static JTextArea A1;
    JPanel p1;
    JTextField j;
    static ServerSocket skt;
    static Socket s1;
    static DataInput in;
    static DataOutput out;
    Boolean typing;
    Client()
    {
        p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(7, 94, 84));
        p1.setBounds(0, 0, 600, 60);
        add(p1);

        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("CA//images//3.png"));
        Image i1 = i.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i1);
        JLabel s1 = new JLabel(i3);
        s1.setBounds(5, 17, 30, 30);
        p1.add(s1);

        s1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.exit(0);
            }
        });


        ImageIcon i21 = new ImageIcon(ClassLoader.getSystemResource("CA//images//3icon.png"));
        Image i11 = i21.getImage().getScaledInstance(13, 25
                , Image.SCALE_DEFAULT);
        ImageIcon i31 = new ImageIcon(i11);
        JLabel s12 = new JLabel(i31);
        s12.setBounds(260, 20, 13, 25);
        p1.add(s12);

        ImageIcon i9 = new ImageIcon(ClassLoader.getSystemResource("CA//images//video.png"));
        Image i19 = i9.getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT);
        ImageIcon i4 = new ImageIcon(i19);
        JLabel s4 = new JLabel(i4);
        s4.setBounds(290, 20, 30, 30);
        p1.add(s4);

        ImageIcon i5 = new ImageIcon(ClassLoader.getSystemResource("CA//images//phone.png"));
        Image i7 = i5.getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT);
        ImageIcon i8 = new ImageIcon(i7);
        JLabel s5 = new JLabel(i8);
        s5.setBounds(350, 20, 35, 30);
        p1.add(s5);


        ImageIcon i41 = new ImageIcon(ClassLoader.getSystemResource("CA//images//icon2.jpg"));
        Image i2 = i41.getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT);
        ImageIcon i91 = new ImageIcon(i2);
        JLabel s3 = new JLabel(i91);
        s3.setBounds(40, 5, 50, 50);
        p1.add(s3);

        JLabel q = new JLabel("USER 1");
        q.setForeground(Color.WHITE);
        q.setFont(new Font("SANS_SERIF", Font.BOLD, 16));
        q.setBounds(95, 15, 100, 18);
        p1.add(q);

        JLabel q1 = new JLabel("Active Now");
        q1.setForeground(Color.WHITE);
        q1.setFont(new Font("SAN_SERIF", Font.PLAIN, 12));
        q1.setBounds(95, 35, 100, 20);
        p1.add(q1);

        b=new JButton("Send");
        b.setBounds(310,520,80,35);
        b.setBackground(new Color(7,94,84));
        b.setForeground(Color.WHITE);
        b.addActionListener(this);
        add(b);

        Timer t = new Timer(1, new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                if(!typing){
                    q1.setText("Active Now");
                }
            }
        });
        t1 = new JTextField();
        t1.setBounds(5, 655, 310, 40);
        t1.setFont(new Font("SAN_SERIF", Font.PLAIN, 16));
        f1.add(t1);

        t.setInitialDelay(2000);
        t1.addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent ke){
                q1.setText("typing...");

                t.stop();

                typing = true;
            }

            public void keyReleased(KeyEvent ke){
                typing = false;

                if(!t.isRunning()){
                    t.start();
                }
            }
        });

        A1=new JTextArea();
        A1.setBounds(10,70,360,420);
        add(A1);


        j=new JTextField();
        j.setBounds(10,520,300,35);
        add(j);

        getContentPane().setBackground(Color.white);
        setLayout(null);
        setSize(400, 600);
        setLocation(200, 200);
        setUndecorated(false);
        setVisible(true);
    }
    public static void main(String[] args)
    {
        new Client().setVisible(true);
        String mi="";
        /* skt=new ServerSocket(7000);
         s1= skt.accept();
         in=new DataInput(s1.getInputStream());
         out=new DataOutput(s1.getOutputStream());

         mi=in.readUTF();

     */


    }
    public void actionPerformed(ActionEvent ae)
    {
        String chatMessages=j.getText();
        A1.setText(A1.getText()+"\n"+chatMessages);


    }
}
