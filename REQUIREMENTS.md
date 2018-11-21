# High level requirements
We need to build a canteen management application,
customer can order their food through the  portal. 

 Customer Login:
   * can view their menu details.
   * can order food.
	* The order will be accepted only if the customer had enough money for the ordered food in
	  his wallet.
   * can check the status of their delivery.
   * can check their order history.  
Vendor Manager 
	* can view the order request from customers.
	* can accept or deny the entire order.
customer details (custId, custName, etc..) are stored along with their wallet balance.
Customer can place their order in this portal. These orders go to the Canteen managers acceptance.
Canteen Manager can accept/reject the order with proper comments.
Wallet balance should not go negative.
Customer can view their order status.
# Application flow
The skeletal application contains a simple screen with list of food items (Menu).
  * The "place order" button is the default button (i.e., pressing "Place order" invokes the login function).
  * Customer should enter his customer id will take the customer to "place the order screen".
  * Customer should enter the item id and quantity and "Order" button to place the order 
  * On Wallet money balance the order should be accepted or rejected with proper error message.
  * "Back to Menu" takes the customer back to the Menu list screen from all the screen.
  * Entering the "Login button " from main screen will take to the vendor manager login. 


# Must-Have
  * Following functionalities are must to have-
  1.View all food items.
  2.Enter food items with price.
  3.Order food with auto cancelation if no enough money in Wallet for the food ordered.
  5.Food order history and status for customer view for their id. 
  6.Food ordered and their status for vendor view. 
  7.Food order accepted /canceled by the Vendor with proper reason.  
  * Functionality available via
     * Cli
     * Curl
     * Browser
  * Validations, with error messages, both on 
     * the server side, to make sure the data is clean no matter what the source and,
     * the client side, to provide a responsive user interface
     * Type validations
     * Semantic validations     
# Nice-To-Have
  * Photos of the food items in the menu.
  * Multiple Vendors with their specialization (North Indian, South Indian, Veg, Non veg, etc..).
  * Ability to select multiple food items at once via multi-select/select-all.
  * Authentication of the Vendor Manager using password, password-reset etc.. (client and server).
  * Adding/Editing Menu details.
  * Cancellation of food ordered by customer.
  * Customer can order different vendor will create a single order and internally it should create multiple orders for each product and vendor.
  * Partial acceptance and deny of the order.
  
    
# Great-To-Have
  * Confirmation alerts through SMS and Mail.
  * Sorting options on all tables
  * 'Quick filter' options on all tables.
  * Customer to re-edit their orders.
  * Ability for Customer to review and revisit their orders.
  * Different interfaces for vegetarians and non-vegetarians.
  
# Fantastic-To-Have
  * Rating for the food items.
  * Mobile UI
  * Conversational Interface
     * ChatBot
     * VoiceBot
  * Metrics, Monitoring, Logs, Alerts, Dashboards
  * Calories Monitoring.
