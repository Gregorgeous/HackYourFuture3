def runEncoder():
    myInput = input('Type the series of numbers')
    outputString = ''
    for index, char in enumerate (myInput):
        if char == ' ': 
            pass
        if int(char) % 2 == 0:
            outputString += char
        else:
            outputString += char
            if index+1 < len(myInput) and int(myInput[index+1]) % 2 == 1:
                outputString += '-'
    print (outputString)

def exitProgram():
    print("You pressed 0. Exiting program .. Bye !")


title = "DASHER ! :) ";

selected = -1;
while (selected != 0):
    print(title)
    selected = int( input("Type '1' for typing the the string. Type '0' for exiting: \n"))
    if selected == 1:
        runEncoder()
    else:
        exitProgram()