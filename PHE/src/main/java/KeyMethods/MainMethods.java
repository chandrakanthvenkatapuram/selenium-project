package KeyMethods;





import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import Helpers.DataHelper;
import Helpers.ReadPropertiesFile;
import Helpers.Report;
import modules.AlcoholIntakeAction;
import modules.BeingHealthyAction;
import modules.BreakfastChoiceAction;
import modules.CheeseChoiceAction;
import modules.DrinkChoiceAction;
import modules.ExerciseAction;
import modules.FoodChoiceAction;
import modules.FruitChoiceActions;
import modules.HealthPrioritiesAction;
import modules.NonVegChoicesAction;
import modules.OneYouLand;
import modules.ResultAction;
import modules.SmokeAction;
import modules.SnacksChoiceAction;
import modules.StrengthAction;
import modules.TakeCareAction;
import pageobjects.AlcoholIntakePage;
import pageobjects.BaseClass;
import pageobjects.BreakfastChoicePage;
import pageobjects.CheeseChoicePage;
import pageobjects.DrinkChoice;
import pageobjects.ExercisePage;
import pageobjects.FoodChoice;
import pageobjects.FruitsChoicesPage;
import pageobjects.HealthPriorties;
import pageobjects.HowAreYouFeelingRightNowPage;
import pageobjects.NonVegChoicesPages;
import pageobjects.OneYouLandingPage;
import pageobjects.ResultPage;
import pageobjects.SmokePage;
import pageobjects.SnacksChoicePage;
import pageobjects.StrengthPage;
import pageobjects.TakingCarePage;






public class MainMethods extends BaseClass {
	
	ReadPropertiesFile rp = new ReadPropertiesFile();
	DataHelper dp = new DataHelper();
	Report Reporter = new Report();
	HowAreYouFeelingRightNowPage hfrnw = new HowAreYouFeelingRightNowPage();
	
	public void Open_HowAreQuiz_website() throws Throwable {

			PageFactory.initElements(driver, ReadPropertiesFile.class);
			String browser = rp.ReadFile("browser", "config.properties");
			//String browser = "chrome";
			//Added new line
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Drivers\\chromedriver.exe");
				BaseClass.driver = new ChromeDriver();
				// driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				BaseClass.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			}		
			BaseClass.driver.get(rp.ReadFile("url", "config.properties"));
			OneYouLand.AcceptCookies();	
	      
	}
	
	
	public void Fill_Name_Gender_Age_clickNext(HashMap<String, String> TData) throws Throwable {

			PageFactory.initElements(driver, OneYouLandingPage.class);

			OneYouLand.clickStartQuiz();
			
			OneYouLand.enterFirstName(TData.get("Name"));

			if (TData.get("Gender").equalsIgnoreCase("m")) {
				OneYouLand.selectMale();

			} else if (TData.get("Gender").equalsIgnoreCase("f")) {
				OneYouLand.selectFemale();

			}
			OneYouLand.enterAge(TData.get("Age"));
			
		    OneYouLand.clickNext();
		    Reporter.LogStepInfo("Quiz Started for : " + TData.get("Name"));
	}
	
	
	public void Fill_How_are_you_feeling_right_now(HashMap<String, String> TData) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
         
