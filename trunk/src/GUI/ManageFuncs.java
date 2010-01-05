package GUI;

import org.eclipse.swt.*;
import org.eclipse.swt.events.*;
import org.eclipse.swt.widgets.*;

import DBLayer.*;
import Debug.*;
import Debug.Debug.*;
import Tables.*;

/**
 * created by Ariel
 * 
 * Management tab handlers
 */
public class ManageFuncs {
	
	/**
	 * initializes the manage tab view: enabled and disabled fields, default values etc.
	 */
	protected static void initManageTabView(){
		// update employees table view
		updateEmployeesTableView();
		// disable employees details inputs
		switchEnableEmployeesDetails(false);
		// disable update data button
		Main.getManageButtonDBSUpdate().setEnabled(false);
		// initialize buttons
		setEnableEmployeeButtons(true, false, false, false, false, false);
		// initialize positions
		Main.getManageComboEmployeePositionInput().add(EmployeePositionsEnum.NETWORK_MANAGER.getStrRep());
		Main.getManageComboEmployeePositionInput().add(EmployeePositionsEnum.MANAGER.getStrRep());
		Main.getManageComboEmployeePositionInput().add(EmployeePositionsEnum.ASSIST_MANAGER.getStrRep());
		Main.getManageComboEmployeePositionInput().add(EmployeePositionsEnum.SALESMAN.getStrRep());
		// initialize DB update progress animation to be invisible
		showDBProgress(false);
	}

