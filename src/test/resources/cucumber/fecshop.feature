#Feature: Test for fecshop website
#  Background: Log in
#    Given open page "https://fecshop.appfront.fancyecommerce.com/special-occasion"
#    When I click sign in link
#    Then input email "tuo_chao@sohu.com"
#    And input password "123456"
#    And click Sign In button
#    Then I should be logged in as "tuo chao"
#
#  @fecshop
#  Scenario: Test feature in fecshop
#    Given open page "https://fecshop.appfront.fancyecommerce.com/special-occasion"
#    Then the browser title should contain "Special Occasion"
#
#  @fecshop
#  Scenario: Test add chart feature
#    Given open page "https://fecshop.appfront.fancyecommerce.com/special-occasion"
#    When user select product which contains "Off-the-Shoulder Long Sleeve High-Low Day Dress"
#    And add it to cart
#    Then should see product which contains "Off-the-Shoulder Long Sleeve High-Low Day Dress" in cart
