Feature: Gradle-Cucumber integration
  @test1
  Scenario Outline: Test google search
    Given open page "http://www.google.com"
    When I search for "<key>"
    Then the browser title should contain "<title>"
    Examples:
      | key      | title    |
      | Cucumber | Cucumber |
      | Selenium | Selenium |

  @test2
  Scenario: Open baidu
    Given open page "http://www.baidu.com"
    Then the browser title should contain "百度一下，你就知道"
    When click search configure