	/**
	 * initialize manage tab listeners
	 */
	protected static void initManageListeners(){
		// employees table listener
		Main.getManageTableEmployees().addSelectionListener(
				new SelectionAdapter() {
					public void widgetSelected(SelectionEvent e){
						Debug.log("Management tab: employee selected",DebugOutput.FILE,DebugOutput.STDOUT);
						
						// disable employee details
						switchEnableEmployeesDetails(false);
						// set buttons
						setEnableEmployeeButtons(true, false, false, true, false, true);
						// show employee details
						showSelectedEmployeeDetails();
						// enable edit and remove employee
					}
				}
		);
		
		// new button listener
		Main.getManageButtonEmployeeNew().addSelectionListener(
				new SelectionAdapter() {
					public void widgetSelected(SelectionEvent e){
						Debug.log("Management tab: New button clicked",DebugOutput.FILE,DebugOutput.STDOUT);

						// disable new, edit, remove employee buttons
						// enable insert, exit without saving, save buttons
						setEnableEmployeeButtons(false,true,true,false,false,false);
						// setup employee details fields
						newButtonInvokation();
						// disable new employee selection
						Main.getManageTableEmployees().setEnabled(false);
					}
				}
		);
		
		// insert button listener
		Main.getManageButtonEmployeeInsert().addSelectionListener(
				new SelectionAdapter() {
					public void widgetSelected(SelectionEvent e){
						Debug.log("Management tab: Insert button clicked",DebugOutput.FILE,DebugOutput.STDOUT);
						
						
						
						// check fields validity
						try{
							int employeeID = checkEmployeeDetailsValidity();
							// if valid, check if employee exists in DB
							// there it will insert employee if allowed
							
							// check if DB is not busy, else pop a message
							if (MainFuncs.isAllowDBAction()){
								// flag DB as busy
								MainFuncs.setAllowDBAction(false);
								
								DBConnectionInterface.checkIfEmployeeExists(employeeID);
								
							} else {
								MainFuncs.getMsgDBActionNotAllowed().open();
							}
							
						}catch(EmployeeDetailsValidityException edve){
							// in case the fields are not valid
							edve.getMsgBox().open();
						}
					}
				}
		);
		
		// exit without saving button listener
		Main.getManageButtonEmployeeNoSave().addSelectionListener(
				new SelectionAdapter() {
					public void widgetSelected(SelectionEvent e){
						Debug.log("Management tab: Exit without saving button clicked",DebugOutput.FILE,DebugOutput.STDOUT);
						
						exitWithoutSavingInvokation();
					}
				}
		);
		
		// edit button listener
		Main.getManageButtonEmployeeEdit().addSelectionListener(
				new SelectionAdapter() {
					public void widgetSelected(SelectionEvent e){
						Debug.log("Management tab: Edit button clicked",DebugOutput.FILE,DebugOutput.STDOUT);
						
						editInvokation();
					}
				}
		);
		
		// save button listener
		Main.getManageButtonEmployeeSave().addSelectionListener(
				new SelectionAdapter() {
					public void widgetSelected(SelectionEvent e){
						Debug.log("Management tab: Save button clicked",DebugOutput.FILE,DebugOutput.STDOUT);
						
						// check fields validity
						try{
							int employeeID = checkEmployeeDetailsValidity();
							// if valid, change employee in DB
							
							// check if DB is not busy, else pop a message
							if (MainFuncs.isAllowDBAction()){
								// flag DB as busy
								MainFuncs.setAllowDBAction(false);
								
								DBConnectionInterface.insertUpdateEmployee(getEmployeeFromDetails(employeeID));
								
							} else {
								MainFuncs.getMsgDBActionNotAllowed().open();
							}
							
						}catch(EmployeeDetailsValidityException edve){
							// in case the fields are not valid
							edve.getMsgBox().open();
						}
					}
				}
		);
		
		// remove employee button listener
		Main.getManageButtonEmployeeRemove().addSelectionListener(
				new SelectionAdapter() {
					public void widgetSelected(SelectionEvent e){
						Debug.log("Management tab: Remove employee button clicked",DebugOutput.FILE,DebugOutput.STDOUT);
						
						// check if DB is not busy, else pop a message
						if (MainFuncs.isAllowDBAction()){
							// flag DB as busy
							MainFuncs.setAllowDBAction(false);
							
							removeEmployeeInvokation();
							
						} else {
							MainFuncs.getMsgDBActionNotAllowed().open();
						}
					}
				}
		);
		
		// browse button listener
		Main.getManageButtonDBSBrowse().addSelectionListener(
				new SelectionAdapter() {
					public void widgetSelected(SelectionEvent e){
						Debug.log("Management tab: Browse button clicked",DebugOutput.FILE,DebugOutput.STDOUT);
						
						browseInvokation();
					}
				}
		);
		
		// update database button listener
		Main.getManageButtonDBSUpdate().addSelectionListener(
				new SelectionAdapter() {
					public void widgetSelected(SelectionEvent e){
						Debug.log("Management tab: Update DBS button clicked",DebugOutput.FILE,DebugOutput.STDOUT);

						// check if DB is not busy, else pop a message
						if (MainFuncs.isAllowDBAction()){
							// flag DB as busy
							MainFuncs.setAllowDBAction(false);
							
							updateDBInvokation();
							
						} else {
							MainFuncs.getMsgDBActionNotAllowed().open();
						}
					}
				}
		);
	}
	
	/////////////////////////
	//	employees handlers //
	/////////////////////////
	
	/**
	 * enables or disables employee details text boxes
	 * @param enable
	 */
	public static void switchEnableEmployeesDetails(boolean enable){
		Main.getManageTextBoxEmployeeIDInput().setEnabled(enable);
		Main.getManageTextBoxEmployeeBirthInput().setEnabled(enable);
		Main.getManageTextBoxEmployeeFNameInput().setEnabled(enable);
		Main.getManageTextBoxEmployeeLNameInput().setEnabled(enable);
		Main.getManageTextBoxEmployeeAddressInput().setEnabled(enable);
		Main.getManageTextBoxEmployeePhoneInput().setEnabled(enable);
		Main.getManageTextBoxEmployeeCellPhoneInput().setEnabled(enable);
		Main.getManageComboEmployeePositionInput().setEnabled(enable);
	}
	
