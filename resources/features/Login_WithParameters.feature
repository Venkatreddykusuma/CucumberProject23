Feature: Verify Flipkart Registration
	Scenario: Registration with mobile number
		Given site url as "http://flipkart.com"
		And click on Register with us
		When user enter valid mobilenumber "7981186694"
		And Enter firstname as "Venkat"
		And Enter Surname as "Kusuma"
		And Enter age as 26
		And click on Register
		Then verify Sucessful message