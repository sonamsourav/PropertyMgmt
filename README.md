This repository is about the automating and write couple of test cases for PropertyMgmg project where I have written some test case to show case the automation skills.
I have written couple of test cases in TestNG as below

  <b> a. Automate the Login page with two schearios that is one happy path scenario and other is for negative scenario where login attempt will get fail when credential are not valid.</b>
 
 <b>  b. landing page scenarios where user do the sign-up first time.</b>
  
  <b> c. validating the title of the web page that entrata.com </b>

Apart from the above scenarios i have implemented this using POM ( page object model) with abstraction class where implementation is directly hiding from test case itself and calling the main function

from abstraction class methods.
I have also tried to call and launch this on cross browser i.e. Chrome / Firefox / IE. by using properties file.
Also use the Implicitly wait class to wait webdriver.
