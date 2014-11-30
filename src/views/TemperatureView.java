package views;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by Danuts on 11/30/2014.
 */
public class TemperatureView extends JFrame {
    private JButton generateButton = new JButton("Generate");
    private JLabel tempLabel = new JLabel("Temperature");
    private JLabel windLabel = new JLabel("Wind Speed");

    private JLabel degLabel = new JLabel("\u00b0" + "C");
    private JLabel speedLabel = new JLabel("mph");

    public TemperatureView() {
        //JFrame f=new JFrame("Weather Forecast");
        JPanel TemperaturePanel = new JPanel();
        //f.add(TemperaturePanel);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(300, 100, 500, 230);

        TemperaturePanel.setLayout(null);
        //TemperaturePanel.setToolTipText("Weather Forecast");
        TemperaturePanel.setBackground(Color.MAGENTA);

        generateButton.setBounds(200, 100, 100, 40);
        tempLabel.setBounds(50, 50, 200, 40);
        windLabel.setBounds(350, 50, 200, 40);
        degLabel.setBounds(80, 80, 100, 100);
        speedLabel.setBounds(380, 80, 80, 100);

        TemperaturePanel.setBounds(400, 400, 200, 100);

        TemperaturePanel.add(generateButton);
        TemperaturePanel.add(tempLabel);
        TemperaturePanel.add(windLabel);
        TemperaturePanel.add(degLabel);
        TemperaturePanel.add(speedLabel);

        this.add(TemperaturePanel);
    }

    public void setDegrees(int degrees) {
        degLabel.setText(degrees + "\u00b0" + " C");
    }

    public void setSpeed(int speed) {
        speedLabel.setText(speed + " mph");
    }

    public void addListener(ActionListener listenRefreshButton){
        generateButton.addActionListener(listenRefreshButton);
    }
}
