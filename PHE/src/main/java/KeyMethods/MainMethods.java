package KeyMethods;



import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

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
	
	
	JavascriptExecutor jse=(JavascriptExecutor)BaseClass.driver; 
	
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
		    Reporter.LogStepPass("Survey Started for : " + TData.get("Name"));
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
		Reporter.LogStepPass("Health Info : "+ "\n" + "ReallyKnackered : " + TData.get("ReallyKnackered") + "\n" + "CanRunForMiles :\n " + TData.get("CanRunForMiles") +" FeelingCalm :\n " + TData.get("FeelingCalm") +"SleeplessNights :\n " + TData.get("SleeplessNights") +" LeanMean :\n " + TData.get("LeanMean") +"DownDump : \n " + TData.get("DownDump"));
	}
	
	
	
	public void Select_options_from_What_Stops_you_taking_care_of_yourself(HashMap<String, String> TData) throws Throwable {

	    // Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(BaseClass.driver, TakingCarePage.class);
		String options = TData.get("options");
	 String delim=",";
	 String [] split_options=options.split(delim);
		int len = split_options.length;
		for (int i = 0; i < len; i++) {
			if (split_options[i].equalsIgnoreCase("1")) {
				
				TakeCareAction.selectIDontHaveTime();
				 Reporter.LogStepPass("Taking Care Option : I don't have the time");
			}else if (split_options[i].equalsIgnoreCase("2")) {
				TakeCareAction.selectILookAfterOthers();
				Reporter.LogStepPass("Taking Care Option : It's more important I look after others");
			}else if (split_options[i].equalsIgnoreCase("3")) {
				TakeCareAction.selectIDontKnowWhatToDo();
				Reporter.LogStepPass("Taking Care Option : I don't know what to do");
			}else if (split_options[i].equalsIgnoreCase("4")) {
				TakeCareAction.selectIDontHaveTheMoney();	
				Reporter.LogStepPass("Taking Care Option : I don't have the money");
			}else if (split_options[i].equalsIgnoreCase("5")) {
				TakeCareAction.selectIStartCantKeepUp();	
				Reporter.LogStepPass("Taking Care Option : I start but can't keep up");
			}else if (split_options[i].equalsIgnoreCase("6")) {
				TakeCareAction.selectIllDisabled();
				OneYouLand.clickNext();
				TakeCareAction.ValidateDisableMessage();
				Reporter.LogStepPass("Taking Care Option : I'm ill or disabled");
			}else if (split_options[i].equalsIgnoreCase("7")) {
				TakeCareAction.selectITakeGoodCare();	
				Reporter.LogStepPass("Taking Care Option : Nothing - I take good care of myself");
			}
		}

		JavascriptExecutor jse=(JavascriptExecutor)BaseClass.driver; 
		jse.executeScript("window.scrollBy(0,250)", "");
		//TakeCareAction.clickNext();		
		OneYouLand.clickNext();
		
	}
	
	
	public void Choose_who_all_depend_on_me_for_being_healthy(HashMap<String, String> TData)
	{
		PageFactory.initElements(BaseClass.driver,pageobjects.BeingHealthy.class);
		String choices = TData.get("options_dependents");
		String delim=",";
		 String [] split_options=choices.split(delim);
			int len = split_options.length;
			for (int i = 0; i < len; i++) {
				if (split_options[i].equalsIgnoreCase("1")) {
					BeingHealthyAction.selectMyPartner();
					Reporter.LogStepPass("Dependents : My partner");
				}
				else if (split_options[i].equalsIgnoreCase("2")) {
				BeingHealthyAction.selectMyKids();
				Reporter.LogStepPass("Dependents :My kids");
				}

				else if (split_options[i].equalsIgnoreCase("3")) {
					BeingHealthyAction.selectMyParents();
					Reporter.LogStepPass("Dependents : My parents");
				}

				else if (split_options[i].equalsIgnoreCase("4")) {
					BeingHealthyAction.selectMyGrandChildren();
					Reporter.LogStepPass("Dependents : My grandkids");
				}
				else if (split_options[i].equalsIgnoreCase("5")) {
					BeingHealthyAction.selectMyCloseFriends();
					Reporter.LogStepPass("Dependents : My close friends");
				}

				else if (split_options[i].equalsIgnoreCase("6")) {
					BeingHealthyAction.selectMyCloseFriends();
					Reporter.LogStepPass("Dependents : My close friends");
					}
				
				else if (split_options[i].equalsIgnoreCase("7")) {
					BeingHealthyAction.selectMyBrotherSister();
					Reporter.LogStepPass("Dependents : My brothers and sisters");
				}
				
				else if (split_options[i].equalsIgnoreCase("8")) {
					BeingHealthyAction.selectMyPets();
					Reporter.LogStepPass("Dependents : My pets");
				}
				
				else if (split_options[i].equalsIgnoreCase("9")) {
					BeingHealthyAction.selectNone();		
					Reporter.LogStepPass("Dependents : None of these");
				}
			  
		 }
			OneYouLand.clickNext();
			
	}
	
	
	public void Identify_top_three_health_priorities_from_the_given_options(HashMap<String, String> TData) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(BaseClass.driver, HealthPriorties.class);
		String Priorityoptions = TData.get("options_priorities");
		String delim = ",";
		String[] split_options = Priorityoptions.split(delim);
		int len = split_options.length;
		for (int i = 0; i < len; i++) {
			if (split_options[i].equalsIgnoreCase("1")) {
				HealthPrioritiesAction.selectFittingJeans();
			Reporter.LogStepPass("Health Priorities : Fitting into my jeans");
			}
			else if (split_options[i].equalsIgnoreCase("2")) {
				HealthPrioritiesAction.selectMorweEnergy();
				Reporter.LogStepPass("Health Priorities : Having more energy");
			}
			else if (split_options[i].equalsIgnoreCase("3")) {
				HealthPrioritiesAction.selectAchespain();
				Reporter.LogStepPass("Health Priorities : Avoiding aches and pains");
			}
			else if (split_options[i].equalsIgnoreCase("4")) {
				HealthPrioritiesAction.selectFeelingYoung();
				Reporter.LogStepPass("Health Priorities : Feeling young");
			}
			else if (split_options[i].equalsIgnoreCase("5")) {
				HealthPrioritiesAction.selectStayIndependent();
				Reporter.LogStepPass("Health Priorities : Staying independent");
			}
			else if (split_options[i].equalsIgnoreCase("6")) {
				HealthPrioritiesAction.selectMindSharp();
				Reporter.LogStepPass("Health Priorities : Keeping my mind sharp");
			}
			else if (split_options[i].equalsIgnoreCase("7")) {
				HealthPrioritiesAction.selectSocialLife();
				Reporter.LogStepPass("Health Priorities : Having a more active social life");
			}
			else if (split_options[i].equalsIgnoreCase("8"))
			{
				HealthPrioritiesAction.selectYoungLooking();
				Reporter.LogStepPass("Health Priorities : Staying young looking");
			}
			else if (split_options[i].equalsIgnoreCase("9")) {
				HealthPrioritiesAction.selectForKids();
				Reporter.LogStepPass("Health Priorities : Being there for my kids and grandkids");
			}

		}
		JavascriptExecutor jse=(JavascriptExecutor)BaseClass.driver; 
		jse.executeScript("window.scrollBy(0,250)", ""); Thread.sleep(1000);
		//TakeCareAction.clickNext(); Thread.sleep(1000);
		jse.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(1000);
		OneYouLand.clickNext();
		Reporter.LogStepPass("Pass!! Health Priorities");
		//HealthPrioritiesAction.clickNextPage();		
	}
	
	
	public void ValidatePartOneOutPutMessage(HashMap<String, String> TData) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(BaseClass.driver, HealthPriorties.class);
		String sAppMessages = "";
		List<WebElement> listOfmessages = BaseClass.driver.findElements(By.xpath("//div[@id='hay-container-embedded']//div[2]/div/p"));
	    for (int i=0; i<listOfmessages.size();i++){
	    	sAppMessages = sAppMessages + " " + listOfmessages.get(i).getText().trim();
	        System.out.println("message : --" + listOfmessages.get(i).getText());
	    }
	    System.out.println(sAppMessages);
	    System.out.println(TData.get("Part1_Message"));
	    if(!sAppMessages.equals(TData.get("Part1_Message").trim())) {
	    	 //logger = extent.startTest("passTest");
//	    	 Assert.assertTrue(true);
//	    	 //To generate the log when the test case is passed
//	    	 logger.log(Status.INFO, "Test Case Passed is passTest");
	    	Reporter.LogStepPass("Message validation step");
	    }else {
	    	 //logger = extent.startTest("passTest");
//	    	 //Assert.assertTrue(true);
//	    	 //To generate the log when the test case is passed
//	    	 logger.log(Status.FAIL, "Test Case Failed");
	    	Reporter.LogStepFail("Message validation step");
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
			if (split_options[i].equalsIgnoreCase("1"))
				DrinkChoiceAction.selectSugarDrinks();
			else if (split_options[i].equalsIgnoreCase("2"))
				DrinkChoiceAction.selectDietDrinks();
			else if (split_options[i].equalsIgnoreCase("3"))
				DrinkChoiceAction.selectWater();
			else if (split_options[i].equalsIgnoreCase("4"))
				DrinkChoiceAction.selectTea();
		}
		JavascriptExecutor jse=(JavascriptExecutor)BaseClass.driver; 
		jse.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(1000);
		OneYouLand.clickNext();
		Reporter.LogStepPass("Pass!! Favourite Drinks Selected");
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
			if (split_options[i].equalsIgnoreCase("1"))
				FoodChoiceAction.clickChips();
			else if (split_options[i].equalsIgnoreCase("2"))
				FoodChoiceAction.clickBPotato();
			else if (split_options[i].equalsIgnoreCase("3"))
				FoodChoiceAction.clickRPotato();
			else if (split_options[i].equalsIgnoreCase("4"))
				FoodChoiceAction.clickJPotato();
		}
		OneYouLand.clickNext();
		Thread.sleep(1000);
		Reporter.LogStepPass("Pass!! Favourite Snacks Selected");
	}
	
	public void Choose_my_favorite_breakfast_out_of_given_options(HashMap<String, String> TData) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    PageFactory.initElements(BaseClass.driver, BreakfastChoicePage.class);
	    String Bfstoptions = TData.get("options_bfast");
	    if (Bfstoptions.equalsIgnoreCase("1"))
	    	BreakfastChoiceAction.clickSugaryCereal();
	    else if (Bfstoptions.equalsIgnoreCase("2"))
	    	BreakfastChoiceAction.clickPorridge();
	    else if (Bfstoptions.equalsIgnoreCase("3"))
	    	BreakfastChoiceAction.clickCornFlakes();
	    else if (Bfstoptions.equalsIgnoreCase("4"))
	    	BreakfastChoiceAction.clickCereals();   
	 
	    
	    //BreakfastChoiceAction.clickNextBC();
	    OneYouLand.clickNext();
	    Thread.sleep(1000);
	    System.out.println("Break Fast Options done");
	    Reporter.LogStepPass("Pass!! Breakfast options Selected");
	}
	

	public void Choose_my_favorite_cheese_out_of_given_options(HashMap<String, String> TData) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(BaseClass.driver, CheeseChoicePage.class);
		String cheeseoptions = TData.get("options_cheese");

		if (cheeseoptions.equalsIgnoreCase("1"))
			CheeseChoiceAction.clickHardCheese();
		else if (cheeseoptions.equalsIgnoreCase("2"))
			CheeseChoiceAction.clickCottageCheese();
		else if (cheeseoptions.equalsIgnoreCase("3"))
			CheeseChoiceAction.clickFatCheese();
		else if (cheeseoptions.equalsIgnoreCase("4"))
			CheeseChoiceAction.clickVeganCheese();

		//CheeseChoiceAction.clickNextCC();
		OneYouLand.clickNext();
		Thread.sleep(1000);

		System.out.println("cheese options done");
	}
	
	public void Choose_my_favorite_NonVeg_item_from_the_available_options_and_click_next(HashMap<String, String> TData) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(BaseClass.driver, NonVegChoicesPages.class);
		String options_nv = TData.get("options_nv");
		if (options_nv.equalsIgnoreCase("1"))
			NonVegChoicesAction.clickBurger();
		else if (options_nv.equalsIgnoreCase("2"))
			NonVegChoicesAction.clickFish();
		else if (options_nv.equalsIgnoreCase("3"))
			NonVegChoicesAction.clickHam();
		else if (options_nv.equalsIgnoreCase("4"))
			NonVegChoicesAction.clickMeat();

		//NonVegChoicesAction.clickNextNC();
		OneYouLand.clickNext();
		Thread.sleep(1000);
		System.out.println("NonVeg options done");
		Reporter.LogStepPass("Pass!! NonVeg options Selected");
	}
	
	public void Choose_servings_of_fruits_and_vegetables_from(HashMap<String, String> TData) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(BaseClass.driver, FruitsChoicesPage.class);
		String fruits_options = TData.get("options_fruits");
		if (fruits_options.equalsIgnoreCase("1"))
			FruitChoiceActions.clickZero();
		else if (fruits_options.equalsIgnoreCase("2"))
			FruitChoiceActions.clickOne();
		else if (fruits_options.equalsIgnoreCase("3"))
			FruitChoiceActions.clickThree();
		else if (fruits_options.equalsIgnoreCase("4"))
			FruitChoiceActions.clickFive();

		//FruitChoiceActions.clickNextFrC();
		OneYouLand.clickNext();
		Thread.sleep(1000);
		System.out.println("fruits_options done");
	}
	
	public void Choose_my_favorite_snacks_from_given_options(HashMap<String, String> TData) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	  PageFactory.initElements(BaseClass.driver,SnacksChoicePage.class);
	  String snacks_options_ag = TData.get("options_snacks_ag");
		String delim=",";
	    String [] options_list= snacks_options_ag.split(delim);
	    int len=options_list.length;
	    Thread.sleep(1000);
	    for(int i=0;i<len;i++)
	    {
	    	if(options_list[i].equalsIgnoreCase("1"))
	    		SnacksChoiceAction.clickFruit();
	    	else if(options_list[i].equalsIgnoreCase("2"))
	    		SnacksChoiceAction.clickChocolate();
	    	else if(options_list[i].equalsIgnoreCase("3"))
	    		SnacksChoiceAction.clickCrisp();
	    	else if(options_list[i].equalsIgnoreCase("4"))
	    		SnacksChoiceAction.clickCakes();
	    	else if(options_list[i].equalsIgnoreCase("5"))
	    		SnacksChoiceAction.clickBiscuits();
	    	else if(options_list[i].equalsIgnoreCase("6"))
	    		SnacksChoiceAction.clickTeaCakes();
	    	else if(options_list[i].equalsIgnoreCase("7"))
	    		SnacksChoiceAction.clickNuts();
	    	else if(options_list[i].equalsIgnoreCase("8"))
	    		SnacksChoiceAction.clickToast();
	    	else if(options_list[i].equalsIgnoreCase("9"))
	    		SnacksChoiceAction.clickNone();
	    }
	    JavascriptExecutor jse=(JavascriptExecutor)BaseClass.driver; 
	    jse.executeScript("window.scrollBy(0,250)", ""); Thread.sleep(1000);
	    //SnacksChoiceAction.clickNext_SC();
	    OneYouLand.clickNext();
	    Thread.sleep(1000);
	    jse.executeScript("window.scrollBy(0,250)","");
	    //SnacksChoiceAction.clickNext_SC();
	    OneYouLand.clickNext();
	    System.out.println("snacks_options_ag done");
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
			Reporter.LogStepPass("Pass !! You Drink : Most Weeks");
			OneYouLand.clickNext();
			
		}

		else if (options_freq.equalsIgnoreCase("2")) {
			AlcoholIntakeAction.clickTwoMonths();
			OneYouLand.clickNext();
			Thread.sleep(1000);
			WeeklyDrinkVol("2", "WeekDays", options_volume_WD);
			Reporter.LogStepPass("Pass !! You Drink : 2-4 times in a month");
			OneYouLand.clickNext();
			Thread.sleep(1000);

		} 
		else if (options_freq.equalsIgnoreCase("3")) {
			AlcoholIntakeAction.clickOneMonth();
			OneYouLand.clickNext();
			Thread.sleep(1000);
			WeeklyDrinkVol("3", "WeekDays", options_volume_WD);
			Reporter.LogStepPass("Pass !! You Drink : MOnthly or less");
			OneYouLand.clickNext();
			Thread.sleep(500);
			//AlcoholIntakeAction.clickNoToDrink();
			//OneYouLand.clickNext();Thread.sleep(500);
			
			Thread.sleep(1000);
		}

		else if (options_freq.equalsIgnoreCase("4"))
		OneYouLand.clickNext();
		Thread.sleep(1000);
	//	Reporter.LogStepPass("Pass !! You dont drink");
		OneYouLand.clickNext();
		Thread.sleep(1000);
		System.out.println("Alcohol Frequency done");
	}
	
	
	
	public void Choose_my_exercise_days_and_strength(HashMap<String, String> TData) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(BaseClass.driver,ExercisePage.class);

		String exer = TData.get("options_exercise");
		String[] options_days_list = exer.split(";");
		int len = options_days_list.length;
		int num = 0;
		
		for (int i = 0; i < len; i++) {
			String[] stregth_list = options_days_list[i].split(",");
			if (stregth_list[0].equalsIgnoreCase("1")) {
				num = Integer.parseInt(stregth_list[1]);
				ExerciseAction.dragMonday(num);
				// width = ExercisePage.mondayExercise.
			   // Actions act = new Actions(BaseClass.driver);
			   // act.moveToElement(ExercisePage.mondayExercise).moveByOffset((width/2)-2, 0).click().perform();
				
				
				Thread.sleep(500);
			} else if (stregth_list[0].equalsIgnoreCase("2")) {
				num = Integer.parseInt(stregth_list[1]);
				ExerciseAction.dragTuesday(num);
				Thread.sleep(500);
			} else if (stregth_list[0].equalsIgnoreCase("3")) {
				num = Integer.parseInt(stregth_list[1]);
				ExerciseAction.dragWednesday(num);
				Thread.sleep(500);
			} else if (stregth_list[0].equalsIgnoreCase("4")) {
				num = Integer.parseInt(stregth_list[1]);
				ExerciseAction.dragThursday(num);
				Thread.sleep(500);
			} else if (stregth_list[0].equalsIgnoreCase("5")) {
				num = Integer.parseInt(stregth_list[1]);
				ExerciseAction.dragFriday(num);
				Thread.sleep(500);
			} else if (stregth_list[0].equalsIgnoreCase("6")) {
				num = Integer.parseInt(stregth_list[1]);
				ExerciseAction.dragSaturday(num);
				Thread.sleep(500);
			} else if (stregth_list[0].equalsIgnoreCase("7")) {
				num = Integer.parseInt(stregth_list[1]);
				ExerciseAction.dragSunday(num);
				Thread.sleep(500);
			}
		}
		OneYouLand.clickNext();Thread.sleep(900);
		System.out.println("exercise metrics done");
		//ExerciseAction.clickNext_Ex();Thread.sleep(900);
	}
	
	
	public void Choose_my_strengthening_metrics(HashMap<String, String> TData) throws Throwable {	// Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(BaseClass.driver,StrengthPage.class);

				String options_strength = TData.get("options_strength");

				String[] options_days_list = options_strength.split(";");
				int len = options_days_list.length;
				int num = 0;
				for (int i = 0; i < len; i++) {
					String[] stregth_list = options_days_list[i].split(",");
					
					if (stregth_list[0].equalsIgnoreCase("1")) {
						num = Integer.parseInt(stregth_list[1]);
						StrengthAction.dragMonday(num);
						Thread.sleep(500);
					} else if (stregth_list[0].equalsIgnoreCase("2")) {
						num = Integer.parseInt(stregth_list[1]);
						StrengthAction.dragTuesday(num);
						Thread.sleep(500);
					} else if (stregth_list[0].equalsIgnoreCase("3")) {
						num = Integer.parseInt(stregth_list[1]);
						StrengthAction.dragWednesday(num);
						Thread.sleep(500);
					} else if (stregth_list[0].equalsIgnoreCase("4")) {
						num = Integer.parseInt(stregth_list[1]);
						StrengthAction.dragThursday(num);
						Thread.sleep(500);
					} else if (stregth_list[0].equalsIgnoreCase("5")) {
						num = Integer.parseInt(stregth_list[1]);
						StrengthAction.dragFriday(num);
						Thread.sleep(500);
					} else if (stregth_list[0].equalsIgnoreCase("6")) {
						num = Integer.parseInt(stregth_list[1]);
						StrengthAction.dragSaturday(num);
						Thread.sleep(500);
					} else if (stregth_list[0].equalsIgnoreCase("7")) {
						num = Integer.parseInt(stregth_list[1]);
						StrengthAction.dragSunday(num);
						
						Thread.sleep(500);
					}
				}
				JavascriptExecutor jse = (JavascriptExecutor)BaseClass.driver;
				jse.executeScript("window.scrollBy(0,250)", ""); Thread.sleep(600);
				OneYouLand.clickNext();Thread.sleep(500);
				JavascriptExecutor jse1 = (JavascriptExecutor)BaseClass.driver;
				jse1.executeScript("window.scrollBy(0,250)", ""); Thread.sleep(600);
				OneYouLand.clickNext();Thread.sleep(500);
				System.out.println("strengthening metrics done");
				//StrengthAction.clickNext_St();Thread.sleep(500);
			}
	
	
	
	public void About_my_smoking_habbits(HashMap<String, String> TData) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    PageFactory.initElements(BaseClass.driver,SmokePage.class);
	    String options_smoke = TData.get("options_smoke");
	    if (options_smoke.equalsIgnoreCase("1")) {
	    	Reporter.LogStepPass("Pass !! You Smoke : Everyday");
			SmokeAction.selectEveryDay();}
		else if (options_smoke.equalsIgnoreCase("2")) {
			Reporter.LogStepPass("Pass !! You Smoke : Not Everyday");
			SmokeAction.selectSometimes();}
		else if (options_smoke.equalsIgnoreCase("3")) {
			Reporter.LogStepPass("Pass !! You Smoke : You have quit");
			SmokeAction.selectQuit();}
		else if (options_smoke.equalsIgnoreCase("4")) {
			Reporter.LogStepPass("Pass !! You Smoke : Never");
			SmokeAction.selectNeverHad();}

	    OneYouLand.clickNext();
		Thread.sleep(1000);
		OneYouLand.clickNext();
		System.out.println("smoking habbits done");

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
		Reporter.LogStepPass("Pass !! Your Score" + expScore);
	}

	public void Validate_messages_against_each_section() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(BaseClass.driver, ResultPage.class);
		PageFactory.initElements(BaseClass.driver, ReadPropertiesFile.class);
		ReadPropertiesFile rp=new ReadPropertiesFile();
		
		//** Moving text validation*****//
		String exMove=rp.ReadFile("moving","config.properties");
		JavascriptExecutor jse = (JavascriptExecutor)BaseClass.driver;
		jse.executeScript("window.scrollBy(0,120)", ""); Thread.sleep(600);
		validateMovingContent(exMove);
		
		//***Eating*************/
		
		/*String exEating=rp.ReadFile("Eating","config.properties");
		jse.executeScript("window.scrollBy(0,230)", ""); Thread.sleep(600);
		ResultAction.validateEatingContent(exEating);*/
		
		//****Drinking*********//
		/*String exDrinking=rp.ReadFile("Drinking","config.properties");
		ResultAction.validateDrinkingContent(exDrinking);
		*/
		//********Smoking********//
		/*String exSmoking=rp.ReadFile("Smoking","config.properties");
		ResultAction.validateSmokingContent(exSmoking);
		*/	
		Thread.sleep(200);
			
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
		String[] drink_list = volume.split(delim);
		int drink_len = drink_list.length;
		if (day.equalsIgnoreCase("WeekDays") & called.equalsIgnoreCase("1")) {
			for (int j = 0; j < drink_len; j++) {
				String[] vol_list = drink_list[j].split(",");

				if (vol_list[0].equalsIgnoreCase("1")) {
					AlcoholIntakeAction.clickBeer4VolWD(vol_list[1]);
				}
				else if (vol_list[0].equalsIgnoreCase("2")) {
					AlcoholIntakeAction.clickBeer5VolWD(vol_list[1]);
				}
				else if (vol_list[0].equalsIgnoreCase("3")) {
					AlcoholIntakeAction.clickSpiritVolWD(vol_list[1]);
				}
				else if (vol_list[0].equalsIgnoreCase("4")) {
					AlcoholIntakeAction.clickWineVolWD(vol_list[1]);
				}
				else {
					Reporter.LogStepFail("Wrong Input" + getClass());
				}
			}
			

		}

		else if ((day.equalsIgnoreCase("WeekDays") & (called.equalsIgnoreCase("2") | called.equalsIgnoreCase("3")))) {
			for (int j = 0; j < drink_len; j++) {
				String[] vol_list = drink_list[j].split(",");

				if (vol_list[0].equalsIgnoreCase("1"))
					AlcoholIntakeAction.clickBeer4VolOcc(vol_list[1]);
				else if (vol_list[0].equalsIgnoreCase("2"))
					AlcoholIntakeAction.clickBeer5VolOcc(vol_list[1]);
				else if (vol_list[0].equalsIgnoreCase("3"))
					AlcoholIntakeAction.clickSpiritVolOcc(vol_list[1]);
				else if (vol_list[0].equalsIgnoreCase("4"))
					AlcoholIntakeAction.clickWineVolOcc(vol_list[1]);
				else
					Reporter.LogStepFail("Wrong Input" + getClass());
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
		System.out.println(score + "=="+expScore);
		if ((score.replace("hay-results__score hay-results__score--",""))==expScore) {
			System.out.println("Score Matched");
			Reporter.LogStepPass("Actual Acore :" + score);
			
		}else {
			System.out.println("Score Mismatch");
			Reporter.LogStepFail("Actual Acore :" + score);
		}
		System.out.println("Score" + score);
	}
	
	public void validateMovingContent(String exMoving) {

		String text1 = ResultPage.scoreMoving.getText();
		System.out.println("Expected text-" + exMoving + "/n" + "ActualText-" + text1);
		// assertEquals("Verify message", exMoving, text1);
		if (text1.contains(exMoving)) {
			Reporter.LogStepPass("Content validation of Moving section is passed");
		} else {
			Reporter.LogStepFail("Content validation of Moving section is failed");			
		}
	}
}
