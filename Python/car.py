class Car:
     id=int
     license=str
     driver=str
     _passenger=int

     def __init__(self,license,driver):
         self.license=license
         self.driver=driver
         self._passenger=int

     def get_passenger(self):
	     return self._passenger

     def set_passenger(self, passenger):
	     if passenger < 0:
		     raise ValueError("Uber debe tener 4 asientos")

	     self._passenger = passenger

     def printDataCar(self):
          pass