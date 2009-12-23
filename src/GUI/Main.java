package GUI;

import java.util.ListIterator;
import java.util.Observable;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import org.eclipse.jface.viewers.*;
import com.cloudgarden.resource.SWTResourceManager;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.widgets.*;
import org.eclipse.swt.graphics.*;
import org.eclipse.swt.*;
import org.eclipse.swt.custom.ScrolledComposite;

/**
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

	//////////////////////////////
	//	Variables definitions	//
	//////////////////////////////
	
	// Main Menu
	private Menu mainMenuBar;
	private MenuItem menuItemSeperator;
	
	private MenuItem mainMenuItemFile;
	private Menu fileMenu;
	private MenuItem fileMenuItemExit;
	
	private MenuItem mainMenuItemSearch;
	private Menu searchMenu;
	private MenuItem searchMenuItemAddToSale;
	private MenuItem searchMenuItemPlaceOrder;
	private MenuItem searchMenuItemSearch;
	private MenuItem searchMenuItemClear;
	
	private MenuItem mainMenuItemSale;
	private Menu saleMenu;
	private MenuItem saleMenuItemRemove;
	private MenuItem saleMenuItemClear;
	private MenuItem saleMenuItemMakeSale;
	
	private MenuItem mainMenuItemStock;
	private Menu stockMenu;
	private MenuItem stockMenuItemCheckAvailability;
	private MenuItem stockMenuItemClear;
	private MenuItem stockMenuItemPlaceOrder;
	private MenuItem stockMenuItemRemoveOrder;
	private MenuItem stockMenuItemCancelOrder;
	private MenuItem stockMenuItemDenyRequest;
	private MenuItem stockMenuItemApproveRequest;
	
	private MenuItem mainMenuItemManage;
	private Menu manageMenu;
	private MenuItem manageMenuItemBrowse;
	private MenuItem manageMenuItemUpdateDBS;
	private MenuItem manageMenuItemNew;
	private MenuItem manageMenuItemInsert;
	private MenuItem manageMenuItemEdit;
	private MenuItem manageMenuItemSave;
	private MenuItem manageMenuItemExitNoSave;
	private MenuItem manageMenuItemRemoveEmployee;
	
	// Main Window Details
	//////////////////////
	// Store details
	private Group mainGroupStoreDetails;
	private Label mainLabelStoreDetailsStoreID;
	private Label mainLabelStoreDetailsDateTime;
	private Label mainLabelStoreDetailsStoreAddress;
	private Label mainLabelStoreDetailsStorePhone;
	private Label mainLabelStoreDetailsStoreManager;
	
	// Quick tips
	private Group mainGroupQuickTips;
	private Label mainLabelQuickTipsTip;
	
	// Tab folder
	private TabFolder mainTabFolder;
	
	// Search tab
	/////////////
	private TabItem searchTabItem;
	private Composite searchTabComposite;
	
	// Search options group
	private Group searchGroupOptions;
	private Button searchBulletByAlbum;
	private Text searchTextBoxAlbumID;
	private Button searchBulletOtherParameters;
	private Button searchCheckBoxAlbumName;
	private Text searchTextBoxAlbumName;
	private Button searchCheckBoxArtist;
	private Text searchTextBoxArtist;
	private Button searchCheckBoxYear;
	private Text searchTextBoxYearFrom;
	private Label searchLabelYearTo;
	private Text searchTextBoxYearTo;
	private Button searchCheckBoxSongNames;
	private Text searchTextBoxSongNames;
	private Composite searchCompositeStockField;
	private Label searchLabelStock;
	private Button searchBulletInStockAll;
	private Button searchBulletInStockInStore;
	private Button searchBulletInStockInNetwork;
	private Button searchCheckBoxGenres;
	private Button searchCheckBoxGenreJazz;
	private Button searchCheckBoxGenreRock;
	private Button searchCheckBoxGenre03;
	private Button searchCheckBoxGenre04;
	private Button searchCheckBoxGenre05;
	private Button searchCheckBoxGenre06;
	private Button searchCheckBoxGenre07;
	private Button searchCheckBoxGenre08;
	private Button searchCheckBoxGenre09;
	private Button searchCheckBoxGenre10;
	private Button searchCheckBoxGenreOther;
	private Text searchTextBoxGenreOther;
	private Button searchButtonClear;
	private Button searchButtonSearch;
	
	// Search results group
	private Group searchGroupResults;
	private Table searchTableAlbumResults;
	private TableColumn searchTableColumnAlbumID;
	private TableColumn searchTableColumnAlbumName;
	private TableColumn searchTableColumnAlbumArtist;
	private TableColumn searchTableColumnAlbumYear;
	private TableColumn searchTableColumnAlbumGenre;
	private TableColumn searchTableColumnAlbumLength;
	private ProgressBar searchProgressBar;
	private Table searchTableSongResults;
	private TableColumn searchTableColumnSongName;
	private TableColumn searchTableColumnSongArtist;
	private TableColumn searchTableColumnSongLength;
	
	// Stock information group
	private Group searchGroupStockInfo;
	private Label searchLabelStockInfoStoreStock;
	private Label searchLabelStockInfoLocation;
	private Label searchLabelStockInfoPrice;
	private Button searchButtonStockInfoOrder;
	
	// Sale group
	private Group searchGroupSaleInfo;	
	private Label searchLabelSaleInfoQuantity;
	private Text searchTextBoxSaleInfoQuantity;
	private Button searchButtonSaleInfoSale;
	
	// Sale tab
	///////////
	private TabItem saleTabItem;
	private Composite saleCompositeMain;
	
	// Sale details group
	private Group saleGroupSaleDetails;
	private Label saleLabelSaleID;
	private Label saleLabelSaleIDInput;
	private Label saleLabelSaleDate;
	private Label saleLabelDateInput;
	private Label saleLabelSalesmanIDName;
	private Combo saleComboSalesmanIDNameInput;
	private Label saleLabelSaleTime;
	private Label saleLabelTimeInput;
	
	// Sale table
	private Table saleTableSaleItems;
	private TableColumn saleTableColumnAlbumID;
	private TableColumn saleTableColumnAlbumName;
	private TableColumn saleTableColumnQuantity;
	private TableColumn saleTableColumnPricePerItem;
	private TableColumn saleTableColumnPriceTotal;
	private Button saleButtonRemoveItem;
	private Button saleButtonClearSale;
	private Label saleLabelTotalPrice;
	private Label saleLabelTotalPriceValue;
	private Button saleButtonMakeSale;
	
	// Stock tab
	////////////
	private TabItem stockTabItem;
	private Composite stockTabComposite;
	
	// Order group
	private Group stockGroupOrderForm;
	private Label stockLabelOrderID;
	private Label stockLabelOrderIDInput;
	private Label stockLabelAlbumID;
	private Text stockTextBoxAlbumIDInput;
	private Label stockLabelDate;
	private Label stockLabelOrderDateInput;
	private Button stockButtonCheckAvailability;
	private Label stockLabelOrderFromStore;
	private Table stockTableOrderAvailableStores;
	private TableColumn stockTableColumnStoreID;
	private TableColumn stockTableColumnStoreCity;
	private TableColumn stockTableColumnQuantity;
	private TableColumn stockTableColumnPrice;
	private Label stockLabelPrice;
	private Label stockLabelStorePriceInput;
	private Label stockLabelQuantityInStock;
	private Label stockLabelQuantityInStockInput;
	private Label stockLabelStorageLocation;
	private Label stockLabelStorageLocationInput;
	private Label stockLabelQuantityToOrder;
	private Text stockTextBoxQuantityToOrder;
	private Button stockButtonClearOrder;
	private Button stockButtonPlaceOrder;
	
	// Orders table
	private Label stockLabelOrders;
	private Table stockTableOrders;
	private TableColumn stockTableColumnOrdersOrderID;
	private TableColumn stockTableColumnOrdersSupplierID;
	private TableColumn stockTableColumnOrdersAlbumID;
	private TableColumn stockTableColumnOrdersQuantity;
	private TableColumn stockTableColumnOrdersDate;
	private TableColumn stockTableColumnOrdersStatus;
	private TableColumn stockTableColumnOrdersCompletionDate;
	private Button stockButtonRemoveOrder;
	private Button stockButtonCancelOrder;
	
	// Requests table
	private Label stockLabelRequests;	
	private Table stockTableRequests;
	private TableColumn stockTableColumnRequestsOrderID;
	private TableColumn stockTableColumnRequestsOrderingStoreID;
	private TableColumn stockTableColumnRequestsAlbumID;
	private TableColumn stockTableColumnRequestsQuantity;
	private TableColumn stockTableColumnRequestsDate;
	private TableColumn stockTableColumnRequestsStatus;
	private TableColumn stockTableColumnRequestsCompletionDate;
	private Button stockButtonDenyRequest;
	private Button stockButtonApproveRequest;
	
	// Management tab
	/////////////////
	private TabItem managementTabItem;
	private Composite manageMainComposite;
	
	// Employees table
	private Label manageLabelEmployees;
	private Table manageTableEmployees;
	private TableColumn manageTableColumnEmployeeID;
	private TableColumn manageTableColumnEmployeePName;
	private TableColumn manageTableColumnEmployeeLName;
	private TableColumn manageTableColumnEmployeePosition;
	
	// Edit employee details group
	private Group manageGroupEditEmployee;
	private Label manageLabelEmployeeEmploymentDateInput;
	private Label manageLabelEmployeeEmploymentDate;
	private Label manageLabelEmployeeStoreID;
	private Label manageLabelEmployeeEmployeeStoreIDInput;
	private Label manageLabelEmployeeID;
	private Text manageTextBoxEmployeeIDInput;
	private Label manageLabelEmployeeBirth;
	private Text manageTextBoxEmployeeBirthInput;
	private Label manageLabelEmployeeFName;
	private Text manageTextBoxEmployeeFNameInput;	
	private Label manageLabelEmployeeLName;
	private Text manageTextBoxEmployeeLNameInput;
	private Label manageLabelEmployeeAddress;
	private Text manageTextBoxEmployeeAddressInput;
	private Label manageLabelEmployeePhone;
	private Text manageTextBoxEmployeePhoneInput;
	private Label manageLabelEmployeeCellPhone;
	private Text manageTextBoxEmployeeCellPhoneInput;
	private Label manageLabelEmployeePosition;
	private Combo manageComboEmployeePositionInput;
	private Button manageButtonEmployeeNew;
	private Button manageButtonEmployeeInsert;
	private Button manageButtonEmployeeNoSave;
	private Button manageButtonEmployeeEdit;
	private Button manageButtonEmployeeSave;
	private Button manageButtonEmployeeRemove;
	
	// Update database group
	private Group manageGroupDBSManage;
	private Label manageLabelDBSUpdate;
	private Text manageTextBoxDBSUpdateFileInput;
	private Button manageButtonDBSBrowse;
	private Button manageButtonDBSUpdate;
	private ProgressBar manageProgressBarDBSUpdate;

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
					mainMenuItemFile.setText("File");
					{
						fileMenu = new Menu(mainMenuItemFile);
						mainMenuItemFile.setMenu(fileMenu);
						{
							fileMenuItemExit = new MenuItem(fileMenu, SWT.PUSH);
							fileMenuItemExit.setText("Exit");
						}
					}
					
					mainMenuItemSearch = new MenuItem(mainMenuBar, SWT.CASCADE);
					mainMenuItemSearch.setText("Search");
					{
						searchMenu = new Menu(mainMenuItemSearch);
						mainMenuItemSearch.setMenu(searchMenu);
						{
							searchMenuItemClear = new MenuItem(searchMenu, SWT.PUSH);
							searchMenuItemClear.setText("Clear Fields");
						}
						{
							searchMenuItemSearch = new MenuItem(searchMenu, SWT.PUSH);
							searchMenuItemSearch.setText("Search");
						}
						{
							menuItemSeperator = new MenuItem(searchMenu, SWT.SEPARATOR);
						}
						{
							searchMenuItemPlaceOrder = new MenuItem(searchMenu, SWT.PUSH);
							searchMenuItemPlaceOrder.setText("Place an Order...");
						}
						{
							menuItemSeperator = new MenuItem(searchMenu, SWT.SEPARATOR);
						}
						{
							searchMenuItemAddToSale = new MenuItem(searchMenu, SWT.PUSH);
							searchMenuItemAddToSale.setText("Add to Sale...");
						}
					}
					
					mainMenuItemSale = new MenuItem(mainMenuBar, SWT.CASCADE);
					mainMenuItemSale.setText("Sale");
					{
						saleMenu = new Menu(mainMenuItemSale);
						mainMenuItemSale.setMenu(saleMenu);
						{
							saleMenuItemRemove = new MenuItem(saleMenu, SWT.PUSH);
							saleMenuItemRemove.setText("Remove Item");
						}
						{
							saleMenuItemClear = new MenuItem(saleMenu, SWT.PUSH);
							saleMenuItemClear.setText("Clear Sale");
						}
						{
							saleMenuItemMakeSale = new MenuItem(saleMenu, SWT.PUSH);
							saleMenuItemMakeSale.setText("Make Sale");
						}						
					}
					
					mainMenuItemStock = new MenuItem(mainMenuBar, SWT.CASCADE);
					mainMenuItemStock.setText("Stock");
					{
						stockMenu = new Menu(mainMenuItemStock);
						mainMenuItemStock.setMenu(stockMenu);
						{
							stockMenuItemCheckAvailability = new MenuItem(stockMenu, SWT.PUSH);
							stockMenuItemCheckAvailability.setText("Check Availability");
						}
						{
							stockMenuItemClear = new MenuItem(stockMenu, SWT.PUSH);
							stockMenuItemClear.setText("Clear Fields");
						}
						{
							stockMenuItemPlaceOrder = new MenuItem(stockMenu, SWT.PUSH);
							stockMenuItemPlaceOrder.setText("Place Order");
						}
						{
							menuItemSeperator = new MenuItem(stockMenu, SWT.SEPARATOR);
						}
						{
							stockMenuItemRemoveOrder = new MenuItem(stockMenu, SWT.PUSH);
							stockMenuItemRemoveOrder.setText("Remove Order");
						}
						{
							stockMenuItemCancelOrder = new MenuItem(stockMenu, SWT.PUSH);
							stockMenuItemCancelOrder.setText("Cancel Order");
						}
						{
							menuItemSeperator = new MenuItem(stockMenu, SWT.SEPARATOR);
						}
						{
							stockMenuItemDenyRequest = new MenuItem(stockMenu, SWT.PUSH);
							stockMenuItemDenyRequest.setText("Deny Request");
						}
						{
							stockMenuItemApproveRequest = new MenuItem(stockMenu, SWT.PUSH);
							stockMenuItemApproveRequest.setText("Approve Request");
						}
					}
					
					mainMenuItemManage = new MenuItem(mainMenuBar, SWT.CASCADE);
					mainMenuItemManage.setText("Management");
					{
						manageMenu = new Menu(mainMenuItemManage);
						mainMenuItemManage.setMenu(manageMenu);
						{
							manageMenuItemBrowse = new MenuItem(manageMenu, SWT.PUSH);
							manageMenuItemBrowse.setText("Browse...");
						}
						{
							manageMenuItemUpdateDBS = new MenuItem(manageMenu, SWT.PUSH);
							manageMenuItemUpdateDBS.setText("Update Database");
						}
						{
							menuItemSeperator = new MenuItem(manageMenu, SWT.SEPARATOR);
						}
						{
							manageMenuItemNew = new MenuItem(manageMenu, SWT.PUSH);
							manageMenuItemNew.setText("New");
						}
						{
							manageMenuItemInsert = new MenuItem(manageMenu, SWT.PUSH);
							manageMenuItemInsert.setText("Insert");
						}
						{
							manageMenuItemEdit = new MenuItem(manageMenu, SWT.PUSH);
							manageMenuItemEdit.setText("Edit");
						}
						{
							manageMenuItemSave = new MenuItem(manageMenu, SWT.PUSH);
							manageMenuItemSave.setText("Save");
						}
						{
							manageMenuItemExitNoSave = new MenuItem(manageMenu, SWT.PUSH);
							manageMenuItemExitNoSave.setText("Exit Without Saving");
						}
						{
							manageMenuItemRemoveEmployee = new MenuItem(manageMenu, SWT.PUSH);
							manageMenuItemRemoveEmployee.setText("Remove Employee");
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
								searchCheckBoxGenres.setBounds(12, 186, 82, 22);
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
								searchCheckBoxGenreRock = new Button(searchGroupOptions, SWT.CHECK | SWT.LEFT);
								searchCheckBoxGenreRock.setText("Rock");
								searchCheckBoxGenreRock.setBounds(12, 207, 60, 16);
							}
							{
								searchCheckBoxGenreJazz = new Button(searchGroupOptions, SWT.CHECK | SWT.LEFT);
								searchCheckBoxGenreJazz.setText("Jazz");
								searchCheckBoxGenreJazz.setBounds(12, 227, 60, 16);
							}
							{
								searchCheckBoxGenre03 = new Button(searchGroupOptions, SWT.CHECK | SWT.LEFT);
								searchCheckBoxGenre03.setText("Genre03");
								searchCheckBoxGenre03.setBounds(76, 207, 60, 16);
							}
							{
								searchCheckBoxGenre04 = new Button(searchGroupOptions, SWT.CHECK | SWT.LEFT);
								searchCheckBoxGenre04.setText("Genre04");
								searchCheckBoxGenre04.setBounds(76, 227, 60, 16);
							}
							{
								searchCheckBoxGenre05 = new Button(searchGroupOptions, SWT.CHECK | SWT.LEFT);
								searchCheckBoxGenre05.setText("Genre05");
								searchCheckBoxGenre05.setBounds(141, 207, 60, 16);
							}
							{
								searchCheckBoxGenre06 = new Button(searchGroupOptions, SWT.CHECK | SWT.LEFT);
								searchCheckBoxGenre06.setText("Genre06");
								searchCheckBoxGenre06.setBounds(141, 227, 60, 16);
							}
							{
								searchCheckBoxGenre07 = new Button(searchGroupOptions, SWT.CHECK | SWT.LEFT);
								searchCheckBoxGenre07.setText("Genre07");
								searchCheckBoxGenre07.setBounds(205, 207, 60, 16);
							}
							{
								searchCheckBoxGenre08 = new Button(searchGroupOptions, SWT.CHECK | SWT.LEFT);
								searchCheckBoxGenre08.setText("Genre08");
								searchCheckBoxGenre08.setBounds(205, 227, 60, 16);
							}
							{
								searchCheckBoxGenre09 = new Button(searchGroupOptions, SWT.CHECK | SWT.LEFT);
								searchCheckBoxGenre09.setText("Genre09");
								searchCheckBoxGenre09.setBounds(270, 207, 60, 16);
							}
							{
								searchCheckBoxGenre10 = new Button(searchGroupOptions, SWT.CHECK | SWT.LEFT);
								searchCheckBoxGenre10.setText("Genre10");
								searchCheckBoxGenre10.setBounds(270, 227, 60, 16);
							}
							{
								searchCheckBoxGenreOther = new Button(searchGroupOptions, SWT.CHECK | SWT.LEFT);
								searchCheckBoxGenreOther.setText("Other:");
								searchCheckBoxGenreOther.setBounds(12, 243, 54, 22);
							}
							{
								searchTextBoxGenreOther = new Text(searchGroupOptions, SWT.BORDER);
								searchTextBoxGenreOther.setBounds(74, 243, 273, 22);
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
								searchCompositeStockField.setBounds(12, 166, 331, 20);
								{
									searchLabelStock = new Label(searchCompositeStockField, SWT.NONE);
									searchLabelStock.setText("Stock:");
									searchLabelStock.setBounds(0, 2, 36, 16);
								}
								{
									searchBulletInStockInStore = new Button(searchCompositeStockField, SWT.RADIO | SWT.LEFT);
									searchBulletInStockInStore.setText("In store");
									searchBulletInStockInStore.setBounds(223, -1, 60, 22);
								}
								{
									searchBulletInStockInNetwork = new Button(searchCompositeStockField, SWT.RADIO | SWT.LEFT);
									searchBulletInStockInNetwork.setText("In network");
									searchBulletInStockInNetwork.setBounds(147, -1, 76, 22);
								}
								{
									searchBulletInStockAll = new Button(searchCompositeStockField, SWT.RADIO | SWT.LEFT);
									searchBulletInStockAll.setText("All");
									searchBulletInStockAll.setBounds(96, -1, 33, 22);
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
					managementTabItem.setToolTipText("View and manage HR");
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
}
