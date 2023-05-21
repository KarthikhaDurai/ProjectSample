package org.mp;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM extends BaseClass{

	public POM() {
		PageFactory.initElements(driver,this);
		
	}
//	 ------------------NEW USER REGISTER----------------
	@FindBy(className="login_register")
	private WebElement newuser;
	@FindBy(id = "username")
	private WebElement txtusername;
	@FindBy(id = "password")
	private WebElement txtpassword;
	@FindBy(id = "re_password")
	private WebElement txtconpass;
	@FindBy(id = "full_name")
	private WebElement txtfullname;
	@FindBy(id = "email_add")
	private WebElement txtemail;
	@FindBy(id = "tnc_box")
	private WebElement checkbox;
	
	@FindBy(id = "Submit")
	private WebElement btnregister;
//   -------------------LOGIN----------
	 @FindBy(id="username")
	    private WebElement txtuser;
	    @FindBy(id="password")
	    private WebElement txtpass;
	    @FindBy(name="login")
	    private WebElement btnlogin; 
//-----------------------SELECT HOTEL-----------------
	    @FindBy(id = "location")
		private WebElement location;
		@FindBy(id = "hotels")
		private WebElement hotels;
		@FindBy(id = "room_type")
		private WebElement room;
		@FindBy(xpath = "(//select[@class='search_combobox'])[4]")
		private WebElement roomno;
		@FindBy(id = "datepick_in")
		private WebElement datecheckin;
		@FindBy(id = "datepick_out")
		private WebElement datecheckout;
		@FindBy(id = "adult_room")
		private WebElement adultno;
		@FindBy(id = "child_room")
		private WebElement childno;
		@FindBy(id = "Submit")
		private WebElement search;
		@FindBy (name="radiobutton_0")
		private WebElement radiobutton;
		@FindBy(xpath="//input[@value='Continue']")
		private WebElement Continue;
		//-----------------BOOK A HOTEL--------------------------------

	    @FindBy(id="first_name")
		private WebElement firstname;
		@FindBy(id="last_name")
		private WebElement lastname;
		@FindBy(id="address")
		private WebElement address;
		@FindBy(id="cc_num")
		private WebElement cardno;
		@FindBy(id="cc_type")
		private WebElement cardtype;
		@FindBy(id="cc_exp_month")
		private WebElement expmonth;
		@FindBy(id="cc_exp_year")
		private WebElement expyear;
		@FindBy(id="cc_cvv")
		private WebElement cardcvno;
		@FindBy(id="book_now")
		private WebElement bookbtn;

		@FindBy(xpath="//a[text()='Booked Itinerary']")
		private WebElement bookeditinerary;
		@FindBy(name="order_id_text")
		private WebElement orderid;
		@FindBy(xpath="//input[@value='867670']")
		private WebElement orderbtn;
		
		

	//  ------------------------GETTER-------------
		
		public WebElement newuser() {
			return newuser;
		}
		
		public WebElement getTxtusername() {
			return txtusername;
		}

		public WebElement getTxtpassword() {
			return txtpassword;
		}
		public WebElement getTxtconpass() {
			return txtconpass;
		}

		public WebElement getTxtfullname() {
			return txtfullname;
		}

		public WebElement getTxtemail() {
			return txtemail;
		}

		public WebElement getCheckbox() {
			return checkbox;
		}

		public WebElement getBtnregister() {
			return btnregister;
		}
		public WebElement getTxtuser() {
			return txtuser;
		}
	    public WebElement getTxtpass() {
			return txtpass;
	    }
			public WebElement getBtnlogin() {
				return btnlogin;
		}
			
			public WebElement getLocation() {
				return location;
			}

			public WebElement getHotels() {
				return hotels;
			}

			public WebElement getRoom() {
				return room;
			}

			public WebElement getRoomno() {
				return roomno;
			}

			public WebElement getDatecheckin() {
				return datecheckin;
			}

			public WebElement getDatecheckout() {
				return datecheckout;
			}

			public WebElement getAdultno() {
				return adultno;
			}

			public WebElement getChildno() {
				return childno;
			}

			public WebElement getSearch() {
				return search;
			}
		
			public WebElement radiobutton(){
				return radiobutton;
			}
			
			public WebElement Continue() {
			return Continue;
			}
			
//			---------------------------LAST------------------
			
			public WebElement getFirstname() {
				return firstname;
			}
			public WebElement getLastname() {
				return lastname;
			}
			public WebElement getaddress() {
				return address;
			}
			public WebElement getCardno() {
				return cardno;
			}
			public WebElement getCardtype() {
				return cardtype;
			}
			public WebElement getExpmonth() {
				return expmonth;
			}
			public WebElement getExpyear() {
				return expyear;
			}
			public WebElement getCardcvno() {
				return cardcvno;
			}
			public WebElement getBookbtn() {
				return bookbtn;
			}
			
			public WebElement getNewuser() {
				return newuser;
			}

			public WebElement getRadiobutton() {
				return radiobutton;
			}

			public WebElement getContinue() {
				return Continue;
			}

			public WebElement getAddress() {
				return address;
			}

			

			public WebElement getbookeditinerary(){
				return bookeditinerary;
			}
			
			public WebElement getorderid() {
				return orderid;
				
			}
			
			public WebElement getorderbtn() {
				return orderbtn;
				
			}
			
		

			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

