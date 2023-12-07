
from Athlete import Athlete

if __name__ == "__main__":
    person_one = Athlete()

    print()
    person_one.getPersonalInfo()
    person_one.changePersonalInfo("Nicola", "Kovac", 26)
    person_one.getPersonalInfo()
    person_one.getAddressInfo()
    person_one.changeAddress("Ukraine", "Lviv", "Horodotska ", 21)
    person_one.getAddressInfo()
    person_one.changeWeightAndHeight(67, 172)
    person_one.getWeightAndHeight()
    person_one.getHealthStatus()
    person_one.getCurrentActivity()
    person_one.changeActivityStatus(1)
    person_one.growUp()
    person_one.changeActivityStatus(3)
    person_one.setSport("Basketball")
    person_one.compete()
    person_one.startCompete()
    person_one.finishCOmpete()
    person_one.getAllPersonInfo()
    
