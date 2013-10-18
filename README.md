#Nerding Out!
##Robocode

Welcome to the first Ordina J-Technologies Nerding Out event!
This first time we will be building robots and battle in various assignments. The assignments will be presented during the day.

This wiki can be used to set up your local environment.

## Setting up your local environment

Make sure you have **Java 6** or **Java 7** set up for building our code.

There are three steps that you need to complete to have the whole setup needed.
You'll need to:
- Clone the Git repository
- Setup the project in your favorite IDE
- Configure Robocode to use your compiled classes

### Step 1: Cloning the Git repository
You'll need to clone this Git repository

    git clone https://github.com/joukestoel/jtech-nerding-out-1.git nerding-out-1

That's it!

### Step 2: Setting up the project in your favorite IDE

#### Eclipse (Juno)
1. Workspace -> [location_where_you_checked_out_the_nerding-out_project]
2. File -> New -> Project
3. Java Project -> Project name: your_code_here -> Next
4. (The next steps are required to link the source code to the robocode.jar)
5. Tab Libraries -> Select 'robocode-sources.jar' -> Click 'Remove'
6. Expand 'robocode.jar' -> Select 'Source attachment' -> Click 'Edit' -> Select 'Workspace location' -> In 'Path', select 'Browse' -> Select the 'robocode-source.jar' (in the lib directory)
7. Hit 'Finish'

#### IntelliJ (12)
1. Import project -> Select '[location_where_you_checked_out_the_nerding-out_project]/your_code_here' -> Hit 'Ok'
2. Select 'Create project from existing sources'
3. You can now basically keep hitting 'Next' and then hit 'Finish'
4. You will be notified that the GIT root is unknown. You can add it to your Version Control configuration (just follow the link in your 'Event Log')
5. (The next steps are required to link the source code to the robocode.jar)
6. Open the settings of your project (select project in the project explorer and hit CTRL-ALT-SHIFT-s)
7. Open the 'Libraries' section
8. Remove the 'robocode-sources.jar' as library
9. Select the 'robocode.jar' -> Hit '+' -> Select 'Attach Files or Directories' -> Select 'robocode-sources.jar' -> Hit 'Ok'
10. Hit 'Ok'

#### Netbeans (7.3)
1. Select menu 'File' -> 'New project'
2. Select 'Java' -> 'Java Project with Existing Sources' -> Hit 'Next'
3. Select 'Project Name' -> Think up something nice
4. Select 'Project Folder' -> Hit 'Browse' -> Select '[location_where_you_checked_out_the_nerding-out_project]/your_code_here' -> Hit 'Ok' -> Select 'Next'
5. In the 'Existing sources' section, select 'Add Folder' -> Select 'src' -> Hit 'Ok'
6. Hit 'Finish'
7. (The next sesion is to link the library)
8. In the 'Projects' outline, select 'Libraries'
9. Right mouse click -> Select 'Add JAR/Folder' -> Select '[location_where_you_checked_out_the_nerding-out_project]/your_code_here/lib/robocode.jar' -> Hit 'Ok'
10. (The next session is to link the source code to the robocode.jar)
11. Right mouse click on the 'robocode.jar' -> Hit 'Edit' -> Hit 'Browse' next to the 'Sources' input field -> Select 'robocode-sources.jar' -> Hit 'Ok' -> Hit 'Ok'

### Step 3: Configuring the RoboCode app

1. Start 'Robocode' (Browse to '[location_where_you_checked_out_the_nerding-out_project]/robocode_app' -> double click 'robocode.bat/sh')
2. Once 'Robocode' is running, select menu 'Options' -> Select 'Preferences'
3. Select tab 'Development options' -> Hit 'Add'
4. Select the directory which you have configured as your build output path in your IDE (i.e. [location_where_you_checked_out_the_nerding-out_project]/your_code_here/build/classes or /out/production/your_own_robot or /bin). Watch out! Make sure that you select the directory where the classes are put (this directory should contain the nl/ directory)
5. Hit 'Ok'

### Step 4: Start a battle
If all the above steps are succesful you should be able to select the robots that you will create. To check do the following

1. Select the 'Battle' menu -> Select 'New'
2. You should be able to see the robots in the 'nl.ordina.nerdingout...' packages -> Select the 'ExampleBot' -> hit 'Add'
3. Select 'SittingDuck' -> hit 'Add'
4. Hit 'Start battle'

You're done! Happy hunting!