	/**
	 * show selected employee details
	 */
	public static void showSelectedEmployeeDetails(){
		try{
			// get selected employee
			int employeeID = Integer.parseInt(Main.getManageTableEmployees().getSelection()[0].getText());
			EmployeesTableItem employee = StaticProgramTables.employees.getEmployee(employeeID);
			
			// update details view
			Main.getManageLabelEmployeeEmploymentDateInput().setText(employee.getEmploymentDate());
			Main.getManageLabelEmployeeEmployeeStoreIDInput().setText(Integer.toString(employee.getStoreID()));
			Main.getManageTextBoxEmployeeIDInput().setText(Integer.toString(employee.getEmployeeID()));
			Main.getManageTextBoxEmployeeBirthInput().setText(employee.getBirthDate());
			Main.getManageTextBoxEmployeeFNameInput().setText(employee.getFirstName());
			Main.getManageTextBoxEmployeeLNameInput().setText(employee.getLastName());
			Main.getManageTextBoxEmployeeAddressInput().setText(employee.getAddress());
			Main.getManageTextBoxEmployeePhoneInput().setText(employee.getPhone());
			Main.getManageTextBoxEmployeeCellPhoneInput().setText(employee.getCellPhone());
			Main.getManageComboEmployeePositionInput().setText(employee.getPosition().getStrRep());
		}catch(NumberFormatException nfe){
			System.out.println("*** BUG: ManageFuncs.showSelectedEmployeeDetails bug");
		}
	}
	
	/**
	 * set employees buttons enable
	 * @param newEnable
	 * @param insertEnable
	 * @param noSaveEnable
	 * @param editEnable
	 * @param saveEnable
	 * @param removeEnable
	 */
	public static void setEnableEmployeeButtons(boolean newEnable, boolean insertEnable, boolean noSaveEnable,
			boolean editEnable, boolean saveEnable, boolean removeEnable){
		Main.getManageButtonEmployeeNew().setEnabled(newEnable);
		Main.getManageButtonEmployeeInsert().setEnabled(insertEnable);
		Main.getManageButtonEmployeeNoSave().setEnabled(noSaveEnable);
		Main.getManageButtonEmployeeEdit().setEnabled(editEnable);
		Main.getManageButtonEmployeeSave().setEnabled(saveEnable);
		Main.getManageButtonEmployeeRemove().setEnabled(removeEnable);
	}
	
	///////////////////////
	//	employee buttons //
	///////////////////////
	
	/**
	 * clear all employee details fields
	 */
	public static void clearEmployeeDetails(){
		Main.getManageLabelEmployeeEmploymentDateInput().setText("");
		Main.getManageLabelEmployeeEmployeeStoreIDInput().setText("");
		Main.getManageTextBoxEmployeeIDInput().setText("");
		Main.getManageTextBoxEmployeeBirthInput().setText("");
		Main.getManageTextBoxEmployeeFNameInput().setText("");
		Main.getManageTextBoxEmployeeLNameInput().setText("");
		Main.getManageTextBoxEmployeeAddressInput().setText("");
		Main.getManageTextBoxEmployeePhoneInput().setText("");
		Main.getManageTextBoxEmployeeCellPhoneInput().setText("");
		Main.getManageComboEmployeePositionInput().setText("");
	}
	
	// New button
	/////////////
	
	/**
	 * enable employee input fields and clear them
	 * initialize employment date and store id
	 */
	public static void newButtonInvokation(){
		// enable fields and clear them
		switchEnableEmployeesDetails(true);
		// clear fields
		clearEmployeeDetails();
		// set employment date and store id
		Main.getManageLabelEmployeeEmploymentDateInput().setText(MainFuncs.getDate());
		Main.getManageLabelEmployeeEmployeeStoreIDInput().setText(
				Integer.toString(StaticProgramTables.thisStore.getStoreID()));
	}
	
	// Insert button
	////////////////
	
