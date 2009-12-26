package GUI;

import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import com.cloudgarden.resource.SWTResourceManager;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.widgets.*;
import org.eclipse.swt.graphics.*;
import org.eclipse.swt.*;
import org.eclipse.swt.custom.ScrolledComposite;

/**
 * created by Ariel
 * 
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class Main extends org.eclipse.swt.widgets.Composite {

	{
		//Register as a resource user - SWTResourceManager will
		//handle the obtaining and disposing of resources
		SWTResourceManager.registerResourceUser(this);
	}

	//////////////////////////////////
	//	Class Fields definitions	//
	//////////////////////////////////
	
	// Main Menu
	private static Menu mainMenuBar;
	private static MenuItem menuItemSeperator;
	
	private static MenuItem mainMenuItemFile;
	private static Menu fileMenu;
	private static MenuItem fileMenuItemExit;
	
	private static MenuItem mainMenuItemSearch;
	private static Menu searchMenu;
	private static MenuItem searchMenuItemAddToSale;
	private static MenuItem searchMenuItemPlaceOrder;
	private static MenuItem searchMenuItemSearch;
	private static MenuItem searchMenuItemClear;
	
	private static MenuItem mainMenuItemSale;
	private static Menu saleMenu;
	private static MenuItem saleMenuItemRemove;
	private static MenuItem saleMenuItemClear;
	private static MenuItem saleMenuItemMakeSale;
	
	private static MenuItem mainMenuItemStock;
	private static Menu stockMenu;
	private static MenuItem stockMenuItemCheckAvailability;
	private static MenuItem stockMenuItemClear;
	private static MenuItem stockMenuItemPlaceOrder;
	private static MenuItem stockMenuItemRemoveOrder;
	private static MenuItem stockMenuItemCancelOrder;
	private static MenuItem stockMenuItemDenyRequest;
	private static MenuItem stockMenuItemApproveRequest;
	
	private static MenuItem mainMenuItemManage;
	private static Menu manageMenu;
	private static MenuItem manageMenuItemBrowse;
	private static MenuItem manageMenuItemUpdateDBS;
	private static MenuItem manageMenuItemNew;
	private static MenuItem manageMenuItemInsert;
	private static MenuItem manageMenuItemEdit;
	private static MenuItem manageMenuItemSave;
	private static MenuItem manageMenuItemExitNoSave;
	private static MenuItem manageMenuItemRemoveEmployee;
	
	// Main Window Details
	//////////////////////
	// Store details
	private static Group mainGroupStoreDetails;
	private static Label mainLabelStoreDetailsStoreID;
	private static Label mainLabelStoreDetailsDateTime;
	private static Label mainLabelStoreDetailsStoreAddress;
	private static Label mainLabelStoreDetailsStorePhone;
	private static Label mainLabelStoreDetailsStoreManager;
	
	// Quick tips
	private static Group mainGroupQuickTips;
	private static Label mainLabelQuickTipsTip;
	
	// Tab folder
	private static TabFolder mainTabFolder;
	
	// Search tab
	/////////////
	private static TabItem searchTabItem;
	private static Composite searchTabComposite;
	
	// Search options group
	private static Group searchGroupOptions;
	private static Button searchBulletByAlbum;
	private static Text searchTextBoxAlbumID;
	private static Button searchBulletOtherParameters;
	private static Button searchCheckBoxAlbumName;
	private static Text searchTextBoxAlbumName;
	private static Button searchCheckBoxArtist;
	private static Text searchTextBoxArtist;
	private static Button searchCheckBoxYear;
	private static Text searchTextBoxYearFrom;
	private static Label searchLabelYearTo;
	private static Text searchTextBoxYearTo;
	private static Button searchCheckBoxSongNames;
	private static Text searchTextBoxSongNames;
	private static Composite searchCompositeStockField;
	private static Label searchLabelStock;
	private static Button searchBulletInStockAll;
	private static Button searchBulletInStockInStore;
	private static Button searchBulletInStockInNetwork;
	private static Button searchCheckBoxGenres;
	private static Button[] searchCheckBoxGenresArr = new Button[10];
	/*
	private static Button searchCheckBoxGenreJazz;
	private static Button searchCheckBoxGenreRock;
	private static Button searchCheckBoxGenre03;
	private static Button searchCheckBoxGenre04;
	private static Button searchCheckBoxGenre05;
	private static Button searchCheckBoxGenre06;
	private static Button searchCheckBoxGenre07;
	private static Button searchCheckBoxGenre08;
	private static Button searchCheckBoxGenre09;
	private static Button searchCheckBoxGenre10;
	*/
	private static Button searchCheckBoxGenreOther;
	private static Text searchTextBoxGenreOther;
	private static Button searchButtonClear;
	private static Button searchButtonSearch;
	
	// Search results group
	private static Group searchGroupResults;
	private static Table searchTableAlbumResults;
	private static TableColumn searchTableColumnAlbumID;
	private static TableColumn searchTableColumnAlbumName;
	private static TableColumn searchTableColumnAlbumArtist;
	private static TableColumn searchTableColumnAlbumYear;
	private static TableColumn searchTableColumnAlbumGenre;
	private static TableColumn searchTableColumnAlbumLength;
	private static ProgressBar searchProgressBar;
	private static Table searchTableSongResults;
	private static TableColumn searchTableColumnSongName;
	private static TableColumn searchTableColumnSongArtist;
	private static TableColumn searchTableColumnSongLength;
	
	// Stock information group
	private static Group searchGroupStockInfo;
	private static Label searchLabelStockInfoStoreStock;
	private static Label searchLabelStockInfoLocation;
	private static Label searchLabelStockInfoPrice;
	private static Button searchButtonStockInfoOrder;
	
	// Sale group
	private static Group searchGroupSaleInfo;	
	private static Label searchLabelSaleInfoQuantity;
	private static Text searchTextBoxSaleInfoQuantity;
	private static Button searchButtonSaleInfoSale;
	
	// Sale tab
	///////////
	private static TabItem saleTabItem;
	private static Composite saleCompositeMain;
	
	// Sale details group
	private static Group saleGroupSaleDetails;
	private static Label saleLabelSaleID;
	private static Label saleLabelSaleIDInput;
	private static Label saleLabelSaleDate;
	private static Label saleLabelDateInput;
	private static Label saleLabelSalesmanIDName;
	private static Combo saleComboSalesmanIDNameInput;
	private static Label saleLabelSaleTime;
	private static Label saleLabelTimeInput;
	
	// Sale table
	private static Table saleTableSaleItems;
	private static TableColumn saleTableColumnAlbumID;
	private static TableColumn saleTableColumnAlbumName;
	private static TableColumn saleTableColumnQuantity;
	private static TableColumn saleTableColumnPricePerItem;
	private static TableColumn saleTableColumnPriceTotal;
	private static Button saleButtonRemoveItem;
	private static Button saleButtonClearSale;
	private static Label saleLabelTotalPrice;
	private static Label saleLabelTotalPriceValue;
	private static Button saleButtonMakeSale;
	
	// Stock tab
	////////////
	private static TabItem stockTabItem;
	private static Composite stockTabComposite;
	
	// Order group
	private static Group stockGroupOrderForm;
	private static Label stockLabelOrderID;
	private static Label stockLabelOrderIDInput;
	private static Label stockLabelAlbumID;
	private static Text stockTextBoxAlbumIDInput;
	private static Label stockLabelDate;
	private static Label stockLabelOrderDateInput;
	private static Button stockButtonCheckAvailability;
	private static Label stockLabelOrderFromStore;
	private static Table stockTableOrderAvailableStores;
	private static TableColumn stockTableColumnStoreID;
	private static TableColumn stockTableColumnStoreCity;
	private static TableColumn stockTableColumnQuantity;
	private static TableColumn stockTableColumnPrice;
	private static Label stockLabelPrice;
	private static Label stockLabelStorePriceInput;
	private static Label stockLabelQuantityInStock;
	private static Label stockLabelQuantityInStockInput;
	private static Label stockLabelStorageLocation;
	private static Label stockLabelStorageLocationInput;
	private static Label stockLabelQuantityToOrder;
	private static Text stockTextBoxQuantityToOrder;
	private static Button stockButtonClearOrder;
	private static Button stockButtonPlaceOrder;
	
	// Orders table
	private static Label stockLabelOrders;
	private static Table stockTableOrders;
	private static TableColumn stockTableColumnOrdersOrderID;
	private static TableColumn stockTableColumnOrdersSupplierID;
	private static TableColumn stockTableColumnOrdersAlbumID;
	private static TableColumn stockTableColumnOrdersQuantity;
	private static TableColumn stockTableColumnOrdersDate;
	private static TableColumn stockTableColumnOrdersStatus;
	private static TableColumn stockTableColumnOrdersCompletionDate;
	private static Button stockButtonRemoveOrder;
	private static Button stockButtonCancelOrder;
	
	// Requests table
	private static Label stockLabelRequests;	
	private static Table stockTableRequests;
	private static TableColumn stockTableColumnRequestsOrderID;
	private static TableColumn stockTableColumnRequestsOrderingStoreID;
	private static TableColumn stockTableColumnRequestsAlbumID;
	private static TableColumn stockTableColumnRequestsQuantity;
	private static TableColumn stockTableColumnRequestsDate;
	private static TableColumn stockTableColumnRequestsStatus;
	private static TableColumn stockTableColumnRequestsCompletionDate;
	private static Button stockButtonDenyRequest;
	private static Button stockButtonApproveRequest;
	
	// Management tab
	/////////////////
	private static TabItem managementTabItem;
	private static Composite manageMainComposite;
	
	// Employees table
	private static Label manageLabelEmployees;
	private static Table manageTableEmployees;
	private static TableColumn manageTableColumnEmployeeID;
	private static TableColumn manageTableColumnEmployeePName;
	private static TableColumn manageTableColumnEmployeeLName;
	private static TableColumn manageTableColumnEmployeePosition;
	
	// Edit employee details group
	private static Group manageGroupEditEmployee;
	private static Label manageLabelEmployeeEmploymentDateInput;
	private static Label manageLabelEmployeeEmploymentDate;
	private static Label manageLabelEmployeeStoreID;
	private static Label manageLabelEmployeeEmployeeStoreIDInput;
	private static Label manageLabelEmployeeID;
	private static Text manageTextBoxEmployeeIDInput;
	private static Label manageLabelEmployeeBirth;
	private static Text manageTextBoxEmployeeBirthInput;
	private static Label manageLabelEmployeeFName;
	private static Text manageTextBoxEmployeeFNameInput;	
	private static Label manageLabelEmployeeLName;
	private static Text manageTextBoxEmployeeLNameInput;
	private static Label manageLabelEmployeeAddress;
	private static Text manageTextBoxEmployeeAddressInput;
	private static Label manageLabelEmployeePhone;
	private static Text manageTextBoxEmployeePhoneInput;
	private static Label manageLabelEmployeeCellPhone;
	private static Text manageTextBoxEmployeeCellPhoneInput;
	private static Label manageLabelEmployeePosition;
	private static Combo manageComboEmployeePositionInput;
	private static Button manageButtonEmployeeNew;
	private static Button manageButtonEmployeeInsert;
	private static Button manageButtonEmployeeNoSave;
	private static Button manageButtonEmployeeEdit;
	private static Button manageButtonEmployeeSave;
	private static Button manageButtonEmployeeRemove;
	
	// Update database group
	private static Group manageGroupDBSManage;
	private static Label manageLabelDBSUpdate;
	private static Text manageTextBoxDBSUpdateFileInput;
	private static Button manageButtonDBSBrowse;
	private static Button manageButtonDBSUpdate;
	private static ProgressBar manageProgressBarDBSUpdate;

	/**
	* Auto-generated main method to display this 
	* org.eclipse.swt.widgets.Composite inside a new Shell.
	*/
	public static void main(String[] args) {
		// generate Quick Tips
		MainFuncs.generateTips();
		// Start GUI
		showGUI();
	}
	
	/**
	* Overriding checkSubclass allows this class to extend org.eclipse.swt.widgets.Composite
	*/	
	protected void checkSubclass() {
	}
	
	/**
	* Auto-generated method to display this 
	* org.eclipse.swt.widgets.Composite inside a new Shell.
	*/
	public static void showGUI() {
		Display display = Display.getDefault();
		Shell shell = new Shell(display, SWT.TITLE | SWT.CLOSE | SWT.MIN);
		shell.setText("SSDA Music Store Manager");
		Main inst = new Main(shell, SWT.NULL);
		Point size = inst.getSize();
		shell.setLayout(new FillLayout());
		shell.layout();
		if(size.x == 0 && size.y == 0) {
			inst.pack();
			shell.pack();
		} else {
			Rectangle shellBounds = shell.computeTrim(0, 0, size.x, size.y);
			shell.setSize(shellBounds.width, shellBounds.height);
		}
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
	}

	public Main(org.eclipse.swt.widgets.Composite parent, int style) {
		super(parent, style);
		initGUI();
	}

	/**
	 * Main Program window
	 * holds tabs for functionality:
	 * - Search
	 * - Sales
	 * - Stock
	 * - Management
	 */
	private void initGUI() {
		try {
			this.setLayout(null);
			this.layout();
			pack();
			this.setSize(800, 590);
			{
				/**
				 * Main menu
				 */
				mainMenuBar = new Menu(getShell(), SWT.BAR);
				getShell().setMenuBar(mainMenuBar);
				{
					mainMenuItemFile = new MenuItem(mainMenuBar, SWT.CASCADE);
					mainMenuItemFile.setText("&File");
					{
						fileMenu = new Menu(mainMenuItemFile);
						mainMenuItemFile.setMenu(fileMenu);
						{
							fileMenuItemExit = new MenuItem(fileMenu, SWT.PUSH);
							fileMenuItemExit.setText("E&xit");
						}
					}
					
					mainMenuItemSearch = new MenuItem(mainMenuBar, SWT.CASCADE);
					mainMenuItemSearch.setText("&Search");
					{
						searchMenu = new Menu(mainMenuItemSearch);
						mainMenuItemSearch.setMenu(searchMenu);
						{
							searchMenuItemClear = new MenuItem(searchMenu, SWT.PUSH);
							searchMenuItemClear.setText("&Clear Fields");
						}
						{
							searchMenuItemSearch = new MenuItem(searchMenu, SWT.PUSH);
							searchMenuItemSearch.setText("&Search");
						}
						{
							menuItemSeperator = new MenuItem(searchMenu, SWT.SEPARATOR);
						}
						{
							searchMenuItemPlaceOrder = new MenuItem(searchMenu, SWT.PUSH);
							searchMenuItemPlaceOrder.setText("&Place an Order...");
						}
						{
							menuItemSeperator = new MenuItem(searchMenu, SWT.SEPARATOR);
						}
						{
							searchMenuItemAddToSale = new MenuItem(searchMenu, SWT.PUSH);
							searchMenuItemAddToSale.setText("&Add to Sale...");
						}
					}
					
					mainMenuItemSale = new MenuItem(mainMenuBar, SWT.CASCADE);
					mainMenuItemSale.setText("Sa&le");
					{
						saleMenu = new Menu(mainMenuItemSale);
						mainMenuItemSale.setMenu(saleMenu);
						{
							saleMenuItemRemove = new MenuItem(saleMenu, SWT.PUSH);
							saleMenuItemRemove.setText("&Remove Item");
						}
						{
							saleMenuItemClear = new MenuItem(saleMenu, SWT.PUSH);
							saleMenuItemClear.setText("&Clear Sale");
						}
						{
							saleMenuItemMakeSale = new MenuItem(saleMenu, SWT.PUSH);
							saleMenuItemMakeSale.setText("&Make Sale");
						}						
					}
					
					mainMenuItemStock = new MenuItem(mainMenuBar, SWT.CASCADE);
					mainMenuItemStock.setText("S&tock");
					{
						stockMenu = new Menu(mainMenuItemStock);
						mainMenuItemStock.setMenu(stockMenu);
						{
							stockMenuItemCheckAvailability = new MenuItem(stockMenu, SWT.PUSH);
							stockMenuItemCheckAvailability.setText("&Check Availability");
						}
						{
							stockMenuItemClear = new MenuItem(stockMenu, SWT.PUSH);
							stockMenuItemClear.setText("Clear &Fields");
						}
						{
							stockMenuItemPlaceOrder = new MenuItem(stockMenu, SWT.PUSH);
							stockMenuItemPlaceOrder.setText("&Place Order");
						}
						{
							menuItemSeperator = new MenuItem(stockMenu, SWT.SEPARATOR);
						}
						{
							stockMenuItemRemoveOrder = new MenuItem(stockMenu, SWT.PUSH);
							stockMenuItemRemoveOrder.setText("&Remove Order");
						}
						{
							stockMenuItemCancelOrder = new MenuItem(stockMenu, SWT.PUSH);
							stockMenuItemCancelOrder.setText("Cancel &Order");
						}
						{
							menuItemSeperator = new MenuItem(stockMenu, SWT.SEPARATOR);
						}
						{
							stockMenuItemDenyRequest = new MenuItem(stockMenu, SWT.PUSH);
							stockMenuItemDenyRequest.setText("&Deny Request");
						}
						{
							stockMenuItemApproveRequest = new MenuItem(stockMenu, SWT.PUSH);
							stockMenuItemApproveRequest.setText("&Approve Request");
						}
					}
					
					mainMenuItemManage = new MenuItem(mainMenuBar, SWT.CASCADE);
					mainMenuItemManage.setText("&Management");
					{
						manageMenu = new Menu(mainMenuItemManage);
						mainMenuItemManage.setMenu(manageMenu);
						{
							manageMenuItemBrowse = new MenuItem(manageMenu, SWT.PUSH);
							manageMenuItemBrowse.setText("&Browse...");
						}
						{
							manageMenuItemUpdateDBS = new MenuItem(manageMenu, SWT.PUSH);
							manageMenuItemUpdateDBS.setText("&Update Database");
						}
						{
							menuItemSeperator = new MenuItem(manageMenu, SWT.SEPARATOR);
						}
						{
							manageMenuItemNew = new MenuItem(manageMenu, SWT.PUSH);
							manageMenuItemNew.setText("&New");
						}
						{
							manageMenuItemInsert = new MenuItem(manageMenu, SWT.PUSH);
							manageMenuItemInsert.setText("&Insert");
						}
						{
							manageMenuItemEdit = new MenuItem(manageMenu, SWT.PUSH);
							manageMenuItemEdit.setText("&Edit");
						}
						{
							manageMenuItemSave = new MenuItem(manageMenu, SWT.PUSH);
							manageMenuItemSave.setText("&Save");
						}
						{
							manageMenuItemExitNoSave = new MenuItem(manageMenu, SWT.PUSH);
							manageMenuItemExitNoSave.setText("Exit &Without Saving");
						}
						{
							manageMenuItemRemoveEmployee = new MenuItem(manageMenu, SWT.PUSH);
							manageMenuItemRemoveEmployee.setText("&Remove Employee");
						}
					}
				}
			}
			
			{
				/**
				 * Main window details: store details and quick tips
				 */
				mainGroupStoreDetails = new Group(this, SWT.NONE);
				mainGroupStoreDetails.setLayout(null);
				mainGroupStoreDetails.setText("Store Details");
				mainGroupStoreDetails.setBounds(7, 0, 324, 86);
				{
					mainLabelStoreDetailsStoreID = new Label(mainGroupStoreDetails, SWT.NONE);
					mainLabelStoreDetailsStoreID.setText("Store: "+MainFuncs.getStoreID());
					mainLabelStoreDetailsStoreID.setBounds(5, 19, 101, 20);
				}
				{
					mainLabelStoreDetailsStoreAddress = new Label(mainGroupStoreDetails, SWT.NONE);
					mainLabelStoreDetailsStoreAddress.setText("Address: "+MainFuncs.getStoreAddress()+", "+MainFuncs.getStoreCity());
					mainLabelStoreDetailsStoreAddress.setBounds(5, 41, 245, 20);
				}
				{
					mainLabelStoreDetailsStorePhone = new Label(mainGroupStoreDetails, SWT.NONE);
					mainLabelStoreDetailsStorePhone.setText("Phone: "+MainFuncs.getStorePhone());
					mainLabelStoreDetailsStorePhone.setBounds(5, 63, 133, 20);
				}
				{
					mainLabelStoreDetailsStoreManager = new Label(mainGroupStoreDetails, SWT.NONE);
					mainLabelStoreDetailsStoreManager.setText("Manager: "+MainFuncs.getStoreManager());
					mainLabelStoreDetailsStoreManager.setBounds(150, 62, 162, 22);
				}
				{
					mainLabelStoreDetailsDateTime = new Label(mainGroupStoreDetails, SWT.NONE);
					mainLabelStoreDetailsDateTime.setBounds(150, 19, 167, 20);
					mainLabelStoreDetailsDateTime.setText(MainFuncs.getDay() + ", " + MainFuncs.getDate()+ ", "+ MainFuncs.getTime());
				}
			}
			{
				mainGroupQuickTips = new Group(this, SWT.NONE);
				mainGroupQuickTips.setLayout(null);
				mainGroupQuickTips.setBounds(337, 0, 460, 86);
				mainGroupQuickTips.setText("Quick Tips");
				{
					mainLabelQuickTipsTip = new Label(mainGroupQuickTips, SWT.NONE);
					mainLabelQuickTipsTip.setBounds(8, 19, 445, 61);
					mainLabelQuickTipsTip.setText(MainFuncs.getTip());
				}
			}
			{
				mainTabFolder = new TabFolder(this, SWT.NONE);
				mainTabFolder.setSelection(0);
				mainTabFolder.setBounds(7, 92, 793, 491);

				{
					/**
					 * Search Tab
					 * ==========
					 * Contains search fields, results and stock and sale actions
					 */
					searchTabItem = new TabItem(mainTabFolder, SWT.NONE);
					searchTabItem.setText("Search");
					searchTabItem.setToolTipText("Search for Albums");
					{
						searchTabComposite = new Composite(mainTabFolder, SWT.NONE);
						searchTabComposite.setLayout(null);
						searchTabItem.setControl(searchTabComposite);
						{
							searchGroupOptions = new Group(searchTabComposite, SWT.NONE);
							searchGroupOptions.setLayout(null);
							searchGroupOptions.setText("Search by");
							searchGroupOptions.setBounds(5, 0, 355, 313);
							{
								searchBulletByAlbum = new Button(searchGroupOptions, SWT.RADIO | SWT.LEFT);
								searchBulletByAlbum.setText("Search by album ID:");
								searchBulletByAlbum.setBounds(12, 16, 118, 22);
								searchBulletByAlbum.setSelection(true);
							}
							{
								searchBulletOtherParameters = new Button(searchGroupOptions, SWT.RADIO | SWT.LEFT);
								searchBulletOtherParameters.setText("Search by other parameters:");
								searchBulletOtherParameters.setBounds(12, 42, 173, 22);
							}
							{
								searchTextBoxAlbumID = new Text(searchGroupOptions, SWT.BORDER);
								searchTextBoxAlbumID.setBounds(138, 16, 205, 22);
								searchTextBoxAlbumID.setToolTipText("Enter album ID");
							}
							{
								searchCheckBoxAlbumName = new Button(searchGroupOptions, SWT.CHECK | SWT.LEFT);
								searchCheckBoxAlbumName.setText("Album name:");
								searchCheckBoxAlbumName.setBounds(12, 69, 82, 22);
							}
							{
								searchCheckBoxArtist = new Button(searchGroupOptions, SWT.CHECK | SWT.LEFT);
								searchCheckBoxArtist.setText("Artist:");
								searchCheckBoxArtist.setBounds(12, 93, 82, 21);
							}
							{
								searchCheckBoxYear = new Button(searchGroupOptions, SWT.CHECK | SWT.LEFT);
								searchCheckBoxYear.setText("Year from:");
								searchCheckBoxYear.setBounds(12, 117, 82, 23);
							}
							{
								searchCheckBoxSongNames = new Button(searchGroupOptions, SWT.CHECK | SWT.LEFT);
								searchCheckBoxSongNames.setText("Song name(s):");
								searchCheckBoxSongNames.setBounds(12, 141, 88, 22);
							}
							{
								searchCheckBoxGenres = new Button(searchGroupOptions, SWT.CHECK | SWT.LEFT);
								searchCheckBoxGenres.setText("Genre(s):");
								searchCheckBoxGenres.setBounds(12, 165, 82, 22);
							}
							{
								searchTextBoxAlbumName = new Text(searchGroupOptions, SWT.BORDER);
								searchTextBoxAlbumName.setBounds(106, 69, 237, 22);
							}
							{
								searchTextBoxArtist = new Text(searchGroupOptions, SWT.BORDER);
								searchTextBoxArtist.setBounds(106, 93, 237, 22);
							}
							{
								searchTextBoxYearFrom = new Text(searchGroupOptions, SWT.BORDER);
								searchTextBoxYearFrom.setBounds(106, 117, 54, 22);
							}
							{
								searchLabelYearTo = new Label(searchGroupOptions, SWT.NONE);
								searchLabelYearTo.setText("To:");
								searchLabelYearTo.setBounds(168, 120, 20, 16);
							}
							{
								searchTextBoxYearTo = new Text(searchGroupOptions, SWT.BORDER);
								searchTextBoxYearTo.setBounds(188, 117, 60, 22);
							}
							{
								searchTextBoxSongNames = new Text(searchGroupOptions, SWT.BORDER);
								searchTextBoxSongNames.setBounds(106, 141, 237, 22);
							}
							{
								searchCheckBoxGenresArr[0] = new Button(searchGroupOptions, SWT.CHECK | SWT.LEFT);
								searchCheckBoxGenresArr[0].setText("Rock");
								searchCheckBoxGenresArr[0].setBounds(12, 186, 60, 16);
							}
							{
								searchCheckBoxGenresArr[1] = new Button(searchGroupOptions, SWT.CHECK | SWT.LEFT);
								searchCheckBoxGenresArr[1].setText("Jazz");
								searchCheckBoxGenresArr[1].setBounds(12, 206, 60, 16);
							}
							{
								searchCheckBoxGenresArr[2] = new Button(searchGroupOptions, SWT.CHECK | SWT.LEFT);
								searchCheckBoxGenresArr[2].setText("Genre03");
								searchCheckBoxGenresArr[2].setBounds(76, 186, 60, 16);
							}
							{
								searchCheckBoxGenresArr[3] = new Button(searchGroupOptions, SWT.CHECK | SWT.LEFT);
								searchCheckBoxGenresArr[3].setText("Genre04");
								searchCheckBoxGenresArr[3].setBounds(76, 206, 60, 16);
							}
							{
								searchCheckBoxGenresArr[4] = new Button(searchGroupOptions, SWT.CHECK | SWT.LEFT);
								searchCheckBoxGenresArr[4].setText("Genre05");
								searchCheckBoxGenresArr[4].setBounds(141, 186, 60, 16);
							}
							{
								searchCheckBoxGenresArr[5] = new Button(searchGroupOptions, SWT.CHECK | SWT.LEFT);
								searchCheckBoxGenresArr[5].setText("Genre06");
								searchCheckBoxGenresArr[5].setBounds(141, 206, 60, 16);
							}
							{
								searchCheckBoxGenresArr[6] = new Button(searchGroupOptions, SWT.CHECK | SWT.LEFT);
								searchCheckBoxGenresArr[6].setText("Genre07");
								searchCheckBoxGenresArr[6].setBounds(205, 186, 60, 16);
							}
							{
								searchCheckBoxGenresArr[7] = new Button(searchGroupOptions, SWT.CHECK | SWT.LEFT);
								searchCheckBoxGenresArr[7].setText("Genre08");
								searchCheckBoxGenresArr[7].setBounds(205, 206, 60, 16);
							}
							{
								searchCheckBoxGenresArr[8] = new Button(searchGroupOptions, SWT.CHECK | SWT.LEFT);
								searchCheckBoxGenresArr[8].setText("Genre09");
								searchCheckBoxGenresArr[8].setBounds(270, 186, 60, 16);
							}
							{
								searchCheckBoxGenresArr[9] = new Button(searchGroupOptions, SWT.CHECK | SWT.LEFT);
								searchCheckBoxGenresArr[9].setText("Genre10");
								searchCheckBoxGenresArr[9].setBounds(270, 206, 60, 16);
							}
							{
								searchCheckBoxGenreOther = new Button(searchGroupOptions, SWT.CHECK | SWT.LEFT);
								searchCheckBoxGenreOther.setText("Other:");
								searchCheckBoxGenreOther.setBounds(12, 223, 54, 22);
							}
							{
								searchTextBoxGenreOther = new Text(searchGroupOptions, SWT.BORDER);
								searchTextBoxGenreOther.setBounds(76, 224, 273, 22);
							}
							{
								searchButtonClear = new Button(searchGroupOptions, SWT.PUSH | SWT.CENTER);
								searchButtonClear.setText("Clear Fields");
								searchButtonClear.setBounds(12, 273, 156, 33);
							}
							{
								searchButtonSearch = new Button(searchGroupOptions, SWT.PUSH | SWT.CENTER);
								searchButtonSearch.setText("Search");
								searchButtonSearch.setBounds(174, 273, 169, 33);
							}
							{
								searchCompositeStockField = new Composite(searchGroupOptions, SWT.NONE);
								searchCompositeStockField.setLayout(null);
								searchCompositeStockField.setBounds(12, 247, 331, 20);
								{
									searchLabelStock = new Label(searchCompositeStockField, SWT.NONE);
									searchLabelStock.setText("Stock:");
									searchLabelStock.setBounds(0, 3, 36, 16);
								}
								{
									searchBulletInStockInStore = new Button(searchCompositeStockField, SWT.RADIO | SWT.LEFT);
									searchBulletInStockInStore.setText("In store");
									searchBulletInStockInStore.setBounds(191, 0, 60, 22);
								}
								{
									searchBulletInStockInNetwork = new Button(searchCompositeStockField, SWT.RADIO | SWT.LEFT);
									searchBulletInStockInNetwork.setText("In network");
									searchBulletInStockInNetwork.setBounds(115, 0, 76, 22);
								}
								{
									searchBulletInStockAll = new Button(searchCompositeStockField, SWT.RADIO | SWT.LEFT);
									searchBulletInStockAll.setText("All");
									searchBulletInStockAll.setBounds(64, 0, 33, 22);
									searchBulletInStockAll.setSelection(true);
								}
							}
						}
						{
							searchGroupResults = new Group(searchTabComposite, SWT.NONE);
							searchGroupResults.setLayout(null);
							searchGroupResults.setText("Search Results");
							searchGroupResults.setBounds(366, 0, 419, 465);
							{
								searchTableAlbumResults = new Table(searchGroupResults, SWT.BORDER | SWT.MULTI
										| SWT.H_SCROLL | SWT.V_SCROLL | SWT.SINGLE);
								searchTableAlbumResults.setBounds(12, 20, 395, 225);
								searchTableAlbumResults.setHeaderVisible(true);
								searchTableAlbumResults.setLinesVisible(true);
								int numOfColumns = 6;
								int tableWidth = searchTableAlbumResults.getClientArea().width - getBorderWidth()*2;
								
								searchTableColumnAlbumID = new TableColumn(searchTableAlbumResults, SWT.NONE);
								searchTableColumnAlbumID.setText("Album ID");
								searchTableColumnAlbumID.setResizable(true);
								searchTableColumnAlbumID.setMoveable(true);
								searchTableColumnAlbumID.setWidth(tableWidth / numOfColumns);
								
								searchTableColumnAlbumName = new TableColumn(searchTableAlbumResults, SWT.NONE);
								searchTableColumnAlbumName.setText("Album Name");
								searchTableColumnAlbumName.setResizable(true);
								searchTableColumnAlbumName.setMoveable(true);
								searchTableColumnAlbumName.setWidth(tableWidth / numOfColumns);
								
								searchTableColumnAlbumArtist = new TableColumn(searchTableAlbumResults, SWT.NONE);
								searchTableColumnAlbumArtist.setText("Artist");
								searchTableColumnAlbumArtist.setResizable(true);
								searchTableColumnAlbumArtist.setMoveable(true);
								searchTableColumnAlbumArtist.setWidth(tableWidth / numOfColumns);
								
								searchTableColumnAlbumYear = new TableColumn(searchTableAlbumResults, SWT.NONE);
								searchTableColumnAlbumYear.setText("Year");
								searchTableColumnAlbumYear.setResizable(true);
								searchTableColumnAlbumYear.setMoveable(true);
								searchTableColumnAlbumYear.setWidth(tableWidth / numOfColumns);
								
								searchTableColumnAlbumGenre = new TableColumn(searchTableAlbumResults, SWT.NONE);
								searchTableColumnAlbumGenre.setText("Genre");
								searchTableColumnAlbumGenre.setResizable(true);
								searchTableColumnAlbumGenre.setMoveable(true);
								searchTableColumnAlbumGenre.setWidth(tableWidth / numOfColumns);
								
								searchTableColumnAlbumLength = new TableColumn(searchTableAlbumResults, SWT.NONE);
								searchTableColumnAlbumLength.setText("Length");
								searchTableColumnAlbumLength.setResizable(true);
								searchTableColumnAlbumLength.setMoveable(true);
								searchTableColumnAlbumLength.setWidth(tableWidth / numOfColumns);
							}
							{
								searchProgressBar = new ProgressBar(searchGroupResults, SWT.NONE);
								searchProgressBar.setBounds(15, 251, 392, 22);
							}
							{
								searchTableSongResults = new Table(searchGroupResults, SWT.BORDER | SWT.MULTI
										| SWT.H_SCROLL | SWT.V_SCROLL | SWT.SINGLE);
								searchTableSongResults.setBounds(12, 286, 395, 170);
								searchTableSongResults.setHeaderVisible(true);
								searchTableSongResults.setLinesVisible(true);
								
								int tableWidth = searchTableSongResults.getClientArea().width - getBorderWidth()*2;
								int numOfColumns = 3;
								
								searchTableColumnSongName = new TableColumn(searchTableSongResults, SWT.NONE);
								searchTableColumnSongName.setText("Song name");
								searchTableColumnSongName.setResizable(true);
								searchTableColumnSongName.setMoveable(true);
								searchTableColumnSongName.setWidth(tableWidth / numOfColumns);
								
								searchTableColumnSongArtist = new TableColumn(searchTableSongResults, SWT.NONE);
								searchTableColumnSongArtist.setText("Artist");
								searchTableColumnSongArtist.setResizable(true);
								searchTableColumnSongArtist.setMoveable(true);
								searchTableColumnSongArtist.setWidth(tableWidth / numOfColumns);
								
								searchTableColumnSongLength = new TableColumn(searchTableSongResults, SWT.NONE);
								searchTableColumnSongLength.setText("Length");
								searchTableColumnSongLength.setResizable(true);
								searchTableColumnSongLength.setMoveable(true);
								searchTableColumnSongLength.setWidth(tableWidth / numOfColumns);
							}
							
						}
						{
							searchGroupStockInfo = new Group(searchTabComposite, SWT.NONE);
							searchGroupStockInfo.setLayout(null);
							searchGroupStockInfo.setText("Stock Information");
							searchGroupStockInfo.setBounds(5, 319, 171, 146);
							{
								searchLabelStockInfoStoreStock = new Label(searchGroupStockInfo, SWT.NONE);
								searchLabelStockInfoStoreStock.setText("Store stock:");
								searchLabelStockInfoStoreStock.setBounds(12, 22, 152, 19);
							}
							{
								searchLabelStockInfoLocation = new Label(searchGroupStockInfo, SWT.NONE);
								searchLabelStockInfoLocation.setText("Storage location: ");
								searchLabelStockInfoLocation.setBounds(12, 44, 152, 19);
							}
							{
								searchLabelStockInfoPrice = new Label(searchGroupStockInfo, SWT.NONE);
								searchLabelStockInfoPrice.setText("Price:");
								searchLabelStockInfoPrice.setBounds(12, 66, 152, 19);
							}
							{
								searchButtonStockInfoOrder = new Button(searchGroupStockInfo, SWT.PUSH | SWT.CENTER);
								searchButtonStockInfoOrder.setText("Place an Order...");
								searchButtonStockInfoOrder.setBounds(12, 91, 147, 45);
							}
						}
						{
							searchGroupSaleInfo = new Group(searchTabComposite, SWT.NONE);
							searchGroupSaleInfo.setLayout(null);
							searchGroupSaleInfo.setText("Sale");
							searchGroupSaleInfo.setBounds(182, 319, 177, 146);
							{
								searchLabelSaleInfoQuantity = new Label(searchGroupSaleInfo, SWT.NONE);
								searchLabelSaleInfoQuantity.setText("Add to sale with quantity:");
								searchLabelSaleInfoQuantity.setBounds(8, 22, 127, 22);
							}
							{
								searchTextBoxSaleInfoQuantity = new Text(searchGroupSaleInfo, SWT.BORDER);
								searchTextBoxSaleInfoQuantity.setText("1");
								searchTextBoxSaleInfoQuantity.setBounds(137, 19, 28, 22);
							}
							{
								searchButtonSaleInfoSale = new Button(searchGroupSaleInfo, SWT.PUSH | SWT.CENTER);
								searchButtonSaleInfoSale.setText("Add to Sale...");
								searchButtonSaleInfoSale.setBounds(8, 91, 157, 45);
							}
						}
					}
					
					// initialize search tab view
					SearchFuncs.initSearchTabView();
					// initialize search listeners
					SearchFuncs.initSearchListeners();
				}
				{
					/**
					 * Sale tab
					 * ========
					 * Manage current sale
					 * 
					 */
					saleTabItem = new TabItem(mainTabFolder, SWT.NONE);
					saleTabItem.setText("Sale");
					saleTabItem.setToolTipText("Manage current sale");
					{
						saleCompositeMain = new Composite(mainTabFolder, SWT.NONE);
						saleCompositeMain.setLayout(null);
						saleTabItem.setControl(saleCompositeMain);
						{
							saleGroupSaleDetails = new Group(saleCompositeMain, SWT.NONE);
							saleGroupSaleDetails.setLayout(null);
							saleGroupSaleDetails.setText("Manage Current Sale");
							saleGroupSaleDetails.setBounds(0, 0, 423, 90);
							{
								saleLabelSaleID = new Label(saleGroupSaleDetails, SWT.NONE);
								saleLabelSaleID.setText("Sale ID:");
								saleLabelSaleID.setBounds(7, 24, 47, 21);
								saleLabelSaleID.setSize(47, 18);
							}
							{
								saleLabelSaleIDInput = new Label(saleGroupSaleDetails, SWT.BORDER);
								saleLabelSaleIDInput.setText("STR0000-000000-0000");
								saleLabelSaleIDInput.setBounds(66, 24, 126, 18);
							}
							{
								saleLabelSalesmanIDName = new Label(saleGroupSaleDetails, SWT.NONE);
								saleLabelSalesmanIDName.setText("Salesman:");
								saleLabelSalesmanIDName.setBounds(7, 54, 47, 18);
							}
							{
								saleComboSalesmanIDNameInput = new Combo(saleGroupSaleDetails, SWT.NONE);
								saleComboSalesmanIDNameInput.setBounds(66, 53, 191, 21);
							}
							{
								saleLabelSaleDate = new Label(saleGroupSaleDetails, SWT.NONE);
								saleLabelSaleDate.setText("Date of sale:");
								saleLabelSaleDate.setBounds(269, 24, 73, 18);
							}
							{
								saleLabelSaleTime = new Label(saleGroupSaleDetails, SWT.NONE);
								saleLabelSaleTime.setText("Time of sale:");
								saleLabelSaleTime.setBounds(269, 54, 73, 18);
							}
							{
								saleLabelDateInput = new Label(saleGroupSaleDetails, SWT.BORDER);
								saleLabelDateInput.setBounds(343, 24, 69, 18);
								saleLabelDateInput.setText(MainFuncs.getDate());
							}
							{
								saleLabelTimeInput = new Label(saleGroupSaleDetails, SWT.BORDER);
								saleLabelTimeInput.setBounds(343, 54, 69, 18);
								saleLabelTimeInput.setText(MainFuncs.getTime());
							}
						}
						{
							saleTableSaleItems = new Table(saleCompositeMain, SWT.BORDER | SWT.MULTI
									| SWT.H_SCROLL | SWT.V_SCROLL | SWT.SINGLE);
							saleTableSaleItems.setBounds(16, 108, 759, 267);
							saleTableSaleItems.setHeaderVisible(true);
							saleTableSaleItems.setLinesVisible(true);
							int tableWidth = saleTableSaleItems.getClientArea().width - getBorderWidth()*2;
							int numOfColumns = 5;
							
							// adding columns
							saleTableColumnAlbumID = new TableColumn(saleTableSaleItems, SWT.NONE);
							saleTableColumnAlbumID.setText("Album ID");
							saleTableColumnAlbumID.setResizable(true);
							saleTableColumnAlbumID.setMoveable(true);
							saleTableColumnAlbumID.setWidth(tableWidth / numOfColumns);
							
							saleTableColumnAlbumName = new TableColumn(saleTableSaleItems, SWT.NONE);
							saleTableColumnAlbumName.setText("Album name");
							saleTableColumnAlbumName.setResizable(true);
							saleTableColumnAlbumName.setMoveable(true);
							saleTableColumnAlbumName.setWidth(111);
							saleTableColumnAlbumName.setWidth(tableWidth / numOfColumns);
							
							saleTableColumnQuantity = new TableColumn(saleTableSaleItems, SWT.NONE);
							saleTableColumnQuantity.setText("Quantity");
							saleTableColumnQuantity.setResizable(true);
							saleTableColumnQuantity.setMoveable(true);
							saleTableColumnQuantity.setWidth(tableWidth / numOfColumns);
							
							saleTableColumnPricePerItem = new TableColumn(saleTableSaleItems, SWT.NONE);
							saleTableColumnPricePerItem.setText("Price per item");
							saleTableColumnPricePerItem.setResizable(true);
							saleTableColumnPricePerItem.setMoveable(true);
							saleTableColumnPricePerItem.setWidth(tableWidth / numOfColumns);
							
							saleTableColumnPriceTotal = new TableColumn(saleTableSaleItems, SWT.NONE);
							saleTableColumnPriceTotal.setText("Total price");
							saleTableColumnPriceTotal.setResizable(true);
							saleTableColumnPriceTotal.setMoveable(true);
							saleTableColumnPriceTotal.setWidth(tableWidth / numOfColumns);
						}
						{
							saleLabelTotalPriceValue = new Label(saleCompositeMain, SWT.BORDER);
							saleLabelTotalPriceValue.setBounds(679, 383, 94, 22);
						}
						{
							saleLabelTotalPrice = new Label(saleCompositeMain, SWT.NONE);
							saleLabelTotalPrice.setText("Total price:");
							saleLabelTotalPrice.setBounds(598, 384, 76, 22);
							saleLabelTotalPrice.setAlignment(SWT.RIGHT);
						}
						{
							saleButtonRemoveItem = new Button(saleCompositeMain, SWT.PUSH | SWT.CENTER);
							saleButtonRemoveItem.setText("Remove Item");
							saleButtonRemoveItem.setBounds(18, 384, 110, 30);
						}
						{
							saleButtonClearSale = new Button(saleCompositeMain, SWT.PUSH | SWT.CENTER);
							saleButtonClearSale.setText("Clear Sale");
							saleButtonClearSale.setBounds(134, 384, 110, 30);
						}
						{
							saleButtonMakeSale = new Button(saleCompositeMain, SWT.PUSH | SWT.CENTER);
							saleButtonMakeSale.setText("Make Sale");
							saleButtonMakeSale.setBounds(680, 412, 93, 41);
						}
					}
				}
				{
					/**
					 * Stock tab
					 * =========
					 * Manage Stock, orders and requests
					 * 
					 */
					stockTabItem = new TabItem(mainTabFolder, SWT.NONE);
					stockTabItem.setText("Stock");
					stockTabItem.setToolTipText("View and manage orders and requests");
					{
						stockTabComposite = new Composite(mainTabFolder, SWT.NONE);
						stockTabComposite.setLayout(null);
						stockTabItem.setControl(stockTabComposite);
						{
							stockGroupOrderForm = new Group(stockTabComposite, SWT.NONE);
							stockGroupOrderForm.setLayout(null);
							stockGroupOrderForm.setText("Order Albums");
							stockGroupOrderForm.setBounds(2, 0, 779, 147);
							{
								stockLabelOrderID = new Label(stockGroupOrderForm, SWT.NONE);
								stockLabelOrderID.setText("Order ID:");
								stockLabelOrderID.setBounds(8, 19, 74, 22);
							}
							{
								stockLabelOrderIDInput = new Label(stockGroupOrderForm, SWT.BORDER);
								stockLabelOrderIDInput.setBounds(88, 18, 153, 22);
								stockLabelOrderIDInput.setText("ORD-0000-0000-000000-000");
							}
							{
								stockLabelAlbumID = new Label(stockGroupOrderForm, SWT.NONE);
								stockLabelAlbumID.setText("Album ID:");
								stockLabelAlbumID.setBounds(8, 49, 74, 22);
							}
							{
								stockTextBoxAlbumIDInput = new Text(stockGroupOrderForm, SWT.BORDER);
								stockTextBoxAlbumIDInput.setBounds(87, 47, 154, 22);
							}
							{
								stockLabelDate = new Label(stockGroupOrderForm, SWT.NONE);
								stockLabelDate.setText("Order date:");
								stockLabelDate.setBounds(8, 79, 74, 22);
							}
							{
								stockLabelOrderDateInput = new Label(stockGroupOrderForm, SWT.BORDER);
								stockLabelOrderDateInput.setBounds(86, 79, 70, 22);
								stockLabelOrderDateInput.setText(MainFuncs.getDate());
							}
							{
								stockButtonCheckAvailability = new Button(stockGroupOrderForm, SWT.PUSH | SWT.CENTER);
								stockButtonCheckAvailability.setText("Check Availability");
								stockButtonCheckAvailability.setBounds(8, 108, 235, 30);
							}
							{
								stockLabelOrderFromStore = new Label(stockGroupOrderForm, SWT.NONE);
								stockLabelOrderFromStore.setText("Order from:");
								stockLabelOrderFromStore.setBounds(256, 18, 79, 24);
							}
							{
								stockTableOrderAvailableStores = new Table(stockGroupOrderForm, SWT.BORDER | SWT.MULTI
										| SWT.H_SCROLL | SWT.V_SCROLL | SWT.SINGLE);
								stockTableOrderAvailableStores.setBounds(254, 42, 284, 94);
								stockTableOrderAvailableStores.setHeaderVisible(true);
								stockTableOrderAvailableStores.setLinesVisible(true);
								int numOfColumns = 3;
								int tableWidth = stockTableOrderAvailableStores.getClientArea().width - getBorderWidth()*2;
								
								stockTableColumnStoreID = new TableColumn(stockTableOrderAvailableStores, SWT.NONE);
								stockTableColumnStoreID.setText("Store ID");
								stockTableColumnStoreID.setResizable(true);
								stockTableColumnStoreID.setMoveable(true);
								stockTableColumnStoreID.setWidth(tableWidth / numOfColumns);
								
								stockTableColumnStoreCity = new TableColumn(stockTableOrderAvailableStores, SWT.NONE);
								stockTableColumnStoreCity.setText("City");
								stockTableColumnStoreCity.setResizable(true);
								stockTableColumnStoreCity.setMoveable(true);
								stockTableColumnStoreCity.setWidth(tableWidth / numOfColumns);
								
								stockTableColumnQuantity = new TableColumn(stockTableOrderAvailableStores, SWT.NONE);
								stockTableColumnQuantity.setText("Quantity");
								stockTableColumnQuantity.setResizable(true);
								stockTableColumnQuantity.setMoveable(true);
								stockTableColumnQuantity.setWidth(tableWidth / numOfColumns);
								
								stockTableColumnPrice = new TableColumn(stockTableOrderAvailableStores, SWT.NONE);
								stockTableColumnPrice.setText("Price");
								stockTableColumnPrice.setResizable(true);
								stockTableColumnPrice.setMoveable(true);
								stockTableColumnPrice.setWidth(tableWidth / numOfColumns);
							}
							{
								stockLabelQuantityInStock = new Label(stockGroupOrderForm, SWT.NONE);
								stockLabelQuantityInStock.setText("Quantity:");
								stockLabelQuantityInStock.setBounds(656, 19, 52, 22);
							}
							{
								stockLabelQuantityInStockInput = new Label(stockGroupOrderForm, SWT.BORDER);
								stockLabelQuantityInStockInput.setBounds(709, 18, 57, 22);
							}
							{
								stockLabelPrice = new Label(stockGroupOrderForm, SWT.NONE);
								stockLabelPrice.setText("Price:");
								stockLabelPrice.setBounds(552, 20, 52, 22);
							}
							{
								stockLabelStorePriceInput = new Label(stockGroupOrderForm, SWT.BORDER);
								stockLabelStorePriceInput.setBounds(604, 18, 46, 22);
							}
							{
								stockLabelStorageLocation = new Label(stockGroupOrderForm, SWT.NONE);
								stockLabelStorageLocation.setText("Location:");
								stockLabelStorageLocation.setBounds(551, 50, 52, 22);
							}
							{
								stockLabelStorageLocationInput = new Label(stockGroupOrderForm, SWT.BORDER);
								stockLabelStorageLocationInput.setBounds(605, 49, 161, 22);
							}
							{
								stockButtonPlaceOrder = new Button(stockGroupOrderForm, SWT.PUSH | SWT.CENTER);
								stockButtonPlaceOrder.setText("Place Order");
								stockButtonPlaceOrder.setBounds(665, 109, 102, 30);
							}
							{
								stockButtonClearOrder = new Button(stockGroupOrderForm, SWT.PUSH | SWT.CENTER);
								stockButtonClearOrder.setText("Clear Fields");
								stockButtonClearOrder.setBounds(551, 109, 108, 30);
							}
							{
								stockLabelQuantityToOrder = new Label(stockGroupOrderForm, SWT.NONE);
								stockLabelQuantityToOrder.setText("Quantity to order:");
								stockLabelQuantityToOrder.setBounds(551, 83, 108, 22);
							}
							{
								stockTextBoxQuantityToOrder = new Text(stockGroupOrderForm, SWT.BORDER);
								stockTextBoxQuantityToOrder.setText("1");
								stockTextBoxQuantityToOrder.setBounds(665, 82, 100, 22);
							}
						}
						{
							stockTableOrders = new Table(stockTabComposite, SWT.BORDER | SWT.MULTI
									| SWT.H_SCROLL | SWT.V_SCROLL | SWT.SINGLE);
							stockTableOrders.setBounds(5, 174, 770, 110);
							stockTableOrders.setHeaderVisible(true);
							stockTableOrders.setLinesVisible(true);
							int numOfColumns = 7;
							int tableWidth = stockTableOrders.getClientArea().width - getBorderWidth()*2;
							
							stockTableColumnOrdersOrderID = new TableColumn(stockTableOrders, SWT.NONE);
							stockTableColumnOrdersOrderID.setText("Order ID");
							stockTableColumnOrdersOrderID.setResizable(true);
							stockTableColumnOrdersOrderID.setMoveable(true);
							stockTableColumnOrdersOrderID.setWidth(tableWidth / numOfColumns);
							
							stockTableColumnOrdersSupplierID = new TableColumn(stockTableOrders, SWT.NONE);
							stockTableColumnOrdersSupplierID.setText("Supplier ID");
							stockTableColumnOrdersSupplierID.setResizable(true);
							stockTableColumnOrdersSupplierID.setMoveable(true);
							stockTableColumnOrdersSupplierID.setWidth(tableWidth / numOfColumns);
							
							stockTableColumnOrdersAlbumID = new TableColumn(stockTableOrders, SWT.NONE);
							stockTableColumnOrdersAlbumID.setText("Album ID");
							stockTableColumnOrdersAlbumID.setResizable(true);
							stockTableColumnOrdersAlbumID.setMoveable(true);
							stockTableColumnOrdersAlbumID.setWidth(tableWidth / numOfColumns);
							
							stockTableColumnOrdersQuantity = new TableColumn(stockTableOrders, SWT.NONE);
							stockTableColumnOrdersQuantity.setText("Quantity");
							stockTableColumnOrdersQuantity.setResizable(true);
							stockTableColumnOrdersQuantity.setMoveable(true);
							stockTableColumnOrdersQuantity.setWidth(tableWidth / numOfColumns);
							
							stockTableColumnOrdersDate = new TableColumn(stockTableOrders, SWT.NONE);
							stockTableColumnOrdersDate.setText("Date");
							stockTableColumnOrdersDate.setResizable(true);
							stockTableColumnOrdersDate.setMoveable(true);
							stockTableColumnOrdersDate.setWidth(tableWidth / numOfColumns);
							
							stockTableColumnOrdersStatus = new TableColumn(stockTableOrders, SWT.NONE);
							stockTableColumnOrdersStatus.setText("Status");
							stockTableColumnOrdersStatus.setResizable(true);
							stockTableColumnOrdersStatus.setMoveable(true);
							stockTableColumnOrdersStatus.setWidth(tableWidth / numOfColumns);
							
							stockTableColumnOrdersCompletionDate = new TableColumn(stockTableOrders, SWT.NONE);
							stockTableColumnOrdersCompletionDate.setText("Completion Date");
							stockTableColumnOrdersCompletionDate.setResizable(true);
							stockTableColumnOrdersCompletionDate.setMoveable(true);
							stockTableColumnOrdersCompletionDate.setWidth(tableWidth / numOfColumns);
						}
						{
							stockTableRequests = new Table(stockTabComposite, SWT.BORDER | SWT.MULTI // TODO
									| SWT.H_SCROLL | SWT.V_SCROLL | SWT.SINGLE);
							stockTableRequests.setBounds(4, 317, 770, 104);
							stockTableRequests.setHeaderVisible(true);
							stockTableRequests.setLinesVisible(true);
							int numOfColumns = 7;
							int tableWidth = stockTableRequests.getClientArea().width - getBorderWidth()*2;
							
							stockTableColumnRequestsOrderID = new TableColumn(stockTableRequests, SWT.NONE);
							stockTableColumnRequestsOrderID.setText("Order ID");
							stockTableColumnRequestsOrderID.setResizable(true);
							stockTableColumnRequestsOrderID.setMoveable(true);
							stockTableColumnRequestsOrderID.setWidth(tableWidth / numOfColumns);
							
							stockTableColumnRequestsOrderingStoreID = new TableColumn(stockTableRequests, SWT.NONE);
							stockTableColumnRequestsOrderingStoreID.setText("Requesting Store ID");
							stockTableColumnRequestsOrderingStoreID.setResizable(true);
							stockTableColumnRequestsOrderingStoreID.setMoveable(true);
							stockTableColumnRequestsOrderingStoreID.setWidth(tableWidth / numOfColumns);
							
							stockTableColumnRequestsAlbumID = new TableColumn(stockTableRequests, SWT.NONE);
							stockTableColumnRequestsAlbumID.setText("Album ID");
							stockTableColumnRequestsAlbumID.setResizable(true);
							stockTableColumnRequestsAlbumID.setMoveable(true);
							stockTableColumnRequestsAlbumID.setWidth(tableWidth / numOfColumns);
							
							stockTableColumnRequestsQuantity = new TableColumn(stockTableRequests, SWT.NONE);
							stockTableColumnRequestsQuantity.setText("Quantity");
							stockTableColumnRequestsQuantity.setResizable(true);
							stockTableColumnRequestsQuantity.setMoveable(true);
							stockTableColumnRequestsQuantity.setWidth(tableWidth / numOfColumns);
							
							stockTableColumnRequestsDate = new TableColumn(stockTableRequests, SWT.NONE);
							stockTableColumnRequestsDate.setText("Date");
							stockTableColumnRequestsDate.setResizable(true);
							stockTableColumnRequestsDate.setMoveable(true);
							stockTableColumnRequestsDate.setWidth(tableWidth / numOfColumns);
							
							stockTableColumnRequestsStatus = new TableColumn(stockTableRequests, SWT.NONE);
							stockTableColumnRequestsStatus.setText("Status");
							stockTableColumnRequestsStatus.setResizable(true);
							stockTableColumnRequestsStatus.setMoveable(true);
							stockTableColumnRequestsStatus.setWidth(tableWidth / numOfColumns);
							
							stockTableColumnRequestsCompletionDate = new TableColumn(stockTableRequests, SWT.NONE);
							stockTableColumnRequestsCompletionDate.setText("Completion Date");
							stockTableColumnRequestsCompletionDate.setResizable(true);
							stockTableColumnRequestsCompletionDate.setMoveable(true);
							stockTableColumnRequestsCompletionDate.setWidth(tableWidth / numOfColumns);
						}
						{
							stockLabelRequests = new Label(stockTabComposite, SWT.NONE);
							stockLabelRequests.setText("Requests:");
							stockLabelRequests.setBounds(6, 295, 64, 20);
						}
						{
							stockButtonApproveRequest = new Button(stockTabComposite, SWT.PUSH | SWT.CENTER);
							stockButtonApproveRequest.setText("Approve Request");
							stockButtonApproveRequest.setBounds(674, 429, 101, 24);
						}
						{
							stockButtonDenyRequest = new Button(stockTabComposite, SWT.PUSH | SWT.CENTER);
							stockButtonDenyRequest.setText("Deny Request");
							stockButtonDenyRequest.setBounds(567, 429, 101, 24);
						}
						{
							stockLabelOrders = new Label(stockTabComposite, SWT.NONE);
							stockLabelOrders.setText("Orders:");
							stockLabelOrders.setBounds(7, 153, 60, 20);
						}
						{
							stockButtonCancelOrder = new Button(stockTabComposite, SWT.PUSH | SWT.CENTER);
							stockButtonCancelOrder.setText("Cancel Order");
							stockButtonCancelOrder.setBounds(672, 286, 101, 24);
						}
						{
							stockButtonRemoveOrder = new Button(stockTabComposite, SWT.PUSH | SWT.CENTER);
							stockButtonRemoveOrder.setText("Remove Order");
							stockButtonRemoveOrder.setBounds(565, 286, 101, 24);
						}
					}
				}
				{
					/**
					 * Management tab
					 * ==============
					 * Manage Employees and database
					 * 
					 */
					managementTabItem = new TabItem(mainTabFolder, SWT.NONE);
					managementTabItem.setText("Management");
					managementTabItem.setToolTipText("View and manage employees, update database");
					{
						manageMainComposite = new Composite(mainTabFolder, SWT.NONE);
						manageMainComposite.setLayout(null);
						managementTabItem.setControl(manageMainComposite);
						{
							manageLabelEmployees = new Label(manageMainComposite, SWT.NONE);
							manageLabelEmployees.setText("Employees:");
							manageLabelEmployees.setBounds(12, 12, 60, 22);
						}
						{
							manageTableEmployees = new Table(manageMainComposite, SWT.BORDER | SWT.MULTI // TODO
									| SWT.H_SCROLL | SWT.V_SCROLL | SWT.SINGLE);
							manageTableEmployees.setBounds(13, 35, 423, 250);
							manageTableEmployees.setHeaderVisible(true);
							manageTableEmployees.setLinesVisible(true);
							int numOfColumns = 4;
							int tableWidth = manageTableEmployees.getClientArea().width - getBorderWidth()*2;
							
							manageTableColumnEmployeeID = new TableColumn(manageTableEmployees, SWT.NONE);
							manageTableColumnEmployeeID.setText("Employee ID");
							manageTableColumnEmployeeID.setResizable(true);
							manageTableColumnEmployeeID.setMoveable(true);
							manageTableColumnEmployeeID.setWidth(tableWidth / numOfColumns);
							
							manageTableColumnEmployeePName = new TableColumn(manageTableEmployees, SWT.NONE);
							manageTableColumnEmployeePName.setText("First name");
							manageTableColumnEmployeePName.setResizable(true);
							manageTableColumnEmployeePName.setMoveable(true);
							manageTableColumnEmployeePName.setWidth(tableWidth / numOfColumns);
							
							manageTableColumnEmployeeLName = new TableColumn(manageTableEmployees, SWT.NONE);
							manageTableColumnEmployeeLName.setText("Last name");
							manageTableColumnEmployeeLName.setResizable(true);
							manageTableColumnEmployeeLName.setMoveable(true);
							manageTableColumnEmployeeLName.setWidth(tableWidth / numOfColumns);
							
							manageTableColumnEmployeePosition = new TableColumn(manageTableEmployees, SWT.NONE);
							manageTableColumnEmployeePosition.setText("Position");
							manageTableColumnEmployeePosition.setResizable(true);
							manageTableColumnEmployeePosition.setMoveable(true);
							manageTableColumnEmployeePosition.setWidth(tableWidth / numOfColumns);
						}
						{
							manageGroupEditEmployee = new Group(manageMainComposite, SWT.NONE);
							manageGroupEditEmployee.setLayout(null);
							manageGroupEditEmployee.setText("Edit Employee Details");
							manageGroupEditEmployee.setBounds(449, 12, 324, 441);
							{
								manageLabelEmployeeID = new Label(manageGroupEditEmployee, SWT.NONE);
								manageLabelEmployeeID.setText("ID:");
								manageLabelEmployeeID.setBounds(12, 79, 25, 22);
							}
							{
								manageTextBoxEmployeeIDInput = new Text(manageGroupEditEmployee, SWT.BORDER);
								manageTextBoxEmployeeIDInput.setBounds(12, 101, 129, 22);
							}
							{
								manageLabelEmployeeFName = new Label(manageGroupEditEmployee, SWT.NONE);
								manageLabelEmployeeFName.setText("First name:");
								manageLabelEmployeeFName.setBounds(12, 131, 62, 22);
							}
							{
								manageTextBoxEmployeeFNameInput = new Text(manageGroupEditEmployee, SWT.BORDER);
								manageTextBoxEmployeeFNameInput.setBounds(12, 153, 129, 22);
							}
							{
								manageLabelEmployeeLName = new Label(manageGroupEditEmployee, SWT.NONE);
								manageLabelEmployeeLName.setText("Last name:");
								manageLabelEmployeeLName.setBounds(177, 131, 60, 22);
							}
							{
								manageTextBoxEmployeeLNameInput = new Text(manageGroupEditEmployee, SWT.BORDER);
								manageTextBoxEmployeeLNameInput.setBounds(178, 153, 129, 22);
							}
							{
								manageLabelEmployeeEmploymentDate = new Label(manageGroupEditEmployee, SWT.NONE);
								manageLabelEmployeeEmploymentDate.setText("Date of employment:");
								manageLabelEmployeeEmploymentDate.setBounds(12, 24, 112, 22);
							}
							{
								manageLabelEmployeeBirth = new Label(manageGroupEditEmployee, SWT.NONE);
								manageLabelEmployeeBirth.setText("Date of birth:");
								manageLabelEmployeeBirth.setBounds(177, 79, 78, 22);
							}
							{
								manageTextBoxEmployeeBirthInput = new Text(manageGroupEditEmployee, SWT.BORDER);
								manageTextBoxEmployeeBirthInput.setBounds(177, 101, 129, 22);
							}
							{
								manageLabelEmployeeAddress = new Label(manageGroupEditEmployee, SWT.NONE);
								manageLabelEmployeeAddress.setText("Address:");
								manageLabelEmployeeAddress.setBounds(12, 183, 51, 22);
							}
							{
								manageTextBoxEmployeeAddressInput = new Text(manageGroupEditEmployee, SWT.BORDER);
								manageTextBoxEmployeeAddressInput.setBounds(12, 205, 296, 22);
							}
							{
								manageLabelEmployeeStoreID = new Label(manageGroupEditEmployee, SWT.NONE);
								manageLabelEmployeeStoreID.setText("Employing store ID:");
								manageLabelEmployeeStoreID.setBounds(176, 24, 106, 22);
							}
							{
								manageLabelEmployeeEmployeeStoreIDInput = new Label(manageGroupEditEmployee, SWT.BORDER);
								manageLabelEmployeeEmployeeStoreIDInput.setBounds(176, 49, 130, 22);
							}
							{
								manageLabelEmployeeEmploymentDateInput = new Label(manageGroupEditEmployee, SWT.BORDER);
								manageLabelEmployeeEmploymentDateInput.setBounds(12, 50, 130, 22);
							}
							{
								manageLabelEmployeePhone = new Label(manageGroupEditEmployee, SWT.NONE);
								manageLabelEmployeePhone.setText("Phone:");
								manageLabelEmployeePhone.setBounds(12, 235, 60, 22);
							}
							{
								manageLabelEmployeeCellPhone = new Label(manageGroupEditEmployee, SWT.NONE);
								manageLabelEmployeeCellPhone.setText("Cellular Phone:");
								manageLabelEmployeeCellPhone.setBounds(180, 235, 80, 22);
							}
							{
								manageTextBoxEmployeePhoneInput = new Text(manageGroupEditEmployee, SWT.BORDER);
								manageTextBoxEmployeePhoneInput.setBounds(12, 257, 131, 22);
							}
							{
								manageTextBoxEmployeeCellPhoneInput = new Text(manageGroupEditEmployee, SWT.BORDER);
								manageTextBoxEmployeeCellPhoneInput.setBounds(177, 257, 131, 22);
							}
							{
								manageLabelEmployeePosition = new Label(manageGroupEditEmployee, SWT.NONE);
								manageLabelEmployeePosition.setText("Position:");
								manageLabelEmployeePosition.setBounds(12, 291, 60, 22);
							}
							{
								manageComboEmployeePositionInput = new Combo(manageGroupEditEmployee, SWT.NONE);
								manageComboEmployeePositionInput.setBounds(78, 291, 229, 21);
							}
							{
								manageButtonEmployeeNew = new Button(manageGroupEditEmployee, SWT.PUSH | SWT.CENTER);
								manageButtonEmployeeNew.setText("New");
								manageButtonEmployeeNew.setBounds(12, 363, 60, 30);
							}
							{
								manageButtonEmployeeInsert = new Button(manageGroupEditEmployee, SWT.PUSH | SWT.CENTER);
								manageButtonEmployeeInsert.setText("Insert");
								manageButtonEmployeeInsert.setBounds(81, 363, 60, 30);
							}
							{
								manageButtonEmployeeEdit = new Button(manageGroupEditEmployee, SWT.PUSH | SWT.CENTER);
								manageButtonEmployeeEdit.setText("Edit");
								manageButtonEmployeeEdit.setBounds(12, 399, 60, 30);
							}
							{
								manageButtonEmployeeSave = new Button(manageGroupEditEmployee, SWT.PUSH | SWT.CENTER);
								manageButtonEmployeeSave.setText("Save");
								manageButtonEmployeeSave.setBounds(81, 399, 60, 30);
							}
							{
								manageButtonEmployeeRemove = new Button(manageGroupEditEmployee, SWT.PUSH | SWT.CENTER);
								manageButtonEmployeeRemove.setText("Remove Employee");
								manageButtonEmployeeRemove.setBounds(150, 399, 157, 30);
							}
							{
								manageButtonEmployeeNoSave = new Button(manageGroupEditEmployee, SWT.PUSH | SWT.CENTER);
								manageButtonEmployeeNoSave.setText("Exit Without Saving");
								manageButtonEmployeeNoSave.setBounds(150, 363, 157, 30);
							}
						}
						{
							manageGroupDBSManage = new Group(manageMainComposite, SWT.NONE);
							manageGroupDBSManage.setLayout(null);
							manageGroupDBSManage.setText("Manage Database");
							manageGroupDBSManage.setBounds(12, 293, 425, 160);
							{
								manageLabelDBSUpdate = new Label(manageGroupDBSManage, SWT.NONE);
								manageLabelDBSUpdate.setText("Select update file:");
								manageLabelDBSUpdate.setBounds(12, 26, 96, 18);
							}
							{
								manageTextBoxDBSUpdateFileInput = new Text(manageGroupDBSManage, SWT.BORDER);
								manageTextBoxDBSUpdateFileInput.setBounds(13, 49, 393, 22);
							}
							{
								manageButtonDBSBrowse = new Button(manageGroupDBSManage, SWT.PUSH | SWT.CENTER);
								manageButtonDBSBrowse.setText("Browse...");
								manageButtonDBSBrowse.setBounds(214, 82, 74, 30);
							}
							{
								manageButtonDBSUpdate = new Button(manageGroupDBSManage, SWT.PUSH | SWT.CENTER);
								manageButtonDBSUpdate.setText("Update Database");
								manageButtonDBSUpdate.setBounds(294, 82, 112, 30);
							}
							{
								manageProgressBarDBSUpdate = new ProgressBar(manageGroupDBSManage, SWT.NONE);
								manageProgressBarDBSUpdate.setBounds(13, 123, 393, 25);
							}
						}
					}

				}	
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//////////////////////////
	//	Getters and Setters	//
	//////////////////////////

	public static Menu getMainMenuBar() {
		return mainMenuBar;
	}

	public static MenuItem getMenuItemSeperator() {
		return menuItemSeperator;
	}

	public static MenuItem getMainMenuItemFile() {
		return mainMenuItemFile;
	}

	public static Menu getFileMenu() {
		return fileMenu;
	}

	public static MenuItem getFileMenuItemExit() {
		return fileMenuItemExit;
	}

	public static MenuItem getMainMenuItemSearch() {
		return mainMenuItemSearch;
	}

	public static Menu getSearchMenu() {
		return searchMenu;
	}

	public static MenuItem getSearchMenuItemAddToSale() {
		return searchMenuItemAddToSale;
	}

	public static MenuItem getSearchMenuItemPlaceOrder() {
		return searchMenuItemPlaceOrder;
	}

	public static MenuItem getSearchMenuItemSearch() {
		return searchMenuItemSearch;
	}

	public static MenuItem getSearchMenuItemClear() {
		return searchMenuItemClear;
	}

	public static MenuItem getMainMenuItemSale() {
		return mainMenuItemSale;
	}

	public static Menu getSaleMenu() {
		return saleMenu;
	}

	public static MenuItem getSaleMenuItemRemove() {
		return saleMenuItemRemove;
	}

	public static MenuItem getSaleMenuItemClear() {
		return saleMenuItemClear;
	}

	public static MenuItem getSaleMenuItemMakeSale() {
		return saleMenuItemMakeSale;
	}

	public static MenuItem getMainMenuItemStock() {
		return mainMenuItemStock;
	}

	public static Menu getStockMenu() {
		return stockMenu;
	}

	public static MenuItem getStockMenuItemCheckAvailability() {
		return stockMenuItemCheckAvailability;
	}

	public static MenuItem getStockMenuItemClear() {
		return stockMenuItemClear;
	}

	public static MenuItem getStockMenuItemPlaceOrder() {
		return stockMenuItemPlaceOrder;
	}

	public static MenuItem getStockMenuItemRemoveOrder() {
		return stockMenuItemRemoveOrder;
	}

	public static MenuItem getStockMenuItemCancelOrder() {
		return stockMenuItemCancelOrder;
	}

	public static MenuItem getStockMenuItemDenyRequest() {
		return stockMenuItemDenyRequest;
	}

	public static MenuItem getStockMenuItemApproveRequest() {
		return stockMenuItemApproveRequest;
	}

	public static MenuItem getMainMenuItemManage() {
		return mainMenuItemManage;
	}

	public static Menu getManageMenu() {
		return manageMenu;
	}

	public static MenuItem getManageMenuItemBrowse() {
		return manageMenuItemBrowse;
	}

	public static MenuItem getManageMenuItemUpdateDBS() {
		return manageMenuItemUpdateDBS;
	}

	public static MenuItem getManageMenuItemNew() {
		return manageMenuItemNew;
	}

	public static MenuItem getManageMenuItemInsert() {
		return manageMenuItemInsert;
	}

	public static MenuItem getManageMenuItemEdit() {
		return manageMenuItemEdit;
	}

	public static MenuItem getManageMenuItemSave() {
		return manageMenuItemSave;
	}

	public static MenuItem getManageMenuItemExitNoSave() {
		return manageMenuItemExitNoSave;
	}

	public static MenuItem getManageMenuItemRemoveEmployee() {
		return manageMenuItemRemoveEmployee;
	}

	public static Group getMainGroupStoreDetails() {
		return mainGroupStoreDetails;
	}

	public static Label getMainLabelStoreDetailsStoreID() {
		return mainLabelStoreDetailsStoreID;
	}

	public static Label getMainLabelStoreDetailsDateTime() {
		return mainLabelStoreDetailsDateTime;
	}

	public static Label getMainLabelStoreDetailsStoreAddress() {
		return mainLabelStoreDetailsStoreAddress;
	}

	public static Label getMainLabelStoreDetailsStorePhone() {
		return mainLabelStoreDetailsStorePhone;
	}

	public static Label getMainLabelStoreDetailsStoreManager() {
		return mainLabelStoreDetailsStoreManager;
	}

	public static Group getMainGroupQuickTips() {
		return mainGroupQuickTips;
	}

	public static Label getMainLabelQuickTipsTip() {
		return mainLabelQuickTipsTip;
	}

	public static TabFolder getMainTabFolder() {
		return mainTabFolder;
	}

	public static TabItem getSearchTabItem() {
		return searchTabItem;
	}

	public static Composite getSearchTabComposite() {
		return searchTabComposite;
	}

	public static Group getSearchGroupOptions() {
		return searchGroupOptions;
	}

	public static Button getSearchBulletByAlbum() {
		return searchBulletByAlbum;
	}

	public static Text getSearchTextBoxAlbumID() {
		return searchTextBoxAlbumID;
	}

	public static Button getSearchBulletOtherParameters() {
		return searchBulletOtherParameters;
	}

	public static Button getSearchCheckBoxAlbumName() {
		return searchCheckBoxAlbumName;
	}

	public static Text getSearchTextBoxAlbumName() {
		return searchTextBoxAlbumName;
	}

	public static Button getSearchCheckBoxArtist() {
		return searchCheckBoxArtist;
	}

	public static Text getSearchTextBoxArtist() {
		return searchTextBoxArtist;
	}

	public static Button getSearchCheckBoxYear() {
		return searchCheckBoxYear;
	}

	public static Text getSearchTextBoxYearFrom() {
		return searchTextBoxYearFrom;
	}

	public static Label getSearchLabelYearTo() {
		return searchLabelYearTo;
	}

	public static Text getSearchTextBoxYearTo() {
		return searchTextBoxYearTo;
	}

	public static Button getSearchCheckBoxSongNames() {
		return searchCheckBoxSongNames;
	}

	public static Text getSearchTextBoxSongNames() {
		return searchTextBoxSongNames;
	}

	public static Composite getSearchCompositeStockField() {
		return searchCompositeStockField;
	}

	public static Label getSearchLabelStock() {
		return searchLabelStock;
	}

	public static Button getSearchBulletInStockAll() {
		return searchBulletInStockAll;
	}

	public static Button getSearchBulletInStockInStore() {
		return searchBulletInStockInStore;
	}

	public static Button getSearchBulletInStockInNetwork() {
		return searchBulletInStockInNetwork;
	}

	public static Button getSearchCheckBoxGenres() {
		return searchCheckBoxGenres;
	}

	public static Button[] getSearchCheckBoxGenresArr(){
		return searchCheckBoxGenresArr;
	}
	
	public static Button getSearchCheckBoxGenreRock() {
		return searchCheckBoxGenresArr[0];
	}
	
	public static Button getSearchCheckBoxGenreJazz() {
		return searchCheckBoxGenresArr[1];
	}

	public static Button getSearchCheckBoxGenre03() {
		return searchCheckBoxGenresArr[2];
	}

	public static Button getSearchCheckBoxGenre04() {
		return searchCheckBoxGenresArr[3];
	}

	public static Button getSearchCheckBoxGenre05() {
		return searchCheckBoxGenresArr[4];
	}

	public static Button getSearchCheckBoxGenre06() {
		return searchCheckBoxGenresArr[5];
	}

	public static Button getSearchCheckBoxGenre07() {
		return searchCheckBoxGenresArr[6];
	}

	public static Button getSearchCheckBoxGenre08() {
		return searchCheckBoxGenresArr[7];
	}

	public static Button getSearchCheckBoxGenre09() {
		return searchCheckBoxGenresArr[8];
	}

	public static Button getSearchCheckBoxGenre10() {
		return searchCheckBoxGenresArr[9];
	}

	public static Button getSearchCheckBoxGenreOther() {
		return searchCheckBoxGenreOther;
	}

	public static Text getSearchTextBoxGenreOther() {
		return searchTextBoxGenreOther;
	}

	public static Button getSearchButtonClear() {
		return searchButtonClear;
	}

	public static Button getSearchButtonSearch() {
		return searchButtonSearch;
	}

	public static Group getSearchGroupResults() {
		return searchGroupResults;
	}

	public static Table getSearchTableAlbumResults() {
		return searchTableAlbumResults;
	}

	public static TableColumn getSearchTableColumnAlbumID() {
		return searchTableColumnAlbumID;
	}

	public static TableColumn getSearchTableColumnAlbumName() {
		return searchTableColumnAlbumName;
	}

	public static TableColumn getSearchTableColumnAlbumArtist() {
		return searchTableColumnAlbumArtist;
	}

	public static TableColumn getSearchTableColumnAlbumYear() {
		return searchTableColumnAlbumYear;
	}

	public static TableColumn getSearchTableColumnAlbumGenre() {
		return searchTableColumnAlbumGenre;
	}

	public static TableColumn getSearchTableColumnAlbumLength() {
		return searchTableColumnAlbumLength;
	}

	public static ProgressBar getSearchProgressBar() {
		return searchProgressBar;
	}

	public static Table getSearchTableSongResults() {
		return searchTableSongResults;
	}

	public static TableColumn getSearchTableColumnSongName() {
		return searchTableColumnSongName;
	}

	public static TableColumn getSearchTableColumnSongArtist() {
		return searchTableColumnSongArtist;
	}

	public static TableColumn getSearchTableColumnSongLength() {
		return searchTableColumnSongLength;
	}

	public static Group getSearchGroupStockInfo() {
		return searchGroupStockInfo;
	}

	public static Label getSearchLabelStockInfoStoreStock() {
		return searchLabelStockInfoStoreStock;
	}

	public static Label getSearchLabelStockInfoLocation() {
		return searchLabelStockInfoLocation;
	}

	public static Label getSearchLabelStockInfoPrice() {
		return searchLabelStockInfoPrice;
	}

	public static Button getSearchButtonStockInfoOrder() {
		return searchButtonStockInfoOrder;
	}

	public static Group getSearchGroupSaleInfo() {
		return searchGroupSaleInfo;
	}

	public static Label getSearchLabelSaleInfoQuantity() {
		return searchLabelSaleInfoQuantity;
	}

	public static Text getSearchTextBoxSaleInfoQuantity() {
		return searchTextBoxSaleInfoQuantity;
	}

	public static Button getSearchButtonSaleInfoSale() {
		return searchButtonSaleInfoSale;
	}

	public static TabItem getSaleTabItem() {
		return saleTabItem;
	}

	public static Composite getSaleCompositeMain() {
		return saleCompositeMain;
	}

	public static Group getSaleGroupSaleDetails() {
		return saleGroupSaleDetails;
	}

	public static Label getSaleLabelSaleID() {
		return saleLabelSaleID;
	}

	public static Label getSaleLabelSaleIDInput() {
		return saleLabelSaleIDInput;
	}

	public static Label getSaleLabelSaleDate() {
		return saleLabelSaleDate;
	}

	public static Label getSaleLabelDateInput() {
		return saleLabelDateInput;
	}

	public static Label getSaleLabelSalesmanIDName() {
		return saleLabelSalesmanIDName;
	}

	public static Combo getSaleComboSalesmanIDNameInput() {
		return saleComboSalesmanIDNameInput;
	}

	public static Label getSaleLabelSaleTime() {
		return saleLabelSaleTime;
	}

	public static Label getSaleLabelTimeInput() {
		return saleLabelTimeInput;
	}

	public static Table getSaleTableSaleItems() {
		return saleTableSaleItems;
	}

	public static TableColumn getSaleTableColumnAlbumID() {
		return saleTableColumnAlbumID;
	}

	public static TableColumn getSaleTableColumnAlbumName() {
		return saleTableColumnAlbumName;
	}

	public static TableColumn getSaleTableColumnQuantity() {
		return saleTableColumnQuantity;
	}

	public static TableColumn getSaleTableColumnPricePerItem() {
		return saleTableColumnPricePerItem;
	}

	public static TableColumn getSaleTableColumnPriceTotal() {
		return saleTableColumnPriceTotal;
	}

	public static Button getSaleButtonRemoveItem() {
		return saleButtonRemoveItem;
	}

	public static Button getSaleButtonClearSale() {
		return saleButtonClearSale;
	}

	public static Label getSaleLabelTotalPrice() {
		return saleLabelTotalPrice;
	}

	public static Label getSaleLabelTotalPriceValue() {
		return saleLabelTotalPriceValue;
	}

	public static Button getSaleButtonMakeSale() {
		return saleButtonMakeSale;
	}

	public static TabItem getStockTabItem() {
		return stockTabItem;
	}

	public static Composite getStockTabComposite() {
		return stockTabComposite;
	}

	public static Group getStockGroupOrderForm() {
		return stockGroupOrderForm;
	}

	public static Label getStockLabelOrderID() {
		return stockLabelOrderID;
	}

	public static Label getStockLabelOrderIDInput() {
		return stockLabelOrderIDInput;
	}

	public static Label getStockLabelAlbumID() {
		return stockLabelAlbumID;
	}

	public static Text getStockTextBoxAlbumIDInput() {
		return stockTextBoxAlbumIDInput;
	}

	public static Label getStockLabelDate() {
		return stockLabelDate;
	}

	public static Label getStockLabelOrderDateInput() {
		return stockLabelOrderDateInput;
	}

	public static Button getStockButtonCheckAvailability() {
		return stockButtonCheckAvailability;
	}

	public static Label getStockLabelOrderFromStore() {
		return stockLabelOrderFromStore;
	}

	public static Table getStockTableOrderAvailableStores() {
		return stockTableOrderAvailableStores;
	}

	public static TableColumn getStockTableColumnStoreID() {
		return stockTableColumnStoreID;
	}

	public static TableColumn getStockTableColumnStoreCity() {
		return stockTableColumnStoreCity;
	}

	public static TableColumn getStockTableColumnQuantity() {
		return stockTableColumnQuantity;
	}

	public static TableColumn getStockTableColumnPrice() {
		return stockTableColumnPrice;
	}

	public static Label getStockLabelPrice() {
		return stockLabelPrice;
	}

	public static Label getStockLabelStorePriceInput() {
		return stockLabelStorePriceInput;
	}

	public static Label getStockLabelQuantityInStock() {
		return stockLabelQuantityInStock;
	}

	public static Label getStockLabelQuantityInStockInput() {
		return stockLabelQuantityInStockInput;
	}

	public static Label getStockLabelStorageLocation() {
		return stockLabelStorageLocation;
	}

	public static Label getStockLabelStorageLocationInput() {
		return stockLabelStorageLocationInput;
	}

	public static Label getStockLabelQuantityToOrder() {
		return stockLabelQuantityToOrder;
	}

	public static Text getStockTextBoxQuantityToOrder() {
		return stockTextBoxQuantityToOrder;
	}

	public static Button getStockButtonClearOrder() {
		return stockButtonClearOrder;
	}

	public static Button getStockButtonPlaceOrder() {
		return stockButtonPlaceOrder;
	}

	public static Label getStockLabelOrders() {
		return stockLabelOrders;
	}

	public static Table getStockTableOrders() {
		return stockTableOrders;
	}

	public static TableColumn getStockTableColumnOrdersOrderID() {
		return stockTableColumnOrdersOrderID;
	}

	public static TableColumn getStockTableColumnOrdersSupplierID() {
		return stockTableColumnOrdersSupplierID;
	}

	public static TableColumn getStockTableColumnOrdersAlbumID() {
		return stockTableColumnOrdersAlbumID;
	}

	public static TableColumn getStockTableColumnOrdersQuantity() {
		return stockTableColumnOrdersQuantity;
	}

	public static TableColumn getStockTableColumnOrdersDate() {
		return stockTableColumnOrdersDate;
	}

	public static TableColumn getStockTableColumnOrdersStatus() {
		return stockTableColumnOrdersStatus;
	}

	public static TableColumn getStockTableColumnOrdersCompletionDate() {
		return stockTableColumnOrdersCompletionDate;
	}

	public static Button getStockButtonRemoveOrder() {
		return stockButtonRemoveOrder;
	}

	public static Button getStockButtonCancelOrder() {
		return stockButtonCancelOrder;
	}

	public static Label getStockLabelRequests() {
		return stockLabelRequests;
	}

	public static Table getStockTableRequests() {
		return stockTableRequests;
	}

	public static TableColumn getStockTableColumnRequestsOrderID() {
		return stockTableColumnRequestsOrderID;
	}

	public static TableColumn getStockTableColumnRequestsOrderingStoreID() {
		return stockTableColumnRequestsOrderingStoreID;
	}

	public static TableColumn getStockTableColumnRequestsAlbumID() {
		return stockTableColumnRequestsAlbumID;
	}

	public static TableColumn getStockTableColumnRequestsQuantity() {
		return stockTableColumnRequestsQuantity;
	}

	public static TableColumn getStockTableColumnRequestsDate() {
		return stockTableColumnRequestsDate;
	}

	public static TableColumn getStockTableColumnRequestsStatus() {
		return stockTableColumnRequestsStatus;
	}

	public static TableColumn getStockTableColumnRequestsCompletionDate() {
		return stockTableColumnRequestsCompletionDate;
	}

	public static Button getStockButtonDenyRequest() {
		return stockButtonDenyRequest;
	}

	public static Button getStockButtonApproveRequest() {
		return stockButtonApproveRequest;
	}

	public static TabItem getManagementTabItem() {
		return managementTabItem;
	}

	public static Composite getManageMainComposite() {
		return manageMainComposite;
	}

	public static Label getManageLabelEmployees() {
		return manageLabelEmployees;
	}

	public static Table getManageTableEmployees() {
		return manageTableEmployees;
	}

	public static TableColumn getManageTableColumnEmployeeID() {
		return manageTableColumnEmployeeID;
	}

	public static TableColumn getManageTableColumnEmployeePName() {
		return manageTableColumnEmployeePName;
	}

	public static TableColumn getManageTableColumnEmployeeLName() {
		return manageTableColumnEmployeeLName;
	}

	public static TableColumn getManageTableColumnEmployeePosition() {
		return manageTableColumnEmployeePosition;
	}

	public static Group getManageGroupEditEmployee() {
		return manageGroupEditEmployee;
	}

	public static Label getManageLabelEmployeeEmploymentDateInput() {
		return manageLabelEmployeeEmploymentDateInput;
	}

	public static Label getManageLabelEmployeeEmploymentDate() {
		return manageLabelEmployeeEmploymentDate;
	}

	public static Label getManageLabelEmployeeStoreID() {
		return manageLabelEmployeeStoreID;
	}

	public static Label getManageLabelEmployeeEmployeeStoreIDInput() {
		return manageLabelEmployeeEmployeeStoreIDInput;
	}

	public static Label getManageLabelEmployeeID() {
		return manageLabelEmployeeID;
	}

	public static Text getManageTextBoxEmployeeIDInput() {
		return manageTextBoxEmployeeIDInput;
	}

	public static Label getManageLabelEmployeeBirth() {
		return manageLabelEmployeeBirth;
	}

	public static Text getManageTextBoxEmployeeBirthInput() {
		return manageTextBoxEmployeeBirthInput;
	}

	public static Label getManageLabelEmployeeFName() {
		return manageLabelEmployeeFName;
	}

	public static Text getManageTextBoxEmployeeFNameInput() {
		return manageTextBoxEmployeeFNameInput;
	}

	public static Label getManageLabelEmployeeLName() {
		return manageLabelEmployeeLName;
	}

	public static Text getManageTextBoxEmployeeLNameInput() {
		return manageTextBoxEmployeeLNameInput;
	}

	public static Label getManageLabelEmployeeAddress() {
		return manageLabelEmployeeAddress;
	}

	public static Text getManageTextBoxEmployeeAddressInput() {
		return manageTextBoxEmployeeAddressInput;
	}

	public static Label getManageLabelEmployeePhone() {
		return manageLabelEmployeePhone;
	}

	public static Text getManageTextBoxEmployeePhoneInput() {
		return manageTextBoxEmployeePhoneInput;
	}

	public static Label getManageLabelEmployeeCellPhone() {
		return manageLabelEmployeeCellPhone;
	}

	public static Text getManageTextBoxEmployeeCellPhoneInput() {
		return manageTextBoxEmployeeCellPhoneInput;
	}

	public static Label getManageLabelEmployeePosition() {
		return manageLabelEmployeePosition;
	}

	public static Combo getManageComboEmployeePositionInput() {
		return manageComboEmployeePositionInput;
	}

	public static Button getManageButtonEmployeeNew() {
		return manageButtonEmployeeNew;
	}

	public static Button getManageButtonEmployeeInsert() {
		return manageButtonEmployeeInsert;
	}

	public static Button getManageButtonEmployeeNoSave() {
		return manageButtonEmployeeNoSave;
	}

	public static Button getManageButtonEmployeeEdit() {
		return manageButtonEmployeeEdit;
	}

	public static Button getManageButtonEmployeeSave() {
		return manageButtonEmployeeSave;
	}

	public static Button getManageButtonEmployeeRemove() {
		return manageButtonEmployeeRemove;
	}

	public static Group getManageGroupDBSManage() {
		return manageGroupDBSManage;
	}

	public static Label getManageLabelDBSUpdate() {
		return manageLabelDBSUpdate;
	}

	public static Text getManageTextBoxDBSUpdateFileInput() {
		return manageTextBoxDBSUpdateFileInput;
	}

	public static Button getManageButtonDBSBrowse() {
		return manageButtonDBSBrowse;
	}

	public static Button getManageButtonDBSUpdate() {
		return manageButtonDBSUpdate;
	}

	public static ProgressBar getManageProgressBarDBSUpdate() {
		return manageProgressBarDBSUpdate;
	}
}