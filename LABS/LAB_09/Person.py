from Address import Address
from PersonalInfo import PersonalInfo
from HealthStatus import HealthStatus
from ActivityStatus import ActivityStatus

class Person:
    
    # Constructor
    def __init__(self, firstName="unknown", lastName="unknown", age=0, country="unknown", city="unknown", street="unknown", houseNumber=0, weight=1.0, height=1.0):
        self.__personalInfo = PersonalInfo(firstName, lastName, age)
        self.__address = Address(country, city, street, houseNumber)
        self.__healthStatus = HealthStatus(weight, height)
        self.__activityStatus = ActivityStatus()

    # Method: Changes the personal information of the Person object.
    def changePersonalInfo(self, firstName, lastName, age):
        self.__personalInfo.setFirstName(firstName)
        self.__personalInfo.setLastName(lastName)
        self.__personalInfo.setAge(age)
        print("Personal data has been changed")
        print()

    # Method: Changes the address of residence of the Person object.
    def changeAddress(self, new_country, new_city, new_street, new_house_number):
        self.__address.setCountry(new_country)
        self.__address.setCity(new_city)
        self.__address.setStreet(new_street)
        self.__address.setHouseNumber(new_house_number)
        print("Address of residence changed")
        print()

    # Method: Changes the weight and height data of the Person object.
    def changeWeightAndHeight(self, new_weight, new_height):
        self.__healthStatus.setWeight(new_weight)
        self.__healthStatus.setHeight(new_height)
        self.__healthStatus.updateBMI()
        print("Weight and height data changed")
        print()

    # Method: Changes the activity mode of the Person object based on the provided status.
    def changeActivityStatus(self, status):
        if status == 1:
            self.__activityStatus.setMovingActivity()
        elif status == 2:
            self.__activityStatus.setStandingActivity()
        elif status == 3:
            self.__activityStatus.setSittingActivity()
        else:
            self.__activityStatus.setLieActivity()

        print("Activity mode changed to " + str(self.__activityStatus.getCurrentActivity()))
        print()

    # Method: Simulates the Person object growing up and prints a message.
    def growUp(self):
        self.__personalInfo.growUp()
        print(str(self.__personalInfo.getFullName()) + " has grown up.")
        print()

    # Method: Prints the personal information of the Person object.
    def getPersonalInfo(self):
        print("First name: " + str(self.__personalInfo.getFirstName()))
        print("Last name: " + str(self.__personalInfo.getLastName()))
        print("Age: " + str(self.__personalInfo.getAge()))
        print()

    # Method: Prints the address information of the Person object.
    def getAddressInfo(self):
        print(str(self.__personalInfo.getFullName()) + "'s Address: " + str(self.__address.toString()))
        print()

    # Method: Prints the health status of the Person object.
    def getHealthStatus(self):
        print(self.__healthStatus.checkHealthStatus())
        print()

    # Method: Prints the weight and height information of the Person object.
    def getWeightAndHeight(self):
        print("Body weight: " + str(self.__healthStatus.getWeight()))
        print("Height: " + str(self.__healthStatus.getHeight()))
        print()

    # Method: Prints the current activity mode of the Person object.
    def getCurrentActivity(self):
        print("The activity mode is set to " + str(self.__activityStatus.getCurrentActivity()))
        print()

    # Method: Prints all information about the Person object, including personal information, address, health status, and current activity.
    def getAllPersonInfo(self):
        print("ALL INFORMATION ABOUT THE PERSON:\n")
        print("First name: " + str(self.__personalInfo.getFirstName()))
        print("Last name: " + str(self.__personalInfo.getLastName()))
        print("Age: " + str(self.__personalInfo.getAge()))
        print("Address: " + str(self.__address.toString()))
        print(self.__healthStatus.checkHealthStatus())
        print("Live: " + str(self.__activityStatus.getCurrentActivity()))
        print()
