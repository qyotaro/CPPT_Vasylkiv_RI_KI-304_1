import os
import struct
import sys
import math

# функція запису результату в текстовий файл
def writeResTxt(fName, result):
    with open(fName, 'w') as f:
        f.write(str(result))

# функція читання результату з текстового файлу
def readResTxt(fName):
    result = 0.0
    try:
        if os.path.exists(fName):
            with open(fName, 'r') as f:
                result = f.read()
        else:
            raise FileNotFoundError(f"File {fName} not found.")
    except FileNotFoundError as e:
        print(e)
    return result

# функція запису результату в бінарний файл
def writeResBin(fName, result):
    with open(fName, 'wb') as f:
        f.write(struct.pack('f', result))

# функція читання результату з бінарного файлу
def readResBin(fName):
    result = 0.0
    try:
        if os.path.exists(fName):
            with open(fName, 'rb') as f:
                result = struct.unpack('f', f.read())[0]
        else:
            raise FileNotFoundError(f"File {fName} not found.")
    except FileNotFoundError as e:
        print(e)
    return result

# функція обчислення заданого виразу (з обробкою можливих помилок)
def calculate(x):
    try:
         # перевірка, чи x != 90 + n*180
        if x % 180 == 90:
            raise ValueError("Тангенс не визначений для кутів 90 + n*180 градусів")
        res = math.tan(math.radians(x))
        return res
    except ValueError as e:
        print(f"Помилка значення: {e}")
    return None

    return res

def execute():
    data = float(input("Enter data: "))
    result = calculate(data)
    print(f"Result is: {result}")
    try:
        writeResTxt("textRes.txt", result)
        writeResBin("binRes.bin", result)
        print("Result is: {0}".format(readResBin("binRes.bin")))
        print("Result is: {0}".format(readResTxt("textRes.txt")))
    except FileNotFoundError as e:
        print (e)
        sys.exit(1)