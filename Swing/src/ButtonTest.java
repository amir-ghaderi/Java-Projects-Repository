import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonTest extends JFrame{
	private JButton plainButton, fancyButton;
	
	
	public ButtonTest() 
	
	{
		super( "Testing Buttons" );
		
		Container container = getContentPane();
		container.setLayout( new FlowLayout() );
		
		plainButton = new JButton("Plain Button" );
		container.add( plainButton );
		
		Icon bug1 = new ImageIcon( "image1.jpg" );
		Icon bug2 = new ImageIcon( "image2.jpg" );
		
		fancyButton = new JButton( "Fancy Button", bug1 );
		fancyButton.setRolloverIcon(bug2);
		container.add(fancyButton);
		
		
		ButtonHandler handler = new ButtonHandler();
		fancyButton.addActionListener(handler);
		plainButton.addActionListener(handler);
		
	
		setSize(150,100);
		setVisible(true);
		
	}

	public static void main( String args[] )
	
	{
		ButtonTest application = new ButtonTest();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
	}
	
	private class ButtonHandler implements ActionListener 
	{
		
		public void actionPerformed( ActionEvent event )
		
		{
			JOptionPane.showMessageDialog(null,"You Pressed: " + event.getActionCommand());
		
		}
		
		
		
	}
		
	
}
