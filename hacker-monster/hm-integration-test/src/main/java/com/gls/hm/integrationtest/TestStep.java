package com.gls.hm.integrationtest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.gls.hm.rest.model.AuthenticationRequest;
import com.google.gson.Gson;

public class TestStep
{
	@Autowired
	private MockMvc mockMvc;

	private MyCalculation myCaculation;

	@Given("I have two numbers are $firstNumber and $secondNumber")
	public void requestSumOfNumbers(int firstNumber, int secondNumber)
	{
		myCaculation = new MyCalculation();
		myCaculation.setFirstNumber(firstNumber);
		myCaculation.setSecondNumber(secondNumber);

		int result = myCaculation.getFirstNumber() + myCaculation.getSecondNumber();
		myCaculation.setResult(result);
	}

	@Then("The result should be $result")
	public void validate(int result)
	{
		Assert.assertEquals(result, myCaculation.getResult());
	}

	@Given("I call the api for login")
	public void callAPILogin() throws Exception
	{
		HttpClient httpClient = HttpClientBuilder.create().build();

		AuthenticationRequest authenticationRequest = new AuthenticationRequest("test1@gmail.com", "abcd1234");
		Gson gson = new Gson();
		String json = gson.toJson(authenticationRequest);
		StringEntity entity = new StringEntity(json);

		HttpPost post = new HttpPost("http://localhost:8181/authenticate");
		post.setEntity(entity);
		post.setHeader("Content-type", "application/json");
		HttpResponse response = httpClient.execute(post);

		System.out.println(EntityUtils.toString(response.getEntity()));

	}
}
