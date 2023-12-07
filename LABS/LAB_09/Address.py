class Address:
    # Constructor
    def __init__(self, country="unknown", city="unknown", street="unknown", houseNumber=0):
        self.__country = country
        self.__city = city
        self.__street = street
        self.__house_number = houseNumber

    # Method: Sets the country attribute of the Address object.
    def setCountry(self, newCountry):
        self.__country = newCountry

    # Method: Sets the city attribute of the Address object.
    def setCity(self, newCity):
        self.__city = newCity

    # Method: Sets the street attribute of the Address object.
    def setStreet(self, newStreet):
        self.__street = newStreet

    # Method: Sets the house_number attribute of the Address object.
    def setHouseNumber(self, newHouseNumber):
        self.__house_number = newHouseNumber

    # Method: Returns the country attribute of the Address object.
    def getCountry(self):
        return self.__country

    # Method: Returns the city attribute of the Address object.
    def getCity(self):
        return self.__city

    # Method: Returns the street attribute of the Address object.
    def getStreet(self):
        return self.__street

    # Method: Returns the house_number attribute of the Address object.
    def getHouseNumber(self):
        return self.__house_number

    # Method: Returns a formatted string representation of the Address object.
    def toString(self):
        return f"{self.__country}, {self.__city}, {self.__street} {self.__house_number}"
