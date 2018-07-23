package locks;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class GUI {

	private JFrame frame;
	
	private final JLabel lblTrainStatus = new JLabel("Train Status");
	private final JLabel label_train1 = new JLabel("Train 1");
	private final JLabel label_train2 = new JLabel("Train 2");
	private final JLabel label_train3 = new JLabel("Train 3");
	private final JLabel label_train4 = new JLabel("Train 4");
	private final JLabel label_train5 = new JLabel("Train 5");
	private final JLabel label_train6 = new JLabel("Train 6");
	private final JLabel label_train7 = new JLabel("Train 7");
	private final JLabel label_train8 = new JLabel("Train 8");
	private final JLabel label_train9 = new JLabel("Train 9");
	private final JLabel label_train10 = new JLabel("Train 10");
	private final JLabel label_train11 = new JLabel("Train 11");
	private final JLabel label_train12 = new JLabel("Train 12");
	private final JLabel label_train13 = new JLabel("Train 13");
	private final JLabel label_train14 = new JLabel("Train 14");
	private final JLabel label_train15 = new JLabel("Train 15");
	private final JLabel label_train16 = new JLabel("Train 16");
	
	public static ArrayList<JLabel> list_train_status = new ArrayList<JLabel>();
	private static JLabel status_train1 = new JLabel("<html>Status: Deployed <br> Location: Station 2 <br> Seat Limit: 3 <br> Passenger Count: 3</html>");
	private static JLabel status_train2 = new JLabel(StaticTexts.train_default_status);
	private static JLabel status_train3 = new JLabel(StaticTexts.train_default_status);
	private static JLabel status_train4 = new JLabel(StaticTexts.train_default_status);
	private static JLabel status_train5 = new JLabel(StaticTexts.train_default_status);
	private static JLabel status_train6 = new JLabel(StaticTexts.train_default_status);
	private static JLabel status_train7 = new JLabel(StaticTexts.train_default_status);
	private static JLabel status_train8 = new JLabel(StaticTexts.train_default_status);
	private static JLabel status_train9 = new JLabel(StaticTexts.train_default_status);
	private static JLabel status_train10 = new JLabel(StaticTexts.train_default_status);
	private static JLabel status_train11 = new JLabel(StaticTexts.train_default_status);
	private static JLabel status_train12 = new JLabel(StaticTexts.train_default_status);
	private static JLabel status_train13 = new JLabel(StaticTexts.train_default_status);
	private static JLabel status_train14 = new JLabel(StaticTexts.train_default_status);
	private static JLabel status_train15 = new JLabel(StaticTexts.train_default_status);
	private static JLabel status_train16 = new JLabel(StaticTexts.train_default_status);
	
	private final JLabel lblStationQueue = new JLabel("Station Queue Status");
	private final JLabel lblStation1Queue = new JLabel("Station 1");
	private final JLabel lblStation2Queue = new JLabel("Station 2");
	private final JLabel lblStation3Queue = new JLabel("Station 3");
	private final JLabel lblStation4Queue = new JLabel("Station 4");
	private final JLabel lblStation5Queue = new JLabel("Station 5");
	private final JLabel lblStation6Queue = new JLabel("Station 6");
	private final JLabel lblStation7Queue = new JLabel("Station 7");
	private final JLabel lblStation8Queue = new JLabel("Station 8");
	
	private final JScrollPane station1_queue_scrollpane = new JScrollPane();
	private final JScrollPane station2_queue_scrollpane = new JScrollPane();
	private final JScrollPane station3_queue_scrollpane = new JScrollPane();
	private final JScrollPane station4_queue_scrollpane = new JScrollPane();
	private final JScrollPane station5_queue_scrollpane = new JScrollPane();
	private final JScrollPane station6_queue_scrollpane = new JScrollPane();
	private final JScrollPane station7_queue_scrollpane = new JScrollPane();
	private final JScrollPane station8_queue_scrollpane = new JScrollPane();
	
	public static ArrayList<JTextArea> queue_info_list = new ArrayList<JTextArea>();
	private static JTextArea queue_info_station1 = new JTextArea();
	private static JTextArea queue_info_station2 = new JTextArea();
	private static JTextArea queue_info_station3 = new JTextArea();
	private static JTextArea queue_info_station4 = new JTextArea();
	private static JTextArea queue_info_station5 = new JTextArea();
	private static JTextArea queue_info_station6 = new JTextArea();
	private static JTextArea queue_info_station7 = new JTextArea();
	private static JTextArea queue_info_station8 = new JTextArea();

	public static ArrayList<JLabel> queue_total_list = new ArrayList<JLabel>();
	private static JLabel queue_total_station1 = new JLabel("Total: 0");
	private static JLabel queue_total_station2 = new JLabel("Total: 0");
	private static JLabel queue_total_station3 = new JLabel("Total: 0");
	private static JLabel queue_total_station4 = new JLabel("Total: 0");
	private static JLabel queue_total_station5 = new JLabel("Total: 0");
	private static JLabel queue_total_station6 = new JLabel("Total: 0");
	private static JLabel queue_total_station7 = new JLabel("Total: 0");
	private static JLabel queue_total_station8 = new JLabel("Total: 0");
	
	private final JLabel lblStationStatus = new JLabel("Station Status");
	private final JLabel lblStationStatus1 = new JLabel("Station 1");
	private final JLabel lblStationStatus2 = new JLabel("Station 2");
	private final JLabel lblStationStatus3 = new JLabel("Station 3");
	private final JLabel lblStationStatus4 = new JLabel("Station 4");
	private final JLabel lblStationStatus5 = new JLabel("Station 5");
	private final JLabel lblStationStatus6 = new JLabel("Station 6");
	private final JLabel lblStationStatus7 = new JLabel("Station 7");
	private final JLabel lblStationStatus8 = new JLabel("Station 8");
	
	private final JScrollPane station1_status_scrollpane = new JScrollPane();
	private final JScrollPane station2_status_scrollpane = new JScrollPane();
	private final JScrollPane station3_status_scrollpane = new JScrollPane();
	private final JScrollPane station4_status_scrollpane = new JScrollPane();
	private final JScrollPane station5_status_scrollpane = new JScrollPane();
	private final JScrollPane station6_status_scrollpane = new JScrollPane();
	private final JScrollPane station7_status_scrollpane = new JScrollPane();
	private final JScrollPane station8_status_scrollpane = new JScrollPane();
	
	public static ArrayList<JTextArea> station_status_list = new ArrayList<JTextArea>();
	private static JTextArea status_station1 = new JTextArea();
	private static JTextArea status_station2 = new JTextArea();
	private static JTextArea status_station3 = new JTextArea();
	private static JTextArea status_station4 = new JTextArea();
	private static JTextArea status_station5 = new JTextArea();
	private static JTextArea status_station6 = new JTextArea();
	private static JTextArea status_station7 = new JTextArea();
	private static JTextArea status_station8 = new JTextArea();
	
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initializeGUI(){
		//initialize Train Number Labels
		label_train1.setBounds(10, 21, 46, 14);
		frame.getContentPane().add(label_train1);
		
		label_train2.setBounds(145, 21, 46, 14);
		frame.getContentPane().add(label_train2);
		
		label_train3.setBounds(313, 21, 46, 14);
		frame.getContentPane().add(label_train3);
		
		label_train4.setBounds(484, 21, 46, 14);
		frame.getContentPane().add(label_train4);
		
		label_train5.setBounds(636, 21, 46, 14);
		frame.getContentPane().add(label_train5);
		
		label_train6.setBounds(799, 21, 46, 14);
		frame.getContentPane().add(label_train6);
		
		label_train7.setBounds(959, 21, 46, 14);
		frame.getContentPane().add(label_train7);
		
		label_train8.setBounds(1116, 21, 91, 14);
		frame.getContentPane().add(label_train8);
		
		label_train9.setBounds(10, 137, 46, 14);
		frame.getContentPane().add(label_train9);
		
		label_train10.setBounds(145, 137, 46, 14);
		frame.getContentPane().add(label_train10);
		
		label_train11.setBounds(313, 137, 46, 14);
		frame.getContentPane().add(label_train11);
		
		label_train12.setBounds(484, 137, 46, 14);
		frame.getContentPane().add(label_train12);
		
		label_train13.setBounds(636, 137, 46, 14);
		frame.getContentPane().add(label_train13);
		
		label_train14.setBounds(799, 137, 46, 14);
		frame.getContentPane().add(label_train14);
		
		label_train15.setBounds(959, 137, 46, 14);
		frame.getContentPane().add(label_train15);
		
		label_train16.setBounds(1116, 137, 46, 14);
		frame.getContentPane().add(label_train16);
		
		status_train1.setBounds(10, 46, 120, 80);
		list_train_status.add(status_train1);
		frame.getContentPane().add(status_train1);
		
		status_train2.setBounds(140, 46, 120, 80);
		list_train_status.add(status_train2);
		frame.getContentPane().add(status_train2);		
		
		status_train3.setBounds(313, 46, 120, 80);
		list_train_status.add(status_train3);
		frame.getContentPane().add(status_train3);
		
		status_train4.setBounds(484, 46, 120, 80);
		list_train_status.add(status_train4);
		frame.getContentPane().add(status_train4);
	
		status_train5.setBounds(636, 46, 120, 80);
		list_train_status.add(status_train5);
		frame.getContentPane().add(status_train5);
			
		status_train6.setBounds(799, 46, 120, 80);
		list_train_status.add(status_train6);
		frame.getContentPane().add(status_train6);
		
		status_train7.setBounds(959, 46, 120, 80);
		list_train_status.add(status_train7);
		frame.getContentPane().add(status_train7);
		
		status_train8.setBounds(1116, 46, 120, 80);
		list_train_status.add(status_train8);
		frame.getContentPane().add(status_train8);
		
		status_train9.setBounds(10, 162, 120, 80);
		list_train_status.add(status_train9);
		frame.getContentPane().add(status_train9);
		
		status_train10.setBounds(145, 162, 120, 80);
		list_train_status.add(status_train10);
		frame.getContentPane().add(status_train10);
		
		status_train11.setBounds(313, 162, 120, 80);
		list_train_status.add(status_train11);
		frame.getContentPane().add(status_train11);
		
		status_train12.setBounds(484, 162, 120, 80);
		list_train_status.add(status_train12);
		frame.getContentPane().add(status_train12);
		
		status_train13.setBounds(636, 162, 120, 80);
		list_train_status.add(status_train13);
		frame.getContentPane().add(status_train13);
		
		status_train14.setBounds(799, 162, 120, 80);
		list_train_status.add(status_train14);
		frame.getContentPane().add(status_train14);
		
		status_train15.setBounds(959, 162, 120, 80);
		list_train_status.add(status_train15);
		frame.getContentPane().add(status_train15);
		
		status_train16.setBounds(1116, 162, 120, 80);
		list_train_status.add(status_train16);
		frame.getContentPane().add(status_train16);
		
		lblTrainStatus.setBounds(10, 0, 120, 14);
		frame.getContentPane().add(lblTrainStatus);
		
		lblStationQueue.setBounds(10, 253, 120, 14);
		frame.getContentPane().add(lblStationQueue);
		
		lblStation1Queue.setBounds(10, 278, 120, 14);
		frame.getContentPane().add(lblStation1Queue);
		
		lblStation2Queue.setBounds(145, 278, 115, 14);
		frame.getContentPane().add(lblStation2Queue);
		
		lblStation3Queue.setBounds(313, 278, 120, 14);
		frame.getContentPane().add(lblStation3Queue);
		
		lblStation4Queue.setBounds(484, 278, 120, 14);
		frame.getContentPane().add(lblStation4Queue);
		
		lblStation5Queue.setBounds(636, 278, 120, 14);
		frame.getContentPane().add(lblStation5Queue);
		
		lblStation6Queue.setBounds(799, 278, 120, 14);
		frame.getContentPane().add(lblStation6Queue);
		
		lblStation7Queue.setBounds(959, 278, 120, 14);
		frame.getContentPane().add(lblStation7Queue);
		
		lblStation8Queue.setBounds(1116, 278, 120, 14);
		frame.getContentPane().add(lblStation8Queue);
		
		
		station1_queue_scrollpane.setBounds(10, 303, 120, 80);
		frame.getContentPane().add(station1_queue_scrollpane);
		station1_queue_scrollpane.setViewportView(queue_info_station1);
		
		station2_queue_scrollpane.setBounds(145, 303, 120, 80);
		frame.getContentPane().add(station2_queue_scrollpane);
		station2_queue_scrollpane.setViewportView(queue_info_station2);
		
		station3_queue_scrollpane.setBounds(313, 303, 120, 80);
		frame.getContentPane().add(station3_queue_scrollpane);
		station3_queue_scrollpane.setViewportView(queue_info_station3);
		
		station4_queue_scrollpane.setBounds(484, 303, 120, 80);
		frame.getContentPane().add(station4_queue_scrollpane);
		station4_queue_scrollpane.setViewportView(queue_info_station4);
		
		station5_queue_scrollpane.setBounds(636, 304, 120, 80);
		frame.getContentPane().add(station5_queue_scrollpane);
		station5_queue_scrollpane.setViewportView(queue_info_station5);
		
		station6_queue_scrollpane.setBounds(799, 303, 120, 80);
		frame.getContentPane().add(station6_queue_scrollpane);
		station6_queue_scrollpane.setViewportView(queue_info_station6);
		
		station7_queue_scrollpane.setBounds(959, 303, 120, 80);
		frame.getContentPane().add(station7_queue_scrollpane);
		station7_queue_scrollpane.setViewportView(queue_info_station7);
		
		station8_queue_scrollpane.setBounds(1116, 303, 120, 80);
		frame.getContentPane().add(station8_queue_scrollpane);
		station8_queue_scrollpane.setViewportView(queue_info_station8);
		
		
		queue_total_station1.setBounds(10, 394, 120, 14);
		frame.getContentPane().add(queue_total_station1);
		queue_total_list.add(queue_total_station1);
		
		queue_total_station2.setBounds(145, 394, 131, 14);
		frame.getContentPane().add(queue_total_station2);
		queue_total_list.add(queue_total_station2);
		
		queue_total_station3.setBounds(313, 394, 120, 14);
		frame.getContentPane().add(queue_total_station3);
		queue_total_list.add(queue_total_station3);
		
		queue_total_station4.setBounds(484, 394, 131, 14);
		frame.getContentPane().add(queue_total_station4);
		queue_total_list.add(queue_total_station4);
		
		queue_total_station5.setBounds(646, 394, 120, 14);
		frame.getContentPane().add(queue_total_station5);
		queue_total_list.add(queue_total_station5);
		
		queue_total_station6.setBounds(799, 394, 120, 14);
		frame.getContentPane().add(queue_total_station6);
		queue_total_list.add(queue_total_station6);
		
		queue_total_station7.setBounds(959, 394, 120, 14);
		frame.getContentPane().add(queue_total_station7);
		queue_total_list.add(queue_total_station7);
		
		queue_total_station8.setBounds(1116, 394, 120, 14);
		frame.getContentPane().add(queue_total_station8);
		queue_total_list.add(queue_total_station8);
		
		lblStationStatus.setBounds(10, 455, 131, 14);
		frame.getContentPane().add(lblStationStatus);
		
		station1_status_scrollpane.setBounds(10, 500, 250, 66);
		frame.getContentPane().add(station1_status_scrollpane);
		station1_status_scrollpane.setViewportView(status_station1);
		station_status_list.add(status_station1);
		
		station2_status_scrollpane.setBounds(354, 500, 250, 66);
		frame.getContentPane().add(station2_status_scrollpane);
		station2_status_scrollpane.setViewportView(status_station2);
		station_status_list.add(status_station2);
		
		station3_status_scrollpane.setBounds(669, 500, 250, 66);
		frame.getContentPane().add(station3_status_scrollpane);
		station3_status_scrollpane.setViewportView(status_station3);
		station_status_list.add(status_station3);
		
		station4_status_scrollpane.setBounds(986, 500, 250, 66);
		frame.getContentPane().add(station4_status_scrollpane);
		station4_status_scrollpane.setViewportView(status_station4);
		station_status_list.add(status_station4);
		
		station5_status_scrollpane.setBounds(986, 604, 250, 66);
		frame.getContentPane().add(station5_status_scrollpane);
		station5_status_scrollpane.setViewportView(status_station5);
		station_status_list.add(status_station5);
		
		station6_status_scrollpane.setBounds(669, 604, 250, 66);
		frame.getContentPane().add(station6_status_scrollpane);
		station6_status_scrollpane.setViewportView(status_station6);
		station_status_list.add(status_station6);
		
		station7_status_scrollpane.setBounds(357, 604, 250, 66);
		frame.getContentPane().add(station7_status_scrollpane);
		station7_status_scrollpane.setViewportView(status_station7);
		station_status_list.add(status_station7);
		
		station8_status_scrollpane.setBounds(10, 604, 250, 66);
		frame.getContentPane().add(station8_status_scrollpane);
		station8_status_scrollpane.setViewportView(status_station8);
		station_status_list.add(status_station8);
		
		lblStationStatus1.setBounds(10, 480, 131, 14);
		
		frame.getContentPane().add(lblStationStatus1);
		lblStationStatus2.setBounds(354, 480, 120, 14);
		
		frame.getContentPane().add(lblStationStatus2);
		lblStationStatus3.setBounds(669, 475, 120, 14);
		
		frame.getContentPane().add(lblStationStatus3);
		lblStationStatus4.setBounds(986, 475, 125, 14);
		
		frame.getContentPane().add(lblStationStatus4);
		lblStationStatus5.setBounds(986, 579, 115, 14);
		
		frame.getContentPane().add(lblStationStatus5);
		lblStationStatus6.setBounds(669, 579, 120, 14);
		
		frame.getContentPane().add(lblStationStatus6);
		lblStationStatus7.setBounds(354, 579, 120, 14);
		
		frame.getContentPane().add(lblStationStatus7);
		lblStationStatus8.setBounds(10, 579, 120, 14);
		
		frame.getContentPane().add(lblStationStatus8);
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("CalTrains");
		frame.setBounds(100, 100, 1280, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.getContentPane().setLayout(null);		
		initializeGUI();
		
	}
}
