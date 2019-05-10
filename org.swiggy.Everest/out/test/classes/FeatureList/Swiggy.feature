Feature: Swiggy
@smoke
  Scenario: Order From Bite Me
    Given Navigate to Swiggy
      Then Enter delivery location as Indiranagar, Bengaluru
      Then Select first result which is Indiranagar, Bengaluru, Karnataka, India
      And Click on Search
      Then Search for Restaurant called “Bite Me” and Click on it
      When Restaurant loaded
      Then Click on Bite Me Restaurant
      Then Add few items to the cart
      Then Add one more red velvet cupcake
      Then click on Tiramisu cupcake
      Then click on plus to add more Tiramisu cupcake
      Then click on add for Irish Coffee Cupcake
      Then click on add for Choco Choco Cupcake
      Then click on checkout
      Then verify item added in chechout page
      Then click on new swiggy
      Then pass phone number
      Then pass name
      Then Enter email
      Then Enter password
      Then click on CONTINUE
#      Then  Click on Checkout
#      And  Verify Items added in checkout page
#      Then Click on ​“New to Swiggy SIGN UP
#      And Enter Details for cehckout
      But Error message at Email field ​“Email id already exists”​ and  Capture screenshot
      Then Change Red Velvet cupcake quantity to One
#      Then  Change Red Velvet cupcake quantity to 1
#      And Capture screenshot and close  browser
