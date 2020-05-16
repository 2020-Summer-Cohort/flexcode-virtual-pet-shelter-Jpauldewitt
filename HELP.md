# Virtual Pet Shelter

So, you have some experience under your belt in the care and feeding of a virtual pet. It's time to share that with the community! Time to volunteer! 

Design a game that allows you to play the role of a pet shelter worker!

## Setup
- [ ] Update the README.md file in your project folder to describe what you've done with your project. No fancy formatting is necessary. Just separate paragraphs with an empty line. (If you'd like to learn more about Markdown formatting, check out the [Github Markdown Guide](https://guides.github.com/features/mastering-markdown/).)

## Details

We're going to use TDD to drive the creation of an application that simulates you taking care of the pets in a shelter.

Include a game loop in this project, too. It should query the user, then call the appropriate method(s) on `VirtualPetShelter` and/or `VirtualPet`. In general, your `VirtualPetApp` should talk to your `VirtualPetShelter`, and your `VirtualPetShelter` should talk to your `VirtualPet`. Try to avoid `VirtualPetApp` talking directly to `VirtualPet` instances, apart from accessing basic information about pets (via `get*` methods).

### Example Interactions

```
Thank you for volunteering at Big Al\'s Virtual Pet Shelter and Delicatessen!

This is the status of your pets:

Name	|Hunger	|Thirst	|Boredom
--------|-------|-------|-------
Joey	|83     |34     |23
Johnny	|69     |49     |2
Dee Dee	|39     |18     |88
Tommy	|59     |19     |37

What would you like to do next?

1. Feed the pets
2. Water the pets
3. Play with a pet
4. Adopt a pet
5. Admit a pet
6. Quit
```

#### Example Pet Selection Interaction

```bash
Ok, so you\'d like to play with a pet. Please choose one:

[Joey] looks like he\'s seen better days.
[Johnny] is a bit nervous.
[Dee Dee] probably didn\'t start with that many legs.
[Tommy] smells like a Stargazer lily fresh with morning dew.

Which pet would you like to play with?
Tommy

Ok, you play with Tommy.
```

## Required Tasks to be completed in the order you feel is necessary

### VirtualPetShelterApp class

- Create a `main` method that…
	- [ ] implements a *game loop*.
	- [ ] asks for user input.
	- [ ] writes output to the console.
	- [ ] calls `VirtualPetShelter`'s `tick` method after each interaction

- Available user interface actions should include (at minimum)…
	- [ ] feeding all the pets
	- [ ] watering all the pets
	- [ ] playing with an individual pet, which should display a list of pet names and descriptions, allowing a user to select one
	- [ ] allow adoption of a pet, which should display a list of pet names and descriptions, allowing a user to select one.  _NOTE: In the past this has been a bit confusing.  Keep in mind you are playing the role of a shelter worker, if a pet is adopted it will be removed from the shelter._
	- [ ] allow intake of a pet, prompting the user for the pet's information, requiring the user to (at minimum) specify name and description

	(*Hint: you can use tab characters ("\t") to align console output in columns.*)

### VirtualPetShelter class

- [ ] include appropriate instance variable(s) to store the pets who reside at the shelter
- [ ] include methods that:
	- [ ] return a `Collection` of all of the pets in the shelter
	- [ ] return a specific `VirtualPet` given its name
	- [ ] allow intake of a homeless pet (adding a pet to the shelter)
	- [ ] allow adoption of a homeless pet (removing a pet from the shelter)
	- [ ] feed all of the pets in the shelter
	- [ ] water all of the pets in the shelter
	- [ ] plays (or performs some other interaction(s)) with an individual pet in the shelter
- [ ] include a `tick` method that calls the `tick` method for each of the pets in the shelter, updating their needs

### VirtualPet class
	
In addition to the requirements from [last week's project](./virtual-pet):
- [ ] include instance variables representing:
	- [ ] name (from the above example, this might be "Tommy")
	- [ ] description (from the above example, this might be "smells like a Stargazer lily fresh with morning dew")
- [ ] include a constructor that accepts a name and description
- [ ] include a constructor that, in addition to name and description, accepts default values for the pet's attributes (hunger, boredom, etc)
- [ ] Do **not** include a default (zero arguments) constructor.
 
### Grading
Your grading will be based on three areas:
- Test Driven Development
- Working Software
- Clean Code

#### Test Driven Development 
You should write your code by writing tests first.  If you do so, each public method you write should have a unit test that covers its behavior.  The test classes should also be well maintained and follow the principles of clean code.  These are the things we are looking for with regards to Test Driven Development:

- 75% of your public methods (excepting the `main()` in your app class) should be covered by unit tests.
- The principles of _Clean Code_ as described below apply to your test classes.
- All tests pass.

#### Working Software
Working software consists of does the application run and how well you met the requirements.  Of the 30 required tasks above, we need to see 25 complete for this category to be considered PASSING.

#### Clean Code
Clean code deals with how your code is written.  Is it readable, easy to understand, formatted, and not littered with commented out code?   These are the things we will be looking for:

- Keep method chains to a minimum. (Three chained methods in the entire project are permissable.)
- Formatted code - This is the simplest task, use _CTRL + ALT + L_ to have IntelliJ format your code for you.
- Variable and Method Names - Variables and method names should inform the reader what the purpose of the variable or method is.  A `feed()` method that affects the `hunger` field variable in your `VirtualPet` class is an example of good naming.
- If you use descriptive method and variable names, your reliance on comments can be reduced.  And you should never leave blocks of commented out code in your committed code. 


We are looking for adherence to all four of the above principles for this category to be considered PASSING.

## Stretch Tasks

- [ ] Consider any stretch tasks from last week's project that you did not attempt.
- [ ] Keep track of the cleanliness of individual pets' cages and offer an option in the user interface to clean pet cages
- [ ] DNA! In order to give your pets individual character, include as part of each pet's state one or more multipliers for needs so that one pet may become hungrier/thirstier/more bored slower/faster than another pet. (*Tip: you could create a class to encapsulate this.*)
