class PersonalInfo:
    
    # Constructor
    def __init__(self, firsame="unknown", lastName="unknown", age=0):
        self.__first_name = firsame
        self.__last_name = lastName
        self.__age = age

    # Method: Sets the first_name attribute of the PersonalInfo object.
    def setFirstName(self, newFirstName):
        self.__first_name = newFirstName

    # Method: Returns the first_name attribute of the PersonalInfo object.
    def getFirstName(self):
        return self.__first_name

    # Method: Sets the last_name attribute of the PersonalInfo object.
    def setLastName(self, newLastName):
        self.__last_name = newLastName

    # Method: Returns the last_name attribute of the PersonalInfo object.
    def getLastName(self):
        return self.__last_name

    # Method: Sets the age attribute of the PersonalInfo object.
    def setAge(self, newAge):
        self.__age = newAge

    # Method: Returns the age attribute of the PersonalInfo object.
    def getAge(self):
        return self.__age

    # Method: Changes the age attribute of the PersonalInfo object.
    def changeAge(self, newAge):
        self.setAge(newAge)

    # Method: Increases the age attribute of the PersonalInfo object by 1.
    def growUp(self):
        self.__age += 1

    # Method: Returns a formatted string with the full name of the PersonalInfo object.
    def getFullName(self):
        return f"{self.__first_name} {self.__last_name}"