	/**
	 * checks for employee details validity upon insert / save
	 * returns employee id as integer
	 * throws EmployeeDetailsValidityException in case of illegal entries
	 * @throws EmployeeDetailsValidityException
	 */
	protected static int checkEmployeeDetailsValidity() throws EmployeeDetailsValidityException{
		// check that id field is not empty and is valid (an integer)
		// NOTE: checking if the employee exist is done later in button "insert" listener
		int employeeID = -1;
		boolean amIManager = false;
		try{
			employeeID = Integer.parseInt(Main.getManageTextBoxEmployeeIDInput().getText());
			// set if I am a manager (if I'm new, set false, if I exist, check my position)
			if (StaticProgramTables.employees.getEmployee(employeeID) == null)
				amIManager = false;
			else
				amIManager = StaticProgramTables.employees.getEmployee(employeeID).getPosition() == EmployeePositionsEnum.MANAGER;
		}catch(NumberFormatException nfe){
			throw new EmployeeDetailsValidityException("Employee ID must be an integer");
		}
		
		// check that first name and last name are not empty
		if (Main.getManageTextBoxEmployeeFNameInput().getText().isEmpty() ||
				Main.getManageTextBoxEmployeeLNameInput().getText().isEmpty())
			throw new EmployeeDetailsValidityException("Employee full name must be specified");
		
		// check that phone and cell phone are numbers
		String[] tokens = Main.getManageTextBoxEmployeePhoneInput().getText().split("-");
		for(String str: tokens){
			try{
				//int phone = 
				Integer.parseInt(str);
			}catch(NumberFormatException nfe){
				throw new EmployeeDetailsValidityException("Employee phone format illegal");
			}
		}
		
		tokens = Main.getManageTextBoxEmployeeCellPhoneInput().getText().split("-");
		for(String str: tokens){
			try{
				//long cellPhone = 
				Long.parseLong(str);
			}catch(NumberFormatException nfe){
				throw new EmployeeDetailsValidityException("Employee cell-phone format illegal");
			}
		}
		
		// check that position is valid - not empty and no double managers
		if (Main.getManageComboEmployeePositionInput().getText().isEmpty())
			throw new EmployeeDetailsValidityException("Must select employee position");
		if (Main.getManageComboEmployeePositionInput().getText().equals(EmployeePositionsEnum.MANAGER.getStrRep())
				&& alreadyHasManager() && !amIManager)
			throw new EmployeeDetailsValidityException("Store already has a manager");
		
		return employeeID;
	}
	
	/**
	 * returns true iff this store already has a manager
	 * @return
	 */
	protected static boolean alreadyHasManager(){		
		for(EmployeesTableItem employee: StaticProgramTables.employees.getEmployees().values()){
			if (employee.getPosition() == EmployeePositionsEnum.MANAGER)
				return true;
		}
		return false;
	}
	
	/**
	 * this method is called by GuiUpdatesInterface.tryInsertNewEmployee
	 * if employee exists in DB, pops an error message
	 * otherwise inserts employee to DB and updates view
	 * @param exists
	 * @param employeeID
	 */
	public static void tryInsert(boolean exists, int employeeID){
		if (exists){ // employee already exists in DB
			EmployeeDetailsValidityException ndve = new EmployeeDetailsValidityException(
					"Employee already employed by the network");
			ndve.getMsgBox().open();
		}else{ // insert employee
			// by now the employee details are correct
			// insert employee to DB
			DBConnectionInterface.insertUpdateEmployee(getEmployeeFromDetails(employeeID));
		}
	}
	
	/**
	 * creates employees table item (assumes fields are ok) and returns it
	 * @param employeeID
	 * @return
	 */
	public static EmployeesTableItem getEmployeeFromDetails(int employeeID){
		EmployeesTableItem employee = new EmployeesTableItem(
				employeeID,
				Main.getManageTextBoxEmployeeFNameInput().getText(),
				Main.getManageTextBoxEmployeeLNameInput().getText(),
				MainFuncs.getDate(),
				Main.getManageTextBoxEmployeeBirthInput().getText(),
				Main.getManageTextBoxEmployeeAddressInput().getText(),
				Main.getManageTextBoxEmployeePhoneInput().getText(),
				Main.getManageTextBoxEmployeeCellPhoneInput().getText(),
				StaticProgramTables.thisStore.getStoreID(),
				getPositionFromText());
		return employee;
	}
	
