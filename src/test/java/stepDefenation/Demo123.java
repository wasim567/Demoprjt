package stepDefenation;


import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefination {


    @Given("^user is on Login page$")
    public void user_is_on_login_page() throws Throwable {
        System.out.println("user is on Login page");
    }

    @When("^user enters \"(^\"*)\" and \"(^\"*)\"$")
    public void user_enters_username_and_password(String username, String password) throws Throwable {
    	 System.out.println("user enters username and password");
    }
    


    @When("^user clicks on creditcard tab$")
    public void user_clicks_on_creditcard_tab() throws Throwable {
    	 System.out.println("user clicks on creditcard tab");
    }

    @Then("^user is sucessfully logged into creditcard site$")
    public void user_is_sucessfully_logged_into_creditcard_site() throws Throwable {
    	 System.out.println("user is sucessfully logged into creditcard site");
    }

    @Then("^user is able to see the creditcard balance$")
    public void user_is_able_to_see_the_creditcard_balance() throws Throwable {
    	 System.out.println("user is able to see the creditcard balance");
    }

    @And("^clicks on login button$")
    public void clicks_on_login_button() throws Throwable {
    	 System.out.println("clicks on login button");
    }

    
   

    	@When("user clicks on register button and enters the following details")
    	public void user_clicks_on_register_button_and_enters_the_following_details(DataTable data) {
    	   List<List<String>> obj=data.asLists();
    	   System.out.println(obj.get(0).get(0));
    	   System.out.println(obj.get(0).get(1));
    	   System.out.println(obj.get(0).get(2));
    	   System.out.println(obj.get(0).get(3));
    	   System.out.println(obj.get(0).get(4));
    	   System.out.println(obj.get(1).get(0));
    	   System.out.println(obj.get(1).get(1));
    	   System.out.println(obj.get(1).get(2));
    	   System.out.println(obj.get(1).get(3));
    	   System.out.println(obj.get(1).get(4));
    	}

    	@When("clicks on submit button")
    	public void clicks_on_submit_button() {
    	   System.out.println("Successly submitted the details");
    	  
    	}
    	
    	

    		@When("^user enters (.+) and (.+)$")
    		public void user_enters_and(String username, String password) {
    		    System.out.println(username);
    		    System.out.println(password);
    		}
    		
    		

    			@Given("user launched the browser")
    			public void user_launched_the_browser() {
    			    System.out.println("User launced the browser");
    			}


    		

    			@When("user entered the site url hit enter")
    			public void user_entered_the_site_url_hit_enter() {
    			   System.out.println("user entered the site url hit enter");    			}
    			@Then("user navigated to homepage")
    			public void user_navigated_to_homepage() {
    			   System.out.println("user navigated to homepage");
    			}
    			@Then("clicked on login")
    			public void clicked_on_login() {
    			    System.out.println("Clicked on login");
    			}







}
