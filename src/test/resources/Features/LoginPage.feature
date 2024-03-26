Feature: Login page Automation of FaceBook App

Scenario:Check login is success full with valid creds

Given User is on Login page
When  User enter the Vaild Username and Password
And   Click on Login button
Then  User is navigated to Home page
And   User Takethe Screen_Shot
And   Close The Browser



