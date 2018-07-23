package karl.locks;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JScrollPane;

public class MainWindow extends JFrame {

	
	public static JTextArea station1TextArea = new JTextArea();
	public static JTextArea station2TextArea = new JTextArea();
	public static JTextArea station3TextArea = new JTextArea();
	public static JTextArea station4TextArea = new JTextArea();
	public static JTextArea station5TextArea = new JTextArea();
	public static JTextArea station6TextArea = new JTextArea();
	public static JTextArea station7TextArea = new JTextArea();
	public static JTextArea station8TextArea = new JTextArea();
	
	
	public static JTextField train1PassengerCount = new JTextField();
	public static JTextField train2PassengerCount = new JTextField();
	public static JTextField train3PassengerCount = new JTextField();
	public static JTextField train4PassengerCount = new JTextField();
	public static JTextField train5PassengerCount = new JTextField();
	public static JTextField train6PassengerCount = new JTextField();
	public static JTextField train7PassengerCount = new JTextField();
	public static JTextField train8PassengerCount = new JTextField();
	public static JTextField train9PassengerCount = new JTextField();
	public static JTextField train10PassengerCount = new JTextField();
	public static JTextField train11PassengerCount = new JTextField();
	public static JTextField train12PassengerCount = new JTextField();
	public static JTextField train13PassengerCount = new JTextField();
	public static JTextField train14PassengerCount = new JTextField();
	public static JTextField train15PassengerCount = new JTextField();
	public static JTextField train16PassengerCount = new JTextField();
	
	private final JLabel passengerLbl = new JLabel("Passenger and Destination");
	private final JLabel lblTrainRailways = new JLabel("Train Railways");
	private final JLabel lblStation = new JLabel("Station 1");
	private final JLabel lblStation_1 = new JLabel("Station 2");
	private final JLabel lblStation_2 = new JLabel("Station 3");
	private final JLabel lblStation_3 = new JLabel("Station 4");
	private final JLabel lblStation_4 = new JLabel("Station 5");
	private final JLabel lblStation_5 = new JLabel("Station 6");
	private final JLabel lblStation_6 = new JLabel("Station 7");
	private final JLabel lblStation_7 = new JLabel("Station 8");
	private final JPanel panel = new JPanel();
	private final JLabel lblTrainStatus = new JLabel("Train Passenger Count");
	private final JLabel lblTrain = new JLabel("Train 1");
	
	private final JLabel lblNewLabel = new JLabel("Train 2");
	private final JLabel lblTrain_1 = new JLabel("Train 3");
	private final JLabel lblTrain_2 = new JLabel("Train 4");
	private final JLabel lblTrain_3 = new JLabel("Train 5");
	private final JLabel lblTrain_4 = new JLabel("Train 6");
	private final JLabel lblTrain_5 = new JLabel("Train 7");
	private final JLabel lblTrain_6 = new JLabel("Train 8");
	
	private final JLabel lblTrain_7 = new JLabel("Train 9");
	private final JLabel lblNewLabel_1 = new JLabel("Train 10");
	private final JLabel lblNewLabel_2 = new JLabel("Train 11");
	private final JLabel lblTrain_8 = new JLabel("Train 12");
	private final JLabel lblNewLabel_3 = new JLabel("Train 13");
	private final JLabel lblNewLabel_4 = new JLabel("Train 14");
	private final JLabel lblNewLabel_5 = new JLabel("Train 15");
	private final JLabel lblNewLabel_6 = new JLabel("Train 16");
	

	static JComboBox stationSelectComboBox = new JComboBox();
	private final static JComboBox passengerDestSelectComboBox = new JComboBox();
	private final static JTextField trainSeatsField = new JTextField();
	private final JPanel panel_1 = new JPanel();
	private final JLabel lblStationPassengerCount = new JLabel("Station Passenger Queue Count");
	private final JLabel lblStation_8 = new JLabel("Station 1");
	private final JLabel lblStation_9 = new JLabel("Station 2");
	private final JLabel lblStation_10 = new JLabel("Station 3");
	private final JLabel lblStation_11 = new JLabel("Station 4");
	private final JLabel lblStation_12 = new JLabel("Station 5");
	private final JLabel lblStation_13 = new JLabel("Station 6");
	private final JLabel lblStation_14 = new JLabel("Station 7");
	private final JLabel lblStation_15 = new JLabel("Station 8");

