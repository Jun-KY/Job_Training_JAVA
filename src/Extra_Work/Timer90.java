package Extra_Work;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Timer90 {
    private static final int Time_Limit = 90;

    public static void main(String[] args){
        JFrame frame = new JFrame("90초 타이머");
        JLabel label = new JLabel("남은 시간: 90 sec", SwingConstants.CENTER);
        label.setFont (new Font("맑은 고딕", Font.BOLD, 24));

        frame.add(label);
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        Timer timer = new Timer(1000, new ActionListener(){
            int remaining = Time_Limit;

            @Override
            public void actionPerformed(ActionEvent e) {
                remaining--;
                if (remaining > 0){
                    label.setText("남은 시간: " + remaining + "초");
                } else {
                    ((Timer) e.getSource()).stop();
                    label.setText("시간 종료!");
                    JOptionPane.showMessageDialog(frame, "시간이 종료되었습니다!", "알림", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        timer.setInitialDelay(0);
        timer.start();
    }
}
