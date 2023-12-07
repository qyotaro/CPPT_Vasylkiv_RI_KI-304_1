class PersonalInfo:
    
    # Constructor
    def __init__(self, first_name="unknown", last_name="unknown", age=0):
        self.__first_name = first_name
        self.__last_name = last_name
        self.__age = age

    # Method: Sets the first_name attribute of the PersonalInfo object.
    def setFirstName(self, new_first_name):
        self.__first_name = new_first_name

    # Method: Returns the first_name attribute of the PersonalInfo object.
    def getFirstName(self):
        return self.__first_name

    # Method: Sets the last_name attribute of the PersonalInfo object.
    def setLastName(self, new_last_name):
        self.__last_name = new_last_name

    # Method: Returns the last_name attribute of the PersonalInfo object.
    def getLastName(self):
        return self.__last_name

    # Method: Sets the age attribute of the PersonalInfo object.
    def setAge(self, new_age):
        self.__age = new_age

    # Method: Returns the age attribute of the PersonalInfo object.
    def getAge(self):
        return self.__age

    # Method: Changes the age attribute of the PersonalInfo object.
    def changeAge(self, new_age):
        self.setAge(new_age)

    # Method: Increases the age attribute of the PersonalInfo object by 1.
    def growUp(self):
        self.__age += 1

    # Method: Returns a formatted string with the full name of the PersonalInfo object.
    def getFullName(self):
        return f"{self.__first_name} {self.__last_name}"
