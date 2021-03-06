# 100 Days Of Code - Log

### Day 0: APRIL 6 , 2018

**Today's Progress**: After encountering the ArrayList class in "head first java" I decided to explore what the differences were compared to a standard array.
**Advantages**:
- Being able to dynamically alter the size of the array list is one of the most powerful features.
- Sorting through Arraylists and being able to insert a new index.
- An arraylist can also work with objects.
- Removing an index is not possible with a standard array.

**Thoughts:** Glad I've resumed my studies with "Head first Java" since a week ago. All the things I'd previously learned have pretty much stuck, still going through the previous 5 chapters was a good refresher.
Started my cheat sheet in Google docs.

**Link to work:** [Day 0 Array List Study 01](https://github.com/androvisuals/100-days-of-code/tree/master/Day%200%20Array%20List%20Study%20Java)

### Day 1: APRIL 7 , 2018

**Today's Progress**: More studies with the ArrayList object this time using strings, studied more with lookups, creating arrayLists of objects and then calling methods on the objects inside of the arraylist.
Last but not least how to replace objects in an arrayList with other objects.

**Thoughts:** It's all becoming a lot more natural now with finding errors and understanding how to solve them quickly.

**Link to work:** [Day 1 Array List Study Strings](https://github.com/androvisuals/100-days-of-code/tree/master/100%20days%20of%20code%20in%20here/Day%201%20array%20list%20study%20strings%20methods%20objects%20java)

### Day 2: APRIL 8 , 2018

**Today's Progress**: Basic study with class based inheritance. Kept it very simple to test the use of extend.
Pure test code so nothing really useful. 

**Thoughts:** Great starting method to avoid using duplicate code in a class and being able to overwrite a method from a superclass.

**Link to work:** [Day 2 inheritance studies](https://github.com/androvisuals/100-days-of-code/tree/master/100%20days%20of%20code%20in%20here/Day%202%20Inheritance%20study)

### Day 3: APRIL 9 , 2018

**Today's Progress**: Worked on creating a system which generates a string made from random characters from a pre defined list with the alphabet and numbers 0-9.
This was then added to a system which allows any number of them to be generated and then put into an arraylist.

**Thoughts:** This will be the first step in me figuring out how to get random data with a seed so the same results can be created, then I want to write this to a file and start experimenting with encrypting the data.

**Link to work:** [Day 3 random string generator](https://github.com/androvisuals/100-days-of-code/tree/master/100%20days%20of%20code%20in%20here/Day%2003%20random%20string%20generator%20java)

### Day 4: APRIL 10 , 2018

**Today's Progress**: Continued with the system from yesterday. Now the system can generate the same pseudo random results with a seed number. 
Working on implementing a way to write the final ArrayList into a text file.
Managed to get the relative path of the current java file to be written as a string so that the future text file will be in a logical location.

**Thoughts:** There are many different methods to write things to file, basically a lot of time went into this with little to show for it today. Learnt a lot though. Think I'll continue with the org.apache.commons.io.FileUtils as it seems to be a more modern implementation of older java classes.

**Link to work:** [Day 4 pseudo random string generator](https://github.com/androvisuals/100-days-of-code/tree/master/100%20days%20of%20code%20in%20here/Day%2004%20string%20generator%20to%20file)

### Day 5: APRIL 11 , 2018

**Today's Progress**: Created a script which creates a text file and then writes strings into it. Also uses try catch exception. 

**Thoughts:** Slow going again. Stopped using sublime text 3 and started again with java eclipse so it took a while to get familiar with it and get it all working again. Going to have to study more exception based programming. Going to combine this with the pseudo random string generator once i've figured out how to clear a file and read its contents.

**Link to work:** [Day 5 text file generator](https://github.com/androvisuals/100-days-of-code/tree/master/100%20days%20of%20code%20in%20here/Day%2005%20text%20file%20creator)

### Day 6: APRIL 12 , 2018

**Today's Progress**: Made a basic script which plays two wav files from the hard drive after each other.

**Thoughts:** The Java documentation really misses any clear examples for anything from the javax library, very slow going. Still have a lot to learn about how to navigate through certain parts of the site. Still studying head first with java, busy with polymorphism.

**Link to work:** [Day 6 wav file player](https://github.com/androvisuals/100-days-of-code/tree/master/100%20days%20of%20code%20in%20here/Day%2006%20basic%20wav%20player)

### Day 7: APRIL 13 , 2018

**Today's Progress**: Made a script that converts a loaded image into an array of bytes, I wanted to shuffle the array and make a new image out of it to see some random glitch stuff. Only got as far to make it load an image into a array of bytes and then save a new image to drive from that array. Scrambler part will have to come later.

**Thoughts:** This was pretty hard, I have a lot to learn about "streams" and what that actually means in the bigger picture. Learnt a lot though about how picture image can be represented. 

**Link to work:** [Day 7 Image scrambler not finished ](https://github.com/androvisuals/100-days-of-code/tree/master/100%20days%20of%20code%20in%20here/Day%2007%20Image%20scrambler)

### Day 8: APRIL 14 , 2018

**Today's Progress**: Went back to basic arrayLists this time doing some testing with Abstract classes and methods in the mix.

**Thoughts:** Decided to go back to the basics, need to learn a lot more advanced stuff before i can do the image scrambler stuff. The abstract parts make total sense to get working, but I'm missing some real world scenarios where I'd apply them. Sure that'll come later.

**Link to work:** [Day 8 abstract class studies](https://github.com/androvisuals/100-days-of-code/tree/master/100%20days%20of%20code%20in%20here/Day%2008%20abstract%20classes%20and%20methods)

### Day 9: APRIL 15 , 2018

**Today's Progress**: Basic script which requests the user to type intput into the console and then displays it. Continues until the user types in quit.

**Thoughts:** Struggled with this one today, a few simple things like input == "quit" didn't work as they compare the reference, needed to be .equals. etc etc. Think I'll carry on more with the user console things for the next few days.

**Link to work:** [Day 9 User input to console](https://github.com/androvisuals/100-days-of-code/tree/master/100%20days%20of%20code%20in%20here/Day%2009%20user%20input%20to%20console)
<<<<<<< HEAD

### Day 10: APRIL 16 , 2018

**Today's Progress**: Wrote test code for simulating a simple turn from a warhammer 40k game with dice rolls.
- decide amount of dice to roll
- check for how many hits
- check for wounds
- make saving throw (not done yet)
- inflict damage (not done yet)

**Thoughts:** Pretty much worked this out only as test code, all working so far, kind of messy, still its just an hour, going to tidy it up tomorrow and get it working with the user input.

**Link to work:** [Day 10 Test code for dice pool system](https://github.com/androvisuals/100-days-of-code/tree/master/100%20days%20of%20code%20in%20here/Day%2010%20Dice%20calculator)

### Day 11: APRIL 17 , 2018

**Today's Progress**: Part 02- Managed to get all the user input to define the outcomes of the methods, still not really tidied up as there were a few more methods to implement. Still a few bugs in the logic and I still have to add some extra features.

**Thoughts:** Happy with the progress so far.

**Link to work:** [Day 11 Test code for dice pool system](https://github.com/androvisuals/100-days-of-code/tree/master/100%20days%20of%20code%20in%20here/Day%2010%20Dice%20calculator)

### Day 12: APRIL 18 , 2018

**Today's Progress**: Part 03 - So the user putting in the wrong type of input crashes the program, learning about exception handling and trying to loop the program if the user gives the wrong input. 

**Thoughts:** Learnt a lot, very little results though as its not really working.
**Link to work:** [Day 12 Test code for dice pool system](https://github.com/androvisuals/100-days-of-code/tree/master/100%20days%20of%20code%20in%20here/Day%2012%20Dice%20calculator%2003)

### Day 13: APRIL 19 , 2018

**Today's Progress**: Part 04 - Finally figured out how to use exception handling to test if the console input from the user was an integer or not. If not request new input, otherwise continue 

**Thoughts:** Learnt a lot (again), very little results but now it works ! I'll do a lot of this differently when I do it again from scratch. 
**Link to work:** [Day 13 Test code for dice pool system](https://github.com/androvisuals/100-days-of-code/tree/master/100%20days%20of%20code%20in%20here/Day%2012%20Dice%20calculator%2003)

### Day 14: APRIL 20 , 2018

**Today's Progress**: Asked Tropical Trevor for a challenge. It was :
given an array of strings with names for each string see if there is a first and last name in the string print the initial of the first name and then the last name (Like Mark Smith becomes M Smith).
Ignore empty names or names without last name

**Thoughts:** Good learning experience. Thanks Trevor ! 
**Link to work:** [Day 14 String splitter](https://github.com/androvisuals/100-days-of-code/tree/master/100%20days%20of%20code%20in%20here/Day%2013%20Dice%20calculator%2004)

### Day 15: APRIL 21 , 2018

**Today's Progress**: Started learning about JavaFX to make a basic ui/gui in java. Got the basics down, next part will be event handling. 
Uploaded the wrong files, .class instead of .java ! Already written over them for the next days work, so day 16 is in this folder as well (its better anyway ;-) 

**Thoughts:** Good day, makes more sense than 6 months ago after studying more in the mean time
**Link to work:** [Day 15 JavaFX gui](https://github.com/androvisuals/100-days-of-code/tree/master/100%20days%20of%20code%20in%20here/Day%2015%20JavaFX%20GUI%20start)

### Day 16: APRIL 22 , 2018

**Today's Progress**: Making good progress, Basic layouts are now implemented inside the window so basic automatic resizing occurs. Have my first event handler up and running with a console print out when a button is pressed. 

**Thoughts:** Good progress, enjoying it !
**Link to work:** [Day 16 JavaFX gui layout and event handler](https://github.com/androvisuals/100-days-of-code/tree/master/100%20days%20of%20code%20in%20here/Day%2016%20JavaFX%20gui%20layout%20event%20handler)

### Day 17: APRIL 23 , 2018

**Today's Progress**: A button press can now change label text in the GUI. Also added a text field object which allows the user to type into the field, press a button and have that string printed to the console. 

**Thoughts:** Going good.
**Link to work:** [Day 17 JavaFX gui change labels and user input field](https://github.com/androvisuals/100-days-of-code/tree/master/100%20days%20of%20code%20in%20here/Day%2017%20JavaFX%20gui%20user%20text%20fields)

### Day 18: APRIL 24 , 2018

**Today's Progress**:Researched new methods for placement of child objects within nodes, replaced everything with the Gridpane class , this makes it way easier to decide the where everything should be placed. Got the slider object to work with showing its output to a label in the gui.

**Thoughts:** Still going good ;-)
**Link to work:** [Day 18 JavaFX gui improved layout and slider reader](https://github.com/androvisuals/100-days-of-code/tree/master/100%20days%20of%20code%20in%20here/Day%2018%20JavaFX%20gui%20improved%20with%20gridpane)

### Day 19: APRIL 25 , 2018

**Today's Progress**: Refactored the whole panel section as Main was becoming very long and cluttered. Added background colors and borders to each panel. A lot tidier now and easier to work with.

**Thoughts:** Still going good ;-)
**Link to work:** [Day 19 JavaFX gui refactored added borders - background colors](https://github.com/androvisuals/100-days-of-code/tree/master/100%20days%20of%20code%20in%20here/Day%2019%20JavaFX%20gui%20borders%20color%20refactored%20all)

### Day 20: APRIL 26 , 2018

**Today's Progress**: Played around with the flowpane panel. Tried to load background images into each panel, got the images to load but they overdraw over panels so it didn't work out (yet)

**Thoughts:** Can't win them all 
**Link to work:** [Day 20 JavaFX gui working with images in panels](https://github.com/androvisuals/100-days-of-code/tree/master/100%20days%20of%20code%20in%20here/Day%2019%20JavaFX%20gui%20borders%20color%20refactored%20all)

### Day 21: APRIL 27 , 2018

**Today's Progress**: TestPanel can generate any amount of buttons. Buttons get a dropshadow when the mouse goes over them, color also changes on click. These two actions have been placed into methods which can be called in any panel.

**Thoughts:** Dropped the background image for now as it wasn't working out
**Link to work:** [Day 21 reactive buttons with color](https://github.com/androvisuals/100-days-of-code/tree/master/100%20days%20of%20code%20in%20here/Day%2021%20JavaFX%20gui%20reactive%20button%20colors)

### Day 22: APRIL 28 , 2018

**Today's Progress**: Trying to get the java preferences library to work so I can save the state of the GUI. No joy yet. 

**Thoughts:** Just need another day then I should get this working
**Link to work:** [Day 22 JavaFX Save gui preferences](https://github.com/androvisuals/100-days-of-code/tree/master/100%20days%20of%20code%20in%20here/Day%2022%20JavaFX%20Save%20gui%20preferences)

### Day 23: APRIL 29 , 2018

**Today's Progress**: Still trying to get preferences to work, good progress but not working in the actual program yet.

**Thoughts:** add another day :P
**Link to work:** [Day 23 JavaFX Save gui preferences 2](https://github.com/androvisuals/100-days-of-code/tree/master/100%20days%20of%20code%20in%20here/Day%2023%20JavaFx%20save%20gui%20preferences%202)

### Day 24: APRIL 30 , 2018

**Today's Progress**: Gui width , height and a single slider are now saved to preferences automatically, started learning how to make a xml file with dom in java 

**Thoughts:** Nailed it for now will clean up later 
**Link to work:** [Day 24 Settings of gui are now saved - started xml file maker](https://github.com/androvisuals/100-days-of-code/tree/master/100%20days%20of%20code%20in%20here/Day%2024%20JavaFx%20save%20gui%20preferences%203)

### Day 25: MAY 01 , 2018

**Today's Progress**: researching different classes and libraries for creating, reading and modifying XML data with java. No solid results yet.

**Thoughts:** Still researching the basics.
**Link to work:** [Day 25 xml file maker start](https://github.com/androvisuals/100-days-of-code/tree/master/100%20days%20of%20code%20in%20here/Day%2025%20xml%20maker%20studies%201)

### Day 26: MAY 02 , 2018

**Today's Progress**: Needed a break. Decided to do an hour of codewars. Managed to get 3 out of the 5 katas.

**Thoughts:** Fun to do !
**Link to work:** [Day 26 codewars day 1 ](https://github.com/androvisuals/100-days-of-code/tree/master/100%20days%20of%20code%20in%20here/Day%2026%20codewars%20excercise%201)

### Day 27: MAY 03 , 2018

**Today's Progress**: More codewars. Got a lot harder today. Managed to only complete two katas from the 4 I tried. The 2nd one really had me stumped for quite a while. 

**Thoughts:** Brain ache
**Link to work:** [Day 27 codewars day 2 ](https://github.com/androvisuals/100-days-of-code/tree/master/100%20days%20of%20code%20in%20here/Day%2027%20codewars%20excercise%202)

### Day 28: MAY 04 , 2018

**Today's Progress**: More codewars. Managed to get 3 out of 4. Learnt a couple of nice cool built in functions from the java library.

**Thoughts:** less brain ache. 
**Link to work:** [Day 28 codewars day 3 ](https://github.com/androvisuals/100-days-of-code/tree/master/100%20days%20of%20code%20in%20here/Day%2028%20codewars%20excercise%203)

### Day 29: MAY 07 , 2018

**Today's Progress**: Started a basic game which i want to implement with the new things I learnt with GUI's with JavaFX.
Got some basic elements together.

**Thoughts:** Went okay, needed 2 days away from the computer to recharge + slightly ill.
**Link to work:** [Day 29 Basic game model 1 ](https://github.com/androvisuals/100-days-of-code/tree/master/100%20days%20of%20code%20in%20here/Day%2029%20Basic%20game%20model%201)

### Day 30: MAY 08 , 2018

**Today's Progress**: Made great progress today with a lot of things just kind of stuck with 2 seperate panes overwriting each other. Figured it out but I'll fix it tomorrow

**Thoughts:** Been a good 7 hours today got a lot done.
**Link to work:** [Day 30 Basic game model 2 ](https://github.com/androvisuals/100-days-of-code/tree/master/100%20days%20of%20code%20in%20here/Day%2030%20Basic%20game%20model%202)

### Day 31: MAY 17 , 2018

**Today's Progress**: After 2 days I finally have a fully working setup with Unity,tensorflow and the machine learning agents package. The agent(cube) has to find the target location(sphere) as quickly as possible.
Saving the whole unity file isn't possible with github at this time so these are the basic scripts with the agent settings and the training data settings.

**Thoughts:** I was away for over half a week and I needed a break of the java gui stuff after realizing I just may as well build it from scratch after working myself into a few corners :P 
With the machine learning setup it's been a very difficult thing to get working. Its all still very much in experimental stages with th ML agents stuff. The differences in previous versions, lack of up to date documentation, using so many different pieces of software together. But finally its working !
**Link to work:** [Day 31 Machine learning agents Unity 1 ](https://github.com/androvisuals/100-days-of-code/tree/master/100%20days%20of%20code%20in%20here/Day%2031%20Machine%20Learning%20Unity%201)

### Day 32: MAY 18 , 2018

**Today's Progress**: The agent now has to find the target in 3d space, basic frameworks done. Its just very ineffecient right now. I think I have to get the delta value of the distance between the 2 points in 3d space, reward if distance decreases, punish if distance increases.

**Thoughts:** Happy with the progress.
**Link to work:** [Day 32 Machine learning agents Unity 2 ](https://github.com/androvisuals/100-days-of-code/tree/master/100%20days%20of%20code%20in%20here/Day%2032%20Machine%20Learning%20Unity%202)

### Day 33: MAY 18 , 2018

**Today's Progress**: Codewars, only pulled off 1 today, its getting a lot harder.On a different computer so no Machine learning today.

**Thoughts:** Can't win em all.
**Link to work:** [Day 33 codewars day 4 ](https://github.com/androvisuals/100-days-of-code/tree/master/100%20days%20of%20code%20in%20here/Day%2033%20codewars%20excercise%204)

### Day 34: MAY 21 , 2018

**Today's Progress**: 2 unique agents in Unity with  machine learning try to beat each other.
The ball tries to stay on the platform as long as possible , the platform tries to get the ball off as quickly as possible. Both agents have a unique brain which have trained together.

**Thoughts:** Forgot to upload this yesterday.Worked together with this on Roel Ezendam who was incredibly helpful with the whole process. Thanks a lot Roel !
**Link to work:** [Day 34 Machine learning agents Unity 3 ]()