	/**
	 * returns the position enum by text in position combobox
	 * @return
	 */
	public static EmployeePositionsEnum getPositionFromText(){
		String pos = Main.getManageComboEmployeePositionInput().getText();
		if (pos.equals(EmployeePositionsEnum.NETWORK_MANAGER.getStrRep()))
			return EmployeePositionsEnum.NETWORK_MANAGER;
		else if (pos.equals(EmployeePositionsEnum.MANAGER.getStrRep()))
			return EmployeePositionsEnum.MANAGER;
		else if (pos.equals(EmployeePositionsEnum.ASSIST_MANAGER.getStrRep()))
			return EmployeePositionsEnum.ASSIST_MANAGER;
		else return EmployeePositionsEnum.SALESMAN;
	}
	
	/**
	 * called after employee was inserted to DB / updated in DB
	 * updates current employees table and gui view
	 * @param employee
	 */
	public static void insertUpdateEmployee(EmployeesTableItem employee){
		// first check if employee exists in table, if so remove it
		if (StaticProgramTables.employees.getEmployee(employee.getEmployeeID()) != null)
			StaticProgramTables.employees.removeEmployee(employee.getEmployeeID());
		
		// insert new employee
		StaticProgramTables.employees.addEmployee(employee);
		
		// update table view
		updateEmployeesTableView();
		// update employee details view
		setNoEmployeeSelectedState();
		
		// update employees list in sale tab
		SaleFuncs.updateSalesmenList();
		
		// flag DB as free
		MainFuncs.setAllowDBAction(true);
	}
	
	// Exit without saving button
	/////////////////////////////
	
	/**
	 * invoked by "Exit without Saving" button
	 * clears employee details and restores to initial state
	 */
	public static void exitWithoutSavingInvokation(){
		setNoEmployeeSelectedState();	
	}
	
	// Edit button
	//////////////
	
	/**
	 * invoked by "Edit" button
	 * sets view to edit selected employee (except id)
	 */
	public static void editInvokation(){
		// disable employees table change
		Main.getManageTableEmployees().setEnabled(false);
		// enable change fields
		switchEnableEmployeesDetails(true);
		Main.getManageTextBoxEmployeeIDInput().setEnabled(false);
		// setup buttons
		setEnableEmployeeButtons(false, false, true, false, true, false);
	}
	
	// Save button
	//////////////
	
	// handled in listener
	
	// Remove employee button
	/////////////////////////
	
	/**
	 * invoked by "Remove employee" button
	 * removes employee
	 */
	public static void removeEmployeeInvokation(){
		// setup "Are you sure" message
		MessageBox areYouSureMsg = new MessageBox(Main.getMainShell(),SWT.ICON_QUESTION | SWT.YES | SWT.NO);
		areYouSureMsg.setText("Remove employee");
		areYouSureMsg.setMessage("Are you sure you want to remove employee "+
				Main.getManageTextBoxEmployeeFNameInput().getText()+" "+
				Main.getManageTextBoxEmployeeLNameInput().getText()+"?");
		
		// pop message and handle "Yes" event
		if (areYouSureMsg.open() == SWT.YES){
			try{
				int employeeID = Integer.parseInt(Main.getManageTextBoxEmployeeIDInput().getText());
				DBConnectionInterface.removeEmployee(employeeID);
			}catch(NumberFormatException nfe){
				Debug.log("*** BUG: ManageFuncs.removeEmployeeInvokation bug", DebugOutput.FILE, DebugOutput.STDOUT);
			}
		}
	}
	
