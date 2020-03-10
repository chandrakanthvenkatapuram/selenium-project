package HowAreYou_Tests;

import java.util.HashMap;

import org.testng.annotations.Test;

import Helpers.DataHelper;
import Helpers.Report;
import KeyMethods.MainMethods;

public class HowAreYou_Quiz {
	
	//Objects Creation
	DataHelper DataLoader = new DataHelper();
	MainMethods AppKeys = new MainMethods();
	Report Reporter = new Report();
	@Test
	public void HowAreQuizTest() throws Throwable{

        Reporter.reportInitiate();
		DataLoader.LoadData();		
	     for(String sTC:DataLoader.TCiDs) {
	         System.out.println("Executing for TC "+sTC);
	         HashMap<String, String> TestData =  DataLoader.loadTestCaseData(sTC);
	        System.out.println("Name-"+TestData.get("Name"));
	        Reporter.reportCreator(TestData.get("TestCase")+"_"+TestData.get("TestCode")+"_"+TestData.get("Name")+"_"+TestData.get("Age")+"_"+TestData.get("Gender"));
	        
	        //Start test
	        AppKeys.Open_HowAreQuiz_website();
            
	        AppKeys.Fill_Name_Gender_Age_clickNext(TestData);
	        
	        AppKeys.Fill_How_are_you_feeling_right_now(TestData);
	        
	        AppKeys.Select_options_from_What_Stops_you_taking_care_of_yourself(TestData);
	        
	        AppKeys.Choose_who_all_depend_on_me_for_being_healthy(TestData);
	        
	        AppKeys.Identify_top_three_health_priorities_from_the_given_options(TestData);
	        
	        AppKeys.ValidatePartOneOutPutMessage(TestData);
	        
	        AppKeys.Choose_one_of_my_favorite_drinks_from_given(TestData);
	        
	        AppKeys.Select_my_favorite_snacks_out_of_given_options(TestData);
	        
	        AppKeys.Choose_my_favorite_breakfast_out_of_given_options(TestData);
	        
	        AppKeys.Choose_my_favorite_cheese_out_of_given_options(TestData);
	        
	        AppKeys.Choose_my_favorite_NonVeg_item_from_the_available_options_and_click_next(TestData);
	        
	        AppKeys.Choose_servings_of_fruits_and_vegetables_from(TestData);
	        
	        AppKeys.Choose_my_favorite_snacks_from_given_options(TestData);
	        
	        AppKeys.Select_frequency_of_alcohol_intake_and_click_Next(TestData);
	        
	        AppKeys.Choose_my_exercise_days_and_strength(TestData);
	        
	        AppKeys.Choose_my_strengthening_metrics(TestData);
	        
	        AppKeys.About_my_smoking_habbits(TestData);
	        
	        AppKeys.Do_not_opt_for_sign_up();
	        
	        AppKeys.Land_on_Result_Page_with_the_score(TestData);
	        
	        AppKeys.Validate_messages_against_each_section();
	      }
	     
	     Reporter.ReportEnd();
	}

}
