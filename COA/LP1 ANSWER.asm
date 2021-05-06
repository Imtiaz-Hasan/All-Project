;*************1.Write a program that gives the following output in DOS****************************************************
.MODEL SMALL
.STACK 100H
.DATA 
A DB 'WELCOME TO MY CALCULATOR!! $'
B DB 'PLEASE USER ENTER DIGIT 1: $'         
C DB 'PLEASE USER ENTER DIGIT 2: $'
D DB 'OUTPUT: $'

NUM1 DB ?
NUM2 DB ? 
E DB 'THANK YOU FOR USING MY CALCULATOR $'
F DB 'HAVE A GOOD DAY $'
.CODE
MAIN PROC
    MOV AX,@DATA
    MOV DS,AX
    
    LEA DX,A  
    MOV AH,9
    INT 21H
    
    
    MOV DL,0AH
    MOV AH,2
    INT 21H 
     
    MOV DL,0DH
    MOV AH,2
    INT 21H
    
    LEA DX,B
    MOV AH,9
    INT 21H 
    MOV AH,1
    INT 21H
    
    
    MOV NUM1,AL
    ;INT 21H 
    
    MOV DL,0AH
    MOV AH,2
    INT 21H 
     
    MOV DL,0DH
    MOV AH,2
    INT 21H
    
    LEA DX,C
    MOV AH,9
    INT 21H
     
    MOV AH,1
    INT 21H
    
    
    MOV NUM2,AL
    ;INT 21H
    
    MOV DL,0AH
    MOV AH,2
    INT 21H 
     
    MOV DL,0DH
    MOV AH,2
    INT 21H
    
    LEA DX,D
    MOV AH,9
    INT 21H 
    
    MOV DL,0AH
    MOV AH,2
    INT 21H 
     
    MOV DL,0DH
    MOV AH,2
    INT 21H
    
    MOV AL,NUM1
    MOV BL,NUM2
    ADD AL,BL
    SUB AL,30H 
    MOV DL,AL
    MOV AH,2
    INT 21H 
    
    MOV DL,0AH
    MOV AH,2
    INT 21H 
     
    MOV DL,0DH
    MOV AH,2
    INT 21H
    
    LEA DX,E
    MOV AH,9
    INT 21H 
    
    MOV DL,0AH
    MOV AH,2
    INT 21H 
     
    MOV DL,0DH
    MOV AH,2
    INT 21H
    
    LEA DX,F
    MOV AH,9
    INT 21H 
    
    MOV AH,4CH
    INT 21H
    
    
    MAIN ENDP
END MAIN

;******************2.Write a program that gives the following output in DOS:*************
.MODEL SMALL
.STACK 100H
.DATA 
A DB 'WELCOME TO MY CALCULATOR!! $'
B DB 'PLEASE USER ENTER DIGIT 1: $'         
C DB 'PLEASE USER ENTER DIGIT 2: $' 
G DB 'PLEASE USER ENTER DIGIT 3: $'
D DB 'OUTPUT: $'
NUM1 DB ?
NUM2 DB ?
NUM3 DB ? 
E DB 'THANK YOU FOR USING MY CALCULATOR $'
F DB 'HAVE A GOOD DAY $'
.CODE
MAIN PROC
    MOV AX,@DATA
    MOV DS,AX
    
    LEA DX,A  
    MOV AH,9
    INT 21H
    
    
    MOV DL,0AH
    MOV AH,2
    INT 21H 
     
    MOV DL,0DH
    MOV AH,2
    INT 21H
    
    LEA DX,B
    MOV AH,9
    INT 21H 
    MOV AH,1
    INT 21H
    MOV NUM1,AL 
    
    MOV DL,0AH
    MOV AH,2
    INT 21H 
     
    MOV DL,0DH
    MOV AH,2
    INT 21H
    
    LEA DX,C
    MOV AH,9
    INT 21H 
    MOV AH,1
    INT 21H
    MOV NUM2,AL
    
    MOV DL,0AH
    MOV AH,2
    INT 21H 
     
    MOV DL,0DH
    MOV AH,2
    INT 21H
    
    LEA DX,G
    MOV AH,9
    INT 21H 
    MOV AH,1
    INT 21H
    
    MOV DL,0AH
    MOV AH,2
    INT 21H
    MOV NUM3,AL 
     
    MOV DL,0DH
    MOV AH,2
    INT 21H
    
    LEA DX,D
    MOV AH,9
    INT 21H 
    
    MOV DL,0AH
    MOV AH,2
    INT 21H 
     
    MOV DL,0DH
    MOV AH,2
    INT 21H
    
    MOV AL,NUM1
    MOV BL,NUM2
    MOV CL,NUM3
    ADD AL,BL
    ADD AL,CL
    
    SUB AL,30H 
    MOV DL,AL
    MOV AH,2
    INT 21H 
    
    MOV DL,0AH
    MOV AH,2
    INT 21H 
     
    MOV DL,0DH
    MOV AH,2
    INT 21H
    
    LEA DX,E
    MOV AH,9
    INT 21H 
    
    MOV DL,0AH
    MOV AH,2
    INT 21H 
     
    MOV DL,0DH
    MOV AH,2
    INT 21H
    
    LEA DX,F
    MOV AH,9
    INT 21H 
    
    INT 21H
    
    
    MAIN ENDP
