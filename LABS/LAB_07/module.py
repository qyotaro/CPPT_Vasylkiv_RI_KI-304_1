
import sys
def execute():  

    nRows = int(input("Введіть розмір квадратної матриці: "))
    filler = input("Введіть символ-заповнювач: ")

   # введення символа заповнювача квадратної матриці і первірка на те, чи він 1
    if len(filler) != 1:
        print("Потрібно ввести лише один символ!")
        sys.exit()

    lst = [[None for j in range(nRows)] for i in range(nRows)]

    # заповнення зубчастої матриці згідно варіанту
    for i in range(nRows):
        for j in range(nRows - i):
            lst[i][j + i] = filler

    # дозаповнення пустих елементів зубчастої матриці для зручного виводу
    for i in range(nRows):
        for j in range(nRows):
            if lst[i][j] != filler:
                lst[i][j] = " "

    # вивід матриці   
    print("\nЗгенерований зубчатий список:")
    for i in range(nRows):
        for j in range(nRows):
            print(lst[i][j], end=" ")
        print()

