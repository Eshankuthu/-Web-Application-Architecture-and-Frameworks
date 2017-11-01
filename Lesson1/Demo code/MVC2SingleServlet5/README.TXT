
Added @RequestMapping -  @Controller

Significantly reduced properties
Only refers to package location of "potential" controllers

Looks like Spring MVC...

NOTE: The @Controller is implemented -- REMOVED THE CONTROLLER INTERFACE

NOTE: DUE TO the WAY the Controller Method parameters are handled in Config...The ORDER of the
      parameters is important in the Method signature:
      Domain Object
      Request Object
      Response Object
       