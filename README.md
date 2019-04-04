# Disk_Space
Returns a JSON listing all the files and Directories in the given path with their disk usage in bytes

# Download Some .jar File
https://www.dropbox.com/s/pte14xzanjgkkv5/rest-assured-all-3.3.0.jar?dl=0

# To Run on Eclipse
1. Fork the repository in your git
2. Download the code into your machine and set it up in eclipse
3. To run the main application from Eclipse: GO to the Run -> Run Configuration -> Select Java Application
  i) Select Project as "Disk_Space". (You can search it from Browse)
  ii) Select Main class as: main.Controller.ReturnDiskUsageOfThePath_Driver (You can search it from Browse)
  iii) Go to Arguments tab (2nd tab)
  iv) under Program_arguments: give a path (make sure the path starts from root eg. /home/user/Desktop)
  v) Once all the steps above done, click on Run button
  vi) voila!! It will give you a json responce listing all Files and Directories with their disk usage in bytes
 
4. To run JUnit Test Cases:
  i) I have added some test cases which can be run via -> Go to the test Folder -> click on any java class ->
      when the file open right click in the Editor -> select Run As -> Select JUnit Test 
      (NOTE: TO MAKE THE TEST CASE WORK, CHANGE THE GIVEN PATH TO YOUR LOCAL PATH)