	    hfrnw.dragReallyKnackered(Integer.parseInt(TData.get("ReallyKnackered")));
		hfrnw.dragCanRunForMiles(Integer.parseInt(TData.get("CanRunForMiles")));
		hfrnw.dragFeelingCalm(Integer.parseInt(TData.get("FeelingCalm")));
		hfrnw.dragSleeplessNights(Integer.parseInt(TData.get("SleeplessNights")));
		hfrnw.dragLeanMean(Integer.parseInt(TData.get("LeanMean")));
		hfrnw.dragDownDumps(Integer.parseInt(TData.get("DownDump")));
		OneYouLand.clickNext();
		Thread.sleep(2000);
		Reporter.LogStepInfo("Health Info : "+ "\n" + "ReallyKnackered : " + TData.get("ReallyKnackered") + "\n" + "CanRunForMiles :\n " + TData.get("CanRunForMiles") +" FeelingCalm :\n " + TData.get("FeelingCalm") +"SleeplessNights :\n " + TData.get("SleeplessNights") +" LeanMean :\n " + TData.get("LeanMean") +"DownDump : \n " + TData.get("DownDump"));
	}
	
	
	
	public void Select_options_from_What_Stops_you_taking_care_of_yourself(HashMap<String, String> TData) throws Throwable {

	    // Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(BaseClass.driver, TakingCarePage.class);
		String ReportingInfo = "";
		String options = TData.get("options");
	 String delim=",";
	 String [] split_options=options.split(delim);
		int len = split_options.length;
		for (int i = 0; i < len; i++) {
			if (split_options[i].equalsIgnoreCase("1")) {				
				TakeCareAction.selectIDontHaveTime();
				ReportingInfo = ReportingInfo + " I don't have the time";
				 Reporter.LogStepInfo("Taking Care Option : I don't have the time");
			}else if (split_options[i].equalsIgnoreCase("2")) {
				TakeCareAction.selectILookAfterOthers();
				ReportingInfo = ReportingInfo + ", It's more important I look after others";
				Reporter.LogStepInfo("Taking Care Option : It's more important I look after others");
			}else if (split_options[i].equalsIgnoreCase("3")) {
				TakeCareAction.selectIDontKnowWhatToDo();
				ReportingInfo = ReportingInfo + ",  I don't know what to do";
				Reporter.LogStepInfo("Taking Care Option : I don't know what to do");
			}else if (split_options[i].equalsIgnoreCase("4")) {
				TakeCareAction.selectIDontHaveTheMoney();	
				ReportingInfo = ReportingInfo + ",  I don't know what to do";
				Reporter.LogStepInfo("Taking Care Option : I don't have the money");
			}else if (split_options[i].equalsIgnoreCase("5")) {
				TakeCareAction.selectIStartCantKeepUp();	
				ReportingInfo = ReportingInfo + ",  I start but can't keep up";
				Reporter.LogStepInfo("Taking Care Option : I start but can't keep up");
			}else if (split_options[i].equalsIgnoreCase("6")) {
				TakeCareAction.selectIllDisabled();
				ReportingInfo = ReportingInfo + ",   I'm ill or disabled";
				OneYouLand.clickNext();
				TakeCareAction.ValidateDisableMessage();
				Reporter.LogStepInfo("Taking Care Option : I'm ill or disabled");
			}else if (split_options[i].equalsIgnoreCase("7")) {
				TakeCareAction.selectITakeGoodCare();	
				ReportingInfo = ReportingInfo + ",  Nothing - I take good care of myself";
				//Reporter.LogStepInfo("Taking Care Option : Nothing - I take good care of myself");
			}
		}
		//Reporter.LogStepInfo("Taking Care Option : " + ReportingInfo);
		JavascriptExecutor jse=(JavascriptExecutor)BaseClass.driver; 
		jse.executeScript("window.scrollBy(0,250)", "");
		//TakeCareAction.clickNext();		
		OneYouLand.clickNext();
		
	}
	
	
	public void Choose_who_all_depend_on_me_for_being_healthy(HashMap<String, String> TData)
	{
		PageFactory.initElements(BaseClass.driver,pageobjects.BeingHealthy.class);
		String ReportingInfoDep = "";
		String choices = TData.get("options_dependents");
		String delim=",";
		 String [] split_options=choices.split(delim);
			int len = split_options.length;
			for (int i = 0; i < len; i++) {
				if (split_options[i].equalsIgnoreCase("1")) {
					BeingHealthyAction.selectMyPartner();
					ReportingInfoDep = ReportingInfoDep + ": My partner";
					//Reporter.LogStepInfo("Dependents : My partner");
				}
				else if (split_options[i].equalsIgnoreCase("2")) {
					BeingHealthyAction.selectMyKids();
					ReportingInfoDep = ReportingInfoDep + " :My kids";
					//Reporter.LogStepInfo("Dependents :My kids");
				}

				else if (split_options[i].equalsIgnoreCase("3")) {
					BeingHealthyAction.selectMyParents();
					ReportingInfoDep = ReportingInfoDep + " :My parents";
					//Reporter.LogStepInfo("Dependents : My parents");
				}

				else if (split_options[i].equalsIgnoreCase("4")) {
					BeingHealthyAction.selectMyGrandChildren();
					ReportingInfoDep = ReportingInfoDep + " :My grandkids";
					//Reporter.LogStepInfo("Dependents : My grandkids");
				}
				else if (split_options[i].equalsIgnoreCase("5")) {
					BeingHealthyAction.selectMyCloseFriends();
					ReportingInfoDep = ReportingInfoDep + " :My close friends";
					//Reporter.LogStepInfo("Dependents : My close friends");
				}

				else if (split_options[i].equalsIgnoreCase("6")) {
					BeingHealthyAction.selectMyCloseFriends();
					ReportingInfoDep = ReportingInfoDep + " :My close friends";
					//Reporter.LogStepInfo("Dependents : My close friends");
					}
				
				else if (split_options[i].equalsIgnoreCase("7")) {
					BeingHealthyAction.selectMyBrotherSister();
					ReportingInfoDep = ReportingInfoDep + " :My brothers and sisters";
					//Reporter.LogStepInfo("Dependents : My brothers and sisters");
				}
				
				else if (split_options[i].equalsIgnoreCase("8")) {
					BeingHealthyAction.selectMyPets();
					ReportingInfoDep = ReportingInfoDep + " :My pets";
					//Reporter.LogStepInfo("Dependents : My pets");
				}
				
				else if (split_options[i].equalsIgnoreCase("9")) {
					BeingHealthyAction.selectNone();		
					ReportingInfoDep = ReportingInfoDep + " :None of these";
					//Reporter.LogStepInfo("Dependents : None of these");
				}
			  
		 }
			Reporter.LogStepInfo("Dependents : "+ReportingInfoDep);
			OneYouLand.clickNext();
			
	}
	
	
	public void Identify_top_three_health_priorities_from_the_given_options(HashMap<String, String> TData) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(BaseClass.driver, HealthPriorties.class);
		String ReportingInfoPrio = "";
		String Priorityoptions = TData.get("options_priorities");
		String delim = ",";
		String[] split_options = Priorityoptions.split(delim);
		int len = split_options.length;
		for (int i = 0; i < len; i++) {
			if (split_options[i].equalsIgnoreCase("1")) {
				HealthPrioritiesAction.selectFittingJeans();
				ReportingInfoPrio = ReportingInfoPrio + ": Fitting into my jeans";
				//Reporter.LogStepPass("Health Priorities : Fitting into my jeans");
			}
			else if (split_options[i].equalsIgnoreCase("2")) {
				HealthPrioritiesAction.selectMorweEnergy();
				ReportingInfoPrio = ReportingInfoPrio + ": Having more energy";
				//Reporter.LogStepInfo("Health Priorities : Having more energy");
			}
			else if (split_options[i].equalsIgnoreCase("3")) {
				HealthPrioritiesAction.selectAchespain();
				ReportingInfoPrio = ReportingInfoPrio + ": Avoiding aches and pains";
				//Reporter.LogStepInfo("Health Priorities : Avoiding aches and pains");
			}
			else if (split_options[i].equalsIgnoreCase("4")) {
				HealthPrioritiesAction.selectFeelingYoung();
				ReportingInfoPrio = ReportingInfoPrio + ": Feeling young";
				//Reporter.LogStepInfo("Health Priorities : Feeling young");
			}
			else if (split_options[i].equalsIgnoreCase("5")) {
				HealthPrioritiesAction.selectStayIndependent();
				ReportingInfoPrio = ReportingInfoPrio + ": Staying independent";
				//Reporter.LogStepInfo("Health Priorities : Staying independent");
			}
			else if (split_options[i].equalsIgnoreCase("6")) {
				HealthPrioritiesAction.selectMindSharp();
				ReportingInfoPrio = ReportingInfoPrio + ": Keeping my mind sharp";
				//Reporter.LogStepInfo("Health Priorities : Keeping my mind sharp");
			}
			else if (split_options[i].equalsIgnoreCase("7")) {
				HealthPrioritiesAction.selectSocialLife();
				ReportingInfoPrio = ReportingInfoPrio + ": Having a more active social life";
				//Reporter.LogStepInfo("Health Priorities : Having a more active social life");
			}
			else if (split_options[i].equalsIgnoreCase("8"))
			{
				HealthPrioritiesAction.selectYoungLooking();
				ReportingInfoPrio = ReportingInfoPrio + ": Staying young looking";
				//Reporter.LogStepInfo("Health Priorities : Staying young looking");
			}
			else if (split_options[i].equalsIgnoreCase("9")) {
				HealthPrioritiesAction.selectForKids();
				ReportingInfoPrio = ReportingInfoPrio + ": Being there for my kids and grandkids";
				//Reporter.LogStepInfo("Health Priorities : Being there for my kids and grandkids");
			}

		}
		JavascriptExecutor jse=(JavascriptExecutor)BaseClass.driver; 
		jse.executeScript("window.scrollBy(0,250)", ""); Thread.sleep(1000);
		//TakeCareAction.clickNext(); Thread.sleep(1000);
		jse.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(1000);
		Reporter.LogStepInfo("Health Priorities :"+ReportingInfoPrio);
		OneYouLand.clickNext();
		//Reporter.LogStepPass("Pass!! Health Priorities");
		//HealthPrioritiesAction.clickNextPage();		
	}
	
	
	public void ValidatePartOneOutPutMessage(HashMap<String, String> TData) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		PageFactory.initElements(BaseClass.driver, HealthPriorties.class);
		String sAppMessages = "";
		List<WebElement> listOfmessages = BaseClass.driver.findElements(By.xpath("//div[@id='hay-container-embedded']//div[2]/div/p"));
	    for (int i=0; i<listOfmessages.size();i++){
	    	sAppMessages = sAppMessages + " " + listOfmessages.get(i).getText().trim();
	        System.out.println("message : --" + listOfmessages.get(i).getText());
	    }
	    System.out.println(sAppMessages);
	    System.out.println(TData.get("Part1_Message"));
	    if(sAppMessages.trim().equals(TData.get("Part1_Message").trim())) {
	    	Reporter.LogStepPass("First step Message validation - pass");
	    }else {
	    	Reporter.LogStepFail("First step Message validation fail--"+sAppMessages+"--is not egaul to "+TData.get("Part1_Message").trim());
	    }
	  OneYouLand.clickNext();
	}
	
	
	public void Choose_one_of_my_favorite_drinks_from_given(HashMap<String, String> TData) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    PageFactory.initElements(BaseClass.driver, DrinkChoice.class);
	    String Drinkoptions = TData.get("options_drink");
	    String delim = ",";
		String[] split_options = Drinkoptions.split(delim);
		int len = split_options.length;
		for (int i = 0; i < len; i++) {
			if (split_options[i].equalsIgnoreCase("1")) {
				DrinkChoiceAction.selectSugarDrinks();
				Reporter.LogStepInfo("Eating Habbit Drinks: Sugary drinks");
			}else if (split_options[i].equalsIgnoreCase("2")) {
				DrinkChoiceAction.selectDietDrinks();
				Reporter.LogStepInfo("Eating Habbit Drinks: Diet drinks");
			}else if (split_options[i].equalsIgnoreCase("3")) {
				DrinkChoiceAction.selectWater();
				Reporter.LogStepInfo("Eating Habbit Drinks: Water");
			}else if (split_options[i].equalsIgnoreCase("4")) {
				DrinkChoiceAction.selectTea();
				Reporter.LogStepInfo("Eating Habbit Drinks: Unsugared tea/coffee");
			}
		}
		JavascriptExecutor jse=(JavascriptExecutor)BaseClass.driver; 
		jse.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(1000);
		OneYouLand.clickNext();
		
		//TakeCareAction.clickNext(); Thread.sleep(1000);
	
	}
	
	public void Select_my_favorite_snacks_out_of_given_options(HashMap<String, String> TData) throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		PageFactory.initElements(BaseClass.driver, FoodChoice.class);
		String Snackoptions = TData.get("options_snacks");
		String delim = ",";
		String[] split_options = Snackoptions.split(delim);
		int len = split_options.length;
		for (int i = 0; i < len; i++) {
			if (split_options[i].equalsIgnoreCase("1")) {
				FoodChoiceAction.clickChips();
				Reporter.LogStepInfo("Eating Habbit Snaks: Chips");
			}else if (split_options[i].equalsIgnoreCase("2")) {
				FoodChoiceAction.clickBPotato();
				Reporter.LogStepInfo("Eating Habbit Snaks: Boiled potatoes");
			}else if (split_options[i].equalsIgnoreCase("3")) {
				FoodChoiceAction.clickRPotato();
				Reporter.LogStepInfo("Eating Habbit Snaks: Roast potatoes");
			}else if (split_options[i].equalsIgnoreCase("4")) {
				FoodChoiceAction.clickJPotato();
				Reporter.LogStepInfo("Eating Habbit Snaks: Jacket potatoes");
			}
		}
		OneYouLand.clickNext();
		Thread.sleep(1000);
		//Reporter.LogStepPass("Pass!! Favourite Snacks Selected");
	}
	
	public void Choose_my_favorite_breakfast_out_of_given_options(HashMap<String, String> TData) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    PageFactory.initElements(BaseClass.driver, BreakfastChoicePage.class);
	    String Bfstoptions = TData.get("options_bfast");
	    if (Bfstoptions.equalsIgnoreCase("1")) {
	    	BreakfastChoiceAction.clickSugaryCereal();
			Reporter.LogStepInfo("Eating Habbit breakfast: Sugary cereal");
	    }else if (Bfstoptions.equalsIgnoreCase("2")) {
	    	BreakfastChoiceAction.clickPorridge();
			Reporter.LogStepInfo("Eating Habbit breakfast: Plain porridge");
	    }else if (Bfstoptions.equalsIgnoreCase("3")) {
	    	BreakfastChoiceAction.clickCornFlakes();
			Reporter.LogStepInfo("Eating Habbit breakfast: Plain cereal e.g. Cornflakes");
	    }else if (Bfstoptions.equalsIgnoreCase("4")) {
	    	BreakfastChoiceAction.clickCereals();
			Reporter.LogStepInfo("Eating Habbit breakfast: Wholegrain cereal");
	    }	 
	    //BreakfastChoiceAction.clickNextBC();
	    OneYouLand.clickNext();
	    Thread.sleep(1000);
	    System.out.println("Break Fast Options done");
	    //Reporter.LogStepPass("Pass!! Breakfast options Selected");
	}
	

	public void Choose_my_favorite_cheese_out_of_given_options(HashMap<String, String> TData) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(BaseClass.driver, CheeseChoicePage.class);
		String cheeseoptions = TData.get("options_cheese");

		if (cheeseoptions.equalsIgnoreCase("1")) {
			CheeseChoiceAction.clickHardCheese();
			Reporter.LogStepInfo("Eating Habbit cheese: Hard cheese");
		}else if (cheeseoptions.equalsIgnoreCase("2")) {
			CheeseChoiceAction.clickCottageCheese();
			Reporter.LogStepInfo("Eating Habbit cheese: Cottage cheese");
		}else if (cheeseoptions.equalsIgnoreCase("3")) {
			CheeseChoiceAction.clickFatCheese();
			Reporter.LogStepInfo("Eating Habbit cheese: Lower fat hard cheese");
		}else if (cheeseoptions.equalsIgnoreCase("4")) {
			CheeseChoiceAction.clickVeganCheese();
			Reporter.LogStepInfo("Eating Habbit cheese: Low fat vegan cheese");
		}
		//CheeseChoiceAction.clickNextCC();
		OneYouLand.clickNext();
		Thread.sleep(1000);
		System.out.println("cheese options done");
	}
	
	public void Choose_my_favorite_NonVeg_item_from_the_available_options_and_click_next(HashMap<String, String> TData) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(BaseClass.driver, NonVegChoicesPages.class);
		String options_nv = TData.get("options_nv");
		if (options_nv.equalsIgnoreCase("1")) {
			NonVegChoicesAction.clickBurger();
			Reporter.LogStepInfo("Eating Habbit Non-Veg: Burger");
		}else if (options_nv.equalsIgnoreCase("2")) {
			NonVegChoicesAction.clickFish();
			Reporter.LogStepInfo("Eating Habbit Non-Veg: Fish");
		}else if (options_nv.equalsIgnoreCase("3")) {
			NonVegChoicesAction.clickHam();
			Reporter.LogStepInfo("Eating Habbit Non-Veg: Ham");
		}else if (options_nv.equalsIgnoreCase("4")) {
			NonVegChoicesAction.clickMeat();
			Reporter.LogStepInfo("Eating Habbit Non-Veg: Lean meat or meat substitute");
		}

		//NonVegChoicesAction.clickNextNC();
		OneYouLand.clickNext();
		Thread.sleep(1000);
		System.out.println("NonVeg options done");
		//Reporter.LogStepPass("Pass!! NonVeg options Selected");
	}
	
	public void Choose_servings_of_fruits_and_vegetables_from(HashMap<String, String> TData) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(BaseClass.driver, FruitsChoicesPage.class);
		String fruits_options = TData.get("options_fruits");
		if (fruits_options.equalsIgnoreCase("1")) {
			FruitChoiceActions.clickZero();
			Reporter.LogStepInfo("Eating Habbit No of servings: ZERO");
		}else if (fruits_options.equalsIgnoreCase("2")) {
			FruitChoiceActions.clickOne();
			Reporter.LogStepInfo("Eating Habbit No of servings: 1-2");
		}else if (fruits_options.equalsIgnoreCase("3")) {
			FruitChoiceActions.clickThree();
			Reporter.LogStepInfo("Eating Habbit No of servings: 3-4");
		}else if (fruits_options.equalsIgnoreCase("4")) {
			FruitChoiceActions.clickFive();
			Reporter.LogStepInfo("Eating Habbit No of servings: 5+");
		}
		//FruitChoiceActions.clickNextFrC();
		OneYouLand.clickNext();
		Thread.sleep(1000);
		System.out.println("fruits_options done");
	}
	
	public void Choose_my_favorite_snacks_from_given_options(HashMap<String, String> TData) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	  PageFactory.initElements(BaseClass.driver,SnacksChoicePage.class);
		String ReportingInfoSnak = "";

	  String snacks_options_ag = TData.get("options_snacks_ag");
		String delim=",";
	    String [] options_list= snacks_options_ag.split(delim);
	    int len=options_list.length;
	    Thread.sleep(1000);
	    for(int i=0;i<len;i++)
	    {
	    	if(options_list[i].equalsIgnoreCase("1")) {
	    		SnacksChoiceAction.clickFruit();
	    		ReportingInfoSnak = ReportingInfoSnak + ": Fruit";
	    	}else if(options_list[i].equalsIgnoreCase("2")) {
	    		SnacksChoiceAction.clickChocolate();
	    		ReportingInfoSnak = ReportingInfoSnak + ": Chocolate and sweets";
	    	}else if(options_list[i].equalsIgnoreCase("3")) {
	    		SnacksChoiceAction.clickCrisp();
	    		ReportingInfoSnak = ReportingInfoSnak + ": Crisps";
	    	}else if(options_list[i].equalsIgnoreCase("4")){
	    		SnacksChoiceAction.clickCakes();
	    		ReportingInfoSnak = ReportingInfoSnak + ": Cakes";
	    	}else if(options_list[i].equalsIgnoreCase("5")) {
	    		SnacksChoiceAction.clickBiscuits();
	    		ReportingInfoSnak = ReportingInfoSnak + ": Biscuits";
	    	}else if(options_list[i].equalsIgnoreCase("6")) {
	    		SnacksChoiceAction.clickTeaCakes();
	    		ReportingInfoSnak = ReportingInfoSnak + ": Teacakes";
	    	}else if(options_list[i].equalsIgnoreCase("7")) {
	    		SnacksChoiceAction.clickNuts();
	    		ReportingInfoSnak = ReportingInfoSnak + ": Unsalted nuts";
	    	}else if(options_list[i].equalsIgnoreCase("8")) {
	    		SnacksChoiceAction.clickToast();
	    		ReportingInfoSnak = ReportingInfoSnak + ": Toast with low fat spread";
	    	}else if(options_list[i].equalsIgnoreCase("9")) {
	    		SnacksChoiceAction.clickNone();
	    		ReportingInfoSnak = ReportingInfoSnak + ": None of these";
	    	}

	    }
	    JavascriptExecutor jse=(JavascriptExecutor)BaseClass.driver; 
	    jse.executeScript("window.scrollBy(0,250)", ""); Thread.sleep(1000);
	    Reporter.LogStepInfo("Daily Snaks   "+ReportingInfoSnak);
	    OneYouLand.clickNext();
	    Thread.sleep(1000);

	}
	public void ValidateParttwoOutPutMessage(HashMap<String, String> TData) {
		// Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(BaseClass.driver, HealthPriorties.class);
		String sAppMessages = "";
		List<WebElement> listOfmessages = BaseClass.driver.findElements(By.xpath("//div[@id='hay-container-embedded']//div[2]/div/p"));
	    for (int i=0; i<listOfmessages.size();i++){
	    	sAppMessages = sAppMessages + " " + listOfmessages.get(i).getText().trim();
	        System.out.println("message : --" + listOfmessages.get(i).getText());
	    }
	    System.out.println(sAppMessages);
	    System.out.println(TData.get("Part2_Message"));
	    if(sAppMessages.trim().equals(TData.get("Part2_Message").trim())) {
	    	Reporter.LogStepPass("Second step Message validation - pass");
	    }else {
	    	Reporter.LogStepFail("Second step Message validation fail--"+sAppMessages+"--------is not egaul to-------"+TData.get("Part2_Message").trim());
	    }
	    JavascriptExecutor jse=(JavascriptExecutor)BaseClass.driver; 
	    jse.executeScript("window.scrollBy(0,250)","");
	    OneYouLand.clickNext();
	    System.out.println("validate message two");
	}
	
	public void Select_frequency_of_alcohol_intake_and_click_Next(HashMap<String, String> TData) throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		PageFactory.initElements(BaseClass.driver, AlcoholIntakePage.class);
		String options_freq = TData.get("options_freq");
		String options_days = TData.get("options_days");
		String options_volume_WD = TData.get("options_volume_WD");
		String options_volume_WE = TData.get("options_volume_WE");
		
		if (options_freq.equalsIgnoreCase("1")) {
			AlcoholIntakeAction.clickMostly();
			DaysDrink(options_days);
			WeeklyDrinkVol("1", "WeekDays", options_volume_WD);
			JavascriptExecutor jse = (JavascriptExecutor)BaseClass.driver;
			jse.executeScript("window.scrollBy(0,250)", "");
			WeeklyDrinkVol("1", "WeekEnds", options_volume_WE);
			//AlcoholIntakeAction.clickNext_AI();
			Reporter.LogStepInfo("Drink : Most Weeks");
			OneYouLand.clickNext();
			
		}

		else if (options_freq.equalsIgnoreCase("2")) {
			AlcoholIntakeAction.clickTwoMonths();
			OneYouLand.clickNext();
			Thread.sleep(1000);
			WeeklyDrinkVol("2", "WeekDays", options_volume_WD);
			Reporter.LogStepInfo("Drink : 2-4 times in a month");
			OneYouLand.clickNext();
			Thread.sleep(1000);

		} 
		else if (options_freq.equalsIgnoreCase("3")) {
			AlcoholIntakeAction.clickOneMonth();
			OneYouLand.clickNext();
			Thread.sleep(1000);
			WeeklyDrinkVol("3", "WeekDays", options_volume_WD);
			Reporter.LogStepInfo("Drink : Monthly or less");
			OneYouLand.clickNext();
			Thread.sleep(500);
			//AlcoholIntakeAction.clickNoToDrink();
			//OneYouLand.clickNext();Thread.sleep(500);
			
			Thread.sleep(1000);
		}else if (options_freq.equalsIgnoreCase("4")) {
			AlcoholIntakeAction.clickNever();
			Reporter.LogStepInfo("Drink : Never");
			OneYouLand.clickNext();
			Thread.sleep(1000);
		}

	}
	
	public void ValidatePartThreeOutPutMessage(HashMap<String, String> TData) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(BaseClass.driver, HealthPriorties.class);
		String sAppMessages = "";
		List<WebElement> listOfmessages = BaseClass.driver.findElements(By.xpath("//div[@id='hay-container-embedded']//div[2]/div/p"));
	    for (int i=0; i<listOfmessages.size();i++){
	    	sAppMessages = sAppMessages + " " + listOfmessages.get(i).getText().trim();
	        System.out.println("message : --" + listOfmessages.get(i).getText());
	    }
	    System.out.println(sAppMessages);
	    System.out.println(TData.get("Part3_Message"));
	    if(sAppMessages.trim().equals(TData.get("Part3_Message").trim())) {
	    	Reporter.LogStepPass("Third step Message validation - pass");
	    }else {
	    	Reporter.LogStepFail("Third step Message validation fail--"+sAppMessages+"--is not egaul to "+TData.get("Part3_Message").trim());
	    }
		//	Reporter.LogStepPass("Pass !! You dont drink");
		OneYouLand.clickNext();
		Thread.sleep(1000);
		System.out.println("validate message three");
	}
	
	public void Choose_my_exercise_days_and_strength(HashMap<String, String> TData) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(BaseClass.driver,ExercisePage.class);
		String ReportingInfoexercise = "";

		String exer = TData.get("options_exercise");
		String[] options_days_list = exer.split(";");
		int len = options_days_list.length;
		int num = 0;
		
		for (int i = 0; i < len; i++) {
			String[] stregth_list = options_days_list[i].split(",");
			if (stregth_list[0].equalsIgnoreCase("1")) {
				num = Integer.parseInt(stregth_list[1]);
				ReportingInfoexercise = ReportingInfoexercise + ": Monday-"+num;
				ExerciseAction.dragMonday(num);
				Thread.sleep(500);
			} else if (stregth_list[0].equalsIgnoreCase("2")) {
				num = Integer.parseInt(stregth_list[1]);
				ReportingInfoexercise = ReportingInfoexercise + ": Tuesday-"+num;
				ExerciseAction.dragTuesday(num);
				Thread.sleep(500);
			} else if (stregth_list[0].equalsIgnoreCase("3")) {
				num = Integer.parseInt(stregth_list[1]);
				ReportingInfoexercise = ReportingInfoexercise + ": Wednesday-"+num;
				ExerciseAction.dragWednesday(num);
				Thread.sleep(500);
			} else if (stregth_list[0].equalsIgnoreCase("4")) {
				num = Integer.parseInt(stregth_list[1]);
				ReportingInfoexercise = ReportingInfoexercise + ": Thursday-"+num;
				ExerciseAction.dragThursday(num);
				Thread.sleep(500);
			} else if (stregth_list[0].equalsIgnoreCase("5")) {
				num = Integer.parseInt(stregth_list[1]);
				ReportingInfoexercise = ReportingInfoexercise + ": Friday-"+num;
				ExerciseAction.dragFriday(num);
				Thread.sleep(500);
			} else if (stregth_list[0].equalsIgnoreCase("6")) {
				num = Integer.parseInt(stregth_list[1]);
				ReportingInfoexercise = ReportingInfoexercise + ": Saturday-"+num;
				ExerciseAction.dragSaturday(num);
				Thread.sleep(500);
			} else if (stregth_list[0].equalsIgnoreCase("7")) {
				num = Integer.parseInt(stregth_list[1]);
				ReportingInfoexercise = ReportingInfoexercise + ": Sunday-"+num;
				ExerciseAction.dragSunday(num);
				Thread.sleep(500);
			}
		}
		OneYouLand.clickNext();Thread.sleep(900);
		System.out.println("exercise metrics done");
		Reporter.LogStepInfo("Every Day exercise "+ReportingInfoexercise);
		//ExerciseAction.clickNext_Ex();Thread.sleep(900);
	}
	
	
	public void Choose_my_strengthening_metrics(HashMap<String, String> TData) throws Throwable {	// Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(BaseClass.driver,StrengthPage.class);
		String ReportingInfoexeMetrx = "";

				String options_strength = TData.get("options_strength");

				String[] options_days_list = options_strength.split(";");
				int len = options_days_list.length;
				int num = 0;
				for (int i = 0; i < len; i++) {
					String[] stregth_list = options_days_list[i].split(",");
					
					if (stregth_list[0].equalsIgnoreCase("1")) {
						num = Integer.parseInt(stregth_list[1]);
						StrengthAction.dragMonday(num);
						ReportingInfoexeMetrx = ReportingInfoexeMetrx + ": Monday-"+num;
						Thread.sleep(500);
					} else if (stregth_list[0].equalsIgnoreCase("2")) {
						num = Integer.parseInt(stregth_list[1]);
						StrengthAction.dragTuesday(num);
						ReportingInfoexeMetrx = ReportingInfoexeMetrx + ": Tuesday-"+num;
						Thread.sleep(500);
					} else if (stregth_list[0].equalsIgnoreCase("3")) {
						num = Integer.parseInt(stregth_list[1]);
						StrengthAction.dragWednesday(num);
						ReportingInfoexeMetrx = ReportingInfoexeMetrx + ": Wednesday-"+num;
						Thread.sleep(500);
					} else if (stregth_list[0].equalsIgnoreCase("4")) {
						num = Integer.parseInt(stregth_list[1]);
						StrengthAction.dragThursday(num);
						ReportingInfoexeMetrx = ReportingInfoexeMetrx + ": Thursday-"+num;
						Thread.sleep(500);
					} else if (stregth_list[0].equalsIgnoreCase("5")) {
						num = Integer.parseInt(stregth_list[1]);
						StrengthAction.dragFriday(num);
						ReportingInfoexeMetrx = ReportingInfoexeMetrx + ": Friday-"+num;
						Thread.sleep(500);
					} else if (stregth_list[0].equalsIgnoreCase("6")) {
						num = Integer.parseInt(stregth_list[1]);
						StrengthAction.dragSaturday(num);
						ReportingInfoexeMetrx = ReportingInfoexeMetrx + ": Saturday-"+num;
						Thread.sleep(500);
					} else if (stregth_list[0].equalsIgnoreCase("7")) {
						num = Integer.parseInt(stregth_list[1]);
						StrengthAction.dragSunday(num);
						ReportingInfoexeMetrx = ReportingInfoexeMetrx + ": Sunday-"+num;
						Thread.sleep(500);
					}
				}
				JavascriptExecutor jse = (JavascriptExecutor)BaseClass.driver;
				jse.executeScript("window.scrollBy(0,250)", ""); Thread.sleep(600);
				Reporter.LogStepInfo("Every Day exercise "+ReportingInfoexeMetrx);
				OneYouLand.clickNext();Thread.sleep(500);

				System.out.println("strengthening metrics done");
				//StrengthAction.clickNext_St();Thread.sleep(500);
			}
	
	
	public void ValidatePartFourOutPutMessage(HashMap<String, String> TData) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(BaseClass.driver, HealthPriorties.class);
		String sAppMessages = "";
		List<WebElement> listOfmessages = BaseClass.driver.findElements(By.xpath("//div[@id='hay-container-embedded']//div[2]/div/p"));
	    for (int i=0; i<listOfmessages.size();i++){
	    	sAppMessages = sAppMessages + " " + listOfmessages.get(i).getText().trim();
	        System.out.println("message : --" + listOfmessages.get(i).getText());
	    }
	    System.out.println(sAppMessages);
	    System.out.println(TData.get("Part4_Message"));
	    if(sAppMessages.trim().equals(TData.get("Part4_Message").trim())) {
	    	Reporter.LogStepPass("Fourth step Message validation - pass");
	    }else {
	    	Reporter.LogStepFail("Fourth step Message validation fail--"+sAppMessages+"--is not egaul to "+TData.get("Part4_Message").trim());
	    }
		//	Reporter.LogStepPass("Pass !! You dont drink");
		JavascriptExecutor jse1 = (JavascriptExecutor)BaseClass.driver;
		jse1.executeScript("window.scrollBy(0,250)", ""); Thread.sleep(600);
		OneYouLand.clickNext();Thread.sleep(500);
		Thread.sleep(1000);
		System.out.println("validate message four");
	}
	public void About_my_smoking_habbits(HashMap<String, String> TData) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    PageFactory.initElements(BaseClass.driver,SmokePage.class);
	    String options_smoke = TData.get("options_smoke");
	    if (options_smoke.equalsIgnoreCase("1")) {
	    	Reporter.LogStepInfo("Smoke : Everyday");
			SmokeAction.selectEveryDay();}
		else if (options_smoke.equalsIgnoreCase("2")) {
			Reporter.LogStepInfo("Smoke : Not Everyday");
			SmokeAction.selectSometimes();}
		else if (options_smoke.equalsIgnoreCase("3")) {
			Reporter.LogStepInfo("Smoke : You have quit");
			SmokeAction.selectQuit();}
		else if (options_smoke.equalsIgnoreCase("4")) {
			Reporter.LogStepInfo("Smoke : Never");
			SmokeAction.selectNeverHad();}

	    OneYouLand.clickNext();
		Thread.sleep(1000);

		System.out.println("smoking habbits done");

	}
	
	public void ValidateSmokingOutPutMessage(HashMap<String, String> TData) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(BaseClass.driver, HealthPriorties.class);
		String sAppMessages = "";
		List<WebElement> listOfmessages = BaseClass.driver.findElements(By.xpath("//div[@id='hay-container-embedded']//div[2]/div/p"));
	    for (int i=0; i<listOfmessages.size();i++){
	    	sAppMessages = sAppMessages + " " + listOfmessages.get(i).getText().trim();
	        System.out.println("message : --" + listOfmessages.get(i).getText());
	    }
	    System.out.println(sAppMessages);
	    System.out.println(TData.get("AfterSmoke_Message"));
	    if(sAppMessages.trim().equals(TData.get("AfterSmoke_Message").trim())) {
	    	Reporter.LogStepPass("AfterSmoke_Message validation - pass");
	    }else {
	    	Reporter.LogStepFail("AfterSmoke_Message validation fail--"+sAppMessages+"--is not egaul to "+TData.get("AfterSmoke_Message").trim());
	    }
		//	Reporter.LogStepPass("Pass !! You dont drink");
		JavascriptExecutor jse1 = (JavascriptExecutor)BaseClass.driver;
		jse1.executeScript("window.scrollBy(0,250)", ""); Thread.sleep(600);
		OneYouLand.clickNext();Thread.sleep(500);
		Thread.sleep(1000);
		System.out.println("validate message four");
	}
	
	public void Do_not_opt_for_sign_up() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	PageFactory.initElements(BaseClass.driver, ResultPage.class);
	
	JavascriptExecutor jse = (JavascriptExecutor)BaseClass.driver;
	jse.executeScript("window.scrollBy(0,250)", ""); Thread.sleep(600);

	clickNoThanks();
		
	   
	}


	public void Land_on_Result_Page_with_the_score(HashMap<String, String> TData) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
		String expScore = TData.get("expScore");
		Thread.sleep(1000);
		PageFactory.initElements(BaseClass.driver, ResultPage.class);
		findChild(expScore);
