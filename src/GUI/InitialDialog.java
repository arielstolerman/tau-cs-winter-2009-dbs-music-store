package GUI;
import com.cloudgarden.resource.SWTResourceManager;
import org.eclipse.swt.widgets.*;
import org.eclipse.swt.*;

/** Initial Dialog
* ==============
* presents stores table for selection by user
* program is initiated by selected store's view 
*/
public class InitialDialog extends org.eclipse.swt.widgets.Dialog {
	private static Display display;
	private static InitialDialog inst;
	private static Shell shell;
	private static Shell dialogShell;
	private static Button initDialogButtonExit;
	private static Button initDialogButtonStart;
	private static Group initDialogGroup;
	private static Combo initDialogCombo;

	/**
	* Auto-generated main method to display this 
	* org.eclipse.swt.widgets.Dialog inside a new Shell.
	*/
	public static void openInitDialog() {
		try {
			display = Display.getDefault();
			shell = new Shell(display);
			shell.setLocation(Main.getCentral_x()-306, Main.getCentral_y()-158);
			inst = new InitialDialog(shell, SWT.NULL);
			inst.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void closeInitDialog(){
		shell.close();
	}

	public InitialDialog(Shell parent, int style) {
		super(parent, style);
	}

	public void open() {
		try {
			Shell parent = getParent();
			dialogShell = new Shell(parent, SWT.DIALOG_TRIM | SWT.APPLICATION_MODAL);

			{
				//Register as a resource user - SWTResourceManager will
				//handle the obtaining and disposing of resources
				SWTResourceManager.registerResourceUser(dialogShell);
			}
			
			dialogShell.setText("SSDA Music Store Manager");

			dialogShell.setLayout(null);
			{
				initDialogGroup = new Group(dialogShell, SWT.NONE);
				initDialogGroup.setLayout(null);
				initDialogGroup.setText("Select store");
				initDialogGroup.setBounds(0, 4, 306, 113);
				initDialogGroup.setFont(Main.defaultFont);
				{
					initDialogCombo = new Combo(initDialogGroup, SWT.READ_ONLY);
					initDialogCombo.setBounds(12, 29, 276, 21);
					initDialogCombo.setFont(Main.defaultFont);
					initDialogCombo.setEnabled(false);
				}
				{
					initDialogButtonStart = new Button(initDialogGroup, SWT.PUSH | SWT.CENTER);
					initDialogButtonStart.setText("Start");
					initDialogButtonStart.setBounds(12, 62, 135, 33);
					initDialogButtonStart.setFont(Main.defaultFont);
				}
				{
					initDialogButtonExit = new Button(initDialogGroup, SWT.PUSH | SWT.CENTER);
					initDialogButtonExit.setText("Exit");
					initDialogButtonExit.setBounds(153, 62, 135, 33);
					initDialogButtonExit.setFont(Main.defaultFont);
				}
			}
			dialogShell.layout();
			dialogShell.pack();			
			dialogShell.setLocation(getParent().toDisplay(100, 100));
			dialogShell.open();
			Display display = dialogShell.getDisplay();
			
			while (!dialogShell.isDisposed()) {
				if (!display.readAndDispatch())
					display.sleep();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Shell getDialogShell() {
		return dialogShell;
	}

	public static void setDialogShell(Shell dialogShell) {
		InitialDialog.dialogShell = dialogShell;
	}

	public static Button getInitDialogButtonExit() {
		return initDialogButtonExit;
	}

	public static void setInitDialogButtonExit(Button initDialogButtonExit) {
		InitialDialog.initDialogButtonExit = initDialogButtonExit;
	}

	public static Button getInitDialogButtonStart() {
		return initDialogButtonStart;
	}

	public static void setInitDialogButtonStart(Button initDialogButtonStart) {
		InitialDialog.initDialogButtonStart = initDialogButtonStart;
	}

	public static Group getInitDialogGroup() {
		return initDialogGroup;
	}

	public static void setInitDialogGroup(Group initDialogGroup) {
		InitialDialog.initDialogGroup = initDialogGroup;
	}

	public static Combo getInitDialogCombo() {
		return initDialogCombo;
	}

	public static void setInitDialogCombo(Combo initDialogCombo) {
		InitialDialog.initDialogCombo = initDialogCombo;
	}

	public static Display getInitDisplay() {
		return display;
	}

	public static void setDisplay(Display display) {
		InitialDialog.display = display;
	}

	public static Display getDisplay() {
		return display;
	}

	public static InitialDialog getInst() {
		return inst;
	}

	public static Shell getShell() {
		return shell;
	}	
}