	public static JTextField station1PassengerQueue = new JTextField();
	public static JTextField station2PassengerQueue = new JTextField();
	public static JTextField station3PassengerQueue = new JTextField();
	public static JTextField station4PassengerQueue = new JTextField();
	public static JTextField station5PassengerQueue = new JTextField();
	public static JTextField station6PassengerQueue = new JTextField();
	public static JTextField station7PassengerQueue = new JTextField();
	public static JTextField station8PassengerQueue = new JTextField();
	public static JLabel indicatorLbl = new JLabel("Setup");
	private final JPanel panel_2 = new JPanel();
	private final JLabel lblNewLabel_7 = new JLabel("Console Log");
	public static JTextArea consoleLogTextArea = new JTextArea(10,20);
	private final JScrollPane scrollPane = new JScrollPane(consoleLogTextArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	public static JButton pauseBtn = new JButton("Pause for 10 sec");

	/**
	 * Create the frame.
	 */
	public MainWindow() {
		setTitle("S21 OPERSYS Group 10 - CalTrainLocks");
		trainSeatsField.setText("1");
		trainSeatsField.setToolTipText("Seats");
		trainSeatsField.setColumns(10);
		train1PassengerCount.setEditable(false);
		train1PassengerCount.setColumns(10);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		getContentPane().setLayout(new MigLayout("", "[208.00,grow,fill][grow][][][grow][grow][grow]", "[][][117.00][][-40.00][grow][]"));
		
		JLabel stationSelectLabel = new JLabel("Select Station");
		getContentPane().add(stationSelectLabel, "cell 0 0,alignx left");
		
		JLabel addNewTrainLbl = new JLabel("Train and Seats");
		getContentPane().add(addNewTrainLbl, "cell 1 0 2 1,alignx left");
		
		getContentPane().add(passengerLbl, "cell 3 0 2 1");
		
		JButton runCalTrainBtn = new JButton("Run CalTrain Locks");
		runCalTrainBtn.setBackground(new Color(0, 255, 0));
		getContentPane().add(runCalTrainBtn, "cell 5 0 2 1,grow");
		
		stationSelectComboBox.setModel(new DefaultComboBoxModel(new String[] {"Station 1", "Station 2", "Station 3", "Station 4", "Station 5", "Station 6", "Station 7", "Station 8"}));
		getContentPane().add(stationSelectComboBox, "cell 0 1,alignx left");
		
		getContentPane().add(trainSeatsField, "cell 1 1,growx");
		
		JButton addNewTrainBtn = new JButton("Add New Train");
		getContentPane().add(addNewTrainBtn, "cell 2 1,alignx left");
		passengerDestSelectComboBox.setModel(new DefaultComboBoxModel(new String[] {"Station 1", "Station 2", "Station 3", "Station 4", "Station 5", "Station 6", "Station 7", "Station 8"}));
		
		getContentPane().add(passengerDestSelectComboBox, "flowx,cell 3 1,growx");
		
		JButton addNewPassengerBtn = new JButton("Add New Passenger");
		getContentPane().add(addNewPassengerBtn, "cell 4 1,growx");
		pauseBtn.setBackground(new Color(255, 255, 0));
		
		getContentPane().add(pauseBtn, "cell 5 1 2 1,growx");
		
		getContentPane().add(panel, "cell 0 2 7 1,growx,aligny top");
		panel.setLayout(new MigLayout("", "[grow][grow][grow][grow][grow][grow][grow][grow]", "[][][][][]"));
		
		panel.add(lblTrainStatus, "cell 0 0 8 1,grow");
		
		panel.add(lblTrain, "cell 0 1");
		
		panel.add(lblNewLabel, "cell 1 1");
		
		panel.add(lblTrain_1, "cell 2 1");
		
		panel.add(lblTrain_2, "cell 3 1");
		
		panel.add(lblTrain_3, "cell 4 1");
		
		panel.add(lblTrain_4, "cell 5 1");
		
		panel.add(lblTrain_5, "cell 6 1");
		
		panel.add(lblTrain_6, "cell 7 1");
		
		
		panel.add(train1PassengerCount, "cell 0 2,growx");
		train2PassengerCount.setEditable(false);
		train2PassengerCount.setColumns(10);
		
		panel.add(train2PassengerCount, "cell 1 2,growx");
		train3PassengerCount.setEditable(false);
		train3PassengerCount.setColumns(10);
		
		panel.add(train3PassengerCount, "cell 2 2,growx");
		train4PassengerCount.setEditable(false);
		train4PassengerCount.setColumns(10);
		
		panel.add(train4PassengerCount, "cell 3 2,growx");
		train5PassengerCount.setEditable(false);
		train5PassengerCount.setColumns(10);
		
		panel.add(train5PassengerCount, "cell 4 2,growx");
		train6PassengerCount.setEditable(false);
		train6PassengerCount.setColumns(10);
		
		panel.add(train6PassengerCount, "cell 5 2,growx");
		train7PassengerCount.setEditable(false);
		train7PassengerCount.setColumns(10);
		
		panel.add(train7PassengerCount, "cell 6 2,growx");
		train8PassengerCount.setEditable(false);
		train8PassengerCount.setColumns(10);
		
		panel.add(train8PassengerCount, "cell 7 2,growx");
		
		panel.add(lblTrain_7, "cell 0 3");
		
		panel.add(lblNewLabel_1, "cell 1 3");
		
		panel.add(lblNewLabel_2, "cell 2 3");
		
		panel.add(lblTrain_8, "cell 3 3");
		
		panel.add(lblNewLabel_3, "cell 4 3");
		
		panel.add(lblNewLabel_4, "cell 5 3");
		
		panel.add(lblNewLabel_5, "cell 6 3");
		
		panel.add(lblNewLabel_6, "cell 7 3");
		train9PassengerCount.setEditable(false);
		train9PassengerCount.setColumns(10);
		
		panel.add(train9PassengerCount, "cell 0 4,growx");
		train10PassengerCount.setEditable(false);
		train10PassengerCount.setColumns(10);
		
		panel.add(train10PassengerCount, "cell 1 4,growx");
		train11PassengerCount.setEditable(false);
		train11PassengerCount.setColumns(10);
		
		panel.add(train11PassengerCount, "cell 2 4,growx");
		train12PassengerCount.setEditable(false);
		train12PassengerCount.setColumns(10);
		
		panel.add(train12PassengerCount, "cell 3 4,growx");
		train13PassengerCount.setEditable(false);
		train13PassengerCount.setColumns(10);
		
		panel.add(train13PassengerCount, "cell 4 4,growx");
		train14PassengerCount.setEditable(false);
		train14PassengerCount.setColumns(10);
		
		panel.add(train14PassengerCount, "cell 5 4,growx");
		train15PassengerCount.setEditable(false);
		train15PassengerCount.setColumns(10);
		
		panel.add(train15PassengerCount, "cell 6 4,growx");
		train16PassengerCount.setEditable(false);
		train16PassengerCount.setColumns(10);
		
		panel.add(train16PassengerCount, "cell 7 4,growx");
		
		getContentPane().add(panel_1, "cell 0 3 7 1,grow");
		panel_1.setLayout(new MigLayout("", "[grow][grow][grow][grow][grow][grow][grow][grow]", "[][][]"));
		
		panel_1.add(lblStationPassengerCount, "cell 0 0 8 1");
		
		panel_1.add(lblStation_8, "cell 0 1");
		
		panel_1.add(lblStation_9, "cell 1 1");
		
		panel_1.add(lblStation_10, "cell 2 1");
		
		panel_1.add(lblStation_11, "cell 3 1");
		
		panel_1.add(lblStation_12, "cell 4 1");
		
		panel_1.add(lblStation_13, "cell 5 1");
		
		panel_1.add(lblStation_14, "cell 6 1");
		
		panel_1.add(lblStation_15, "cell 7 1");
		station1PassengerQueue.setEditable(false);
		station1PassengerQueue.setColumns(10);
		
		panel_1.add(station1PassengerQueue, "cell 0 2,growx");
		station2PassengerQueue.setEditable(false);
		station2PassengerQueue.setColumns(10);
		
		panel_1.add(station2PassengerQueue, "cell 1 2,growx");
		station3PassengerQueue.setEditable(false);
		station3PassengerQueue.setColumns(10);
		
		panel_1.add(station3PassengerQueue, "cell 2 2,growx");
		station4PassengerQueue.setEditable(false);
		station4PassengerQueue.setColumns(10);
		
		panel_1.add(station4PassengerQueue, "cell 3 2,growx");
		station5PassengerQueue.setEditable(false);
		station5PassengerQueue.setColumns(10);
		
		panel_1.add(station5PassengerQueue, "cell 4 2,growx");
		station6PassengerQueue.setEditable(false);
		station6PassengerQueue.setColumns(10);
		
		panel_1.add(station6PassengerQueue, "cell 5 2,growx");
		station7PassengerQueue.setEditable(false);
		station7PassengerQueue.setColumns(10);
		
		panel_1.add(station7PassengerQueue, "cell 6 2,growx");
		station8PassengerQueue.setEditable(false);
		station8PassengerQueue.setColumns(10);
		
		panel_1.add(station8PassengerQueue, "cell 7 2,growx");
		
		JPanel simulationPanel = new JPanel();
		getContentPane().add(simulationPanel, "cell 0 4 4 2,grow");
		simulationPanel.setLayout(new MigLayout("", "[grow][grow]", "[][][grow][][grow][][grow][][grow]"));
		
		simulationPanel.add(lblTrainRailways, "cell 0 0 2 1");
		
		simulationPanel.add(lblStation, "cell 0 1");
		
		simulationPanel.add(lblStation_1, "cell 1 1");
		
		
		station1TextArea.setEditable(false);
		station1TextArea.setToolTipText("Station 1");
		simulationPanel.add(station1TextArea, "cell 0 2,grow");
		
		station2TextArea.setEditable(false);
		simulationPanel.add(station2TextArea, "cell 1 2,grow");
		
		simulationPanel.add(lblStation_2, "cell 0 3");
		
		simulationPanel.add(lblStation_3, "cell 1 3");
		
		station3TextArea.setEditable(false);
		simulationPanel.add(station3TextArea, "cell 0 4,grow");
		
		station4TextArea.setEditable(false);
		simulationPanel.add(station4TextArea, "cell 1 4,grow");
		
		simulationPanel.add(lblStation_4, "cell 0 5");
		
		simulationPanel.add(lblStation_5, "cell 1 5");
		
		
		station5TextArea.setEditable(false);
		simulationPanel.add(station5TextArea, "cell 0 6,grow");
		
		station6TextArea.setEditable(false);
		simulationPanel.add(station6TextArea, "cell 1 6,grow");
		
		simulationPanel.add(lblStation_6, "cell 0 7");
		
		simulationPanel.add(lblStation_7, "cell 1 7");
		
		station7TextArea.setEditable(false);
		simulationPanel.add(station7TextArea, "cell 0 8,grow");
		
		station8TextArea.setEditable(false);
		simulationPanel.add(station8TextArea, "cell 1 8,grow");
		
		getContentPane().add(panel_2, "cell 4 5 3 1,grow");
		panel_2.setLayout(new MigLayout("", "[grow]", "[][grow]"));
		
		panel_2.add(lblNewLabel_7, "cell 0 0");
		
		panel_2.add(scrollPane, "cell 0 1,grow");
		
		
		scrollPane.setViewportView(consoleLogTextArea);
		
		
		getContentPane().add(indicatorLbl, "cell 0 6 5 1");
		
		
		// TODO How do I make these buttons affect commands?
		

		CalTrain system = new CalTrain();
		
		runCalTrainBtn.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Driver.startSimulation();
			}
		});
		
		addNewPassengerBtn.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Driver.addPassenger();
			}
		});
		
		addNewTrainBtn.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				System.out.println("You pressed add new train button");
				Driver.addTrain();
			}
		});
		
		pauseBtn.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Train.pauseTrainRun();
				MainWindow.consoleLogTextArea.append("\n Simulation Paused for 10 seconds! \n\n");
			}
		});
		
		
	}
	
	public static int getStationSelectComboBox(){
		String s = (String) stationSelectComboBox.getSelectedItem();
		
		
		switch(s){
		case "Station 1":	return 1;
		case "Station 2":	return 2;
		case "Station 3":	return 3;
		case "Station 4":	return 4;
		case "Station 5":	return 5;
		case "Station 6":	return 6;
		case "Station 7":	return 7;
		case "Station 8":	return 8;
		default:			return 0;
		}
		
		
	}

	public static int getPassengerDestSelectComboBox(){
		
		String s = (String) passengerDestSelectComboBox.getSelectedItem();
		
		
		switch(s){
		case "Station 1":	return 1;
		case "Station 2":	return 2;
		case "Station 3":	return 3;
		case "Station 4":	return 4;
		case "Station 5":	return 5;
		case "Station 6":	return 6;
		case "Station 7":	return 7;
		case "Station 8":	return 8;
		default:			return 0;
		}
	}

	public static int getTrainSeatsField(){
		return Integer.parseInt(trainSeatsField.getText());
		
	}
	
	
}