//		Reporter.LogStepPass("Pass !! Your Score" + expScore);
	}

	public void Validate_messages_against_each_section(HashMap<String, String> TData) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(BaseClass.driver, ResultPage.class);
		PageFactory.initElements(BaseClass.driver, ReadPropertiesFile.class);
		ReadPropertiesFile rp=new ReadPropertiesFile();
		
		//** Moving text validation*****//
		String exMove=TData.get("Moving");
		JavascriptExecutor jse = (JavascriptExecutor)BaseClass.driver;
		jse.executeScript("window.scrollBy(0,120)", ""); Thread.sleep(600);
		validateMovingContent(exMove);
		
		//***Eating*************/
		
		String exEating=TData.get("Eating");
		jse.executeScript("window.scrollBy(0,230)", ""); Thread.sleep(600);
		validateEatingContent(exEating);
		
		//****Drinking*********//
		String exDrinking=TData.get("Drinking");
		validateDrinkingContent(exDrinking);
		
		//********Smoking********//
		String exSmoking=TData.get("Smoking");
		validateSmokingContent(exSmoking);
	}
	
	
	public void CloseApplication() throws Throwable {
		Reporter.LogStepInfo("Closing the application");
		BaseClass.driver.close();
		BaseClass.driver.quit();

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void DaysDrink(String days) throws Throwable {

		String delim = ",";
		String[] options_days_list = days.split(delim);
		int len = options_days_list.length;
		for (int i = 0; i < len; i++) {
			if (options_days_list[i].equalsIgnoreCase("1")) {
				AlcoholIntakeAction.clicMonday();
			}
			else if (options_days_list[i].equalsIgnoreCase("2")) {
				AlcoholIntakeAction.clickTuesday();
			}
			else if (options_days_list[i].equalsIgnoreCase("3")) {
				AlcoholIntakeAction.clicWednesday();}
			else if (options_days_list[i].equalsIgnoreCase("4")) {
				AlcoholIntakeAction.clickThursday();}
			else if (options_days_list[i].equalsIgnoreCase("5")) {
				AlcoholIntakeAction.clickFriday();}
			else if (options_days_list[i].equalsIgnoreCase("6")) {
				AlcoholIntakeAction.clicSaturday();}
			else if (options_days_list[i].equalsIgnoreCase("7")) {
				AlcoholIntakeAction.clicSunday();}
			else {
				Reporter.LogStepFail("Please choose atleast one option" + getClass());
			}
			
			JavascriptExecutor jse = (JavascriptExecutor) driver; 
			jse.executeScript("window.scrollBy(0,250)", "");
			Thread.sleep(1000);
			
			

		}
		AlcoholIntakeAction.clickNext_AI();Thread.sleep(1000);

	}

	public void WeeklyDrinkVol(String called, String day, String volume) throws InterruptedException {
		String delim = ";";
		String NoDriking = "no";
		String[] drink_list = volume.split(delim);
		int drink_len = drink_list.length;
		if (day.equalsIgnoreCase("WeekDays") & called.equalsIgnoreCase("1")) {
			for (int j = 0; j < drink_len; j++) {
				String[] vol_list = drink_list[j].split(",");

				if (vol_list[0].equalsIgnoreCase("1")) {
					AlcoholIntakeAction.clickBeer4VolWD(vol_list[1]);				
				}
				else if (vol_list[0].equalsIgnoreCase("2")) {
					AlcoholIntakeAction.clickBeer4VolWD(vol_list[1]);	
				}
				else if (vol_list[0].equalsIgnoreCase("3")) {
					AlcoholIntakeAction.clickBeer4VolWD(vol_list[1]);	
				}
				else if (vol_list[0].equalsIgnoreCase("4")) {
					AlcoholIntakeAction.clickBeer4VolWD(vol_list[1]);	
				}
				else {
					Reporter.LogStepFail("Wrong Input" + getClass());
				}
			}
		

		}

		else if ((day.equalsIgnoreCase("WeekDays") & (called.equalsIgnoreCase("2") | called.equalsIgnoreCase("3")))) {
			for (int j = 0; j < drink_len; j++) {
				String[] vol_list = drink_list[j].split(",");

				if (vol_list[0].equalsIgnoreCase("1")) {
					if(!vol_list[1].equals("0")) {
						AlcoholIntakeAction.clickBeer4VolOcc(vol_list[1]);
						NoDriking = "Yes";
					}	
				}else if (vol_list[0].equalsIgnoreCase("2")) {
					if(!vol_list[1].equals("0")) {
						AlcoholIntakeAction.clickBeer4VolOcc(vol_list[1]);
						NoDriking = "Yes";
					}
				}else if (vol_list[0].equalsIgnoreCase("3")) {
					if(!vol_list[1].equals("0")) {
						AlcoholIntakeAction.clickBeer4VolOcc(vol_list[1]);
						NoDriking = "Yes";
					}
				}else if (vol_list[0].equalsIgnoreCase("4")) {
					if(!vol_list[1].equals("0")) {
						AlcoholIntakeAction.clickBeer4VolOcc(vol_list[1]);
						NoDriking = "Yes";
					}
				}else {
					Reporter.LogStepFail("Wrong Input" + getClass());
				}
			}
			if(NoDriking.equals("no")) {
			    OneYouLand.clickNext();
				AlcoholIntakeAction.clickNever();
			}
			
		} else if (day.equalsIgnoreCase("Weekends")) {
			for (int j = 0; j < drink_len; j++) {
				String[] vol_list = drink_list[j].split(",");
				try {
					if (vol_list[0].equalsIgnoreCase("1"))
						AlcoholIntakeAction.clickBeer4VolWE(vol_list[1]);
					else if (vol_list[0].equalsIgnoreCase("2"))
						AlcoholIntakeAction.clickBeer5VolWE(vol_list[1]);
					else if (vol_list[0].equalsIgnoreCase("3"))
						AlcoholIntakeAction.clickSpiritVolWE(vol_list[1]);
					else if (vol_list[0].equalsIgnoreCase("4"))
						AlcoholIntakeAction.clickWineVolWE(vol_list[1]);
					else
						Reporter.LogStepFail("Wrong Input" + getClass());

				}

				catch (Exception e) {
					e.getStackTrace();
				}
			}
		}
	}
	
	public static void clickNoThanks() {
		JavascriptExecutor executor = (JavascriptExecutor)BaseClass.driver;
		executor.executeScript("arguments[0].click();", ResultPage.noThanks);
		//ResultPage.noThanks.click();
	}
	
	public void findChild(String expScore) throws Exception {

		String score = ResultPage.finalScore.getAttribute("class");
		
		System.out.println("SCORE" + score.substring(score.length()-2) );
		String scores = (score.replace("hay-results__score hay-results__score--",""));
		System.out.println(scores + "=="+expScore);
		if (scores.equals(expScore)) {
			System.out.println("Score Matched");
			Reporter.LogStepPass("Score Matched :" + scores);
			
		}else {
			System.out.println("Score Mismatch");
			Reporter.LogStepFail("Score Mismatched :" + scores);
		}
		System.out.println("Score" + scores);
	}
	
	public void validateMovingContent(String exMoving) {

		//pass the path captured by this mehtod in to the extent reports 
		 
		String text1 = ResultPage.scoreMoving.getText();
		
		System.out.println("Expected text-" + exMoving + "/n" + "ActualText-" + text1);
		if (text1.trim().equals(exMoving.trim())) {
			Reporter.LogStepPass("Content validation of Moving section on result page is passed");
		} else {
			Reporter.LogStepFail("Content validation of Moving section on result page is failed");			
		}
	}
	
	public void validateEatingContent(String exEating) {

		String text1 = ResultPage.scoreEating.getAttribute("innerHTML").toString();
		System.out.println("Expected text-" + exEating + "/n" + "ActualText-" + text1);
		if (text1.trim().equals(exEating.trim())) {
			Reporter.LogStepPass("Content validation of Eating section on result page is passed");
		} else {
			Reporter.LogStepFail("Content validation of Eating section on result page is failed");
		}
	}
	
	public void validateDrinkingContent(String exDrinking) {

		String text1 = ResultPage.scoreDrinking.getText();
		System.out.println("Expected text-" + exDrinking + "/n" + "ActualText-" + text1);
		if (text1.trim().equals(exDrinking.trim())) {
			Reporter.LogStepPass("Content validation of Drinking section on result page is passed");
		} else {
			Reporter.LogStepFail("Content validation of Drinking section on result page is failed");
		}
	}
	
	
	public void validateSmokingContent(String exSmoking) {

		String text1 = ResultPage.scoreSmoking.getText();
		System.out.println("Expected text-" + exSmoking + "/n" + "ActualText-" + text1);
		if (text1.trim().equals(exSmoking.trim())) {
			Reporter.LogStepPass("Content validation of Smoking section on result page is passed");
		} else {
			Reporter.LogStepFail("Content validation of Smoking section on result page is failed");
		}
	}
	
	
	
	/*
	 * Method : TakeScreenshot
	 * Dated : 09/03/2020
	 * Description : This function is used to capture screenshot and save it on desired location
	 * 
	 * */
	
	public static String takeScreenshot(WebDriver driver,String screenShotName) throws IOException
	{
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		//Call getScreenshotAs method to create image file
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		//Move image file to new destination
		
		//Copy file at destination
		String destination = System.getProperty("user.dir") + "/FailedTestsScreenshots/"+screenShotName+dateName+".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(SrcFile, finalDestination);
		return destination;
		 
	}
}
