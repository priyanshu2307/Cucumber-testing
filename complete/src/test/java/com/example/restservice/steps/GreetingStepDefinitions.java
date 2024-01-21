package com.example.restservice.steps;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.restservice.Greeting;
import com.example.restservice.GreetingController;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class GreetingStepDefinitions {

    @Autowired
    private GreetingController greetingController;
    private String response;

    @Given("the greeting endpoint is available")
    public void theGreetingEndpointIsAvailable() {
        // You may want to set up any necessary configurations or state here
    }

    @When("I request the greeting with name {string}")
    public void iRequestTheGreetingWithName(String name) {
        Greeting greeting = greetingController.greeting(name);
        response = greeting.getContent();
    }

    @Then("the response should contain {string}")
    public void theResponseShouldContain(String expected) {
        assert(response.contains(expected));
    }
}