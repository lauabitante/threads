package threads;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Dashboard extends JFrame {
	public static final int qtdSensores = 6;
	private JLabel lblSensor[];
	private JTextField txtSensor[];
	
	public Dashboard() {
		super("Dashboard");
		setBounds(300, 200, 200, 180);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		 
		
		setupDashboard();
	    Dashboard.this.setVisible(true);
	}

    private void setupDashboard() {
        this.setLayout(new GridLayout(qtdSensores, 2));
        lblSensor = new JLabel[qtdSensores];
        txtSensor = new JTextField[qtdSensores];
        for(int i=0; i<qtdSensores; i++){
        	lblSensor[i] = new JLabel("Sensor "+(i+1)+":");
            this.add(lblSensor[i]);
            txtSensor[i] = new JTextField("0");
            this.add(txtSensor[i]);
        }
    }

    public void updateSensor(int sensor, int valor) {
    	txtSensor[sensor-1].setText(String.valueOf(valor));
    }
}
