
Access config file through WEB.XML declaration
Add functionality [ through config file] to match URI to controller/method name
Merged INPUTProductController & SaveProductController into single ProductController
Performed DATA BINDING on Product domain Object

NOTE: If you run it  as Java Application it will verify [VerifyMetaClass has main method)
the Class - Object dependencies W/R to Reflection API support

NOTE: DUE TO the WAY the Controller Method parameters are handled in Config...The ORDER of the
      parameters is important in the Method signature:
      Domain Object
      Request Object
      Response Object
                  