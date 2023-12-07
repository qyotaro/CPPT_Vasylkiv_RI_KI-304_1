from Person import Person

class Athlete(Person):

    # Constructor
    def __init__(self, firstName="unknown", lastName="unknown", age=0, country="unknown", city="unknown", street="unknown", houseNumber=0, weight=1.0, height=1.0, typeSport="Unknown"):
        super().__init__(firstName, lastName, age, country, city, street, houseNumber, weight, height)
        self.__typeSport = typeSport

    # Method: Sets the typeSport attribute of the Athlete object.
    def setSport(self, newTypeSport):
        self.__typeSport = newTypeSport
        print("Sport has been changed to " + str(self.__typeSport))
        print()

    # Method: Simulates the athlete competing in their specific sport.
    def compete(self):
        print("The athlete is now competing in " + str(self.__typeSport))
        print()

    # Method: Prints a message indicating the start of a sport competition.
    def startCompete(self):
        print("Sport competition started.")
        print()

    # Method: Prints a message indicating the finish of a sport competition.
    def finishCOmpete(self):
        print("Sport competition finished.")
        print()

    # Method: Prints all information about the athlete, including personal information,
    def getAllPersonInfo(self):
        print("ALL INFORMATION ABOUT THE PERSON:\n")
        print("First name: " + str(self._Person__personalInfo.getFirstName()))
        print("Last name: " + str(self._Person__personalInfo.getLastName()))
        print("Age: " + str(self._Person__personalInfo.getAge()))
        print("Address: " + str(self._Person__address.toString()))
        print(self._Person__healthStatus.checkHealthStatus())
        print("The athlete's sport: " + str(self.__typeSport))
        print("Live: " + str(self._Person__activityStatus.getCurrentActivity()))
        print()
