import java.awt.*;
import java.awt.event.*;

public class TestGUI extends Frame implements ActionListener
/*Zusicherung im Klassenkopf, dass das Interface actionListener implementiert wird.
  Auf deutsch: Die Klasse Testfenster1(Empfänger) ist in der Lage ActionEvents(Nachricht) zu verarbeiten.
  Ein solches Event wird durch das Klicken eines bestimmten Buttons(Quelle für ActionEvents, Sender) erzeugt.
*/
{
	//Attribute
	private Button button_1 = new Button("Klick");
	private Label label_1 = new Label("Klick den Button");
	private Panel panel_1  = new Panel();
	private Panel panel_2 = new Panel();
	private GridLayout grid = new GridLayout(1,2);
	private Close close_1 = new Close();
		
	//Konstruktor der Klasse TestGUI
	public TestGUI()
	{
		//Panel
		this.add(panel_1);
		this.add(panel_2); 
		
		//Button
		this.panel_2.add(button_1); 
		
		//Label
		this.panel_1.add(label_1); 
	
		//Grid (Tabelle)
		this.setLayout(grid); 
		
		//TestGUI (Frame) / Hauptcontainer
		this.setSize(300,100); 
		this.setResizable(false); 
		this.setVisible(true); 
		this.setTitle("TestGUI"); 
		
		//WindowListener
		this.addWindowListener(close_1);
		
		//ActionListener
		this.button_1.addActionListener(this);
		/*Der Listener("this", Selbstreferenz, weil die Klasse TestGUI in diesem Fall der Listener ist, Siehe oben)
		  wird bei der Eventquelle(Button_1) registriert.
		  Hierdurch weiß die Quelle(button_1) an welchen Listener sie das Event schicken muss.
		*/
	}

	public void actionPerformed(ActionEvent e)
	/*In einr Klasse kann nur ein ActionListener sein, wenn die Klasse eine actionPerformed Methode enthält.
	  In der Methode actionPerformed findet die Verarbeitung(Reaktion auf ein Event) statt.
	*/
	{
		this.panel_1.setBackground(Color.gray);
		this.label_1.setText("Prima!");
	}
}