import java.awt.*;
import javax.swing.*;


public class LabelTest extends JFrame{
	private JLabel label1, label2, label3;
	
	
	public LabelTest() 
	
	{
		super( "Testing Jlabel" );
		
		Container container = getContentPane();
		container.setLayout( new FlowLayout() );
		
		label1 = new JLabel("Label with test" );
		label1.setToolTipText("This is label1" );
		container.add( label1 );
		
		Icon bug = new ImageIcon( "image1.jpg" );
		label2 = new JLabel( "Label with test and icon", bug, SwingConstants.LEFT);
		label2.setToolTipText("This is Label2" );
		container.add( label2 );
		
		label3 = new JLabel();
		label3.setText("label with icon and text button");
		label3.setIcon(bug);
		label3.setHorizontalTextPosition(SwingConstants.CENTER);
		label3.setVerticalTextPosition(SwingConstants.BOTTOM);
		label3.setToolTipText("This is label 3" );
		container.add(label3);
		
		
		setSize(275,170);
		setVisible(true);
		
	}

	public static void main( String args[] )
	{
		LabelTest application = new LabelTest();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
}
	
	//private class ButtonHandler implements ActionListener 
	//{
		
		//public void actionPerformed( ActionEvent event )
		
		//{
			//JOptionPane.showMessageDialog(null,"You Pressed: " + event.getActionCommand());
		
		//}
		
		
		
	//}
		
	
//}
