import sys
def execute():  

    # введення розміру квадратної матриці
    n = int(input("Введіть розмір квадратної матриці: "))
    lst = []
    # введення символ-заповнювачу
    filler = input("Введіть символ-заповнювач: ")
    # опрацювання виключень
    if len(filler) == 1:
        # вивід матрці та заповнення
        for i in range(n):
            lst.append([])
            for j in range(n):
                if j >= i:
                    lst[i].append(ord(filler))
                else:
                    lst[i].append(ord(' '))
                print(chr(lst[i][j]), end=" ")
            print() 
    elif len(filler) == 0:
        print("Не введено символ-заповнювач")
    else:
        print("Забагато символів-заповнювачів")

    