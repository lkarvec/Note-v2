# Musical-Note-Trainer
# ORIGINALLY A SPRING 2019 PROJECT CLEARED FOR UPGRADES FOR SPRING 2020 BY PROFESSOR ARAFAT
# Changes for the 2020 semester are going to be at the bottom of the document

## Spring 2019 - Team 6


Christopher Tyler [christophergtyler / MagicShmagic, tbl512]

Alexander Mains [lkarvec, rta149]

Mark Dziuk [mdziuk37,kvf069]


## Spring 2020 - PEPE ALWAYS WINS

Alexander Mains [lkarvec, rta149]

Zach Ross [zachross2000, bvf676]

HOW TO USE THE NOTE APPLICATION

1. https://github.com/UTSA-CS-3443/Musical-Note-Trainer.git copy this link

2. In Eclipse, Hit 'File' > 'Import' > 'Git' > 'Projects from Git' > 'Clone URL' > Paste the link and enter your github login info

3. Make sure the Master branch is checked and hit next.  Hit Finish.

Functionality

The three instruments play notes based on an input of either typing or clicks on the intrument and will show a musical note's visual representation on the staff.

Main Menu
    
    The main menu has three clickable buttons for the three different instruments.  There is also a settings button in the top left.
    
Settings
    
    The settings menu has a volume slider.  Hit the button next to it to apply.
    
    There is also a mute toggle
    
    You can also change the data path to your saved recordings by inputting an absolute path (Example "C:/Users/UserName/Documents/Folder" ) into the text field and hitting the apply button next to it.
    
    These settings can be found in the config file included with your installation in the data folder.  If anything doesn't work, it's usually a configuration file error.  Delete the configuration file and restart the program to get a pregenerated one.

Piano
    
    The piano's black keys can be clicked on.
    
    The piano's white keys can be either clicked on; or, using the available keys on screen, typed.
    
    The text fields next to play and record are naming inputs from the user to save and load recording files.
    
    The record button writes to a file for each note played.  It will keep the rhythm and note pattern but note attack and cut off is not implemented.  You have to hit stop to close the file.
    
    The play button loads the input file and plays it back until end of file.  You have to hit stop to close the file.
    
    You can hit return to go back to the main menu.
    
    
Xylophone
    
    The Xylophone's bars can be either clicked on; or, using the available keys on screen, typed.
    
    The text fields next to play and record are naming inputs from the user to save and load recording files.
    
    The record button writes to a file for each note played.  It will keep the rhythm and note pattern but note attack and cut off is not implemented.  You have to hit stop to close the file.
    
    The play button loads the input file and plays it back until end of file.  You have to hit stop to close the file.
    
    You can hit return to go back to the main menu.
    
    

Kalimba
    
    The kalimba's keys can be either clicked on; or, using the available keys on screen, typed.
    
    The text fields next to play and record are naming inputs from the user to save and load recording files.
    
    The record button writes to a file for each note played.  It will keep the rhythm and note pattern but note attack and cut off is not implemented.  You have to hit stop to close the file.
    
    The play button loads the input file and plays it back until end of file.  You have to hit stop to close the file.
    
    You can hit return to go back to the main menu.
    
    
###################################

### UPDATE LOG
Updated by Alexander Mains (@lkarvec, rta149)
and Zach Ross (@zachross2000, bvf676)

v1.1
Added a settings button on the main menu for:
    
    Volume Control Slider 
    Muting
    Save data Path setting 

Added a Musical Staff function to the main three instruments.
    
    The staff will show a visible representation of what your note is upon note hover or key press.

Updated the code and bugfixed a few fatal errors.

Updated the GUI to accomodate the new functions on all screens

