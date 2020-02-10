@ombd

  Feature:  OMBD tests

    Background: Setup base URI
      * url 'http://www.omdbapi.com'
      
      Scenario: Verify that user cannot get the data without API key
        Given param t = 'Home Along'
        When method get
        Then status 401
        #401- unauthorized, can not give you data, without API key

    Scenario: Provide API key and verify that user is able to find a movie by title
      Given param t = 'Home Alone'
      And param apikey = '9f94d4d0'
      When method get
      Then status 200
      And assert response.Title == 'Home Alone'
      And assert response.Rated == 'PG'


