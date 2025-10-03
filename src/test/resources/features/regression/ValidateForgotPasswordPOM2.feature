Feature: To validate login of adactin hotel app

@wip0110a
Scenario:
To validate login using valid credentials

Given  user is on "LoginPage"
Then validate title to be "Adactin.com - Hotel Reservation System"
When user clicks "forgotPasswordLink"
Then validate title to be "Adactin.com - Forgot Password"
