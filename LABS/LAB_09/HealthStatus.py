class HealthStatus:
    # Constructor
    def __init__(self, weight=1.0, height=1.0):
        self.__weight = weight
        self.__height = height
        self.__bmi = self.calculateBMI()

    # Method: Calculates BMI based on weight and height.
    def calculateBMI(self):
        return self.__weight / (self.__height / 100 * self.__height / 100)

    # Method: Checks health status based on the calculated BMI.
    def checkHealthStatus(self):
        if self.__bmi < 18.5:
            return "Health status: underweight."
        elif 18.5 <= self.__bmi < 24.9:
            return "Health status: normal body weight."
        elif 25 <= self.__bmi < 29.9:
            return "Health status: overweight."
        else:
            return "Health status: obese."

    # Method: Sets a new weight and updates the BMI.
    def setWeight(self, newWeight):
        self.__weight = newWeight
        self.updateBMI()

    # Method: Sets a new height and updates the BMI.
    def setHeight(self, newHeight):
        self.__height = newHeight
        self.updateBMI()

    # Method: Updates the BMI based on the current weight and height.
    def updateBMI(self):
        self.__bmi = self.calculateBMI()

    # Method: Gets the current weight.
    def getWeight(self):
        return self.__weight

    # Method: Gets the current height.
    def getHeight(self):
        return self.__height