	/**
	 * called by DB after employee was removed from DB
	 * removes employee from employees table in gui and updates view
	 * @param employeeID
	 */
	public static void removeEmployee(int employeeID){
		// remove employee from employees table
		StaticProgramTables.employees.removeEmployee(employeeID);
		
		// update view
		updateEmployeesTableView();
		setNoEmployeeSelectedState();
		
		// update salesmen list in sale tab
		SaleFuncs.updateSalesmenList();
		
		// flag DB as free
		MainFuncs.setAllowDBAction(true);
	}
	
	/////////////////////////////
	//	employees view updates //
	/////////////////////////////
	
	/**
	 * sets employees table and details to initial none-selected state
	 * invoked by:
	 * - insert button
	 * - exit without saving button
	 * - save button
	 * - remove employee button
	 */
	public static void setNoEmployeeSelectedState(){
		// set buttons
		setEnableEmployeeButtons(true, false, false, false, false, false);
		// unselect items in employees table
		Main.getManageTableEmployees().deselectAll();
		// clear details
		clearEmployeeDetails();
		// disable details
		switchEnableEmployeesDetails(false);
		// enable table selection
		Main.getManageTableEmployees().setEnabled(true);
	}
	
	/**
	 * update requests table view according to current requests table
	 */
	public static void updateEmployeesTableView(){
		// first remove all employees table items
		Main.getManageTableEmployees().removeAll();
		
		// then insert all items
		for(EmployeesTableItem employee: StaticProgramTables.employees.getEmployees().values()){
			TableItem item = new TableItem(Main.getManageTableEmployees(), SWT.NONE);
			String[] entry = new String[]{
					Integer.toString(employee.getEmployeeID()),
					employee.getFirstName(),
					employee.getLastName(),
					employee.getPosition().getStrRep()
			};
			item.setText(entry);
		}
	}
	
	/**
	 * update current employees table to given one
	 * @param employees
	 */
	public static void setCurrentEmployees(EmployeesTable employees){
		StaticProgramTables.employees = employees;
	}
	
	/////////////////////
	// update database //
	/////////////////////
	
	/**
	 * invokes open dialog
	 */
	public static void browseInvokation(){
		// initialize and open file dialog
		FileDialog openUpdateFile = new FileDialog(Main.getMainShell(),SWT.OPEN);
		openUpdateFile.setText("Open update file");
		String[] extensions = new String[]{"*.bz2","*.tar"};
		openUpdateFile.setFilterExtensions(extensions);
		try{
			String selected = openUpdateFile.open();
			// update text
			Main.getManageTextBoxDBSUpdateFileInput().setText(selected);
			// enable update button
			Main.getManageButtonDBSUpdate().setEnabled(true);
		}catch(IllegalArgumentException iae){} // in case "cancel" is pressed
	}
	
	/**
	 * invoke updating database
	 */
	public static void updateDBInvokation(){
		// disable update button
		Main.getManageButtonDBSUpdate().setEnabled(false);
		
		//start progress animation
		showDBProgress(true);
		
		// send update to DB
		String filename = Main.getManageTextBoxDBSUpdateFileInput().getText();
		DBConnectionInterface.updateDataBase(filename);
	}
	
	/**
	 * invoked by DB when update is complete
	 * pops a message to the user
	 * @param filename
	 */
	public static void updateComplete(String filename){
		MessageBox updateCompleteMsg = new MessageBox(Main.getMainShell(),SWT.ICON_INFORMATION | SWT.OK);
		updateCompleteMsg.setText("Update complete");
		updateCompleteMsg.setMessage("Updating database from archive "+filename+" has completed successfuly");
		// stop progress animation
		showDBProgress(false);
		if (updateCompleteMsg.open() == SWT.OK){
			// clear file input
			Main.getManageTextBoxDBSUpdateFileInput().setText("");
		}
		
		// flag DB as free
		MainFuncs.setAllowDBAction(true);
	}
	
	/**
	 * sets the DB progress bar visibility on and off
	 * @param show
	 */
	public static void showDBProgress(boolean show){
		Main.getManageCompositeDBProgressContainer().setVisible(show);
	}
}