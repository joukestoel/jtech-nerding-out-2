#Nerding Out!
##Robocode

Welcome to the second Ordina J-Technologies Nerding Out event!
We will be building robots and battle in various assignments. The assignments will be presented during the day.

This wiki can be used to set up your local environment so you will be able to run the tutorial.

## Setting up your local environment

Make sure you have **Java 6** or **Java 7** and **Maven 3** set up for building our code.

There are four steps that you need to complete to have the whole setup needed.
You'll need to:
- Clone the Git repository
- Install the Robocode.jar (and accompanying source) in your local Maven repository 
- Setup the project in your favorite IDE
- Configure Robocode to use your compiled classes
- Make sure everything works by starting a battle

### Step 1: Cloning the Git repository
You'll need to clone this Git repository

    git clone https://github.com/joukestoel/jtech-nerding-out-2.git nerding-out-2

That's it!

### Step 2: Install the Robocode.jar in your local Maven repository
Open the ./setup folder. In here you'll find two convienent scripts and a ./lib directory. 
Depending is you are on Windows, Mac or Linux please run the .sh or .bat script.

After running the script Robocode.jar should be installed in your local library!

### Step 3: Setting up the tutorial project in your favorite IDE

#### Eclipse (Kepler)
1. Workspace -> [location_where_you_checked_out_the_nerding-out_project]

Prerequisit: Make sure that you have installed a Maven 2 Eclipse plugin. If you haven't, please follow the next steps
+ 1. Go to 'Help' -> 'Eclipse Marketplace'
+ 2. Search for 'Maven'
+ 3. Select 'Maven Integration for Eclipse (Juno and newer) 1.4 and hit 'Install'
+ 4. 'Confirm' the next step and wait for it to finish
+ 5. Select 'I accept ...', select 'Finish' and wait for the install to finish
+ 6. Select 'Restart'

2. File -> Import -> Maven -> Existing Maven projects
3. As 'Root dir' select the 'tutorial' folder
4. Hit 'Finish'

#### IntelliJ (12)
1. Import project -> Select '[location_where_you_checked_out_the_nerding-out_project]/tutorial' -> Hit 'Ok'
2. Select 'Import project from external model'
3. Select 'Maven'
4. You can now basically keep hitting 'Next' and then hit 'Finish' (do make sure that you select a Java 6 or 7 SDK!)
5. You will be notified that the GIT root is unknown. You can add it to your Version Control configuration (just follow the link in your 'Event Log')
6. Done!

#### Netbeans (7.4)
1. Select menu 'File' -> 'Open project'
2. Select '[location_where_you_checked_out_the_nerding-out_project]/tutorial' -> Hit 'Ok'
3. Done!

### Step 4: Configuring the RoboCode app

1. Start 'Robocode' (Browse to '[location_where_you_checked_out_the_nerding-out_project]/robocode_app' -> double click 'robocode.bat/sh')
2. Once 'Robocode' is running, select menu 'Options' -> Select 'Preferences'
3. Select tab 'Development options' -> Hit 'Add'
4. Select the build output directory ->  [location_where_you_checked_out_the_nerding-out_project]/tutorial/target/classes
5. Hit 'Ok'

### Step 5: Start a battle
If all the above steps are succesful you should be able to select the robots that you will create. To check do the following

1. Select the 'Battle' menu -> Select 'New'
2. You should be able to see the robots in the 'nl.ordina.nerdingout...' packages -> Select the 'TutorialMovement1' -> hit 'Add'
3. Select 'SittingDuck' -> hit 'Add'
4. Hit 'Start battle'

If all is well you'll see two bots looking angry at each-other but not much will be happening ... We'll fix that in a minute!

Happy hunting!



