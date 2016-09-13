# Developer Guide

## Setting up

**Prerequisites**

* JDK 8 or later 
* Eclipse IDE

**Importing the project into Eclipse**

0. Fork this repo, and clone the fork to your computer
1. Open Eclipse
2. Click `File` > `Import`
3. Click `General` > `Existing Projects into Workspace` > `Next`
4. Click `Browse`, then locate the project's directory
5. Click `Finish`

## Design
<img src="images/mainClassDiagram.png"/>

### User Stories
* As a user, I can assign persons into a group in the addressbook, so that I can search based on the group.
* As a user, I can add multiple phone numbers for one person, so that I can save a person's home/ work/ handphone /etc. contact numbers.
* As a user, I can view a list of recently added persons.

### Use Case
Software System: AddressBook
Use case: UC01 - Rename tag
Actor: User
MSS:
	1. User enters command to rename tag "A" to "B".
	2. AddressBook requests for confirmation of change from "A" to "B".
	3. User confirms change.
	4. AddressBook renames tag from "A" to "B" and displays the change.
		Use case ends.

Extensions:
	1a. User enters command to rename tag without further input
		1a1. AddressBook prints help message for rename tag command.
		1a2. User enters new command.
	Steps 1a1-1a2 are repeated until the command is recognized.
	Use case resumes from step 2.

	2a. AddressBook detects that tag "A" does not exist
		2a1. AddressBook warns that tag "A" does not exist.
		2a2. User enters new command.
	Steps 2a1-2a2 are repeated until the command is recognized.
	Use case resumes from step 2.

### Non-Functional Requirements
*The storage should allow for storage of at least 500 contacts
*All commands should take less than 2 seconds to execute
*Data of Addressbook should be secure
*Addressbook should be able to run on all mobile devices as well


## Testing

### System tests

**Windows**

1. Open a DOS window in the `test` folder
2. Run the `runtests.bat` script
3. If the script reports that there is no difference between `actual.txt` and `expected.txt`, 
   the test has passed.

**Mac/Unix/Linux**

1. Open a terminal window in the `test` folder
2. Run the `runtests.sh` script
3. If the script reports that there is no difference between `actual.txt` and `expected.txt`, 
   the test has passed.

### JUnit tests

* In Eclipse, right-click on the `test/java` folder and choose `Run as` > `JUnit Test`

### Troubleshooting test failures

* Problem: How do I examine the exact differences between `actual.txt` and `expected.txt`?<br>
  Solution: You can use a diff/merge tool with a GUI e.g. WinMerge (on Windows)
* Problem: The two files look exactly the same, but the test script reports they are different.<br>
  Solution: This can happen because the line endings used by Windows is different from Unix-based
  OSes. Convert the actual.txt to the format used by your OS using some [utility](https://kb.iu.edu/d/acux).
* Problem: Test fails during the very first time.<br>
  Solution: The output of the very first test run could be slightly different because the program
  creates a new storage file. Tests should pass from the 2nd run onwards.