END MAIN

*******************3.	Write a program that gives the following output in DOS:**********
.MODEL SMALL
.STACK 100H
.DATA 
A DB 'WELCOME TO MY CALCULATOR!! $'
B DB 'PLEASE USER ENTER DIGIT 1: $'         
C DB 'PLEASE USER ENTER DIGIT 2: $'
D DB 'OUTPUT: $' 
E DB 'THANK YOU FOR USING MY CALCULATOR $'
F DB 'HAVE A GOOD DAY $'
.CODE
MAIN PROC
    MOV AX,@DATA
    MOV DS,AX
    
    LEA DX,A  
    MOV AH,9
    INT 21H
    
    
    MOV DL,0AH
    MOV AH,2
    INT 21H 
     
    MOV DL,0DH
    MOV AH,2
    INT 21H
    
    LEA DX,B
    MOV AH,9
    INT 21H 
    MOV AH,1
    INT 21H 
    
    MOV DL,0AH
    MOV AH,2
    INT 21H 
     
    MOV DL,0DH
    MOV AH,2
    INT 21H
    
    LEA DX,C
    MOV AH,9
    INT 21H 
    MOV AH,1
    INT 21H
    
    MOV DL,0AH
    MOV AH,2
    INT 21H 
     
    MOV DL,0DH
    MOV AH,2
    INT 21H
    
    LEA DX,D
    MOV AH,9
    INT 21H 
    
    MOV DL,0AH
    MOV AH,2
    INT 21H 
     
    MOV DL,0DH
    MOV AH,2
    INT 21H
    
    MOV AL,35H
    MOV BL,32H
    SUB AL,BL
    ADD AL,30H 
    MOV DL,AL
    MOV AH,2
    INT 21H 
    
    MOV DL,0AH
    MOV AH,2
    INT 21H 
     
    MOV DL,0DH
    MOV AH,2
    INT 21H
    
    LEA DX,E
    MOV AH,9
    INT 21H 
    
    MOV DL,0AH
    MOV AH,2
    INT 21H 
     
    MOV DL,0DH
    MOV AH,2
    INT 21H
    
    LEA DX,F
    MOV AH,9
    INT 21H 
    
    MOV AH,4CH
    INT 21H
    
    
    MAIN ENDP
END MAIN



*******************4.5*5 solid box of asterisks************************************

.MODEL SMALL
.STACK 100H
.DATA

SQUARE DB '*****', 0DH,0AH,'$'
.CODE
MAIN PROC
    MOV AX,@DATA
    MOV DS,AX
    
    LEA DX,SQUARE
    MOV AH,9
    
    
    INT 21H
    INT 21H
    INT 21H
    INT 21H
    INT 21H
    
    MOV AH,4CH
    INT 21H
    
    MAIN ENDP 
END MAIN



**********************************5.BEEP***********************************************

.MODEL SMALL
.STACK 100H
.DATA
X DB 4
Y DB 2
.CODE
MAIN PROC
    MOV AL,3
    MOV BL,4
    ADD AL,BL
    
    
    MOV DL,AL
    MOV AH, 2
    INT 21H
    
    MOV AH,4CH
    INT 21H
    
    MAIN ENDP 
END MAIN
