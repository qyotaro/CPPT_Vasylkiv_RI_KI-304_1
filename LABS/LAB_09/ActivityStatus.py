from enum import Enum

class ActivityStatus:
   
    class Activities(Enum):
        MOVING = 1
        STANDING = 2
        SITTING = 3
        LIE = 4

    # Constructor
    def __init__(self):
        self.__activity = self.Activities.STANDING

    # Method: Sets the activity to MOVING.
    def setMovingActivity(self):
        self.__activity = self.Activities.MOVING

    # Method: Sets the activity to STANDING.
    def setStandingActivity(self):
        self.__activity = self.Activities.STANDING

    # Method: Sets the activity to SITTING.
    def setSittingActivity(self):
        self.__activity = self.Activities.SITTING

    # Method: Sets the activity to LIE.
    def setLieActivity(self):
        self.__activity = self.Activities.LIE

    # Method: Returns the current activity mode as a string.
    def getCurrentActivity(self):
        return self.__activity.name
