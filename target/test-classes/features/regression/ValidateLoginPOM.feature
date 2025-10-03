Feature: To validate login of adactin hotel app

@wip0110
Scenario:
To validate login using valid credentials

Given  user is on "LoginPage"
Then validate title to be "Adactin.com - Hotel Reservation System"
When user enters text into textbox "usernameTextbox" "reyaz0806"
And  user enters text into textbox "passwordTextbox" "reyaz123"
And user clicks "loginButton"
Then validate title to be "Adactin.com - Search Hotel"
